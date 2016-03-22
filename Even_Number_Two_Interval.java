
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
public class Even_Number_Two_Interval {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of N : ");
        int n = in.nextInt();
        for(int i=2;i<=n;i+=6){
            System.out.println(i);
        }
    }
}
