package Except_process.Home_tasks.Home_task_3.Exceptions;

import Except_process.Home_tasks.Home_task_3.Exceptions.Base.MyException;



public class InvalidSymbolsException extends MyException {
    public InvalidSymbolsException(String message) {
        super(message);
    }

    public void InvalidSymbol (String i) {
        System.out.println("Введены некорректные данные");
        System.out.printf("Не буквенные и не цифровые символы: %s", i);
        System.out.println();
    }
}