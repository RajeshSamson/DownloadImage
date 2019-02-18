package com.example.downloadimage.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

@RestController("/app")
public class ImageResource {

    private byte[] data;

    @GetMapping("/img")
    public byte[] getImage() {
        DataBufferByte data = null;
        try {
            BufferedImage reader = ImageIO.read(new File("/Users/rajeshsamson/Desktop/image/bike_19-wallpaper-2560x1440.jpg"));
            WritableRaster raster = reader.getRaster();
            data = (DataBufferByte) raster.getDataBuffer();

        } catch (IOException e) {
            e.printStackTrace();

        }
        return data.getData();
    }
}
