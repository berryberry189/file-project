package test.fileproject.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import test.fileproject.file.S3Uploader;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/file")
public class FileController {

    private final S3Uploader s3Uploader;

    @PostMapping("/upload")
    public String upload(@RequestParam("data") MultipartFile multipartFile) throws IOException {

        System.out.println("multipartFile = " + multipartFile);

        return s3Uploader.upload(multipartFile, "test");
    }
}
