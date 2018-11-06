/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_13;

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
    private String subj;
    private String round;

    public Student() {
    }

    public Student(String id, String name, String email, String pass, String gender, String subj, String round) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
        this.subj = subj;
        this.round = round;
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

    public String getSubj() {
        return subj;
    }

    public String getRound() {
        return round;
    }
    
    
}
