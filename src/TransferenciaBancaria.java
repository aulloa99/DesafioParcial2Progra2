public class TransferenciaBancaria implements MetodoPago {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con Transferencia Bancaria.");
        // Implementación de verificaciones manuales y transacción.
    }
}