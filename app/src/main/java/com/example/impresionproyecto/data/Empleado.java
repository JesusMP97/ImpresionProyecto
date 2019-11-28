package com.example.impresionproyecto.data;

public class Empleado {
    private long id;
    private String login;
    private String clave;


    public long getId() {
        return id;
    }

    public Empleado setId(long id) {
        this.id = id;
        return this;
    }

    public String setClave() {
        return clave;
    }

    public Empleado setClave(String clave) {
        this.clave = clave;
        return this;
    }

    public String setLogin() {
        return login;
    }

    public Empleado setLogin(String login) {
        this.login = login;
        return this;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
