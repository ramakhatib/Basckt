git add .
package Basket;


public class Demo {
    public static void main(String[] args) {
        Basket<Double, Double> b = new Basket<>();
        b.add(2.4);
        b.add(5.6);
        System.out.println(b.toString());
	b.add(8.0);
	System.out.println(b.toString());
	
        
       
    }
}
