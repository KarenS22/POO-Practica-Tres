/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.tres.quitokaren.penasofia.controlador;

import ec.edu.ups.practica.tres.quitokaren.penasofia.idao.ICantanteDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Disco;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ControladorCantante {
    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCantante(ICantanteDAO cantanteDAO) {
        this.cantanteDAO = cantanteDAO;
    }
    
      public void crear(Cantante cantante){
        cantanteDAO.create(cantante);
    }
    
    public Cantante buscar(int codigo){
        this.cantante = cantanteDAO.read(codigo);
        return this.cantante;
    }
    
    public boolean actualizar(Cantante cantante){
        Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if(cantanteEncontrado != null){
            cantanteDAO.update(cantante);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(int codigo){
        Cantante cantanteEncontrado = this.buscar(codigo);
        if(cantanteEncontrado != null){
            cantanteDAO.delete(cantanteEncontrado);
            return true;
        }
        return false;
    }
    
    public List<Cantante> listar(){
        return cantanteDAO.findALL();
    }
                
    public void ingresarDisco(int codigoCantante,  int codigoDisco, String nombreDisco, int anioDeLanzamiento){
        Cantante c = this.buscar(codigoCantante);
        c.agregarDisco(codigoDisco, nombreDisco, anioDeLanzamiento);
        cantanteDAO.update(c);
    }
    
    //posible modificacion
    public Disco verDisco(int codigoCa, int codigoD){
        Cantante c = this.buscar(codigoCa);
        Disco d = c.buscarDisco(codigoD);
        return d;
    }
    
    public void actualizarDisco(int codigoCa, int codigoD){
        Disco d = this.verDisco(codigoCa, codigoD);
        this.cantante.actualizarDisco(d);
        cantanteDAO.update(cantante);
    }
    
    public void eliminarDisco(int codigoCa, int codigoD){
        Disco d = this.verDisco(codigoCa, codigoD);
        this.cantante.eliminarDisco(d);
        cantanteDAO.update(cantante);
    }
    
    public void verDiscos(int codigoCa){
        Cantante c  =this.buscar(codigoCa);
        c.listaDisco();
    }
    
    public Cantante buscarPorNombreDeDisco(String nombreD){
        this.cantante = cantanteDAO.buscarPorNombreDeDisco(nombreD);
        return this.cantante;
    }
    
}
