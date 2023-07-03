package Except_process.Home_tasks.Home_task_2;

/* Если необходимо, исправьте данный код 

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
} */




public class Task_2 {

    public static void main(String[] args) {
        //Integer[] intArray  = {23, 36, 58, 789, 87, 56, 96, 123, 52, 43};
        Integer[] intArray  = {23, 36, 58, 789, 87, 56, 96, 123};

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
          //System.out.println("Catching exception: ");
          System.out.println("Catching exception: " + e);
        } 
        catch (Exception e) {                     //  Добавил перехватчик
            System.out.println(e.getMessage());   //  с типом исключения Exception
        }                                         //  
   
    }
    
}
