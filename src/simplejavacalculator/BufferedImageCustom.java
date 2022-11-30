package simplejavacalculator;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;


class BufferedImageCustom {
   public Image imageReturn() 
      throws IOException {
      Image image;
      
      InputStream bis = getClass().getResourceAsStream("/resources/icon/icon.png");
      BufferedImage bImage2 = ImageIO.read(bis);
      image = bImage2;
      
      return image;
   }       
}
