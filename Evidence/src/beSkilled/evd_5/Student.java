/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_5;

/**
 *
 * @author Mostafizur
 */
public class Student {
    private String name;
    private String email;
    private String gender;
    private String subject;
    private String round;

    public Student() {
    }

    public Student(String name, String email, String gender, String subject, String round) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.subject = subject;
        this.round = round;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getSubject() {
        return subject;
    }

    public String getRound() {
        return round;
    }
    
    
    
}
