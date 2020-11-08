package th.ac.su.cp.speedrecords.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class User {
  public static final int GENDER_MALE = 0;
  public static final int GENDER_FEMALE = 1;

  @PrimaryKey(autoGenerate = true)
  public final int id;

  @ColumnInfo(name = "distance_text")
  public final Double distance;

  @ColumnInfo(name = "time_text")
  public final Double time;

  public User(int id, double distance, double time) {
    this.id = id;
    this.distance = distance;
    this.time = time;
  }
}
