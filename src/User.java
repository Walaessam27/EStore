
public class User {
 protected String id;
 protected String password;
 protected String name;
 protected String email;
 protected double balance=0;
 protected int type;
 
 public User(){
	 this.id="";
	 this.password="";
	 this.name="";
	 this.email="";
 }
 
 public User(String id, String password, String name, String email) {
	super();
	this.id = id;
	this.password = password;
	this.name = name;
	this.email = email;
	}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
 public void show_member() {
	
	 System.out.println("The ID: "+ this.id+", The NAME: "+this.name+", The EMAIL: "+this.email+".");
	
 }}
