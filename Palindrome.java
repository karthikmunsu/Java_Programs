
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
public class Palindrome {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = in.nextLine();
        StringBuilder sb = new StringBuilder(str);
        if(str.contentEquals(sb.reverse().toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
    }
}
