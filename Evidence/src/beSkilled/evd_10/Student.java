/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_10;

/**
 *
 * @author Mostafizur
 */
public class Student {
    private String id;
    private String name;
    private String email;
    private String pass;
    private String gender;
    private String subject;
    private String Round;

    public Student() {
    }

    public Student(String id, String name, String email, String pass, String gender, String subject, String Round) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
        this.subject = subject;
        this.Round = Round;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public String getGender() {
        return gender;
    }

    public String getSubject() {
        return subject;
    }

    public String getRound() {
        return Round;
    }
    
}
