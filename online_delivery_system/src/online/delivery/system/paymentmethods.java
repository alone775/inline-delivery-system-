/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online.delivery.system;
import java.util.Scanner;
/**
 *
 * @author wasay
 */
public class paymentmethods {
    public void cashondelivery(){
        paymentmethods py=new paymentmethods();
        System.out.println("Great u have selected a payment method ");
        System.out.println("  ");
        System.out.println("there will be XX aditional charges when u recive ur parcal ");
        py.details();
        
        
    }
    public void onlinepayment (){
        paymentmethods py=new paymentmethods();
        System.out.println("Great Which medium u use:");
        System.out.println("  ");
        System.out.println("for Easypaisa : press 1 :");
        System.out.println("for Jazzcash : press 2 :");
        System.out.println("for Bank Account : press 3 :");
        Scanner choice = new Scanner(System.in);
        int ch=choice.nextInt();
        switch(ch){
            case 1:System.out.println("plz enter your easypaisa number here will send u a link regarding the payment ");
                   Scanner num=new Scanner(System.in);
                   int easynum=num.nextInt();
                   break;
            case 2:System.out.println("plz enter your jazzcash number here will send u a link regarding the payment ");
             Scanner num1=new Scanner(System.in);
                   int jazznum=num1.nextInt();
                   break;
            case 3:System.out.println("plz enter your bank details  we will deduct the amount owed by you:");
            System.out.println("  ");
              System.out.println("Plz enter the Account holders name :");
              Scanner name=new Scanner(System.in);
              String holdername =name.nextLine();
              System.out.println("Plz enter your bank account number :");
                Scanner num2=new Scanner(System.in); 
                 int accnum=num2.nextInt();
                break;
            default: System.out.println("Plz choose a valid payment method");
        }
        py.details();
        System.out.println("Your parcel will be delivered within 2 to 3 working days ");
        System.out.println("  ");
        System.out.println("thank u for ur purchase :(Smileface) ");
        

    }
    public void details(){
                String Email;
        String address;
        int phonenumber;
        System.out.println("Now we just need some details from you to complete the process");
        System.out.println("  ");
        System.out.println("First of all plz enter your email where we can contact u : ");
        Scanner adrs=new Scanner (System.in);
        Email= adrs.nextLine();
        System.out.println("Great now your phone number where we can contect u  ");
        Scanner num=new Scanner(System.in);
        phonenumber=num.nextInt();
        System.out.println("Now your address where u would like the product to be delivered  ");
        Scanner add=new Scanner(System.in);
        address=add.nextLine();
        System.out.println("Your postal code");
        Scanner code=new Scanner(System.in);
        int pcode=code.nextInt();
    }
     
}
