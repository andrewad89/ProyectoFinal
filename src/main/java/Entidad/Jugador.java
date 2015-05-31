package Entidad;


public class Jugador {
    
    private Double id;
    private String firstname;
    private String lastname;
    private String fecha_nac;
    private String salario; 
    private String posicion;
    private String duracion;

    public Jugador() {
    }

    public Jugador(
            Double id,
            String firstname,
            String lastname,
            String fecha_nac,
            String salario,
            String posicion,
            String duracion) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.fecha_nac = fecha_nac;
        this.salario = salario;
        this.posicion = posicion;
        this.duracion = duracion;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

   
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

}