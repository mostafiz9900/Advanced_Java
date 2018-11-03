/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_2;

/**
 *
 * @author User
 */
public class Student {
    private String id;
    private String name;
    private String pass;
    private String email;
    private int age;
    private String gender;
    private String hobby;
    private String round;
    private String messsage;

    public Student() {
    }

    public Student(String id, String name, String pass, String email, int age, String gender, String hobby, String round, String messsage) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.messsage = messsage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getHobby() {
        return hobby;
    }

    public String getRound() {
        return round;
    }

    public String getMesssage() {
        return messsage;
    }
    
}
