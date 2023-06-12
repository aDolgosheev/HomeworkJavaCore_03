package task_01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder logs = new StringBuilder();
        File src = new File("C:\\_java\\other\\Games\\src");
        createFolder(src, logs);
        File res = new File("C:\\_java\\other\\Games\\res");
        createFolder(res, logs);
        File savegames = new File("C:\\_java\\other\\Games\\savegames");
        createFolder(savegames, logs);
        File temp = new File("C:\\_java\\other\\Games\\temp");
        createFolder(temp, logs);
        File main = new File("C:\\_java\\other\\Games\\src\\main");
        createFolder(main, logs);
        File test = new File("C:\\_java\\other\\Games\\src\\test");
        createFolder(test, logs);
        File mainJava = new File("C:\\_java\\other\\Games\\src\\main", "Main.java");
        createFile(mainJava, logs);
        File utilsJava = new File("C:\\_java\\other\\Games\\src\\main", "Utils.java");
        createFile(utilsJava, logs);
        File drawables = new File("C:\\_java\\other\\Games\\res\\drawables");
        createFolder(drawables, logs);
        File vectors = new File("C:\\_java\\other\\Games\\res\\vectors");
        createFolder(vectors, logs);
        File icons = new File("C:\\_java\\other\\Games\\res\\icons");
        createFolder(icons, logs);
        File tempTXT = new File("C:\\_java\\other\\Games\\temp", "temp.txt");
        createFile(tempTXT, logs);

        try (FileWriter writer = new FileWriter(tempTXT)) {
            writer.write(logs.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createFolder(File folderName, StringBuilder logs) {
        if (folderName.mkdir()) {
            logs.append("Folder \"").append(folderName).append("\" has been created.\n");
        } else {
            logs.append("ERROR! Folder \"").append(folderName).append("\" has not been created.\n");
        }
    }

    public static void createFile(File fileName, StringBuilder logs) {
        try {
            if (fileName.createNewFile()) {
                logs.append("File \"").append(fileName).append("\" has been created.\n");
            } else {
                logs.append("ERROR! File \"").append(fileName).append("\" has not been created.\n");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
