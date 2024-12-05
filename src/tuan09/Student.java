/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan09;

/**
 *
 * @author DELL
 */
public class Student {
    int ID;
    String Name;
    float score;

    public Student(int ID, String Name, float score) {
        this.ID = ID;
        this.Name = Name;
        this.score = score;
    }
    
    @Override
    public String toString()
    {
        return ID + ";" + Name + ";" + score;
    }
}
