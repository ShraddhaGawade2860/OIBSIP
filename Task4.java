import java.util.Scanner;

class Task4 {
	
        public static String userID;
	Scanner sc=new Scanner(System.in);

	
	public void login() {
	System.out.println("---------------- WELCOME TO ONLINE EXAM SYSTEM ----------------");
        System.out.print("Enter User-Id: ");
        userID = sc.next();
        System.out.print("Enter Password: ");
        int password = sc.nextInt();
        loginto.put("Shraddha",1234);
        loginto.put("Shradhu",1232);
        loginto.put("Shra",12345);
        
        if (loginto.containsKey(userID) && loginto.get(userID) == password)
        {
            System.out.println("\n" + "LOGIN SUCCESSFULLY...!");
            Main();
        }
        else{
            System.out.println("\n" + "Invalid login credentials.!!! Please try again...");
            login();
}
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
    	        Task4 exam = new Task4();
               
                exam.login();
}








