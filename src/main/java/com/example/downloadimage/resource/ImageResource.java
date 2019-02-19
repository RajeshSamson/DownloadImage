package com.example.downloadimage.resource;

import com.example.downloadimage.model.Image;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/app")
public class ImageResource {

    private byte[] data;


    @GetMapping(value = "/img")
    public Image getImage() {
        return null;
    }
}
