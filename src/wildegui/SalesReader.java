/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildegui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author DylanWilde
 */
public class SalesReader {

    public static void main(String args[]) throws IOException {
        SalesReader readingfile = new SalesReader();
        List<SalesRep> stars = readingfile.readSalesRep("salesrep.txt");
        System.out.println(stars);
    }

    public List<SalesRep> readSalesRep(String filename) throws IOException {
        File f = new File(filename);
        FileReader reader = new FileReader(f);
        BufferedReader breader = new BufferedReader(reader);

        List<SalesRep> stars = new ArrayList<SalesRep>();

        String line = breader.readLine();
        while (line != null) {
            SalesRep sr = null;
            try {
                sr = parseLine(line);
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (sr == null) {
                System.out.println("This row was bad!: " + line);
            } else {
                stars.add(sr);
            }
            line = breader.readLine();
        }
        return stars;
    }

    private SalesRep parseLine(String line) {
        String repID;
        String firstName;
        String lastName;
        String supplies;
        String books;
        String paper;
        String districts;
        String meansOfContact;

        StringTokenizer st = new StringTokenizer(line, ",");

        repID = st.nextToken().trim();
        firstName = st.nextToken().trim();
        lastName = st.nextToken().trim();
        supplies = st.nextToken().trim();
        books = st.nextToken().trim();
        paper = st.nextToken().trim();
        districts = st.nextToken().trim();
        meansOfContact = st.nextToken().trim();

        SalesRep sr = new SalesRep();
        sr.setFirstName(firstName);
        sr.setLastName(lastName);
        sr.setID(Integer.parseInt(repID));
        sr.setSupplies(Double.parseDouble(supplies));
        sr.setBooks(Double.parseDouble(books));
        sr.setPaper(Double.parseDouble(paper));
        sr.setDistricts(districts);
        sr.setMeansOfContact(meansOfContact);
        return sr;
        
    }

}
