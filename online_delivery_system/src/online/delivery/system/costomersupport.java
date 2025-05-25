/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.delivery.system;
import java.util.Scanner;





public class costomersupport extends onlineshopping {
    public void costomersupport(){
        
System.out.println("U can press 1 to enter the costomer support ");
        Scanner csm = new Scanner(System.in);
            int cs=csm.nextInt();
            if(cs== 1){
                System.out.println("A popup menu has been opened for u ");
                System.out.println("  ");
                System.out.println("U have to select one of them if u like to continue");
     String ending = null;
                
                while (!"end".equals(ending)){
                    questions();
                    System.out.println("Just type end to exit this area");
                    Scanner csg = new Scanner(System.in);
                ending=csg.nextLine();
                
                }
            }
}
    public void questions(){
        System.out.println("having trouble reciving order? : press 1");
        System.out.println("  ");
        System.out.println("having trouble paying for order? : press 2");
        System.out.println("  ");
        System.out.println("having trouble brozing? : press 3");
        System.out.println("  ");
        System.out.println("to live chat with support : press 4");
        System.out.println("  ");
        
        System.out.println("enter the value here :");
        Scanner qus=new Scanner(System.in);
        int inp=qus.nextInt();
        if (inp==1){
            System.out.println("We are reviewing ur order");
            System.out.println("  ");
            System.out.println("u will be reciving the order under 2 days i not report it again ");
                System.out.println("thank u");
        }
         if (inp==2){
            System.out.println("plz try again if still not working contact live support ");
                System.out.println("thank u");
        }
         if (inp==3){
            System.out.println("thank u for ur review we are still a growing compny");
            System.out.println("  ");
            System.out.println("we will try our level best to make a comfortable interface for u to broze ");
                System.out.println("thank u");
        }
         if (inp==4){
            System.out.println("live chat is unavalible right now .");
                System.out.println("thank u");
        }
        
         
    }
    
}
