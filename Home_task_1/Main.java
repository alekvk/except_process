package Except_process.Home_tasks.Home_task_1;



import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    

    public static void main(String[] args) {
        int[] arr1 = {29, 3, 56, 89, 12, 45,};
        int[] arr2 = {56, -3, 0, 900, 37, 36};
        int[] arr3 = {56, -3, 78, 900, 37, 36, 98, -47, 0, 900000};

        // Задание 1.
        // 1.1 Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "arr" is null
        // arr1 = null;
        // System.out.println(Task1_1(arr1));
        
        // 1.2  Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
        // Task1_2();

         // 1.3 Exception in thread "main" java.lang.ArithmeticException: / by zero
        // Task1_3();

     
        // Задание 2.
        //print(Task2(arr1, arr3));
      
        // Задание 3.
        //print(Task3(arr1, arr2));
        

    }

    // 1. Получить три разных типов исключений?
    
    //1.1  

    static int Task1_1(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        return arr.length;
    }

    // 1.2   Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
    /*
     Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     Необходимо посчитать и вернуть сумму элементов этого массива.
     При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
     (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
     Если нарушается одно из условий, метод должен вернуть код ошибки.
     Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
     Сравнить такой вариант обработки исключений с предыдущим.
     */

    static void Task1_2(){
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n ***Итерация %d ***\n\n", i+1);
            int errCode = processArrayV2(generateArray());
            if (errCode == -1){
                System.out.println("Некорректная размерность");
            }
            else if (errCode == -2){
                System.out.println("Некорректное значение массива");
            }
            else{
                System.out.printf("Сумма элементов массива: %d", errCode);
            }
        }
    }

    static int processArrayV2(int[][] arr){
        for (int i = 0; i < arr.length; i--) { // 'i--'= вместо 'i++' - Index  out of bounds for length 
            if (arr[i].length != arr.length)
            {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    return -2;
                }
                else{
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    } 

     static int[][] generateArray(){
        int[][] arr = new int[random.nextInt(2)+4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(2);
                if (random.nextInt(1000) == 0)
                {
                    arr[i][j] = 2; // Намерненная ошибка
                }
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }

    // 1.3   Exception in thread "main" java.lang.ArithmeticException: / by zero
    /*
     Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
     Необходимо посчитать и вернуть сумму элементов этого массива.
     При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами
     (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1.
     Если нарушается одно из условий, метод должен вернуть код ошибки.
     Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
     Сравнить такой вариант обработки исключений с предыдущим.
     */
   
    static void Task1_3(){
        for (int i = 0; i < 5; i++) {
            System.out.printf("\n ***Итерация %d ***\n\n", i+1);
            int errCode = processArrayV2_2(generateArray_2());
            if (errCode == -1){
                System.out.println("Некорректная размерность");
            }
            else if (errCode == -2){
                System.out.println("Некорректное значение массива");
            }
            else{
                System.out.printf("Сумма элементов массива: %d", errCode);
            }
        }
    }

    static int processArrayV2_2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {  
            int a = arr.length / i; // Деление на ноль
            if (arr[i].length != arr.length)
            {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1){
                    return -2;
                }
                else{
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    } 

     static int[][] generateArray_2(){
        int[][] arr = new int[random.nextInt(2)+4][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(2);
                if (random.nextInt(1000) == 0)
                {
                    arr[i][j] = 2; // Намерненная ошибка
                }
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        return arr;
    }



    
    /* 2. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
       и возвращающий новый массив, каждый элемент которого равен разности элементов 
       двух входящих массивов в той же ячейке. 
       Если длины массивов не равны, необходимо как-то оповестить пользователя. */
   
           
    static int[] Task2(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length];
        int[] arr4 = new int[0];
        if (arr1.length != arr2.length) {
            System.out.println("Размеры массивов не равны"); 
            return arr4;  
        } else {
            for (int i = 0; i < arr1.length; i++ ) {
               arr3[i] = arr1[i] - arr2[i];
            }
        }
        return arr3;           
    }

    
    /* 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
      и возвращающий новый массив, каждый элемент которого равен частному элементов 
      двух входящих массивов в той же ячейке. 
      Если длины массивов не равны, необходимо как-то оповестить пользователя. 
      Важно: При выполнении метода единственное исключение, 
     которое пользователь может увидеть - RuntimeException, т.е. ваше.
     Преподаватель ждет ваше задание до 29 июня, 20:00 +03:00 UTC
     Загрузите работу, чтобы преподаватель смог проверить ее и выставить оценку */


    static int[] Task3(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException(String.format("Размеры массивов не равны"));
        }      
        for (int i = 0; i < arr1.length; i++ ) {
            if (arr2[i] == 0) {
               throw new RuntimeException("Элемент второго массива с индексом " + i + " равен нулю");
            } else {
                arr3[i] = arr1[i] / arr2[i];
            }
        }
        return arr3; 
    }

    static void  print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 

}
    
   
    

          




        

        





        
       
    
   



