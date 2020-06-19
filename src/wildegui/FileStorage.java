/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildegui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author DylanWilde
 */
public class FileStorage 
{
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        SalesRep sr = new SalesRep();
        sr.setID(1001);
        sr.setFirstName("Jennifer");
        sr.setLastName("Hale");
        sr.setSupplies(2150.20);
        sr.setBooks(300);
        sr.setPaper(410);
        sr.setDistricts("NORTH");
        sr.setMeansOfContact("Phone");
        
      
    }
  public void writeSalesRep (SalesRep sr, String filename) throws IOException
  {
      File testWriter = new File (filename);
      try (BufferedWriter out = new BufferedWriter (new 
            FileWriter(testWriter, true))) {
          out.write(sr.getID() + "");
          out.write(", ");
          out.write(sr.getFirstName());
          out.write( ", ");
          out.write(sr.getLastName());
          out.write(", ");
          out.write(sr.getSupplies()+"");
          out.write(", ");
          out.write(sr.getBooks()+"");
          out.write(", ");
          out.write(sr.getPaper()+"");
          out.write(", ");
          out.write(sr.getDistricts());
          out.write(", ");
          out.write(sr.getMeansOfContact());
          out.write(", ");
          out.newLine();
          out.close();
      }
  }
}
