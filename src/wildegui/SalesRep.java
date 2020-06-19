/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildegui;

/**
 *
 * @author DylanWilde
 */
public class SalesRep {
  
  private int ID;
  private String firstName;
  private String lastName;
  double supplies;
  double books;
  double paper;
  private String salesDistricts;
  private String meansOfContact;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSupplies() {
        return supplies;
    }

    public void setSupplies(double supplies) {
        this.supplies = supplies;
    }

    public double getBooks() {
        return books;
    }

    public void setBooks(double books) {
        this.books = books;
    }

    public double getPaper() {
        return paper;
    }

    public void setPaper(double paper) {
        this.paper = paper;
    }

    public String getDistricts() {
        return salesDistricts;
    }

    public void setDistricts(String districts) {
        this.salesDistricts = districts;
    }

    public String getMeansOfContact() {
        return meansOfContact;
    }

    public void setMeansOfContact(String meansOfContact) {
        this.meansOfContact = meansOfContact;
    }

    @Override
    public String toString() {
        return "SalesRep{" + "ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + ", supplies=" + supplies + ", books=" + books + ", paper=" + paper + ", districts=" + salesDistricts + ", meansOfContact=" + meansOfContact + '}';
    }  
}
