import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;  

class company_info{
    String Name;
   String Issue_Share;
   long current_price;
   int ID;
   int stock;
   company_info(int ID,String Name,String Issue_Share,long current_price,int stock)
   {
        this.ID=ID;
        this.Issue_Share=Issue_Share;
        this.Name=Name;
        this.current_price=current_price;
        this.stock=stock;

   }
   public String toString()
   {
    return "ID:"+ID+" "+Name+" "+Issue_Share+" "+current_price+" "+stock;
    
   }

}
public class first   
{  
public static void main(String[] args) throws IOException   
{     
File file = new File("C:\\Tirtha\\company.txt"); //initialize File object and passing path as argument  
boolean result;  
try   
{  
result = file.createNewFile();  //creates a new file  
if(result)      // test if successfully created a new file  
{  
System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
} 

File file1 = new File("C:\\Tirtha\\sell.txt"); //initialize File object and passing path as argument  
boolean result1;  
try   
{  
result = file1.createNewFile();  //creates a new file  
if(result)      // test if successfully created a new file  
{  
System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
}  


File file12 = new File("C:\\Tirtha\\purchase.txt"); //initialize File object and passing path as argument  
boolean result2;  
try   
{  
result = file1.createNewFile();  //creates a new file  
if(result)      // test if successfully created a new file  
{  
System.out.println("file created "+file.getCanonicalPath()); //returns the path string  
}  
else  
{  
System.out.println("File already exist at location: "+file.getCanonicalPath());  
}  
}   
catch (IOException e)   
{  
e.printStackTrace();    //prints exception if any  
} 


Path companyPath = Path.of("C:\\Tirtha\\company.txt");
Path sellPath=Path.of("C:\\Tirtha\\sell.txt");
Path purchasePath=Path.of("C:\\Tirtha\\purchase.txt");
ArrayList<company_info> A1=new ArrayList<>();
for (int i=0;i<1;i++)   //we given that here 4 company
{
    
    Scanner sc=new Scanner(System.in);
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter your ID:");
    int ID=sc.nextInt();
  System.out.println("Enter the Name of the company:");
    String company_name=obj.nextLine();
  System.out.println("Enter the name of the Issue you want to share:");
  String company_issue=obj.nextLine();
  System.out.println("Enter the current price:");
  long company_price=obj.nextLong();
 
  company_info C1=new company_info(ID,company_name, company_issue, company_price,7);
   A1.add(C1);
   Files.writeString(companyPath, C1.toString());
} 
System.out.println("your turn ");



}
}
