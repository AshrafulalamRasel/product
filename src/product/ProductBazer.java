/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Rasel
 */
public class ProductBazer {
    
    private double quality;
    private String productName;
    private String productCode;
    private double productUnitPrice;
    
    
    public ProductBazer(String pName,String pCode,double puPrice){
        this.productName =pName;
        this.productCode =pCode;
        this.productUnitPrice =puPrice;
    }
    
    
    
    public void setQuality(double quality){
        this.quality =quality;
    }
    
    public double getQuality(){
        return quality;
    }
    
    public void calculationProductPrice(){
        double cost;
        cost=quality*productUnitPrice;
        System.out.println("Total Price of Product :"+cost);
    }
    
    public void productResult(){
        System.out.println("Product Name Is:"+productName);
        System.out.println("ProductCode Is:"+productCode);
        System.out.println("Product Unite Price Is:"+productUnitPrice);
        System.out.println("Product Quality:"+quality);
        
        System.out.println("dfgdsdsf");
    }
    
    
}
