/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class DocGhiFile {
    public static void DocFile(ArrayList<Student> list )
    {
        try{
            File f = new File("D:/test.txt");
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            String line;
            while((line = br.readLine())!=null)
            {
                if(line.trim().equals("")) continue;
                String []arr = line.trim().split("[;]+");
                
                Student st = new Student(Integer.parseInt(arr[0]), 
                        arr[1].trim(), Float.parseFloat(arr[2]));
                
                list.add(st);
                //System.out.println(line);
              
            }
            br.close();
            fr.close();
        }catch(Exception e)
        {
            System.out.println("Doc file bi loi");
        }
    }
    
    public static void GhiFile()
    {
        try{           
        
            File f = new File("D:\\test.txt");
        
            FileWriter fw = new FileWriter(f);         

            
            PrintWriter pw = new PrintWriter(fw);
            Student st1 = new Student(1, "Trung", 9.0f);
            Student st2 = new Student(2, "Binh", 7.0f);
            
            pw.println(st1);
            pw.println(st2);
            fw.close();
            pw.close();            
            
        }catch(Exception e)
        {
            System.out.println("File khong mo duoc");
        }        
    }
}
