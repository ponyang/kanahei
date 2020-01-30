package com.kanahei.model;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class ImageModel {
    private List<String> tags;
    private LocalDateTime datetime;
    private MultipartFile file;
}
