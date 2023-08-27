package com.rapidfort.apiproject.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.rapidfort.apiproject.service.FileUploadService;

@RestController
@RequestMapping("/file")
public class FileUploadController {
    private final String UPLOAD_DIRECTORY = "/tmp/uploads/";

    @Autowired
    private FileUploadService fileUploadService;

    @PostMapping("/uploads")
    public ResponseEntity<String> fileController(@RequestParam("file") MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("No file uploaded");
        }

        this.fileUploadService.uploadFile(UPLOAD_DIRECTORY, file);

        long fileSize = file.getSize();
        String strFileSize = formatFileSize(fileSize);

        String fileInfo = "Filename: " + file.getOriginalFilename() +
                ", Size: " + strFileSize +
                ", Content Type: " + file.getContentType();

        return ResponseEntity.ok(fileInfo);
    }

    // Function to format file size in KB or MB
    private String formatFileSize(long size) {
        final long KB = 1024;
        final long MB = KB * 1024;

        if (size >= MB) {
            double sizeInMB = (double) size / MB;
            return String.format("%.2f MB", sizeInMB);
        } else if (size >= KB) {
            double sizeInKB = (double) size / KB;
            return String.format("%.2f KB", sizeInKB);
        } else {
            return size + " bytes";
        }
    }

}
