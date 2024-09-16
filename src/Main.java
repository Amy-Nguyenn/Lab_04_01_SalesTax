 class Lab_04_01_SalesTax {
    public static void main(String[] args) {

        double priceOfPurchase = 300.00;
        double SALES_TAX = 0.05;


        double salesTax = priceOfPurchase * SALES_TAX;


        System.out.println("Price of Purchase: $" + priceOfPurchase);
        System.out.println("Sales Tax (5%): $" + salesTax);
    }
}