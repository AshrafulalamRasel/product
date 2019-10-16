/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

import java.util.Scanner;

/**
 *
 * @author Rasel
 */
public class Product {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double quality;
        Scanner sc = new Scanner(System.in);
        quality=sc.nextDouble();
        
        ProductBazer  pba = new ProductBazer("Adidas Body Spray","xzl",290.00);
        pba.setQuality(quality);
        pba.productResult();
        pba.calculationProductPrice();
        
    }
    
}
