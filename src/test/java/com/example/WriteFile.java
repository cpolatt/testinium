package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public void WriteFileTxt(String productName, String productPrice) throws IOException {

        String TestFile = "C:\\Users\\CemPolat\\Desktop\\Testinium\\demo\\upload\\temp.txt";
        File FC = new File(TestFile);
        FC.createNewFile();

        FileWriter FW = new FileWriter(TestFile);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(productName);
        BW.newLine();
        BW.write(productPrice); 
        BW.close();

    }

}
