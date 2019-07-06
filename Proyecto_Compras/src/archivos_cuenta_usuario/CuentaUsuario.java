
package archivos_cuenta_usuario;
import java.io.*;

import java.io.IOException;
import javax.swing.JOptionPane;


public class CuentaUsuario {
    public String crear(String id,String pass)//creamos una carpeta(cuenta) por cada usuario q se registre 
    {                                         //y dentro creamo archivos de (usuario, saldo, contraseña))
       try
         {
             
           String carpeta="cuentas\\"+id;//para poder crear una carpeta, creamos una direccion  
           File directorio = new File(carpeta);//para acceder al archivo
           if(directorio.exists())//si existe la carpeta, saldra mensaje que no se puede registrar poruqe ya hay uno igual.
           {
              JOptionPane.showMessageDialog(null,"este usuario ya existe!\n porfavor intentar con otro nombre ");
           }
           else{
              directorio.mkdirs();//este comando crea una carpeta con el nombre ingresado
               
                 FileWriter fichero = new FileWriter(directorio+"\\usuario");//llamar a este metodo te permite crear un archivo vacio con
                 fichero.write(id);//escribe dentro del archivo el nombre ingresado
               
                 FileWriter password= new FileWriter(directorio+"\\contraseña");
                 password.write(pass);//escribe dentro del archivo la contraseña ingresada
               
                 FileWriter saldo= new FileWriter(directorio+"\\saldo");//cada usuario inicia con 0.00 de saldo
                 saldo.write("0.00");//escribe dentro del archivo 0.00 soles, todos inician con esa cantidad
                 
                 FileWriter carrito= new FileWriter(directorio+"\\carrito");//crear el archivo carrito, para almacenar los nombres de juego
                 carrito.write("");
                 
               carrito.close();  
               saldo.close();
               fichero.close();
               password.close();
               JOptionPane.showMessageDialog(null,"usuario registrado exitosamente! ");
           }
         }catch(IOException e)
         {
             System.out.println("error "+e.getMessage());
         }
       
       return null;// es un string, tiene que retornar algo
    }
    
    public String llamarId(String id)//creamos un metodo para poder llamar desde login y compare con la cuenta creada
    {
        String nombre="";//creamos variable para almacenar 
             
         File directorio =new File("cuentas\\"+id+"\\usuario"); 
         try{   
         FileReader lectorcuenta = new FileReader(directorio);
         BufferedReader BR = new BufferedReader(lectorcuenta);
         nombre=BR.readLine();//se almacena el usuario
         }catch(IOException e){}
         return nombre;
         
     
    }
    
      public String llamarContra(String id)
    {
        
        String contra="";
     
      
        File directorio =new File("cuentas\\"+id+"\\contraseña"); 
         try{
         FileReader lectorpass = new FileReader(directorio);
         BufferedReader BR = new BufferedReader(lectorpass);
         contra=BR.readLine();
         }catch (IOException e){}
         return contra;
          
    }
      
          public String cant(String id,String total)
    {
       try
         {          
           File directorio = new File("cuentas\\"+id);//para llamar a la carpeta
           
               FileWriter fichero = new FileWriter(directorio+"\\Saldo");//señalar donde va escribir
               fichero.write(total);//escribe el texto dentro del archivo           
               fichero.close();             
               JOptionPane.showMessageDialog(null,"se a guardado exitosamente el saldo ");
           
         }catch(IOException e)
         {
             System.out.println("error "+e.getMessage());
         }
       
       return null;
    
    }
    
    public String llamarcant(String id)
    {
        String nombre="";
        
     
      
         File directorio =new File("cuentas\\"+id+"\\Saldo"); 
         try{
         FileReader lectorcuenta = new FileReader(directorio);
         BufferedReader BR = new BufferedReader(lectorcuenta);
         nombre=BR.readLine();
         }catch(IOException e){}
         return nombre;
         
    
    }
    
    public String llamarAdmin(String id)
    {
       String admin="";
       
       File directorio = new File("admin\\"+id+"\\usuario");
       try{
       
       FileReader lectorcuenta = new FileReader(directorio);
       BufferedReader BR = new BufferedReader(lectorcuenta);
       admin=BR.readLine();                                                                     
       
       }catch(IOException e){}
       return admin;
    }
    
       public String llamarPassAdmin(String id)
    {
       String contra="";
       
       File directorio = new File("admin\\"+id+"\\contraseña");
       try{
       
       FileReader lectorcuenta = new FileReader(directorio);
       BufferedReader BR = new BufferedReader(lectorcuenta);
       contra=BR.readLine();                                                                     
       
       }catch(IOException e){}
       return contra;
    }
       
    public String AlmacenarCarro(String id,String juego,String precio)
    {
        try{
        
        File directorio = new File("cuentas\\"+id+"\\carrito");//para llamar a la carpeta
                  FileReader leer = new FileReader(directorio);
                  BufferedReader BR = new BufferedReader(leer);
         
                    String temp="",temp2="";
                    while(temp!=null)
                    {
                        
                        temp = BR.readLine();
                        temp2= BR.readLine();
                             if(temp.compareTo(juego)!=0){
                             FileWriter escribir = new FileWriter(directorio,true);               
                                 
                             PrintWriter xd = new PrintWriter(escribir);//para que NO se elimine la informacion que se ingreso anteriormente.
               
               
                              xd.println(juego);//para escribir de una vez en el archivo.  
                              xd.println(precio);//para escribir el precio
                              xd.close();
                              xd.close();
                             }
                           if(temp==null)
                           break;
             
                    } 
        
              
              /* FileWriter escribir = new FileWriter(directorio,true);               
               
               PrintWriter xd = new PrintWriter(escribir);//para que NO se elimine la informacion que se ingreso anteriormente.
               
               
               xd.println(juego);//para escribir de una vez en el archivo.  
               xd.println(precio);//para escribir el precio
               xd.close();
               xd.close();*/
               
        }catch(IOException e)
         {
             System.out.println("error "+e.getMessage());
         }
      return null;
    }
    
    public String llamarCarro(String id)
    {
        String juego="";
        File directorio = new File("admin\\"+id+"\\carrito");
         
     try{      
          FileReader leer = new FileReader(directorio);
          BufferedReader BR = new BufferedReader(leer);
         
         String temp="";
          while(temp!=null)
          {
             
             temp = BR.readLine();
             
             if(temp==null)
                 break;
             
          }
          
       }catch(IOException e){}
        
    return juego;
    }
}
