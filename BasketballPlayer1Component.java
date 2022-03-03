import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

/**
//author Ozgur Tarim Student number 217437054
*/
public class BasketballPlayer1Component extends JComponent
{
   public void paintComponent(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      BasketballPlayer1 basketballplayer1 = new BasketballPlayer1(0, 0);

      int x = getWidth() - 650;
      int y = getHeight() - 700;

      BasketballPlayer1 basketballPlayer2 = new BasketballPlayer1(x, y);

      basketballplayer1.draw(g2);
      basketballPlayer2.draw(g2);
   }
}
