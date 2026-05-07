package mx.unam.fesa.ico.controller;

import mx.unam.fesa.ico.model.ModeloTablaPhone;
import mx.unam.fesa.ico.model.SmartPhone;
import mx.unam.fesa.ico.view.VentanaPrincipal;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
//mouse listener detecta el mouse y se implementan eventos del ratón

public class ControladorPrincipal implements MouseListener {

    private VentanaPrincipal view;
    private ModeloTablaPhone modelo;

    public ControladorPrincipal (VentanaPrincipal vista){
        this.view = vista;
        this.view.getBtnSaludar().addMouseListener(this);
        this.view.getLblNombre().addMouseListener(this);
        ArrayList<SmartPhone> tels = new ArrayList<>();
        tels.add(new SmartPhone("Apple", "iPhone 15", 17000.3f));
        tels.add(new SmartPhone("Samsung", "Galaxy 5", 7000.3f));
        modelo = new ModeloTablaPhone(tels);
        this.view.getTblPhone().setModel(modelo);
        this.view.getTblPhone().updateUI();
    }
    //esta es una variable local al metodo, no el atributo ensi
    @Override
    public void mouseClicked(MouseEvent e) {

        //this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        if (e.getSource() == this.view.getBtnSaludar()){
            System.out.println("Hola desde NezaYork");
            System.out.println("Hola desde otra parte XD");
            this.view.getLblSalida().setText("Hola " + this.view.getTxtNombre().getText());
        }
        if (e.getSource() == this.view.getLblNombre()){
            System.out.println("Desde etiqueta 1");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
