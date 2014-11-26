/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v.i.p_software;

/**
 *
 * @author michaelannor
 */
public class Person {
    private String firstName;
    private String surname;
    private int personID;
    private int phoneNumber;
    private char gender;
    private String email;
    private int age;
    
    void setAge(int a){
        age = a;
    }
    
    int getAge(){
        return age;
    }
    
    void setFirstName(String fn) {
        firstName = fn;
    }
    
    void setSurname(String sn) {
        surname = sn;
    }
    
    void setID(int id) {
        personID = id;
    }
    
    void setPhoneNumber(int num) {
        phoneNumber = num;
    }
    
    void setGender(char gen) {
        gender = gen;
    }
    
    void setEmail(String mail) {
        email = mail;
    }
    
    String getFirstName() {
        return firstName;
    }
    
    String getSurname() {
        return surname;
    }
    
    int getID() {
        return personID;
    }
    
    int getPhoneNumber() {
        return phoneNumber;
    }
    
    char getGender() {
        return gender;
    }
    
    String getEmail() {
        return email;
    }
    
}
