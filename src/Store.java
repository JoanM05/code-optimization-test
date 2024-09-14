
public class Store {
    public static void main(String[] args) {

        final int PRODUCT_PRECE_1 = 15;
        final int PRODUCT_PRECE_2 = 10;
        final int PRODUCT_PRECE_3 = 5;

        final int PROMEDIO_VENTAS = 50;

        final int QUANTITIES_PRODUCT_1 = 1;
        final int QUANTITIES_PRODUCT_2 = 1;
        final int QUANTITIES_PRODUCT_3 = 1;

        int[] productsPrices = {PRODUCT_PRECE_1,PRODUCT_PRECE_2,PRODUCT_PRECE_3};
        int[] productsQuantities = {QUANTITIES_PRODUCT_1,QUANTITIES_PRODUCT_2,QUANTITIES_PRODUCT_3}; 

        int totalSales = 0;

        for (int i = 0; i<productsPrices.length; i++){
            totalSales += productsPrices[i] * productsQuantities[i];
        }

        if (totalSales > PROMEDIO_VENTAS) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
