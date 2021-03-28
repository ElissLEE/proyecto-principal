package co.edu.uniquindio.proyecto.entidades;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Entity
public class Cliente implements Serializable{

    @Id
    private String cedula;
    private String nombre;
    private String correo;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @ElementCollection
    private Map<String,String> numTelefono;

    public Cliente (){
        super();
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Map<String,String> getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Map<String,String> numTelefono) {
        this.numTelefono = numTelefono;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cedula != null ? cedula.equals(cliente.cedula) : cliente.cedula == null;
    }

    @Override
    public int hashCode() {
        return cedula != null ? cedula.hashCode() : 0;
    }
}
