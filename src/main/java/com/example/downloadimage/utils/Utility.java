package com.example.downloadimage.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Utility {

    public static String encoding(String imagePath) {
        Path filePath = Paths.get(imagePath);
        try (FileInputStream inputStream = (FileInputStream) Files.newInputStream(filePath)) {
            String base64Image = null;
            byte[] imageData = new byte[(int) filePath.toFile().length()];
            inputStream.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
            return base64Image;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void decoder(String base64Image, String pathFile) {
        try (FileOutputStream imageOutFile = new FileOutputStream(pathFile)) {

            byte[] imageByteArray = Base64.getDecoder().decode(base64Image);
            imageOutFile.write(imageByteArray);
        } catch (FileNotFoundException e) {
            System.out.println("Image not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the Image " + ioe);
        }
    }


}
