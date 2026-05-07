package mx.unam.fesa.ico;

import mx.unam.fesa.ico.controller.ControladorPrincipal;
import mx.unam.fesa.ico.view.VentanaPrincipal;

public class Main {
    static void main() {
        VentanaPrincipal ventana = new VentanaPrincipal();
        ControladorPrincipal controlador = new ControladorPrincipal(ventana);

    }
}