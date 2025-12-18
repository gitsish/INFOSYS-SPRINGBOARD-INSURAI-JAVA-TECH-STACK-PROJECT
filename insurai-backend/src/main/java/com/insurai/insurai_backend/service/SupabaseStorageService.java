package com.insurai.insurai_backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class SupabaseStorageService {

    @Value("${supabase.url}")
    private String supabaseUrl;

    @Value("${supabase.bucket}")
    private String bucketName;

    /**
     * MOCK upload method.
     * Simulates uploading a file to Supabase Storage and
     * returns a public URL.
     */
    public String uploadFile(MultipartFile file, String path) {

        if (file == null || file.isEmpty()) {
            throw new RuntimeException("File is empty or null");
        }

        // Simulate upload by returning a realistic URL
        return supabaseUrl + "/" + bucketName + "/" + path;
    }
}
