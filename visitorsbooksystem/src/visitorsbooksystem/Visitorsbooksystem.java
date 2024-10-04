package visitorsbooksystem;
import java.util.Scanner;
public class Visitorsbooksystem {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String name,telephone,signature,timeIn,timeOut;
// Loop for 3 visitors 
for(int i=0;i<3;i++) {
System.out.println("Visitor"+(i+1)+"details:");
name=input.nextLine();
System.out.print("Enter Signature:");signature=input.nextLine();
System.out.print("Enter Time In:");
timeIn=input.nextLine();
System.out.print("Enter Time Out:");
timeOut=input.nextLine();

//Display the collected details
System.out.println("Visitor"+(i+1)+"Information:");
System.out.println("Name:"+name);
System.out.println("telephone");
System.out.println("Signature:"+signature);
System.out.println("Time In:"+timeIn);
System.out.println("Time Out:+ time Out");
System.out.println(".......................\n");

	}
	}
}
