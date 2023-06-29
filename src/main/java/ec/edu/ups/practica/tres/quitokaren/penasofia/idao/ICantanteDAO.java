
package ec.edu.ups.practica.tres.quitokaren.penasofia.idao;

import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Cantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.modelo.Disco;
import java.util.List;


public interface ICantanteDAO {
    public abstract void create(Cantante cantante);
    public abstract Cantante read(int codigo);
    public abstract void update(Cantante cantante);
    public abstract void delete(Cantante cantante);
    public List<Cantante> findALL();
    public abstract Cantante buscarPorNombreDeDisco(String valor);
    public abstract void agregarDisco(Disco disco);
    public abstract void actualizarDisco(Disco disco);
    public abstract void eliminarDisco (Disco disco);
    public List<Disco> listaDisco();
    public abstract Disco buscarDisco(int id);
}
