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
public class trackingorder extends onlineshopping {
        public void ordertracking(){
        System.out.println("to track your order press 1 :");
        Scanner sc2 = new Scanner(System.in);
        int tracking=sc2.nextInt();
        if (tracking==1){
            System.out.println("your order is being prepaired for departure");
        }
        else {
            System.out.println("invalid input");
        }
    
}
}
