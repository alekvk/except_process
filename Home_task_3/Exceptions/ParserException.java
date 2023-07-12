package Except_process.Home_tasks.Home_task_3.Exceptions;

import Except_process.Home_tasks.Home_task_3.Exceptions.Base.MyException;

public class ParserException extends MyException  {
    

        public ParserException(String message) {
            super(message);
        }
    
        public void PrintHelp () {
            System.out.println("Возможно нарушен порядок ввода: сначало Ф.И.О, а потом телефон");
        }
       
}
    

