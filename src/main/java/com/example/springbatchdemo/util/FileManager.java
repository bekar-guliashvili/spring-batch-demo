package com.example.springbatchdemo.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileManager {

    private static final String uploadDir = "src/main/resources/uploads/";

    public static String  saveFile(MultipartFile file) throws IOException {
        String filePath = uploadDir + file.getOriginalFilename();
        Path targetPath = Path.of(filePath);
        Files.copy(file.getInputStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
        return filePath;
    }

    public static void deleteFile(String path) throws IOException {
        Files.deleteIfExists(Path.of(path));
    }

    public static String getFilePath(){
        return uploadDir + "default.csv";
    }

}
