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
public class onlineshopping extends functions{
    
    
    @Override
    public void items(){
        itemprocess ip=new itemprocess();
        System.out.println("Here is the list of items u can chose from with there prices mentioned ");
        System.out.println("  ");
        System.out.println("item 1 : price : 200 :");
        System.out.println("item 2 : price : 288 :");
        System.out.println("item 3 : price : 310 :");
        System.out.println("item 4 : price : 220 :");
        System.out.println("item 5 : price : 90 :");
        System.out.println("item 6 : price : 500 :");
        System.out.println("item 7 : price : 800 :");
        System.out.println("item 8 : price : 300 :");
        System.out.println("item 9 : price : 20 :");
        System.out.println("item 10 : price : 400 :");
        System.out.println("  ");
        System.out.println("enter the number of item u want to buy : ");
        Scanner sc = new Scanner(System.in);
        int selectr=sc.nextInt();
        switch(selectr){
            case 1:ip.list();
            break;
            case 2:ip.list();
            break;
            case 3:ip.list();
            break;
            case 4:ip.list();
            break;
            case 5:ip.list();
            break;
            case 6:ip.list();
            break;
            case 7:ip.list();
            break;
            case 8:ip.list();
            break;
            case 9:ip.list();
            break;
            case 10:ip.list();
            default :System.out.println("invalid input");
        }   
        
    }
}
