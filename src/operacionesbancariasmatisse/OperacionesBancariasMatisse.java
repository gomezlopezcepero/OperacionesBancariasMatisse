/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbancariasmatisse;

import banco.CuentasBancarias;
import banco.Historial;
import banco.Operaciones;
import banco.Propietarios;
import com.matisse.MtDatabase;
import com.matisse.MtException;
import com.matisse.MtObjectIterator;
import com.matisse.MtPackageObjectFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Paco
 */
public class OperacionesBancariasMatisse {
    
        String hostname = "127.0.0.1";
        String dbname = "banco";
        MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
        public ArrayList<Operaciones> opes;
        public  ArrayList<Historial> histo;
 
        
        
        public void abrirConexion(){
            
            db.open();
        }
        
        public void cerrarConexion(){
            db.close();
        }
        
    //Crea un objeto en la base de datos.
    public void insertarCuenta( String dni, String numCuent,
            String usuario, String nombre,
            String primerApellido, String segundoApellido, String numSecreto ) {
        try {
            //Abre la base de datos con el Hostname (localhost), dbname (LINKIA) y es namespace "biblioteca".
MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
db.open();
            db.startTransaction();

            // Crea un objeto 
            
             Propietarios a1 = new Propietarios(db);
             a1.setId_Propietario(sacarId()+1);
             a1.setDNI(dni);
             a1.setNombre(nombre);
             a1.setPrimer_Apellido(primerApellido);
             a1.setSegundo_Apellido(segundoApellido);
             a1.setUsuario(usuario);
             a1.setNumero_Secreto(numSecreto);
          
            
            CuentasBancarias a2 = new CuentasBancarias(db);
            a2.setId_CuentaBancaria(sacarId()+1);
            a2.setNumero_Cuenta(numCuent);
            a2.setDNI(dni);
            a2.setPropietario(usuario);
            a2.setSaldo(0);
            System.out.println("cuenta creada...");
            

            //Ejecuta un commit para materializar las peticiones.
            db.commit();
            db.close();
            //Cierra la base de datos.
            System.out.println("\nHecho.");
            
        } catch (MtException mte) {
            System.out.println("MtException : " + mte.getMessage());
        }
       
    }
    

    
    public int verMiRanking(String dni){
        
        int cont=0;
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.CuentasBancarias a order by a.Saldo desc;";
            ResultSet rset = stmt.executeQuery(commandText);
            CuentasBancarias a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (CuentasBancarias) rset.getObject(1);
                cont++;
                if(dni.equals(a1.getDNI())){
                    break;
                }

            }

            rset.close();
            stmt.close();
    
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return cont;
    }
    
    public String verFechaLogin(String fecha){
    Historial a1=null;
        try{
           Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Historial a where a.Fecha_Hora = '"+fecha+"';";
            ResultSet rset = stmt.executeQuery(commandText);
            
            
            while (rset.next()) {
                a1 = (Historial) rset.getObject(1);
            }

            rset.close();
            stmt.close();
           
       } 
         catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        
        return a1.getFecha_Hora();
    }
    
    public ArrayList<CuentasBancarias> rankingNumeroRojos() {

        //el arraylist se debe iniciar fuera del try para que pueda devolverse en el return
        ArrayList<CuentasBancarias> cuents = new ArrayList<CuentasBancarias>();
    
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.CuentasBancarias a where a.Saldo < 0 order by a.Saldo;";
            ResultSet rset = stmt.executeQuery(commandText);
            CuentasBancarias a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (CuentasBancarias) rset.getObject(1);
               
                cuents.add(a1);
            }

            rset.close();
            stmt.close();
    
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return cuents;
    }
    
    public Operaciones verOperacion(int id){
        Operaciones a1=null;
    
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Operaciones a where a.Id_Operacion ="+id+";";
            ResultSet rset = stmt.executeQuery(commandText);
            
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Operaciones) rset.getObject(1);
               
            }

            rset.close();
            stmt.close();
    
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        
        return a1;
    }
    
    public ArrayList<Operaciones> verOperaciones() {

        //el arraylist se debe iniciar fuera del try para que pueda devolverse en el return
        ArrayList<Operaciones> opes = new ArrayList<Operaciones>();
    
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Operaciones a;";
            ResultSet rset = stmt.executeQuery(commandText);
            Operaciones a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Operaciones) rset.getObject(1);
               
                opes.add(a1);
            }

            rset.close();
            stmt.close();
    
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return opes;
    }
    
    
    public ArrayList<Operaciones> generadoNumerosRojos(){
        
        ArrayList<Operaciones> opes = new ArrayList<Operaciones>();
        ArrayList<Historial> histo = new ArrayList<Historial>();
    
        try {
            
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Historial a where a.Tipo_Evento = 'R';";
            ResultSet rset = stmt.executeQuery(commandText);
            Historial a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Historial) rset.getObject(1);
                histo.add(a1);
            }
            
            rset.close();
            stmt.close();
            
            
            
            Statement stmt2 = db.createStatement();
            String commandText2 = "SELECT REF(a) from banco.Operaciones a;";
            ResultSet rset2 = stmt2.executeQuery(commandText2);
            Operaciones a2=null;
            
            while (rset2.next()) {
                // Obtiene los objetos Autor.
                a2 = (Operaciones) rset2.getObject(1);
                for(int i=0;i<histo.size();i++){
                    if(a2.getFecha_Hora().equals(histo.get(i).getFecha_Hora())){
                        opes.add(a2);
                    }
                 }
                
            }
            
            rset2.close();
            stmt2.close();
            
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        
        
        return opes;
    }
    
    public ArrayList<Operaciones> verOperaciones(String dni) {

        //el arraylist se debe iniciar fuera del try para que pueda devolverse en el return
        ArrayList<Operaciones> opes = new ArrayList<Operaciones>();
    
        try {
            
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.CuentasBancarias a where a.DNI = '"+dni+"';";
            ResultSet rset = stmt.executeQuery(commandText);
            CuentasBancarias a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (CuentasBancarias) rset.getObject(1);

            }

            rset.close();
            stmt.close();
            
            
            
            Statement stmt2 = db.createStatement();
            String commandText2 = "SELECT REF(a) from banco.Operaciones a where a.Numero_Cuenta = '"+a1.getNumero_Cuenta()+"';";
            ResultSet rset2 = stmt2.executeQuery(commandText2);
            Operaciones a2=null;
            
            while (rset2.next()) {
                // Obtiene los objetos Autor.
                a2 = (Operaciones) rset2.getObject(1);
               
                opes.add(a2);
            }

            rset2.close();
            stmt2.close();
    
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return opes;
    }
    
    
    public void borrarCuenta(String dni) throws SQLException {

        try {
            MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
            db.open();
            db.startTransaction();

            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Propietarios a where a.DNI = '"+dni+"';";
                  
            ResultSet rset = stmt.executeQuery(commandText);
            Propietarios a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Propietarios) rset.getObject(1);
                 a1.deepRemove();
            }
            
            
            Statement stmt2 = db.createStatement();
             String commandText2 = "SELECT REF(a) from banco.CuentasBancarias a where a.DNI = '"+dni+"';";
                  
            ResultSet rset2 = stmt2.executeQuery(commandText2);
            CuentasBancarias a2=null;
            
            while (rset2.next()) {
                // Obtiene los objetos Autor.
                a2 = (CuentasBancarias) rset2.getObject(1);
                 a2.deepRemove();
            }
            
            
            db.commit();
            db.close();
            System.out.println("\nHEcho.");
        } catch (MtException mte) {
            System.out.println("MtException : " + mte.getMessage());
        }
    }
    
    public void actualizarNumSecreto(String dni, String numSecreto){

        try {
             MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
            db.open();
            
            db.startTransaction();
            
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Propietarios a where a.DNI = '"+dni+"';";
                  
            ResultSet rset = stmt.executeQuery(commandText);
            Propietarios a1=null;
            
            while (rset.next()) {
                a1 = (Propietarios) rset.getObject(1);                
                a1.setNumero_Secreto(numSecreto);
            }

            rset.close();
            stmt.close();
            db.commit();
            db.close();
        
         } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
    }
    
    
    public void actualizarDatosPropietario(String dni,String nombre,String primerApellido,String segundoApellido){

        try {
             MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
            db.open();
            
            db.startTransaction();
            
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Propietarios a where a.DNI = '"+dni+"';";
                  
            ResultSet rset = stmt.executeQuery(commandText);
            Propietarios a1=null;
            
            while (rset.next()) {
                a1 = (Propietarios) rset.getObject(1);                
                a1.setNombre(nombre);
                a1.setPrimer_Apellido(primerApellido);
                a1.setSegundo_Apellido(segundoApellido);
            }

            rset.close();
            stmt.close();
            db.commit();
            db.close();
        
         } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
    }
    
    public void hacerOperacion(String dni, int cantidad, String operacion, String fecha){
         
    try{
        boolean bulean = false;
         int saldo=0;
        
       MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
       db.open();

       db.startTransaction(); 
         
       Statement stmt = db.createStatement();
       String commandText = "SELECT REF(a) from banco.CuentasBancarias a where a.DNI = '"+dni+"';";
                  
       ResultSet rset = stmt.executeQuery(commandText);
       CuentasBancarias cuent=null;
            
            while (rset.next()) {
                cuent = (CuentasBancarias) rset.getObject(1);
             }   
                if(operacion.equals("e")){
                   saldo = cuent.getSaldo() - cantidad;
               }
               else{
                   saldo = cuent.getSaldo() + cantidad;                     
               }
            
       //si el saldo pasa a ser negativo lo marca como true
       
       if(cuent.getSaldo()>0&&saldo<0){
           bulean =true;
       }
       
       //inserta la operacion en el historial       

            Historial a3 = new Historial(db);
            
            a3.setId_Historial(sacarIdHistorial()+1);
            a3.setFecha_Hora(fecha);
            a3.setTipo_Evento(operacion.toUpperCase());
            a3.setNumero_Cuenta(cuent.getNumero_Cuenta());
            
           //inserta la operacion en el historial       

            Operaciones a2 = new Operaciones(db);
            
            a2.setId_Operacion(sacarIdOperacion()+1);
            a2.setFecha_Hora(fecha);
            a2.setTipo_Operacion(operacion);
            a2.setCantidad(cantidad);
            a2.setNumero_Cuenta(cuent.getNumero_Cuenta());
 
            //actualiza el saldo de la cuenta
            
            cuent.setSaldo(saldo);
            
            //numeros rojos
            if(bulean){
                
                Historial a4 = new Historial(db);
            
            a4.setId_Historial(sacarIdHistorial()+2);
            a4.setFecha_Hora(fecha);
            a4.setTipo_Evento("R");
            a4.setNumero_Cuenta(cuent.getNumero_Cuenta());
                
            }
           
            db.commit(); 
            db.close();
       
       } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        
    }
    
    
    public boolean verificarExistencia(String dni, String num_Secreto, String fecha, int id) {
        //Abre una conexión a la base de datos 
        int result=0;
        boolean bulean=false;
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Propietarios a where a.DNI = '"+dni+"' and a.Numero_Secreto = '"+num_Secreto+"';";
                  
            ResultSet rset = stmt.executeQuery(commandText);
            Propietarios a1=null;
            
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Propietarios) rset.getObject(1);
               result++;
            }

            rset.close();
            stmt.close();
            
           
            
            if(result==1){
                bulean = true;
                
           
                 Statement stmt2 = db.createStatement();
             commandText = "SELECT REF(a) from banco.CuentasBancarias a where a.DNI = '"+dni+"';";
                  
            ResultSet rset2 = stmt.executeQuery(commandText);
            CuentasBancarias a2=null;
            
            while (rset2.next()) {
                // Obtiene los objetos Autor.
                a2 = (CuentasBancarias) rset2.getObject(1);
            }

            rset2.close();
            stmt2.close();
                
            MtDatabase db = new MtDatabase(hostname, dbname, new MtPackageObjectFactory("", "banco"));
            db.open();

            //CREA UN NUEVO REGISTRO EN EL HISTORIAL
            
                db.startTransaction();

            
             Historial a3 = new Historial(db);
            
            a3.setId_Historial(id+1);
            a3.setFecha_Hora(fecha);
            a3.setTipo_Evento("L");
            a3.setNumero_Cuenta(a2.getNumero_Cuenta());
 
                db.commit(); 
                db.close();
            }
            else{
                bulean = false;
            }
             
               
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return bulean;
        
    }
    
    
    
    
    
    
    
    public int sacarId() {
        //Abre una conexión a la base de datos 
        int result=0;
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.CuentasBancarias a;";
            ResultSet rset = stmt.executeQuery(commandText);
            CuentasBancarias a1=null;
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (CuentasBancarias) rset.getObject(1);
               
            }

            rset.close();
            stmt.close();
            
            
            if(a1==null){
                result=0;
            }
            else{
                result= a1.getId_CuentaBancaria();
            }
                       
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return result;
    }
    
    public int sacarIdOperacion() {
        //Abre una conexión a la base de datos 
        int result=0;
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Operaciones a;";
            ResultSet rset = stmt.executeQuery(commandText);
            Operaciones a1=null;
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Operaciones) rset.getObject(1);
               
            }

            rset.close();
            stmt.close();
            
            
            if(a1==null){
                result=0;
            }
            else{
                result= a1.getId_Operacion();
            }
                       
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return result;
    }
    
    public int sacarIdHistorial() {
        //Abre una conexión a la base de datos 
        int result=0;
        try {
            Statement stmt = db.createStatement();
            String commandText = "SELECT REF(a) from banco.Historial a;";
            ResultSet rset = stmt.executeQuery(commandText);
            Historial a1=null;
            while (rset.next()) {
                // Obtiene los objetos Autor.
                a1 = (Historial) rset.getObject(1);
               
            }

            rset.close();
            stmt.close();
            
            
            if(a1==null){
                result=0;
            }
            else{
                result= a1.getId_Historial();
            }
                       
            
        } catch (SQLException e) {
            System.out.println("SQLException:  " + e.getMessage());
        }
        return result;
    }
    
    
    
}
