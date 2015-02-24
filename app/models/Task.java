package models;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> f69a440849b7b6779fdb0de2fbd850f0756b5d99
import javax.persistence.*;

import play.data.validation.Constraints.*;
import play.db.ebean.Model;

@Entity
public class Task extends Model {

	@Id
	public int id;
	@MinLength(2)
	public String name;
	
<<<<<<< HEAD
	static Finder<Integer, Task> find = new Finder<Integer, Task>(Integer.class, Task.class);
	
	
	public static void create(Task t){
		t.save();
	}
	
	public static List<Task> all(){
		return find.all();
	}
	
	public static void remove(int id){
		find.byId(id).delete();
	}
=======
	public static void create(Task t){
		t.save();
	}
>>>>>>> f69a440849b7b6779fdb0de2fbd850f0756b5d99
}
