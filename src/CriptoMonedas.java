public class CriptoMonedas implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con Cripto-Monedas.");
        // Implementación de verificación a través de blockchain.
    }
}