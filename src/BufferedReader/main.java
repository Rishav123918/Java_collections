package BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader bf=null;

        try{
            System.out.println("Enter the file path");
            String filepath= sc.nextLine();
            bf=new BufferedReader(new FileReader(filepath));
            String line;
            System.out.println("Content start");
            while((line= bf.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            try {
                if(bf!=null){
                    bf.close();
                    System.out.println("File read succesfully");
                }else {

                }
            } catch (IOException e) {
                System.out.println("Error closing file :"+e.getMessage());
            }
            sc.close();
        }
    }
}
