
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
public class Sum_Of_N {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the N-value ");
        int n = in.nextInt();
        int tmp=0;
        for(int i=1 ; i<=n ; i++){
            tmp+=i;
        }
        System.out.println(tmp);
    }
}
