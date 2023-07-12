package Except_process.Home_tasks.Home_task_3;

import java.util.HashMap;

public class Controller {

    public static void InputWriteData () {
         
        while (true) {
            ParserLineItem parsData = new ParserLineItem(); 
            HashMap<String, Object> data = parsData.parsInputData(); 
            
            String newFileName = data.get("lastName") + ".txt"; 
            StringBuilder sb = new StringBuilder();
            for (String str : data.keySet()) {
                sb.append(data.get(str));
                sb.append(" ");
            }

            String filePath = newFileName;
            FileWrite wf = new FileWrite(); 
            wf.writeData(String.valueOf(sb), filePath); 
        }
    }
}

      
        
    
