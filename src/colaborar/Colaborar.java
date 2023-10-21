
package colaborar;

import java.io.IOException;

/**
 *
 * @author jlizquierdo
 * @version 1.0
 * Aplicación que lanza la aplicación lenguaje en las instancias definidas mediante parámetros
 */

public class Colaborar {

    /**
     * @param args 
     * Método principal
     * Primer parámetro, número de instancias a lanzar
     * Segundo paráemtros, nombre del fichero a generar
     */
    public static void main(String[] args) {
        
        int instancias;
        String nombreFichero;
        String cmd;
        Process proceso;
        int x;
        
        if ( args.length == 2 )
        {
            instancias = Integer.parseInt(args[0]);
            nombreFichero = args[1];
            for( x=0; x<instancias; x++ )
            {
                try
                {
                   cmd = "java -jar lenguaje.jar " + Integer.toString((x+1)*10)+" "+nombreFichero;
                   System.out.println(cmd);
                   proceso = Runtime.getRuntime().exec(cmd);
                  // proceso.waitFor();
                }
                catch ( IOException e)
                {
                    System.err.println( "Problema al lanzar el proceso" );
                }

            }
            System.out.println("Terminado!");
        }
        else
        {
            System.err.println( "Número de parámetros incorrectos" );
        }
        
        
    }
    
}
