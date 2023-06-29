/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica.tres.quitokaren.penasofia.controlador;

import ec.edu.ups.practica.tres.quitokaren.penasofia.idao.ICantanteDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.idao.ICompositorDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cancion;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Compositor;
import java.util.List;

/**
 *
 * @author ACER
 */
public class ControladorCompositor {

    private Compositor compositor;
    private ICompositorDAO compositorDAO;
    
    private Cantante cantante;
    private ICantanteDAO cantanteDAO;

    public ControladorCompositor(ICompositorDAO compositorDAO) {
        this.compositorDAO = compositorDAO;
    }

    public ControladorCompositor(ICompositorDAO compositorDAO, ICantanteDAO cantanteDAO) {
        this.compositorDAO = compositorDAO;
        this.cantanteDAO = cantanteDAO;
    }
    
    
    public void crear(Compositor compositor) {
        this.compositor = compositor;
        compositor.calcularSalario();
        compositorDAO.create(compositor);
    }

    public Compositor buscar(int codigo) {
        this.compositor = compositorDAO.read(codigo);
        return this.compositor;
    }

    public boolean actualizar(Compositor compositor) {
        Compositor compositorEncontrado = this.buscar(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorEncontrado.calcularSalario();
            compositorDAO.update(compositorEncontrado);
            return true;
        }
        return false;
    }

    public boolean eliminar(int codigo) {
        Compositor compositorEncontrado = this.buscar(compositor.getCodigo());
        if (compositorEncontrado != null) {
            compositorDAO.delete(compositorEncontrado);
            return true;
        }
        return false;
    }

    public List<Compositor> listar() {
        return compositorDAO.findALL();
    }

    public void ingresarCancion(int codigoCompositor, Cancion cancion) {
        Compositor c = this.buscar(codigoCompositor);
        c.agregarCancion(cancion);
        compositorDAO.update(c);
    }

    public Cancion verCancion(int codidoCompositor, int codigoCancion) {
        Compositor c = this.buscar(codidoCompositor);
        Cancion ca = c.buscarCancion(codigoCancion);
        return ca;
    }

    public void actualizarCancion(int codidoCompositor, int codigoCancion) {
        Cancion cancion = this.verCancion(codidoCompositor, codigoCancion);
        this.compositor.actualizarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void eliminarCancion(int codidoCompositor, int codigoCancion) {
        Cancion cancion = this.verCancion(codidoCompositor, codigoCancion);
        this.compositor.eliminarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void verCanciones(int codidoCompositor) {
        Compositor c = this.buscar(codidoCompositor);
        c.listarCanciones();
    }

    public void ingresarCliente(int codigoCompositor, Cantante cantante) {
        Compositor c = this.buscar(codigoCompositor);
        c.agregarCliente(cantante);
        compositorDAO.update(c);
    }

    public Cantante verCliente(int codidoCompositor, int codigoCantante) {
        Compositor c = this.buscar(codidoCompositor);
        Cantante ca = c.buscarCli(codigoCantante);
        return ca;
    }

    public void actualizarCliente(int codidoCompositor, int codigoCantante) {
        Cantante ca = this.verCliente(codidoCompositor, codigoCantante);
        this.compositor.actualizarCliente(ca);
        compositorDAO.update(compositor);
    }

    public void eliminarCliente(int codidoCompositor, int codigoCancion) {
        Cancion cancion = this.verCancion(codidoCompositor, codigoCancion);
        this.compositor.eliminarCancion(cancion);
        compositorDAO.update(compositor);
    }

    public void verCliente(int codidoCompositor) {
        Compositor c = this.buscar(codidoCompositor);
        c.listarCanciones();
    }

}
