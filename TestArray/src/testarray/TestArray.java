/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarray;

/**
 *
 * @author Abel Magana
 */
public class TestArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [ ] myArr = {18, 26, 33};
        int sum=0;
        for (int x=0; x<myArr.length; x++){
            sum += myArr[x];
        }
        System.out.println("The sum is " + sum);
        // TODO code application logic here
    }
    
}
