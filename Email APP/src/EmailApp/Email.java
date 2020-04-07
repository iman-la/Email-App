package EmailApp;

import java.util.Scanner;

public class Email {
	

	private String firstName;
	private String lastName;
	private String passWord;
	private String email;
	private String department;
	private int mailboxCapacity=500;
	private int passwordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";
	
	
	
	
	//constructor for fn & ln
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		
		//call a method
		this.department=setDepartment();
		
		
		//random password
				this.passWord = randomPass(passwordLength);
				System.out.println("Your password:  "+ this.passWord);
				
				email=firstName.toLowerCase()+ "."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
				
	}
	
	
	//ask for the department
	private String setDepartment(){
		System.out.println("new worker: "+firstName+". department Codes:\n1 for sales\n2 for development\n3 for accounting\n0 for none");
		Scanner in=new Scanner(System.in);
		int depchoice=in.nextInt();
		if(depchoice==1) {return "sales";	
		}else if(depchoice==2) {return "dev";}
		else if(depchoice==3) {return "acct";}
		else {return "";}
		
		
	}
	
	
	//Generate a random pass
	
	private String randomPass(int length) {
		
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
	
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
		int ran=(int)(Math.random()*passwordSet.length());
		password[i]=passwordSet.charAt(ran);	
		}
		return new String(password);
	}
	
	
	//mailbox cap
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	
	}
	
	
	//set alternateEmail
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//change pass
	public void changePassword(String password) {
	this.passWord=password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return passWord;
	}
	
	public String showInfo() {
		
		return "Display name: "+firstName+" "+lastName+
				"\ncompany Email: "+email+
				"\nMailbox Capacity: "+mailboxCapacity+"mb";
		
	}
	

}
