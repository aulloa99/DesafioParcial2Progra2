public class TiendaOnline {
    private MetodoPago metodoPago; // La estrategia actual seleccionada

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago(double monto) {
        if (metodoPago != null) {
            metodoPago.procesarPago(monto); // Usar la estrategia seleccionada
        } else {
            System.out.println("Seleccione un método de pago.");
        }
    }
}
