public class Main {
    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();

        // Cliente elige pagar con tarjeta de crédito
        tienda.setMetodoPago(new TarjetaCredito());
        tienda.realizarPago(100.0);

        // Cliente elige pagar con PayPal
        tienda.setMetodoPago(new PayPal());
        tienda.realizarPago(150.0);

        // Cliente elige pagar con Cripto-Monedas
        tienda.setMetodoPago(new CriptoMonedas());
        tienda.realizarPago(200.0);

        // Cliente elige pagar con Transferencia Bancaria
        tienda.setMetodoPago(new TransferenciaBancaria());
        tienda.realizarPago(250.0);
    }
}
