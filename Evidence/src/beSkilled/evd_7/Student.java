/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_7;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String email;
    private String pass;
    private String gender;
    private String sub;
    private String round;

    public Student() {
    }

    public Student(String name, String email, String pass, String gender, String sub, String round) {
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.gender = gender;
        this.sub = sub;
        this.round = round;
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

    public String getSub() {
        return sub;
    }

    public String getRound() {
        return round;
    }
    
    
    
}
