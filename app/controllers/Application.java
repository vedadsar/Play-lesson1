<<<<<<< HEAD
 package controllers;
=======
package controllers;
>>>>>>> f69a440849b7b6779fdb0de2fbd850f0756b5d99

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {
	
	static Form<Task> submitForm = new Form<Task>(Task.class);
	
    public static Result index() {
<<<<<<< HEAD
        return ok(index.render("Welcome to TODO.", submitForm, Task.all() ));
        
    }
    
    public static Result createTask(){
    	Form<Task> bindForm = submitForm.bindFromRequest();
    	submitForm.discardErrors();    	
    	if(bindForm.hasErrors() == false){
    		Task.create(bindForm.get());
    		submitForm = new Form<Task>(Task.class);
    		return redirect("/");
    	}
    	
    	return ok(index.render("Welcome to ToDo", bindForm, Task.all()));
    }
    
    public static Result deleteTask(int id){
    	Task.remove(id);
    	return redirect("/");
    }
  
=======
        return ok(index.render("Welcome to TODO.", submitForm));
    }
    
    public static Result createTask(){
    	Task.create(submitForm.bindFromRequest().get());
    	return index();
    }
    
    public static Result deleteTask(){
    	return TODO;
    }

>>>>>>> f69a440849b7b6779fdb0de2fbd850f0756b5d99
}
