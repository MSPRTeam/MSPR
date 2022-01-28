package securigo.infrastructure;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, NullPointerException
    {
        // materiel stockage
        MaterielFichierStockage materielFichierStockage=new MaterielFichierStockage();
        System.out.println(materielFichierStockage.recupererMateriel("gants"));
    }

}
