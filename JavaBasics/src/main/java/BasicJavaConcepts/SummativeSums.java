/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasicJavaConcepts;
import java.util.Scanner;
/**
 *
 * @author pbott
 */
public class SummativeSums {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int array1 = arraySum(scan.nextLine());
        int array2 = arraySum(scan.nextLine());
        int array3 = arraySum(scan.nextLine());
        
        System.out.println("#1 Array sum: " + array1);
        System.out.println("#2 Array sum: " + array2);
        System.out.println("#3 Array sum: " + array3);
        
    }
    
    public static int arraySum(String s){
        String str = s.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll(" ", "");
        String[] nums = str.split(",");
        int i = 0;
        for(String temp : nums){
            i += Integer.parseInt(temp);
        }
        return i;
    }
    
}
