package th.ac.su.cp.speedrecords;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import th.ac.su.cp.speedrecords.db.AppDatabase;
import th.ac.su.cp.speedrecords.model.User;
import th.ac.su.cp.speedrecords.util.AppExecutors;

public class AddUserActivity extends AppCompatActivity {
  EditText distance_text;
  EditText time_text;
  Button saveButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_add);

    Button saveButton = findViewById(R.id.save_button);
    saveButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Double distance;
        Double time;

        final User user = new User(0, 0, 0);

        AppExecutors executors = new AppExecutors();
        executors.diskIO().execute(new Runnable() {
          @Override
          public void run() { // worker thread
            AppDatabase db = AppDatabase.getInstance(AddUserActivity.this);
            db.userDao().addUser(user);
            finish();
          }
        });
      }
    });
  }
}
