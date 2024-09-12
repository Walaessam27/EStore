
public class Book extends Item{
	private String title;
	private String author;
	private boolean ebook;
	private double b_cost;
	private double e_cost;
	private int number_of_copies;
	//String t = new String("YES");
	public Book(int item_id, String add_date) {
		super(item_id, add_date);
		// TODO Auto-generated constructor stub
	}
	public Book(int item_id, String add_date, String title, String author, boolean ebook, double b_cost, double e_cost) {
		super(item_id, add_date);
		this.title = title;
		this.author = author;
		this.ebook = ebook;
		this.b_cost = b_cost;
		this.e_cost = e_cost;
	}
public Book(int item_id, String add_date, String title, String author, boolean ebook, double b_cost, double e_cost,
		int number_of_copies) {
		super(item_id, add_date);
		this.title = title;
		this.author = author;
		this.ebook = ebook;
		this.b_cost = b_cost;
		this.e_cost = e_cost;
		this.number_of_copies = number_of_copies;
	}
public void show_book() {
		if (this.ebook==true)
		System.out.print("ID: "+ this.getItem_id() +" | "+"Title: "+this.title +" by "+ this .author +" | ebook available: "+ " YES "
				+ " | num of copies available: "+ this.number_of_copies+" | price: "+ this.e_cost);
		if (this.ebook==false)
			System.out.print("ID: "+ this.getItem_id() +" | "+"Title: "+ this.title +" by "+ this .author +" | ebook available: "+ " NO "
		+" | num of copies available: "+ this.number_of_copies+" | price: "+ this.b_cost);
	}

	public int get_number_of_copies() {return number_of_copies;}
	public String ebook_available() {
		if (this.ebook==true)
			return "yes";
		else return "false";
		}
	public void add_copies() {this.number_of_copies=this.number_of_copies+1;}
	public void mi_copies() {this.number_of_copies=this.number_of_copies-1;}
	public void change_price(double newPrice)
	{
		if (this.ebook==true)
		{this.e_cost=newPrice;}
		if (this.ebook==false)
		{this.b_cost=newPrice;}
		
	}
	
	public String getTitle() {return title;}
	public void setTitle(String title) 
	{this.title = title;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) 
	{this.author = author;}
	public boolean isEbook() {return ebook;}
	public void setEbook(boolean ebook) 
	{this.ebook = ebook;}
	public double getB_cost() {return b_cost;}
	public void setB_cost(double b_cost) 
	{this.b_cost = b_cost;}
	public double getE_cost() {return e_cost;}
	public void setE_cost(double e_cost)
	{this.e_cost = e_cost;}
}
