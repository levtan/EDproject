package Data;

import java.io.Serializable;

public class Evento implements Serializable{
    String NombreEvento;
    String date;
    String descripcion;
    String encargado;

    @Override
    public String toString() {
        return "Evento{" + "NombreEvento=" + NombreEvento + ", date=" + date + ", descripcion=" + descripcion + ", encargado=" + encargado + '}';
    }
    
    

    public String getNombreEvento() {
        return NombreEvento;
    }

    public void setNombreEvento(String NombreEvento) {
        this.NombreEvento = NombreEvento;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Evento(String NombreEvento, String date, String descripcion, String encargado) {
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.descripcion = descripcion;
        this.encargado = encargado;
    }

    public Evento(String NombreEvento, String date, String encargado) {
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.encargado = encargado;
    }
    
    
    public Evento(){
        this.NombreEvento = NombreEvento;
        this.date = date;
        this.descripcion = descripcion;
        this.encargado = encargado;
    }
    
}
