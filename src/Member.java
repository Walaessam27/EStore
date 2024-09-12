
public class Member extends User{
	private int login_count=0;	
	public Member() {
		super();
		this.type=0;
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String password, String name, String email) {
		super(id, password, name, email);
		this.type=0;
		// TODO Auto-generated constructor stub
	}
	public Member(int login_count) {
		super();
		this.login_count = login_count;
		this.type=0;
	}
	@Override
	public void show_member() {
		// TODO Auto-generated method stub
		super.show_member();
	}
	public int getLogin_count() {return login_count;}
	public void setLogin_count(int login_count) 
	{this.login_count = login_count;}
}