package Ascii;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Ascii-Art
 */
public class Ascii {

    public static void main(String[] args) {
        System.out.println("hello world");
        String imgPath = "resources/mountain.jpg";
        BufferedImage img = imageLoader(imgPath);
        int imgWidth = img.getWidth();
        int imgHeight = img.getHeight();
        System.out.println("Image Successfully Loaded!");
        System.out.println("Image Height : " + imgHeight);
        System.out.println("Image Widht : " + imgWidth);
    }

    public static BufferedImage imageLoader(String filePath) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(filePath));
        } catch (IOException e) {
            System.err.println("Invalid Image");
        } // try-catch
        return img;
    } // ImageLoader

    public static void pixelLoader(BufferedImage img) {

    }

} // Ascii