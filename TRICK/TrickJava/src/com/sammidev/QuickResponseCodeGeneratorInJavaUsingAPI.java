package com.sammidev;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QuickResponseCodeGeneratorInJavaUsingAPI {

    public static void main(String[] args) throws Exception {
        String details = "hello";
        ByteArrayOutputStream outputStream = QRCode.from(details).to(ImageType.JPG).stream();

        File file = new File("/home/sammidev/Desktop/trik/QR_Generator_Libs/MyChannel.JPG");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(outputStream.toByteArray());
        fileOutputStream.flush();
    }
}
