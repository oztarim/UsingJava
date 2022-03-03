import javax.swing.JFrame;

//author Ozgur Tarim Student number 217437054

public class BasketballPlayer1Viewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(2000, 2000);
      frame.setTitle("Basketball Player Scoring Basket");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      BasketballPlayer1Component component = new BasketballPlayer1Component();
      frame.add(component);
      frame.setVisible(true);
   }
}
