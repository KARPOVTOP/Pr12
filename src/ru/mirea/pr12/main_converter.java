package ru.mirea.pr12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main_converter {
    public static void main(String[] args) {
        final String FILENAME = "C:/Users/Mich/IdeaProjects/Pr12/src/file.txt";

        try {
            String words = new String(Files.readAllBytes(Paths.get(FILENAME)));
        } catch (IOException e) {
            e.printStackTrace();
            String words = "";
        }
    }
}