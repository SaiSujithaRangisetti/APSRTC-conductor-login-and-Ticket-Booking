import java.util.*;
public class tick {
public static void main(String...s) {
String name,so,dest,dat,time;
int dur,amo,pass;
Scanner sc=new Scanner(System.in);
System.out.println("							WELCOME TO APSRTC CONDUCTOR LOGIN");
System.out.println("Enter the name : ");
name=sc.nextLine();
System.out.println("Enter the date in dd/mm/yyyy : ");
dat=sc.nextLine();
System.out.println("Enter the Duration of trip (in Hours) :");
dur=sc.nextInt();
sc.nextLine();
System.out.println("Enter the Source :");
so=sc.nextLine();
System.out.println("Enter the Destination: ");
dest=sc.nextLine();
System.out.println("Enter the amount :");
amo=sc.nextInt();
System.out.println("========================================================================");
System.out.println("							WELCOME TO APSRTC PASSENGER LOGIN");
System.out.println("From :"+so);
System.out.println("To :"+dest);
System.out.println("Duration of trip (in Hours) :"+dur);
System.out.println("Count of Passengers :");
pass=sc.nextInt();
System.out.println("================================================================================");
System.out.println("							WELCOME TO APSRTC");
System.out.println("				Date: " +dat+ "									Time: "+dur+" (in Hours)");
System.out.println("			"+so+" 				TO			 "+dest);
System.out.println("							Pass Rs.:"+pass+"*"+amo);
System.out.println("							Amount : Rs."+(pass*amo));
System.out.println("							HAPPY JOURNEY :-)");
System.out.println("							NOT TRANSFERRABLE");
}
}
