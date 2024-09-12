import java.util.ArrayList;
import java.util.Scanner;

public class EStore {
	static ArrayList <Book> book=new ArrayList <Book>();
	static ArrayList <User> user=new ArrayList <User>();
	static ArrayList <CD> cd=new ArrayList <CD>();
	static ArrayList <Item> item=new ArrayList <Item>();
String sh;
/*	public static void main(String[] args) {
			init();	
	
		    System.out.println("The NAME: Ahmad, The PASS: 1234.");
	    	System.out.println("The NAME: ABDALLAH, The PASS: 1233.");
     		System.out.println("The NAME: SANA, The PASS: 4567.");
			System.out.println("Thse NAME: JAFAR, The PASS: 1567.");
			System.out.println("The NAME: MAHMOOD, The PASS: 1237.");
			System.out.println("The NAME: OMAR, The PASS: 1767.");
			System.out.println(" ");
			
		// int i=authenticate_user();
		//if (user.get(i).type==2) { admin_activities();}
		//if (user.get(i).type==0||user.get(i).type==1)user_activities();
	}*/
	public static void init() {
		user.add(new Admin("11","1234","Ahmad","Ahmad@najah"));
		user.add(new Member("12","1233","ABDALLAH","abdallah@najah"));
		user.add(new NonMember("13","4567","SANA","sana@najah"));
		user.add(new Admin("14","1567","JAFAR","jafar@najah"));
		user.add(new Member("15","1237","MAHMOOD","mahmood@najah"));
		user.add(new Admin("16","1767","OMAR","omar@najah"));
		
		book.add(new Book(10,"1/2","A","ASMAA",true,0,11,2));
		book.add(new Book(11,"1/3","B","WALA",false,12,0,3));
		book.add(new Book(12,"1/4","C","ESAM",true,12,11,1));
		book.add(new Book(13,"1/5","D","RASHED",false,12,11,2));
		book.add(new Book(14,"1/6","E","TALA",true,12,11,3));
		
		cd.add(new CD(0,"11/2","AA","QAIS",true,23,22,4));
		cd.add(new CD(1,"1/10","BB","SALEEM",false,22,12,3));
		cd.add(new CD(2,"12/2","CC","SAEED",true,12,3,4));
		cd.add(new CD(3,"1/10","DD","REEMA",true,33,44,3));
		cd.add(new CD(4,"1/12","EE","QASEM",false,25,54,1));
			}
	
	public static int authenticate_user(String userName , String pass) {
		int flag=-1;
		while(flag==-1) {
		 System.out.println("Enter username: "); 
		 Scanner OU = new Scanner(System.in);
		    //String userName;		   
		    userName = OU.nextLine();
		    System.out.println("Enter passWord: "); 
			 Scanner OP = new Scanner(System.in);
			    //String pass;		   
			    pass = OP.nextLine();
			    
			    for (int i = 0; i < user.size(); i++) {
			    	
			       if (userName.equals(user.get(i).name)){
			    	   
			    	   if (pass.equals(user.get(i).password)){
			    		  
			    		   if (user.get(i).type==2){
			    			   System.out.println(" "); 
			    			   System.out.println("WELCOME ADMIN "+userName); 
			    			   System.out.println("----------------------------------------------------------------------------------------------"); 
			    			  flag =i; }
			    		   
			    		   else  if (user.get(i).type==0){
			    			   System.out.println(" "); 
			    			   System.out.println("WELCOME USER "+userName); 
			    			   System.out.println("----------------------------------------------------------------------------------------------"); 
			    			  flag =i; }
			    		   
			    		   else   if (user.get(i).type==1){
			    			   System.out.println(" "); 
			    			   System.out.println("WELCOME USER "+userName); 
			    			   System.out.println("----------------------------------------------------------------------------------------------"); 
			    			  flag =i; }
			    		   
			    		   else flag =-1;
			    		   System.out.println(" ");  		      		
	}}  }}
		
		
		 return flag;
	}
	public static void admin_activities(String nn)
	{
		while(true) {
		 System.out.println(" ");
		 System.out.println("1. Show all items.");
		 System.out.println("2. Display all users.");
		 System.out.println("3. Change price of item.");
		 System.out.println("4. Add new user.");
		 System.out.println("5. Add copies to the items.");
		 System.out.println("6. Quit.");
		 System.out.println(" ");
		 
		 Scanner S = new Scanner(System.in);
		 String n;
		
	    System.out.println("Enter the number= "); 
	    n = S.nextLine();
	   		    
		switch(nn){
		
		case "1": System.out.println("...Showing all items...");
		System.out.println("THE BOOKS:");
		for (int i = 0; i < book.size(); i++) {
			book.get(i).show_book();
			
			System.out.println(" ");
			
		      } 
		System.out.println(" ");
		System.out.println("THE CDs:");
		for (int i = 0; i < cd.size(); i++) {
			cd.get(i).show_CD();
			System.out.println(" ");
		      } 
	      
			break;
		case "2": System.out.println("...Display all users...");
		 for (int i = 0; i < user.size(); i++) {   
		       user.get(i).show_member();
		      }
			break;
		case "3": System.out.println("...Change price of item...");
		System.out.println("Choose which the type?");
		System.out.println("1- BOOK    2- CD.");
		Scanner AAA = new Scanner(System.in);
		 String n_CD_BOOK;
		 n_CD_BOOK = AAA.nextLine();
		
		if (n_CD_BOOK.equals("1"))
		{
		System.out.println("Enter the name of the book: "); 
		Scanner A = new Scanner(System.in);
		 String nameBook;
		 nameBook = A.nextLine();
		    for (int i = 0; i < book.size(); i++) {
				if (nameBook.equals(book.get(i).getTitle())) {
					System.out.println("Please Enter the new price: ");
					Scanner BB = new Scanner(System.in);
					 String newPrice;
					 newPrice = BB.nextLine();
					double np= Integer.parseInt(newPrice);
					 book.get(i).change_price(np);					 
				} 
			      }
		}
		
		if (n_CD_BOOK.equals("2"))
		{
		System.out.println("Please Enter the new price: ");
		Scanner A = new Scanner(System.in);
		 String nameCD;
		 nameCD = A.nextLine();
		    for (int i = 0; i < cd.size(); i++) {
				if (nameCD.equals(cd.get(i).getTitle())) {
					System.out.println("Please Enter the new price: ");
					Scanner CC = new Scanner(System.in);
					 String newPrice;
					 newPrice = CC.nextLine();
					double np= Integer.parseInt(newPrice);
					 cd.get(i).change_price(np);					 
				} 
			      }
		}
		    
		    
		    break;
		case "4": System.out.println("...Add new user...");
		System.out.println("PLEASE INPUT THIS INFORMATION: ");
		System.out.println("ID: ");
		Scanner ID = new Scanner(System.in);
		 String id;
		 id = ID.nextLine();
		 System.out.println("PASSWORD: ");
		 Scanner PASS = new Scanner(System.in);
		 String pass;
		 pass = PASS.nextLine();
		 System.out.println("NAME: ");
		 Scanner NAME = new Scanner(System.in);
		 String name;
		 name = NAME.nextLine();
		 System.out.println("EMAIL: ");
		 Scanner EMAIL = new Scanner(System.in);
		 String email;
		 email = EMAIL.nextLine();
		 
		 System.out.println("TYPE: ");
		 System.out.println("please choose the num: 1. Admin. //2. Member. //3. Nonmember.  "); 
		 Scanner TYPE = new Scanner(System.in);
		 String type;
		 type = TYPE.nextLine();
		 
		 if(type.equals("1")) user.add(new Admin(id,pass,name,email));
		 else  if(type.equals("2")) user.add(new Member(id,pass,name,email));
		 else  if(type.equals("3")) user.add(new NonMember(id,pass,name,email));
		 else System.out.println("there is an error. ");
		
		
		    break;
		    
		   
		case "5":System.out.println("...Add copies to the items...");
		 System.out.println("...Change price of item...");
			System.out.println("Choose which the type?");
			System.out.println("1- BOOK    2- CD.");
			Scanner AA = new Scanner(System.in);
			 String nc_CD_BOOK;
			 nc_CD_BOOK = AA.nextLine();
			
			if (nc_CD_BOOK.equals("1"))
			{
		System.out.println("Enter the name of the book: "); 
		Scanner s = new Scanner(System.in);
		 String Q;
		    Q = s.nextLine();
		    for (int i = 0; i < book.size(); i++) {
				if (Q.equals(book.get(i).getTitle())) {
					 book.get(i).add_copies();					 
				}
				 } }
			if (nc_CD_BOOK.equals("2"))
			{
		System.out.println("Enter the name of CD: "); 
		Scanner n_CD = new Scanner(System.in);
		 String Q;
		    Q = n_CD.nextLine();
		    for (int i = 0; i < cd.size(); i++) {
				if (Q.equals(cd.get(i).getTitle())) {
					 cd.get(i).add_copies();					 
				}
				 } }
			
			
		break;
			
		case "6":
			System.out.println("...Quit.../n");
			System.out.println();
			System.out.println("THANK YOU VERY MUCH.");
			System.exit(0);
		
		default: System.out.println("try again!!");
		}}
	}
	
	public static void user_activities() {
		
		while (true) {
			System.out.println("1. Add item to shopping cart.\n"
			+"2. View shopping cart.\n"
			+"3. Remove item from shopping cart.\n"
			+"4. Checkout.\n"
			+"5. List all items.\n" 
			+"6. Print previous purchases for a specific user.\n"
			+"7. exit.\n");
			
			 System.out.println(" ");
			 
			 Scanner S = new Scanner(System.in);
			 String n;
			
		    System.out.println("Enter the number= "); 
		    n = S.nextLine();
		    switch(n) {
		    
		    case "1":System.out.println("...Add item to shopping cart...\n"); 
		    
		    System.out.println("THE BOOKS:");
			for (int i = 0; i < book.size(); i++) {
				book.get(i).show_book();
				
				System.out.println(" ");
			      } 
			System.out.println(" ");
			System.out.println("THE CDs:");
			for (int i = 0; i < cd.size(); i++) {
				cd.get(i).show_CD();
				System.out.println(" ");
			      } 
			System.out.println(" ");
			
			System.out.println("Please choose ID of CD OR BOOK:");
			
			
			 Scanner BOOK = new Scanner(System.in);
			 String boo;
			 boo = BOOK.nextLine();
			 int nB= Integer.parseInt(boo);
			 
			 if (nB>=10 && nB <20)
			 {
				 for (int i = 0; i < book.size(); i++) {
						if (book.get(i).getItem_id()==nB)
							 item.add( book.get(i) );
						book.get(i).mi_copies();
						} 
			 }
			 
			  if (nB>=0 && nB <10)
			 {
				 for (int i = 0; i < cd.size(); i++) {
						if (cd.get(i).getItem_id()==nB)
							 item.add( cd.get(i) );
						cd.get(i).mi_copies();
						
				      } 
			 }
			 
			 
			 
			System.out.println(" ");
		
		      
				break;
		    case "2":System.out.println("...View shopping cart...\n"); 
		    System.out.println("THE Shopping cart:\n");
			for (int i = 0; i < item.size(); i++) {
if ( item.get(i).getItem_id()>=10 && item.get(i).getItem_id() <20)
					
				{ for (int j = 0; j < book.size(); j++) {
							if (book.get(j).getItem_id()==item.get(i).getItem_id())
								
							book.get(j).show_book();
							
						      } 
				
				}	
System.out.println(" ");
if ( item.get(i).getItem_id()>=0 && item.get(i).getItem_id() <=10)
					
				{ for (int j = 0; j < cd.size(); j++) {
							if (cd.get(j).getItem_id()==item.get(i).getItem_id())
								
							cd.get(j).show_CD();							
						      } 
				
				}
			      }
			System.out.println(" ");
		    break;             
		    case "3":System.out.println("...Remove item from shopping cart...\n"); 
		 
		    break;
		    case "4":System.out.println("...Checkout...\n"); 
		    for (int i = 0; i < item.size(); i++) {
		    	if ( item.get(i).getItem_id()>=10 && item.get(i).getItem_id() <20)
		    						
		    					{ for (int j = 0; j < book.size(); j++) {
		    								if (book.get(j).getItem_id()==item.get(i).getItem_id())
		    									
		    								book.get(j).add_copies();
		    								
		    							      } 
		    		
		    					}	
		    	System.out.println(" ");
		    	if ( item.get(i).getItem_id()>=0 && item.get(i).getItem_id() <=10)
		    						
		    					{ for (int j = 0; j < cd.size(); j++) {
		    								if (cd.get(j).getItem_id()==item.get(i).getItem_id())
		    									
		    								cd.get(j).add_copies();							
		    							      } 
		    					}
		    				      }
		    item.clear();
		    break;
		    case "5":System.out.println("...List all items...\n"); 
		    System.out.println("THE BOOKS:");
			for (int i = 0; i < book.size(); i++) {
				book.get(i).show_book();
				
				System.out.println(" ");
			      } 
			System.out.println(" ");
			System.out.println("THE CDs:");
			for (int i = 0; i < cd.size(); i++) {
				cd.get(i).show_CD();
				System.out.println(" ");
			      } 
		    break; 
		    case "6":System.out.println("...Print previous purchases for a specific user...\n");
		    break;
		    case "7":System.out.println("...Exit...\n"); 
			System.out.println();
			System.out.println("THANK YOU VERY MUCH.");
			System.exit(0);
			 break;
		default: System.out.println("try again!!");		    
		    }
		
		}
		
		}

}
