
package online.delivery.system;
import java.util.Scanner;
public class itemprocess extends onlineshopping{
    public void list(){
         trackingorder to=new trackingorder();
        paymentmethods pm1=new paymentmethods();
        System.out.println("U have selected the your product :enter 1 to check out  ");
            Scanner sc1 = new Scanner(System.in);
            //int selectr1=sc1.nextInt();
            try {
              int selectr1=sc1.nextInt(); 
              if (selectr1==1){
                System.out.println("enter the payment method u want to use ");
                System.out.println("  ");
                System.out.println("Cash on delivery :press 1");
                System.out.println("online payment  :press 2");
                 Scanner pm = new Scanner(System.in);
                 int pammethd=pm.nextInt();
                  switch (pammethd) {
                      case 1 -> pm1.cashondelivery();
                      case 2 -> pm1.onlinepayment();
                      default -> System.out.println("invalid input ");
                  }
                  System.out.println("  ");
                 System.out.println("You can track ur order by clicking 1");
                 to.ordertracking();
            }
            else {
                  System.out.println("  ");
                System.out.println("Invalid Prompt");
            }
            }
            catch(Exception e) {
                System.out.println("  ");
                System.out.println("Plz enter number 1 to check out ");
            }
            
            
    }
    
}
