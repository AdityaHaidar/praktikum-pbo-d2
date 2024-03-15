package org.ident;

public class Ident {
    protected String nama;
    protected int age;
    protected String address;


    public String getNama(){
        return nama;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }


    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
