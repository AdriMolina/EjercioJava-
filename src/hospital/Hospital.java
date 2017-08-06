/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import metodos.metodosHistorial;
import metodos.metodosMedicos;
import metodos.metodosPacientes;

/**
 *
 * @author Adi
 */
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int opcion = 0;
        ArrayList<Paciente> paciente = new ArrayList<>();
        ArrayList<Medico> medico = new ArrayList<>();
        ArrayList<HistorialClinico> historial = new ArrayList<>();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1.-Gestionar Pacientes.\n 2.-Gestionar Medicos\n3.-Gestionar Historial Clinico\n4.-Salir"));
        switch (opcion){
            case 1:

               int opcionPaciente= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Paciente\n 2.-Consultar Paciente\n3.-Modificar Paciente\n4.-Eliminar Paciente\n5.-Atras"));
                switch(opcionPaciente){
                    case 1://Registrar
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del paciente"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Paciente");
                        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del paciente");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del paciente"));
                        String genero = JOptionPane.showInputDialog("Ingrese el genero del usuario");
                        metodosPacientes.getInstancia().registrarPaciente(paciente,new Paciente(id,nombre,apellidos,edad,genero));
                        JOptionPane.showMessageDialog(null,"Se inserto correctamente");
                        break;
                    case 2://Buscar
                        int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog("1.- Busqueda por ID\n 2 Busqueda por Nombre"));
                        if (opcionBusqueda == 1) {
                         int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                           int resultadoBusquedaId= metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idBusqueda);
                            if (resultadoBusquedaId != -1) {
                                
                                 JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                            }
                         
                         
                        }
                        if (opcionBusqueda == 2) {
                            String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre a buscar ");
                            int resultadoBusquedanombre= metodosPacientes.getInstancia().busquedaSecuencialNombre(paciente, nombreBusqueda);
                            if (resultadoBusquedanombre != -1) {
                                
                                 JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,nombreBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este nombre");
                            }
                            
                        
                        }
                        break;
                    case 3://Modificar
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Id\n2.-Nombre\n3.-Atras"));
                       
                        switch(OpcionModificar){
                            case 1:
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
                                int posicionId = metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id"));
                                    metodosPacientes.getInstancia().modificar(paciente, posicionId, idNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaID(paciente,idNuevo));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                                
                                
                                break;
                            case 2:
                                String NombreCambiar=JOptionPane.showInputDialog("Ingrese el nombre a modificar");
                                int posicionNombre = metodosPacientes.getInstancia().busquedaSecuencialNombre(paciente,  NombreCambiar);
                                if (posicionNombre != -1) {
                                    String  NombreNuevo = JOptionPane.showInputDialog("Ingresa el nuevo nombre");
                                    metodosPacientes.getInstancia().modificarNombre(paciente, posicionNombre,NombreCambiar);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showInputDialog(null,metodosPacientes.getInstancia().imprimirListaNombre(paciente,NombreNuevo));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                                break;    
                            case 3:
                                break;
                           
                        }
                        case 4:
                        //eliminar
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int idEliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar"));
                                int posicionId = metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idEliminar);
                                if (posicionId != -1) {
                                   
                                    metodosPacientes.getInstancia().eliminarRegistro(paciente, posicionId);
                                   JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                   JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                                }else{
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                        break;
        
        }
           break;
        case 2:
                 int opcionMedico;
                 opcionMedico= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Medico\n 2.-Consultar Medico\n3.-Modificar Medico\n4.-Eliminar Medico\n5.-Atras"));
                 switch(opcionMedico){
                                      
                    case 1://Registrar
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del Médico"));
                        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Médico");
                        String apellidos = JOptionPane.showInputDialog("Ingrese los apellidos del Médico");
                        
                        String especialidad = JOptionPane.showInputDialog("Ingrese la especialidad del Médico");
                        metodosMedicos.getInstancia().registrarMedico(medico,new Medico(id,nombre,apellidos,especialidad));
                        JOptionPane.showMessageDialog(null,"Se inserto correctamente");

                        break;
                    case 2:
                        int opcionBusqueda = Integer.parseInt(JOptionPane.showInputDialog("1.- Busqueda por ID\n 2 Busqueda por Nombre"));
                        if (opcionBusqueda == 1) {
                         int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                           int resultadoBusquedaId= metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idBusqueda);
                            if (resultadoBusquedaId != -1) {
                                
                                 JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaID(medico,idBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                            }
                         
                         
                        }
                        if (opcionBusqueda == 2) {
                            String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre a buscar ");
                            int resultadoBusquedanombre= metodosMedicos.getInstancia().busquedaSecuencialNombre(medico, nombreBusqueda);
                            if (resultadoBusquedanombre != -1) {
                                
                                 JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaNombre(medico,nombreBusqueda));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este nombre");
                            }
                            

                        }
                        
                        break;
                    case 3:
                        //Modificar
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Id\n2.-Nombre\n3.-Atras"));
                       
                        switch(OpcionModificar){
                            case 1:
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a modificar"));
                                int posicionId = metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id"));
                                    metodosMedicos.getInstancia().modificar(medico, posicionId, idNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirListaID(medico,idNuevo));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                        }
                        break;
                    case 4:
                        //eliminar
                        JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirLista(medico));
                        int idEliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar"));
                                int posicionId = metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idEliminar);
                                if (posicionId != -1) {
                                   
                                    metodosMedicos.getInstancia().eliminarRegistro(medico, posicionId);
                                   JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                   JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirLista(medico));
                                }else{
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                        break;
                    case 5:
                        break;
                }
                break;
            case 3: 
                int opcionHistorial;
                opcionHistorial= Integer.parseInt(JOptionPane.showInputDialog("1.-Registrar Historial\n 2.-Consultar Historial\n3.-Modificar Historial\n4.-Eliminar Historial\n5.-Atras"));
                switch(opcionHistorial){
                    case 1:
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo"));
                        String fecha = JOptionPane.showInputDialog("Ingrese la fecha");
                        
                        JOptionPane.showMessageDialog(null,metodosPacientes.getInstancia().imprimirLista(paciente));
                        int idPAciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente"));
                        JOptionPane.showMessageDialog(null,metodosMedicos.getInstancia().imprimirLista(medico));
                        int idMEdico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del medico"));
                        String observaciones = JOptionPane.showInputDialog("Ingrese las observaciones");
                        int posicionIdPAciente = metodosPacientes.getInstancia().busquedaSecuencialIdentificacion(paciente, idPAciente);
                        int posicionIdMedico = metodosMedicos.getInstancia().busquedaSecuencialIdentificacion(medico, idMEdico);
                        
                                if (posicionIdPAciente != -1 && posicionIdMedico!= -1) {
                                        metodosHistorial.getInstancia().registrarHistorial(historial,new HistorialClinico(codigo, fecha, idPAciente, idMEdico, observaciones));
                        JOptionPane.showMessageDialog(null,"Se inserto correctamente");
                        JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                }else{
                                    JOptionPane.showMessageDialog(null,"El id no existe");
                                
                                }         
                        
                        
                        break;
                    case 2:
                        //Buscar
                        JOptionPane.showMessageDialog(null,"1.- Busqueda por Codigo");
                        
                         int idBusqueda=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a buscar"));
                           int resultadoBusquedaId= metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idBusqueda);
                            if (resultadoBusquedaId != -1) {
                                
                                 JOptionPane.showInputDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                            }else  {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                            }
                   
                        break;
                    case 3:
                        
                        JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                        int OpcionModificar=Integer.parseInt(JOptionPane.showInputDialog("Elija el dato que desea modificar\n1.-Codigo\n2.-Fecha\n3.-idPaciente\n4.-idMedico\n5.-Observaciones"));
                       
                        switch(OpcionModificar){
                            case 1:
                                int idCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a modificar"));
                                int posicionId = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idCambiar);
                                if (posicionId != -1) {
                                    int idNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo codigo"));
                                    metodosHistorial.getInstancia().modificarCodigo(historial, posicionId, idNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showInputDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                                break;
                            case 2:
                                int fechaCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha a modificar"));
                                int posicionfecha = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, fechaCambiar);
                                if (posicionfecha != -1) {
                                    int fechaNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la nueva fecha"));
                                    metodosHistorial.getInstancia().modificarCodigo(historial, posicionfecha, fechaNuevo);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                                
                                break;
                            case 3:
                                int idPacienteCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente a modificar"));
                                int posicionIdPaciente = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idPacienteCambiar);
                                if (posicionIdPaciente != -1) {
                                    int idNuevoPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo ID del paciente"));
                                    int posicionNuevaIdPaciente = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idPacienteCambiar);
                                if (posicionNuevaIdPaciente != -1) {
                                
                                    metodosHistorial.getInstancia().modificarIDPaciente(historial, posicionNuevaIdPaciente, idNuevoPaciente);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                }else {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }   
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                                break;
                            case 4:
                                int idMedicoCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del medico a modificar"));
                                int posicionIdMedicoV = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idMedicoCambiar);
                                if (posicionIdMedicoV != -1) {
                                    int idNuevoMedico = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el nuevo id Medico"));
                                    int posicionIdMedicoNuevoV = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idMedicoCambiar);
                                if (posicionIdMedicoNuevoV != -1) {
                                
                                
                                    metodosHistorial.getInstancia().modificarIDMedico(historial, posicionIdMedicoV, idNuevoMedico);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                }else {
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                                break;
                            case 5:
                                int idObservacionesCambiar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las observaciones a modificar"));
                                int posicionIdObservacionesV = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idObservacionesCambiar);
                                if (posicionIdObservacionesV != -1) {
                                    String NuevoObservaciones = JOptionPane.showInputDialog("Ingresa el nuevo id Medico");
                                    metodosHistorial.getInstancia().modificarObservaciones(historial, posicionIdObservacionesV, NuevoObservaciones);
                                   JOptionPane.showMessageDialog(null,"Se guardaron los cambios");
                                   JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                                    
                                    
                                }else  {
                                    JOptionPane.showMessageDialog(null,"No existe un registro coneste numero de identificacion");
                                }
                                
                                break;
                            case 6:
                                break;
                            
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial));
                        int idEliminar=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo a eliminar"));
                                int posicionId = metodosHistorial.getInstancia().busquedaSecuencialIdentificacion(historial, idEliminar);
                                if (posicionId != -1) {
                                   
                                    metodosHistorial.getInstancia().eliminarRegistro(historial, posicionId);
                                   JOptionPane.showMessageDialog(null,"Se elimino el registro");
                                   JOptionPane.showMessageDialog(null,metodosHistorial.getInstancia().imprimirLista(historial
                                   
                                   ));
                                }else{
                                JOptionPane.showMessageDialog(null,"No existe un registro con este numero de identificacion");
                                }
                        break;
                }
                                
                break;
        }
        
        }while(opcion != 4);  
       
    }
}
    

