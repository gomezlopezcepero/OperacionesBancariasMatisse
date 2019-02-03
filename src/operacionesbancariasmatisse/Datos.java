/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbancariasmatisse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAW
 */
public class Datos {
    
    public static String cadena(){
        
        String sdato="";
        
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader flujoE=new BufferedReader(isr);
            
            sdato=flujoE.readLine();
        }catch(IOException e){
            System.err.println("Error: "+e.getMessage());
        }
        return sdato;
        
    }
    
    
    public static int entero(){
        boolean sw = true;
        int x=0;
        while(sw){
            try{
                x=Integer.parseInt(cadena());
                sw=false;
            }catch(Exception ex){
                
                System.out.println("Vuelva a introducir el dato");
                
            }
        }
        
        return x;
        
    }
    
    
        public static double real(){
        boolean sw = true;
        double x=0;
        while(sw){
            try{
                x=Double.parseDouble(cadena());
                sw=false;
            }catch(Exception ex){
                
                System.out.println("Vuelva a introducir el dato");
                
            }
        }
        
        return x;
        
    }
        
        
        public static char caracter(){
        boolean sw = true;
        char x=' ';
        while(sw){
            try{
                x=cadena().charAt(0);
                sw=false;
            }catch(Exception ex){
                
                System.out.println("Vuelva a introducir el dato");
                
            }
        }
        
        return x;
        
    }
    
    

        
    //PATTERNS
    
     public static int comprobarNumCuenta(String numcuenta){
        
        int cont=0;
        
       
        Pattern p = Pattern.compile("[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}[-]{1}[0-9]{4}");
        Matcher m = p.matcher(numcuenta);
        boolean b = m.matches();
                
        if(!b){
          cont++;
          System.err.println("El número de cuenta es incorrecto");
              }
        
        
        return cont;
        
    }
    
    
    public static int comprobarDNI(String textdni){
        
        int dni, restodni, cont=0;
       
        textdni = textdni.toUpperCase();
        Pattern p = Pattern.compile("[0-9]{8}{1}[A-Za-z]");
        Matcher m = p.matcher(textdni);
        boolean b = m.matches();
        
        if(b){
      
        }
        else{
            cont++;
          System.err.println("El DNI no es correcto");  
        }

        return cont;
    }
    

    
    public static int comprobarNumSecreto(String numSecreto){
        
        int cont=0;
       
        Pattern p = Pattern.compile("[0-9]{4}");
        Matcher m = p.matcher(numSecreto);
        boolean b = m.matches();
                
        if(!b){
          cont++;
          System.err.println("El número secreto es incorrecto");
              }
        
        return cont;   
    }
    
    public static int comprobarUsuario(String nombre){
        
        int cont=0;
       
        Pattern p = Pattern.compile("[A-Za-z0-9]{3,15}");
        Matcher m = p.matcher(nombre);
        boolean b = m.matches();
                
        if(!b){
          cont++;
          System.err.println("El nombre de usuario es incorrecto");
              }
        
        return cont;   
    }
    
    
    
        public static int comprobarNombreApellidos(String nombre){
    
           
         int cont=0;
       
        Pattern p = Pattern.compile("[A-Za-z]{3,15}");
        Matcher m = p.matcher(nombre);
        boolean b = m.matches();
                
        if(!b){
          cont++;
          System.err.println("El nombre y los apellidos no son correctos");
              }
        
        return cont; 
            
    }
        
    
    
}
