/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationarray;

/**
 *
 * @author Abel Magana
 */
public class MultiplicationArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [ ] myArr = {18, 26, 33};
        int product=1;
        for (int x=0; x<myArr.length; x++){
            product *= myArr[x];
        }
        System.out.println("The product is " + product);
        // TODO code application logic here
    }
    
}
