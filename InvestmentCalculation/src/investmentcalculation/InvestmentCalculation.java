/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentcalculation;

import java.util.Scanner;

/**
 *
 * @author Azaam
 */
public class InvestmentCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter present value: ");
 
	double p = sc.nextDouble();
 
	 System.out.print("Enter the interest rate: ");
 
	 double r = sc.nextDouble();
 
	System.out.print("Enter the time period in years: ");
 
	 double y = sc.nextDouble();          
 
   double  e = InvestmentCalculation(p,r,y);
      
        System.out.print("value is:= "+e+"\n");
    }
    static double  InvestmentCalculation(double p,double r,double y)
	{
	double investment = p * Math.pow((1+r/100),y);
	
	return investment;
	} 
    
}
