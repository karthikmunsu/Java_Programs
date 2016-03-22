
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
public class Positive_Negative_Zero {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter the Number : ");
        n = in.nextInt();
        if(n<0){
            System.out.println("Negative");
        }
        else if(n==0){
            System.out.println("Zero");
        }
        else if(n>0){
            System.out.println("Positive");
        }
    }
}
