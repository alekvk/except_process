package Except_process.Home_tasks.Home_task_3.Exceptions;

import Except_process.Home_tasks.Home_task_3.Exceptions.Base.MyException;

public class LackDataException extends MyException  {

    public LackDataException(String message) {
        super(message);
    }

    public void PrintHelp () {
        System.out.println("Должно быть введено 4 элемента: Ф.И.О и телефон");
    }
   
}
