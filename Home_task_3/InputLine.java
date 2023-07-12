package Except_process.Home_tasks.Home_task_3;
import java.util.Scanner;

import Except_process.Home_tasks.Home_task_3.Exceptions.ExceedDataException;
import Except_process.Home_tasks.Home_task_3.Exceptions.LackDataException;


public class InputLine {
    public String[] inputStr() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите Ф.И.О и телефон через один пробел (для завершения программы наберите q)");
            String str = iScanner.nextLine();
            if (str.equals("q")) {
                System.out.println("Работа программы завершена");
                System.exit(0);
            }     
            String[] arrayStr = str.split(" ");
            if (arrayStr.length == 4) {
                return arrayStr;
            } else if (arrayStr.length < 4){
                try {
                    throw new LackDataException("Введено меньше данных чем требуется");
                } catch (LackDataException e) {
                        //System.out.print("LackDataException e.printStackTrace(): ");
                        //e.printStackTrace();
                        System.out.println("");
                        //System.out.print("e: ");
                        System.out.println(e);
                        e.PrintHelp();
                        System.out.println("");
                } 
            } else {
                try {
                    throw new ExceedDataException("Введено больше данных чем требуется");
                } catch (ExceedDataException e) {
                        //System.out.print("ExceedDataException e.printStackTrace(): ");
                        //e.printStackTrace();
                        System.out.println("");
                        //System.out.print("e: ");
                        System.out.println(e);
                        e.PrintHelp();
                        System.out.println("");
                }                  
            }      
        }
    }
}


