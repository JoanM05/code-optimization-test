public class TaxCalculation {
    public static void main(String[] args) {
        // Constantes
        final double[] PRODUCT_PRICES = {100, 200};
        final double[] TAX_RATES = {0.15, 0.10};
        final double TAX_THRESHOLD = 50; 

        double totalTax = 0; // Inicializamos el total de impuestos

        // Cálculo del total de impuestos
        for (int i = 0; i < PRODUCT_PRICES.length; i++) {
            totalTax += PRODUCT_PRICES[i] * TAX_RATES[i]; // Sumar el impuesto de cada producto
        }

        // Evaluar total tax
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}

