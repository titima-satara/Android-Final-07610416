package th.ac.su.cp.speedrecords.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import th.ac.su.cp.speedrecords.R;
import th.ac.su.cp.speedrecords.model.User;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.MyViewHolder> {

  private Context mContext;
  private User[] mUsers;

  public UserAdapter(Context context, User[] users) {
    this.mContext = context;
    this.mUsers = users;
  }

  @NonNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_user, parent, false);
    return new MyViewHolder(v);
  }

  @Override
  public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

  }

  @Override
  public int getItemCount() {
    return mUsers.length;
  }

  static class MyViewHolder extends RecyclerView.ViewHolder {
    TextView text_speed;
    TextView distance_time;
    ImageView image_speed;

    public MyViewHolder(@NonNull View itemView) {
      super(itemView);

      this.image_speed = itemView.findViewById(R.id.text_speed);
      this.image_speed = itemView.findViewById(R.id.distance_time);
      this.image_speed = itemView.findViewById(R.id.image_speed);
    }
  }
}