/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import hospital.Paciente;
import java.util.ArrayList;

/**
 *
 * @author Adi
 */
public class metodosPacientes  {
    private static metodosPacientes instancia;
    public static metodosPacientes getInstancia(){
        if (instancia == null) {
            instancia = new metodosPacientes();
        }
        return instancia;
    }
    
    public  void registrarPaciente(ArrayList<Paciente> lista,Paciente paciente ){
         lista.add(paciente);
         
    }
    
   public  int busquedaSecuencialIdentificacion(ArrayList<Paciente> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getId()) {
                return i;
                
            }
        }
        return -1;
    }
    
    public int busquedaSecuencialNombre(ArrayList<Paciente> arreglo,String nombre){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (arreglo.get(i).getNombre().equals(nombre)) {
                return i;
                
            }
        }
        return -1;
    }
    public  int busquedaSecuencialEdad(ArrayList<Paciente> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getId()) {
                return i;
                
            }
        }
        return -1;
    }
    
    public String imprimirListaID(ArrayList<Paciente>lista, int id){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getId() == id) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
    
    public void modificar(ArrayList<Paciente>lista,int id1,int id2){
        lista.get(id1).setId(id2);
        
    }
    
    public void modificarNombre(ArrayList<Paciente>lista,int nombre1, String nombre2){
        lista.get(nombre1).setNombre(nombre2);
        
    }
    
    public void modificarApellidos(ArrayList<Paciente>lista,int apellido1, String apellido2){
        lista.get(apellido1).setApellidos(apellido2);
        
    }
    
    
     public String imprimirListaNombre(ArrayList<Paciente>lista, String nombre){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getNombre().equals(nombre)) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
     public String imprimirLista(ArrayList<Paciente>lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();
            
            
        }
        return result;
    }
     public void eliminarRegistro(ArrayList<Paciente>lista, int id){
     lista.remove(id);
     }
    
}

    
   
    
    
    
