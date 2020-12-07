package Data;

import java.io.Serializable;


public class Usuario implements Serializable{
    private String Username;
    private String pass;
    private int celular;
    private int cedula;
    private String carrera;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Usuario(String Username, String pass, int celular, int cedula, String carrera, String correo) {
        this.Username = Username;
        this.pass = pass;
        this.celular = celular;
        this.cedula = cedula;
        this.carrera = carrera;
        this.correo = correo;
    }

    public Usuario(String Username, String pass) {
        this.Username = Username;
        this.pass = pass;
    }
    
    public boolean confirmation(String User, String pss){
        if(User.equals(Username)&&pss.equals(pass)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + '}';
    }
    
    
}
