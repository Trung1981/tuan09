/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tuan09;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class Tuan09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //DocGhiFile.GhiFile();
        
        ArrayList<Student> list = new ArrayList<>();
        
        
        DocGhiFile.DocFile(list);
        
        
        for(Student st:list)
            System.out.println(st);
        
        Comparator<Student> cmpID = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.ID>o2.ID) return 1;
                else if(o1.ID==o2.ID) return 0;
                return -1;
            }
        };
        
        Collections.sort(list, cmpID);
        
        System.out.println("\nDanh sach da duoc sap xep");
        for(Student st:list)
            System.out.println(st);
        
    }
    
}
