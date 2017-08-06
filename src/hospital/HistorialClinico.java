/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Adi
 */
public class HistorialClinico {
    
    private int codigo;
    private String fecha;
    private int idPaciente;
    private int idMedico;
    private String observaciones;

    public HistorialClinico(int codigo, String fecha, int idPaciente, int idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Historial Médico :" + "\nIdentificacion= " + codigo + "\nFecha= " + fecha + "\nID paciente= " + idPaciente +"\nID Medico= " + idMedico+"\nObservaciones= "+ observaciones;
    }
   
    
    

   
    
    
    
    
}

