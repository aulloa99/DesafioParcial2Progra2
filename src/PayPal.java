public class PayPal implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con PayPal.");
        // Implementación de autenticación de usuario y verificación de transacciones.
    }
}