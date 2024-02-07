//create a banking application in which user has to create an account with information of name, dob, amount, and account. user can deposit the amount in their account as well as the withdrawal acccount. if the withdrawal amount is grater than the amount which is available in the acc at that time exception will though "insufficient amount in your acc". the last five transaction reports will be generated on the console and the same store in the account.txt file.

import java.io.File;
import java.io.IOException;
import java.util.*;

class BankDetails 
{  
    static String acc_type;  
     static String name;   
     static long amount; 
     static String dob; 
     static int withdrawal;
    static Scanner sc = new Scanner(System.in);  
    //method to open new account  
    public static void openAccount() {  
        System.out.print("Enter Account type: ");  
        acc_type = sc.next(); 
        System.out.print("Enter Name: ");  
        name = sc.next();  
        System.out.print("Enter Date of birth: ");  
        dob = sc.next();
        System.out.print("Enter Amount: ");  
        amount = sc.nextLong();  
          
    }  
    //method to display acc_type details  
    public static void show() {  
        System.out.println("Name of account type: " + name);  
        System.out.println("Name: " + acc_type);  
        System.out.println("Date of birth: " + dob);  
        System.out.println("AMount: " + amount);  
    } 

    public static void deposit() 
    {  
        long am;
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the amount you want to deposit: ");  
        am = sc.nextLong();  
        amount = amount + am;  
    }  

    public static void withdrawal() 
    {  
        long amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (amount >= amt) {  
            amount = amount - amt;  
            System.out.println("amount after withdrawal: " + amount);  
        } 
        // If the money requested for withdrawal is greater
        // than the amount then deny transaction*/
        else 
        {
            try {
                throw new Exception();
            }
 
            catch (Exception e) {
 
                System.out.println("Insufficient amount in your account.");
            }
        }
    } 


    public static void main(String[] args)
    {
        // File file=new File("D:\DHRUDEEP");
        Scanner sc=new Scanner(System.in);
        int ch;  
        do 
        {  
            System.out.println("\n1.Open Accunt\n2.Display account details\n3.Deposit\n4.Withdraw\n5.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        openAccount();
                        break;
                    case 2:
                        show();
                        break;  
                    case 3:  
                       deposit();
                        break;  
                    case 4:  
                       withdrawal();
                        break;  
                    case 5:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 5);  
        }  
    }
//         File file = new File("D:\\DHRUDEEP\\Account.txt"); //initialize File object and passing path as argument   
// try   
// {  
// boolean result = file.createNewFile();  //creates a new file  
// if(result)      // test if successfully created a new file  
// {  
// System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
// }  
// else  
// {  
// System.out.println("File already exist at location: "+file.getCanonicalPath());  
// }  
// }   
// catch (IOException e)   
// {  
// e.printStackTrace();    //prints exception if any  
// } 
// }

    



   
    

