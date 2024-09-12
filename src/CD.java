
public class CD extends Item{
	private String title;
	private String author;
	private boolean eCD;
	private double b_cost;
	private double e_cost;
	private int number_of_copies;

	
	public CD(int item_id, String add_date, String title, String author, boolean eCD, double b_cost, double e_cost,
			int number_of_copies) {
		super(item_id, add_date);
		this.title = title;
		this.author = author;
		this.eCD = eCD;
		this.b_cost = b_cost;
		this.e_cost = e_cost;
		this.number_of_copies = number_of_copies;
	}

	public void show_CD() {
		if (this.eCD==true)
			System.out.print("ID: "+ this.getItem_id() +" | "+"Title: "+this.title +" by "+ this .author +" | ebook available: "+ " YES "
					+ " | num of copies available: "+ this.number_of_copies+" | price: "+ this.e_cost);
			if (this.eCD==false)
				System.out.print("ID: "+ this.getItem_id() +" | "+"Title: "+this.title +" by "+ this .author +" | ebook available: "+ " NO "
			+" | num of copies available: "+ this.number_of_copies+" | price: "+ this.b_cost);
	}
		
	public void add_copies() {this.number_of_copies=this.number_of_copies+1;}
	public void mi_copies() {this.number_of_copies=this.number_of_copies-1;}
	public CD(int item_id, String add_date) {
		super(item_id, add_date);
		// TODO Auto-generated constructor stub
	}
	public String ebook_available() {
		if (this.eCD==true)
			return "yes";
		else return "false";
		}
	public void change_price(double newPrice)

		{if (this.eCD==true)
		{this.e_cost=newPrice;}
		if (this.eCD==false)
		{this.b_cost=newPrice;}}
	
	public String getTitle() {return title;}
    public void setTitle(String title) 
	{this.title = title;}
	public String getAuthor() {return author;}
	public void setAuthor(String author) 
	{this.author = author;}
	
	public int getNumber_of_copies() {return number_of_copies;}
	public void setNumber_of_copies(int number_of_copies)
	{this.number_of_copies = number_of_copies;}

	public boolean isECD() {
		return eCD;
	}

	public void setECD(boolean eCD) {
		this.eCD = eCD;
	}

	public double getB_cost() {
		return b_cost;
	}

	public void setB_cost(double b_cost) {
		this.b_cost = b_cost;
	}

	public double getE_cost() {
		return e_cost;
	}

	public void setE_cost(double e_cost) {
		this.e_cost = e_cost;
	}
	

}
