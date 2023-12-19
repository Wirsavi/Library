import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class bl extends JFrame {
  private static bl Bl;
  private static Image pypy;
  private static Image liverca;
  
  public static void main(String[] args) throws IOException{
      pypy = ImageIO.read(bl.class.getResourceAsStream("Pypy.png"));
      liverca = ImageIO.read(bl.class.getResourceAsStream("livai.png"));
  }
  public static void onRepain(Graphics g){
      g.drawImage(pypy, 860, 672, null);
      g.drawImage(liverca, 100, 100, null);
  }
  
      
  
}