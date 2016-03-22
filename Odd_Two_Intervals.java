
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
public class Odd_Two_Intervals {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value for n : ");
        int n = in.nextInt();
        for(int i=1;i<=n;i+=6){
            System.out.println(i);
        }
    }
}
