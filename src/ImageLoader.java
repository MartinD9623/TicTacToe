import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ImageLoader {

    static Image imgX, imgO;

    public ImageLoader(){


        System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try {
            imgX = ImageIO.read(new File("res/cross.png"));
            imgO = ImageIO.read(new File("res/circle.png"));
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
