/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Admin
 */
public class Teacher {
    private String name;
    private int age ;
    private String email;
    private String hisClass;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getHisClass(){
        return hisClass;
    }
    public void setHisClass(String hisClass){
        this.hisClass = hisClass;
    }
    
    public void getInfor(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("His class: " + hisClass);
    }
}
