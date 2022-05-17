/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yanyg
 */
public class POOTransferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("caracter: ");
        int in = System.in.read();
        System.out.println(" Has introducido: "+in);
        System.err.println(" Esta es la salida estandar de errores");
        
    }
    public void LeerArchivo(){
        try{
        File archivo1 = new File ("C:\\archivo.txt");
        FileReader fr = new FileReader (archivo1);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        } catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
    public void EscribirArchivo(){
        FileWriter archivo = null; 
        PrintWriter pw =null;
        try{
            archivo = new FileWriter("C:/archivo.txt"); 
            pw = new PrintWriter(archivo);
            for (int i = 0; i < 10; i++)
            pw.println("Linea" + i);
        } catch (Exception e) { 
            e.printStackTrace();
        } finally {
            if (null != archivo)
                try {
                    archivo.close();
            } catch (IOException ex) {
                Logger.getLogger(POOTransferencia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
