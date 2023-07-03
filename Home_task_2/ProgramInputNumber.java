package Except_process.Home_tasks.Home_task_2;

import java.util.ArrayList;
import java.util.Scanner;

/* Реализуйте метод, который запрашивает у пользователя ввод дробного числа 
(типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных. */


public class ProgramInputNumber {
    public static void main(String[] args) {

        System.out.print(InputNumberFloat());   
     
    }

    public static Float InputNumberFloat() {
        float num = 0;
        Scanner conin = new Scanner(System.in);
        System.out.print("Введите число: ");
        while (conin.hasNext()) {
            if(conin.hasNextFloat()) {
                num = conin.nextFloat();
                return num;
            }
            else {
                String str = conin.next();
                System.out.println("Вы ввели текст " + '"' + str + '"' + " Необходимо ввести число");
                System.out.print("Введите число: ");
            }
        } 
        return num;
    }

}  












       
    







 





