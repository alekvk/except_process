package Except_process.Home_tasks.Home_task_3;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public void writeData(String data, String path) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(path, true);
            fw.append(data);
            fw.append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                     fw.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла");
                }
                }
        }
    }
}