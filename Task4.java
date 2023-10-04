import java.util.Scanner;

class Task4 {
	
	String userName;
	String password;
	Scanner sc=new Scanner(System.in);

	public void register() {
		System.out.print("\nEnter Your Username - ");
		userName = sc.nextLine();
		System.out.print("\nEnter Your Password - ");
		password = sc.nextLine();
		System.out.println("\nRegistration completed..kindly login");
	}
	
	public void login() {
		while ( Login ) {
			System.out.print("\nEnter Your Username - ");
			String Username = sc.nextLine();
			if ( Username.equals(userName) ) {
				while ( Login ) {
					System.out.print("\nEnter Your Password - ");
					String Password = sc.nextLine();
					if ( Password.equals(password) ) {
						System.out.print("\nLogin successful!!");
					}
					else {
						System.out.println("\nIncorrect Password");
					}
				}
			}
			else {
				System.out.println("\nUsername not found");
			}
		}
		return Login;
	}


public void Main()
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Online Examination System ---> Welcome " + OnlineExam.userName + "!");
        System.out.println("-----------------------------------------------------");
        System.out.println("Select 1 to Start the test...");
        System.out.println("Select 3 to Logout...");
        System.out.println("-----------------------------------------------------");
        System.out.print("Select Option: ");
        int sp=sc.nextInt();
        switch(sp){
            case 1: 
            	test();
            	Main();
            	break;
            case 2: 
                System.out.println("\n" + "Logout Successfully...!");
                System.out.println("Thank You for Attending the Test...");
                System.out.println("-----------------------------------------------------");
            	System.exit(0);
            	break;
            default: 
            	System.out.println("\n" + "Invalid Option Choice.! Try again...");
            	Main();
            	break;
        }
    }
    
public void test(){
        int score = 0;
        int c = 0;
        char ans;
        System.out.println("\n\n----------------- STARTING THE TEST -----------------");
        System.out.println("Each question consist of 4 option you have to choose correct answer");
        System.out.println("All the very best.!!");
        
       
            System.out.println("Ques1. Java is developed by:");
            System.out.println("\ta.James Gosling \n\tb.Dennis Ritchie\n\tc.Steve Jobs\n\td.Ken Thompson");
            System.out.print("\n" + "Answer: ");
            ans = sc.next().charAt(0);
            if(ans == 'c')
            {
                c += 1;
            }
            
            System.out.println("Ques2. Java is:");
            System.out.println("\ta.High Level\n\tb.Low Level\n\tc.Middle Level\n\td.Machine Level");
            System.out.print("\n" + "Answer: ");
            ans = sc.next().charAt(0);
            if(ans == 'a')
            {
                c += 1;
            }
           
            
            System.out.println("Ques3. Java is:");
            System.out.println("\ta.Platform Dependent\n\tb.Platform Indepenedent\n\tc.None\n\td.All of the above");
            System.out.print("\n" + "Answer: ");
            ans = sc.next().charAt(0);
            if(ans == 'c'){
                c += 1;
            }
           
            
            System.out.println("Ques4. Technical Name of Core Java is knon as:");
            System.out.println("\ta.JSE\n\tb.JEE\n\tc.J2SE\n\td.J2EE");
            System.out.print("\n" + "Answer: ");
            ans = sc.next().charAt(0);
            if(ans == 'b')
            {
                c += 1;
            }
           
            System.out.println("Ques5. Java is:");
            System.out.println("\ta.Compiled Language\n\tb.Interpreted Language\n\tc.Both Compiled and Interpreted\n\td.None");
            System.out.print("\n" + "Answer: ");
            ans = sc.next().charAt(0);
            if(ans == 'a') 
            {
                c += 1;
            }
            break;
        }
        
        System.out.println("\n" + "Test Completed.!");
        score = (c * 5);
        System.out.println("Number of correct answers: " +c);
        System.out.println("Congratulations!! Your scored " +score+ " points...");
    }
    

 public static void main(String args[]){
                System.out.println("1.Register \n2.Login \3.Exit");
		System.out.print("Enter Your Choice - ");
		int choice = sc.nextInt();
		
		if ( choice == 1 ) {
    	        OnlineExam exam = new OnlineExam();
                exam.register();
                }
                else if(choice == 2)
                {
                exam.login();
                }
                else
                {
                 System.exit(0);
                }
    }
}








