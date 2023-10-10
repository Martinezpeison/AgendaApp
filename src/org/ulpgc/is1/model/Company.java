package org.ulpgc.is1.model;

public class Company extends Contact{
    private String name;
    private String descripcion;

    public Company(String telephone, String email, String name, String descripcion) {
        super(telephone, email);
        this.name = name;
        this.descripcion = descripcion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
