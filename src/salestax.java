public class salestax {
    public static void main(String[] args) {
        final double salesTax = (.05);// this makes the int a constant
        double subTotal= 25;// this number can be changed to whatever the purchase price is
        double totalCost = (subTotal*salesTax)+subTotal;//this is sales tax and subtotal all added together
        System.out.println("Your total purchase amount with sales tax is $" +totalCost+".") ;// this is the output



    }
}