/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pweb.business;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String Nombre;
    private String Numtarj;
    private String Fexp;
    private String Codseg;

    public Cliente() {
        this.Nombre = "";
        this.Numtarj = "";
        this.Fexp = "";
        this.Codseg = "";
    }

    public Cliente(String Nombre, String Numtarj, String Fexp, String Codseg) {
        this.Nombre = Nombre;
        this.Numtarj = Numtarj;
        this.Fexp = Fexp;
        this.Codseg = Codseg;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumtarj() {
        return Numtarj;
    }

    public void setNumtarj(String Numtarj) {
        this.Numtarj = Numtarj;
    }

    public String getFexp() {
        return Fexp;
    }

    public void setFexp(String Fexp) {
        this.Fexp = Fexp;
    }

    public String getCodseg() {
        return Codseg;
    }

    public void setCodseg(String Codseg) {
        this.Codseg = Codseg;
    }
}
