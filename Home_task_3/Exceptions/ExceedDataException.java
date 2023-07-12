package Except_process.Home_tasks.Home_task_3.Exceptions;

import Except_process.Home_tasks.Home_task_3.Exceptions.Base.MyException;

public class ExceedDataException extends MyException {
    public ExceedDataException(String message) {
        super(message);
    }

    public void PrintHelp () {
        System.out.println("Должно быть введено 4 элемента: Ф.И.О и телефон");
    }
    
}


