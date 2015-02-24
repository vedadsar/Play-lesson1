 package controllers;

import play.*;
import play.data.Form;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {
	
	static Form<Task> submitForm = new Form<Task>(Task.class);
	
    public static Result index() {
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
  
}
