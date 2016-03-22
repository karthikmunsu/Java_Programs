/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Player_Level;

import java.util.Scanner;

/**
 *
 * @author karthik
 */
public class Reverse_String {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        System.out.print(sb.reverse());
    }
}
