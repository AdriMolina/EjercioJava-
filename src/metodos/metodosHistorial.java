/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import hospital.HistorialClinico;
import java.util.ArrayList;

/**
 *
 * @author Adi
 */
public class metodosHistorial {
    private static metodosHistorial instancia;
    public static metodosHistorial getInstancia(){
        if (instancia == null) {
            instancia = new metodosHistorial();
        }
        return instancia;
    }
    
    public  void registrarHistorial(ArrayList<HistorialClinico>lista, HistorialClinico historial ){
         lista.add(historial);
         
    }
    
   public  int busquedaSecuencialIdentificacion(ArrayList<HistorialClinico> arreglo, int id){
        
        for (int i = 0; i < arreglo.size(); i++) {
            if (id == arreglo.get(i).getCodigo()){
                return i;
                
            }
        }
        return -1;
    }
    
//    public int busquedaSecuencialNombre(ArrayList<HistorialClinico> arreglo,String nombre){
//        
//        for (int i = 0; i < arreglo.size(); i++) {
//            if (arreglo.get(i).getNombre().equals(nombre)) {
//                return i;
//                
//            }
//        }
//        return -1;
//    }
    
    
    public String imprimirListaID(ArrayList<HistorialClinico>lista, int id){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
             if (lista.get(i).getCodigo() == id) {
                 result += lista.get(i).toString();
            
            }
           
            
        }
        return result;
    }
    
    public void modificarCodigo(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setCodigo(id2);
        
    }
    
    public void modificarFecha(ArrayList<HistorialClinico>lista,int fecha1, String fecha2){
        lista.get(fecha1).setFecha(fecha2);
        
    }
    public void modificarIDPaciente(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setIdPaciente(id2);
        
    }
    
    public void modificarIDMedico(ArrayList<HistorialClinico>lista,int id1,int id2){
        lista.get(id1).setIdMedico(id2);
        
    }
    public void modificarObservaciones(ArrayList<HistorialClinico>lista,int observaciones1, String observaciones2){
        lista.get(observaciones1).setObservaciones(observaciones2);
        
    }
    
    
    
     public String imprimirLista(ArrayList<HistorialClinico>lista){
        String result ="";
        for (int i = 0; i < lista.size(); i++) {
            result += lista.get(i).toString();
            
            
        }
        return result;
    }
     public void eliminarRegistro(ArrayList<HistorialClinico>lista, int id){
     lista.remove(id);
     }
}
