/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import static java.lang.Math.ceil;

/**
 *
 * @author Panos
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double m = 700;
        System.out.println(m*1.036);
        m = 750;
        System.out.println(m*1.036);
        m = 780;
        System.out.println(m*1.036);
        System.out.println(m*1.036);
        double x = 9360;
//        double y = ceil(x*100);
//        double k = ceil(x*0.1)/0.1;
        double total = 36480;
        double rise = 0;
        for (int i=0;i<4;i++) {
            rise = x*0.06;
            x = x+rise;
            total = total+x*2;
            System.out.println((x/12)*1.036);
            System.out.println((x/12)*1.036);
        }    
        System.out.println(total);
        
    }
    
}
