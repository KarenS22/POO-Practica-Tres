/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.practica.tres.quitokaren.penasofia.vista;

import ec.edu.ups.practica.tres.quitokaren.penasofia.controlador.ControladorCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.dao.CantanteDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.idao.ICantanteDAO;
import ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante.VentanaActualizarCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante.VentanaBuscarCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante.VentanaCrearCantante;
import ec.edu.ups.practica.tres.quitokaren.penasofia.vista.cantante.VentanaEliminarCantante;
import java.util.Locale;
import java.util.ResourceBundle;

/*
import ec.edu.ups.java.ejemplo.diez.controlador.OperadoraControlador;
import ec.edu.ups.java.ejemplo.diez.vista.persona.VentanaBuscarPersona;
import ec.edu.ups.java.ejemplo.diez.vista.persona.VentanaCrearPersona;
import ec.edu.ups.java.ejemplo.diez.controlador.PersonaControlador;
import ec.edu.ups.java.ejemplo.diez.controlador.TelefonoControlador;
import ec.edu.ups.java.ejemplo.diez.dao.OperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.dao.PersonaDAO;
import ec.edu.ups.java.ejemplo.diez.dao.TelefonoDAO;
import ec.edu.ups.java.ejemplo.diez.idao.IOperadoraDAO;
import ec.edu.ups.java.ejemplo.diez.idao.IPersonaDAO;
import ec.edu.ups.java.ejemplo.diez.idao.ITelefonoDAO;
import ec.edu.ups.java.ejemplo.diez.vista.operadora.VentanaActualizarOperadora;
import ec.edu.ups.java.ejemplo.diez.vista.operadora.VentanaBuscarOperadora;
import ec.edu.ups.java.ejemplo.diez.vista.operadora.VentanaCrearOperadora;
import ec.edu.ups.java.ejemplo.diez.vista.operadora.VentanaEliminarOperadora;
import ec.edu.ups.java.ejemplo.diez.vista.operadora.VentanaListarOperadora;
import ec.edu.ups.java.ejemplo.diez.vista.persona.VentanaActualizarPersona;
import ec.edu.ups.java.ejemplo.diez.vista.persona.VentanaEliminarPersona;
import ec.edu.ups.java.ejemplo.diez.vista.persona.VentanaListarPersona;
import ec.edu.ups.java.ejemplo.diez.vista.telefono.VentanaBuscarTelefono;
import ec.edu.ups.java.ejemplo.diez.vista.telefono.VentanaCrearTelefono;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    private VentanaActualizarCantante ventanaActualizarCantante;
    private VentanaEliminarCantante  ventanaEliminarCantante;
    
    private ControladorCantante controladorCantante;
    private ICantanteDAO cantanteDAO;
/*
    //ventanas personas
    private VentanaCrearPersona ventanaCrearPersona;
    private VentanaBuscarPersona ventanaBuscarPersona;
    private VentanaActualizarPersona ventanaActualizarPersona;
    private VentanaEliminarPersona ventanaEliminarPersona;
    private VentanaListarPersona ventanaListarPersona;
    //ventanas operadora
    private VentanaCrearOperadora ventanaCrearOperadora;
    private VentanaBuscarOperadora ventanaBuscarOperadora;
    private VentanaActualizarOperadora ventanaActualizarOperadora;
    private VentanaEliminarOperadora ventanaEliminarOperadora;
    private VentanaListarOperadora ventanaListarOperadora;
    //ventanas telefono
    private VentanaCrearTelefono ventanaCrearTelefono;
    private VentanaBuscarTelefono ventanaBuscarTelefono;
    //controladores
    private PersonaControlador personaControlador;
    private OperadoraControlador operadoraControlador;
    private TelefonoControlador telefonoControlador;
    //DAOs
    private IPersonaDAO personaDAO;
    private IOperadoraDAO operadoraDAO;
    private ITelefonoDAO telefonoDAO;
    */
    //Internacionalizacion
    private Locale localizacion;
    private ResourceBundle mensajes;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        cantanteDAO = new CantanteDAO();
        controladorCantante = new ControladorCantante(cantanteDAO);
        localizacion = Locale.getDefault();
        /*
        personaDAO = new PersonaDAO();
        personaControlador = new PersonaControlador(personaDAO);
        operadoraDAO = new OperadoraDAO();
        operadoraControlador = new OperadoraControlador(operadoraDAO);
        telefonoDAO = new TelefonoDAO();
        telefonoControlador = new TelefonoControlador(telefonoDAO);*/
        //localizacion = Locale.getDefault();
        //baseName es el nombre dle paquete pa que agrare los valores del spanish
        //mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        cambiarIdioma();
        //System.out.println("Locale: " + localizacion);*/
    }

    private void cambiarIdioma(){
        /*
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        menuCantante.setText(mensajes.getString("menu.persona"));
        menuOperadora.setText(mensajes.getString("menu.operadora"));
        menuDisco.setText(mensajes.getString("menu.telefono"));
        menuOpciones.setText(mensajes.getString("menu.opciones"));
        menuIdiomas.setText(mensajes.getString("menu.idiomas"));*/
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCantante = new javax.swing.JMenu();
        menuItemCrearCantante = new javax.swing.JMenuItem();
        menuItemBuscarCantante = new javax.swing.JMenuItem();
        menuItemActualizarCantante = new javax.swing.JMenuItem();
        menuItemEliminarCantante = new javax.swing.JMenuItem();
        menuItemListarCantante = new javax.swing.JMenuItem();
        menuDisco = new javax.swing.JMenu();
        menuItemCrearDisco = new javax.swing.JMenuItem();
        menuItemBuscarDisco = new javax.swing.JMenuItem();
        menuItemActualizarDisco = new javax.swing.JMenuItem();
        menuItemEliminarDisco = new javax.swing.JMenuItem();
        menuItemListarDisco = new javax.swing.JMenuItem();
        menuOperadora = new javax.swing.JMenu();
        menuItemCrearCompositor = new javax.swing.JMenuItem();
        menuItemBuscarCompositor = new javax.swing.JMenuItem();
        menuItemActualizarCompositor = new javax.swing.JMenuItem();
        menuItemEliminarCompositor = new javax.swing.JMenuItem();
        menuItemListarCompositor = new javax.swing.JMenuItem();
        menuCancion = new javax.swing.JMenu();
        menuItemCrearCancion = new javax.swing.JMenuItem();
        menuItemBuscarCancion = new javax.swing.JMenuItem();
        menuItemActualizarCancion = new javax.swing.JMenuItem();
        menuItemEliminarCancion = new javax.swing.JMenuItem();
        menuItemListarCancion = new javax.swing.JMenuItem();
        menuCliente = new javax.swing.JMenu();
        menuItemCrearCliente = new javax.swing.JMenuItem();
        menuItemBuscarCliente = new javax.swing.JMenuItem();
        menuItemActualizarCliente = new javax.swing.JMenuItem();
        menuItemEliminarCliente = new javax.swing.JMenuItem();
        menuItemListarCliente = new javax.swing.JMenuItem();
        menuOpciones = new javax.swing.JMenu();
        menuItemSalirOpciones = new javax.swing.JMenuItem();
        menuIdiomas = new javax.swing.JMenu();
        menuItemEspanol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();
        menuItemFrances = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCantante.setMnemonic('f');
        menuCantante.setText("Cantante");

        menuItemCrearCantante.setMnemonic('o');
        menuItemCrearCantante.setText("Crear");
        menuItemCrearCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemCrearCantante);

        menuItemBuscarCantante.setMnemonic('a');
        menuItemBuscarCantante.setText("Buscar");
        menuItemBuscarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemBuscarCantante);

        menuItemActualizarCantante.setMnemonic('s');
        menuItemActualizarCantante.setText("Actualizar");
        menuItemActualizarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemActualizarCantante);

        menuItemEliminarCantante.setMnemonic('x');
        menuItemEliminarCantante.setText("Eliminar");
        menuItemEliminarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemEliminarCantante);

        menuItemListarCantante.setText("Listar");
        menuItemListarCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCantanteActionPerformed(evt);
            }
        });
        menuCantante.add(menuItemListarCantante);

        menuDisco.setMnemonic('h');
        menuDisco.setText("Disco");

        menuItemCrearDisco.setMnemonic('c');
        menuItemCrearDisco.setText("Crear");
        menuItemCrearDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemCrearDisco);

        menuItemBuscarDisco.setText("Buscar");
        menuItemBuscarDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarDiscoActionPerformed(evt);
            }
        });
        menuDisco.add(menuItemBuscarDisco);

        menuItemActualizarDisco.setMnemonic('a');
        menuItemActualizarDisco.setText("Actualizar");
        menuDisco.add(menuItemActualizarDisco);

        menuItemEliminarDisco.setText("Eliminar");
        menuDisco.add(menuItemEliminarDisco);

        menuItemListarDisco.setText("Listar");
        menuDisco.add(menuItemListarDisco);

        menuCantante.add(menuDisco);

        menuBar.add(menuCantante);

        menuOperadora.setMnemonic('e');
        menuOperadora.setText("Compositor");

        menuItemCrearCompositor.setMnemonic('t');
        menuItemCrearCompositor.setText("Crear");
        menuItemCrearCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearCompositorActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemCrearCompositor);

        menuItemBuscarCompositor.setMnemonic('p');
        menuItemBuscarCompositor.setText("Buscar");
        menuItemBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemBuscarCompositorActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemBuscarCompositor);

        menuItemActualizarCompositor.setMnemonic('y');
        menuItemActualizarCompositor.setText("Actualizar");
        menuItemActualizarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActualizarCompositorActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemActualizarCompositor);

        menuItemEliminarCompositor.setMnemonic('d');
        menuItemEliminarCompositor.setText("Eliminar");
        menuItemEliminarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarCompositorActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemEliminarCompositor);

        menuItemListarCompositor.setText("Listar");
        menuItemListarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemListarCompositorActionPerformed(evt);
            }
        });
        menuOperadora.add(menuItemListarCompositor);

        menuCancion.setText("Cancion");

        menuItemCrearCancion.setText("Crear");
        menuCancion.add(menuItemCrearCancion);

        menuItemBuscarCancion.setText("Buscar");
        menuCancion.add(menuItemBuscarCancion);

        menuItemActualizarCancion.setText("Actualizar");
        menuCancion.add(menuItemActualizarCancion);

        menuItemEliminarCancion.setText("Eliminar");
        menuCancion.add(menuItemEliminarCancion);

        menuItemListarCancion.setText("Listar");
        menuCancion.add(menuItemListarCancion);

        menuOperadora.add(menuCancion);

        menuCliente.setText("Cliente");

        menuItemCrearCliente.setText("Crear");
        menuCliente.add(menuItemCrearCliente);

        menuItemBuscarCliente.setText("Buscar");
        menuCliente.add(menuItemBuscarCliente);

        menuItemActualizarCliente.setText("Actualizar");
        menuCliente.add(menuItemActualizarCliente);

        menuItemEliminarCliente.setText("Eliminar");
        menuCliente.add(menuItemEliminarCliente);

        menuItemListarCliente.setText("Listar");
        menuCliente.add(menuItemListarCliente);

        menuOperadora.add(menuCliente);

        menuBar.add(menuOperadora);

        menuOpciones.setText("Opciones");

        menuItemSalirOpciones.setText("Salir");
        menuItemSalirOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirOpcionesActionPerformed(evt);
            }
        });
        menuOpciones.add(menuItemSalirOpciones);

        menuBar.add(menuOpciones);

        menuIdiomas.setText("Idiomas");

        menuItemEspanol.setText("Español");
        menuItemEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspanolActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemEspanol);

        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemIngles);

        menuItemFrances.setText("Frances");
        menuItemFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFrancesActionPerformed(evt);
            }
        });
        menuIdiomas.add(menuItemFrances);

        menuBar.add(menuIdiomas);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 981, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemSalirOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirOpcionesActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirOpcionesActionPerformed

    private void menuItemCrearCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearCantanteActionPerformed
       if (ventanaCrearCantante == null){
           ventanaCrearCantante = new VentanaCrearCantante(controladorCantante);
           desktopPane.add(ventanaCrearCantante);
       }
       ventanaCrearCantante.setVisible(true);
    }//GEN-LAST:event_menuItemCrearCantanteActionPerformed

    private void menuItemBuscarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCantanteActionPerformed
        if (ventanaBuscarCantante ==null){
            ventanaBuscarCantante = new VentanaBuscarCantante(controladorCantante);
            desktopPane.add(ventanaBuscarCantante);
        }
        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemBuscarCantanteActionPerformed

    private void menuItemActualizarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCantanteActionPerformed
        if (ventanaActualizarCantante == null){
            ventanaActualizarCantante = new VentanaActualizarCantante(controladorCantante);
            desktopPane.add(ventanaActualizarCantante);
        }
        ventanaActualizarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemActualizarCantanteActionPerformed

    private void menuItemEliminarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCantanteActionPerformed
        if (ventanaEliminarCantante == null){
            ventanaEliminarCantante = new VentanaEliminarCantante(controladorCantante);
            desktopPane.add(ventanaEliminarCantante);
        }
        ventanaEliminarCantante.setVisible(true);
    }//GEN-LAST:event_menuItemEliminarCantanteActionPerformed

    private void menuItemListarCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCantanteActionPerformed
        /*if (ventanaListarPersona == null) {
            ventanaListarPersona = new VentanaListarPersona(personaControlador);
            desktopPane.add(ventanaListarPersona);
        }

        ventanaListarPersona.setVisible(true);*/
    }//GEN-LAST:event_menuItemListarCantanteActionPerformed

    private void menuItemCrearCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearCompositorActionPerformed
      /*  if (ventanaCrearOperadora == null) {
            ventanaCrearOperadora = new VentanaCrearOperadora(operadoraControlador);
            desktopPane.add(ventanaCrearOperadora);
        }

        ventanaCrearOperadora.setVisible(true);*/
    }//GEN-LAST:event_menuItemCrearCompositorActionPerformed

    private void menuItemBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarCompositorActionPerformed
       /* if (ventanaBuscarOperadora == null) {
            ventanaBuscarOperadora = new VentanaBuscarOperadora(operadoraControlador);
            desktopPane.add(ventanaBuscarOperadora);
        }

        ventanaBuscarOperadora.setVisible(true);*/
    }//GEN-LAST:event_menuItemBuscarCompositorActionPerformed

    private void menuItemActualizarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActualizarCompositorActionPerformed
        /* if (ventanaActualizarOperadora == null) {
            ventanaActualizarOperadora = new VentanaActualizarOperadora(operadoraControlador);
            desktopPane.add(ventanaActualizarOperadora);
        }

        ventanaActualizarOperadora.setVisible(true);*/
    }//GEN-LAST:event_menuItemActualizarCompositorActionPerformed

    private void menuItemEliminarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarCompositorActionPerformed
     /*   if (ventanaEliminarOperadora == null) {
            ventanaEliminarOperadora = new VentanaEliminarOperadora(operadoraControlador);
            desktopPane.add(ventanaEliminarOperadora);
        }

        ventanaEliminarOperadora.setVisible(true);*/
    }//GEN-LAST:event_menuItemEliminarCompositorActionPerformed

    private void menuItemListarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemListarCompositorActionPerformed
       /* if (ventanaListarOperadora == null) {
            ventanaListarOperadora = new VentanaListarOperadora(operadoraControlador);
            desktopPane.add(ventanaListarOperadora);
        }

        ventanaListarOperadora.setVisible(true);*/
    }//GEN-LAST:event_menuItemListarCompositorActionPerformed

    private void menuItemCrearDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearDiscoActionPerformed
       /*  if (ventanaCrearTelefono == null) {
            ventanaCrearTelefono = new VentanaCrearTelefono(personaControlador, 
                    operadoraControlador, telefonoControlador);
            desktopPane.add(ventanaCrearTelefono);
        }

        ventanaCrearTelefono.setVisible(true);*/
    }//GEN-LAST:event_menuItemCrearDiscoActionPerformed

    private void menuItemBuscarDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemBuscarDiscoActionPerformed
    /*    if (ventanaBuscarTelefono == null) {
            ventanaBuscarTelefono = new VentanaBuscarTelefono(telefonoControlador);
            desktopPane.add(ventanaBuscarTelefono);
        }

        ventanaBuscarTelefono.setVisible(true);*/
    }//GEN-LAST:event_menuItemBuscarDiscoActionPerformed

    private void menuItemEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspanolActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("es","EC");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemEspanolActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("en","US");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFrancesActionPerformed
        // TODO add your handling code here:
        localizacion = new Locale("fr","FR");
        cambiarIdioma();
    }//GEN-LAST:event_menuItemFrancesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCancion;
    private javax.swing.JMenu menuCantante;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenu menuDisco;
    private javax.swing.JMenu menuIdiomas;
    private javax.swing.JMenuItem menuItemActualizarCancion;
    private javax.swing.JMenuItem menuItemActualizarCantante;
    private javax.swing.JMenuItem menuItemActualizarCliente;
    private javax.swing.JMenuItem menuItemActualizarCompositor;
    private javax.swing.JMenuItem menuItemActualizarDisco;
    private javax.swing.JMenuItem menuItemBuscarCancion;
    private javax.swing.JMenuItem menuItemBuscarCantante;
    private javax.swing.JMenuItem menuItemBuscarCliente;
    private javax.swing.JMenuItem menuItemBuscarCompositor;
    private javax.swing.JMenuItem menuItemBuscarDisco;
    private javax.swing.JMenuItem menuItemCrearCancion;
    private javax.swing.JMenuItem menuItemCrearCantante;
    private javax.swing.JMenuItem menuItemCrearCliente;
    private javax.swing.JMenuItem menuItemCrearCompositor;
    private javax.swing.JMenuItem menuItemCrearDisco;
    private javax.swing.JMenuItem menuItemEliminarCancion;
    private javax.swing.JMenuItem menuItemEliminarCantante;
    private javax.swing.JMenuItem menuItemEliminarCliente;
    private javax.swing.JMenuItem menuItemEliminarCompositor;
    private javax.swing.JMenuItem menuItemEliminarDisco;
    private javax.swing.JMenuItem menuItemEspanol;
    private javax.swing.JMenuItem menuItemFrances;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem menuItemListarCancion;
    private javax.swing.JMenuItem menuItemListarCantante;
    private javax.swing.JMenuItem menuItemListarCliente;
    private javax.swing.JMenuItem menuItemListarCompositor;
    private javax.swing.JMenuItem menuItemListarDisco;
    private javax.swing.JMenuItem menuItemSalirOpciones;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JMenu menuOperadora;
    // End of variables declaration//GEN-END:variables

}
