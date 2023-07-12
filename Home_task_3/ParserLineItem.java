package Except_process.Home_tasks.Home_task_3;

import java.util.HashMap;

import Except_process.Home_tasks.Home_task_3.Exceptions.InvalidSymbolsException;
import Except_process.Home_tasks.Home_task_3.Exceptions.ParserException;

public class ParserLineItem {

    public HashMap<String, Object> parsInputData() {
        InputLine inputData = new InputLine();
        String[] data = inputData.inputStr();
        HashMap<String, Object> dict = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int k = 1; // Счетчик элементов строки  
        for (String i : data) {
            if ((i.matches("[A-Za-z]+") && k > 3) || (i.matches("[0-9]+")) && k != 4) {
                try {
                    throw new ParserException("Неправильный ввод данных");
                } catch (ParserException e) {
                    System.out.println (e);
                    e.PrintHelp();
                }
                break;
            }
            else if (i.matches("[A-Za-z]+")) {
                sb.append(i + " ");
            } 
            else if (i.matches("[0-9]+")) {
                dict.put("tel", i); 
            }
            else {
                try {
                    throw new InvalidSymbolsException("Некорректный символ");
                } catch (InvalidSymbolsException e) {
                    System.out.println (e);
                    e.InvalidSymbol(i);
                }
            }
            k++;
        }
        String[] fullName = String.valueOf(sb).split(" ");
        if (fullName.length == 3) {
            dict.put("firstName", fullName[1]);
            dict.put("lastName", fullName[0]);
            dict.put("patronymic", fullName[2]);
        }
        return dict;
    }

}


