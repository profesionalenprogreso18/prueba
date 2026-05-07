package mx.unam.fesa.ico.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaPhone implements TableModel {
    private ArrayList<SmartPhone> data;

    public ModeloTablaPhone(ArrayList<SmartPhone> info){
        this.data = info;
    }


    @Override
    public int getRowCount() {
        return data.size(); //va a reportar a la lista cuantos renglones de una fila hay
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String comulmnName = "";
        switch (columnIndex) {
            case 0:
                comulmnName = "Marca";
                break;
            case 1:
                comulmnName = "Modelo";
                break;
            case 2:
                comulmnName = "Precio";
                break;
            default:
                comulmnName = "NA";
                break;
        }
        return comulmnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Float.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        SmartPhone phone = data.get(rowIndex);
        switch (columnIndex){
            case 0:
                return phone.getMarca();
            case 1:
                return phone.getModelo();
            case 2:
                return phone.getPrecio();
            default:
                return "NA";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}