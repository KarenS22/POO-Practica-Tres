
package ec.edu.ups.practica.tres.quitokaren.penasofia.dao;

import ec.edu.ups.practica.tres.quitokaren.penasofia.idao.ICantanteDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Disco;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CantanteDAO implements ICantanteDAO {
//atributo
    private List<Cantante> listaCantante;
//constructor
    public CantanteDAO() {
        this.listaCantante = new ArrayList<>();
    }
//sobreescriturametodos CRUD
    @Override
    public void create(Cantante cantante) {
        listaCantante.add(cantante);
    }

    @Override
    public Cantante read(int codigo) {
        for (Cantante cantante : listaCantante) {
            if (cantante.getCodigo() == codigo) {
                return cantante;
            }
        }
        return null;
    }

    @Override
    public void update(Cantante cantante) {
        for (int i = 0; i < listaCantante.size(); i++) {
            Cantante cantan = listaCantante.get(i);
            if (cantan.getCodigo() == cantante.getCodigo()) {
                listaCantante.set(i, cantante);
                break;
            }
        }
    }

    @Override
    public void delete(Cantante cantante) {
        Iterator<Cantante> it = listaCantante.iterator();
        while (it.hasNext()) {
            Cantante c = it.next();
            if (c.getCodigo() == cantante.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cantante> findALL() {
        return listaCantante;
    }
//sobreescritura metodo buscar por disco y devuelve un cantante
    @Override
    public Cantante buscarPorNombreDeDisco(String valor) {
        for (Cantante cantante : listaCantante) {
            for (Disco disco : cantante.listaDisco()) {
                if (disco.getNombre().equals(valor)) {
                    return cantante;
                }
            }
        }
    return null;
    }

    @Override
    public void agregarDisco(Disco disco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarDisco(Disco disco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarDisco(Disco disco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Disco> listaDisco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Disco buscarDisco(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
      
}
