
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karthik
 */
public class Even_Odd {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.print("Enter the Number : ");
        n = in.nextInt();
        if(n%2==0){
            System.out.println("even");
        }else if(n%2==1){
            System.out.println("odd");
        }
    }
}
