
package proyecto_goal_height;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Proyecto_Goal_Height {

 // lee registro del archivo
    public static void leerRegistros() {

        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/jugadores.csv"));
             double sumaGoles = 0;
              double sumaH = 0;
            int cantidad = 0;
            double promedioGoles = 0;
             double promedioH = 0;
            while (entrada.hasNext()) {
                    String linea = entrada.nextLine();
        
                ArrayList<String> linea_partes = new ArrayList<>(
                       Arrays.asList(linea.split("\\|")));
               double datoG = Double.parseDouble(linea_partes.get(11));
               double datoH = Double.parseDouble(linea_partes.get(9));
                sumaGoles = sumaGoles + datoG;  
                sumaH = sumaH + datoH;  
                cantidad = cantidad +1;
            } // fin de while
            entrada.close();           
            promedioGoles = sumaGoles /cantidad;
            promedioH = sumaH /cantidad;
            System.out.printf("Promedio de Goles = %.2f\nPromedioHeigth = %.2f"
                    + "\n",promedioGoles,promedioH);
        } // fin de try
        catch (Exception e) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} // fin de la clase LeerArchivoTexto
    

