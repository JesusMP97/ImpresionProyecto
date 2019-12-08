package com.example.impresionproyecto.data;

public class Factura {
    private String destino, horainicio, horacierre;
    private long id, idempleadoinicio, idempleadocierre;
    private float total;
    private boolean selected;

    public Factura(String destino, String horainicio, String horacierre, long id, long idempleadoinicio, long idempleadocierre, float total) {
        this.destino = destino;
        this.horainicio = horainicio;
        this.horacierre = horacierre;
        this.id = id;
        this.idempleadoinicio = idempleadoinicio;
        this.idempleadocierre = idempleadocierre;
        this.total = total;
        this.selected = false;
    }

    public String getDestino() {
        return destino;
    }

    public Factura setDestino(String destino) {
        this.destino = destino;
        return this;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public Factura setHorainicio(String horainicio) {
        this.horainicio = horainicio;
        return this;
    }

    public String getHoracierre() {
        return horacierre;
    }

    public Factura setHoracierre(String horacierre) {
        this.horacierre = horacierre;
        return this;
    }

    public long getId() {
        return id;
    }

    public Factura setId(long id) {
        this.id = id;
        return this;
    }

    public long getIdempleadoinicio() {
        return idempleadoinicio;
    }

    public Factura setIdempleadoinicio(long idempleadoinicio) {
        this.idempleadoinicio = idempleadoinicio;
        return this;
    }

    public long getIdempleadocierre() {
        return idempleadocierre;
    }

    public Factura setIdempleadocierre(long idempleadocierre) {
        this.idempleadocierre = idempleadocierre;
        return this;
    }

    public float getTotal() {
        return total;
    }

    public Factura setTotal(float total) {
        this.total = total;
        return this;
    }

    public boolean isSelected() {
        return selected;
    }

    public Factura setSelected(boolean selected) {
        this.selected = selected;
        return this;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "destino='" + destino + '\'' +
                ", horainicio='" + horainicio + '\'' +
                ", horacierre='" + horacierre + '\'' +
                ", id=" + id +
                ", idempleadoinicio=" + idempleadoinicio +
                ", idempleadocierre=" + idempleadocierre +
                ", total=" + total +
                ", selected=" + selected +
                '}';
    }
}
