/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled.evd_3;


/**
 *
 * @author Mostafizur
 */
public class Student {
    private String id;
    private String name;
    private String Email;
    private String passWord;
    private int age;
    private String gender;
    private String hobby;
    private String round;
    private String message;

    public Student() {
    }

    public Student(String id, String name, String Email, String passWord, int age, String gender, String hobby, String round, String message) {
        this.id = id;
        this.name = name;
        this.Email = Email;
        this.passWord = passWord;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.round = round;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassWord() {
        return passWord;
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

    public String getMessage() {
        return message;
    }
    
    
}
