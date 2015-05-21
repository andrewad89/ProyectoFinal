package daw.ed.spark;



public class User {

    private String firstname;
    private String lastname;
    private String cumple;
    private String salario;
    private String posicion;
    private String duracioncont;

    public User() {
    }

    public User(String firstname, String lastname, String cumple, String salario, String posicion, String duracioncont) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cumple = cumple;
        this.salario = salario;
        this. posicion = posicion;
        this.duracioncont = duracioncont;
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

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getDuracioncont() {
        return duracioncont;
    }

    public void setDuracioncont(String duracioncont) {
        this.duracioncont = duracioncont;
    }
    
    
}
