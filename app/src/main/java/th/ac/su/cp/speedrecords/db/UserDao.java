package th.ac.su.cp.speedrecords.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import th.ac.su.cp.speedrecords.model.User;

@Dao
public interface UserDao {

  @Query("SELECT * FROM users")
  User[] getAllUsers();

  @Query("SELECT * FROM users WHERE id = :id")
  User getUserById(int id);

  @Insert
  void addUser(User... users);

  @Delete
  void deleteUser(User user);
}
