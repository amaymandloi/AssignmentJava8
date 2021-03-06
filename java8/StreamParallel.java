package com.assignment.java8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class StreamParallel {

    public static void main(String[] args)
        throws IOException
    {
  
        File fileName
            = new File("C:/Users/amay.mandloi/Downloads/program/List_Textfile.txt");
  
        List<String> text
            = Files.readAllLines(fileName.toPath());
  
        text.parallelStream().forEach(System.out::println);
    }
}

