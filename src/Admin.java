
public class Admin extends User {	
	public Admin() {
		super();
		this.type=2;
		// TODO Auto-generated constructor stub
	}
	public Admin(String id, String password, String name, String email) {
		super(id, password, name, email);
		this.type=2;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void show_member() {
		// TODO Auto-generated method stub
		super.show_member();
	}}
