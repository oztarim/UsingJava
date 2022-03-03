 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.Line2D;
 import javax.swing.JPanel;
 import javax.swing.JComponent;



 /**
    This component draws Basketball player and a basketball hoop to score
 */
 public class BasketballPlayerComponent extends JComponent
 {
public void paintComponent(Graphics g){
 // Recover Graphics2D
 Graphics2D g2 = (Graphics2D) g;

    //drawing head
    Ellipse2D head = new Ellipse2D.Double(215, 110, 70, 70);
     g2.setColor(Color.RED);
     g2.fill(head);

    //drawing LeftEye
    g2.setColor(Color.BLACK);
    g2.drawLine(230,130, 238,140);
    //drawing RightEye
    g2.drawLine(270,130,260,140);
    //drawing Nose
    Rectangle nose = new Rectangle(245, 145, 6, 10);
    g2.setColor(Color.BLACK);
    g2.fill(nose);

    //drawing Mouth
    Rectangle mouth = new Rectangle(240, 165,20, 5);
    g2.setColor(Color.BLACK);
    g2.fill(mouth);

     //drawing body
     Rectangle body = new Rectangle(240, 180, 20, 60);
     g2.setColor(Color.BLUE);
     g2.fill(body);

  //drawing left Leg
  g2.drawLine( 240,240, 205,320 );
  //drawing leftFoot
  Rectangle leftFoot = new Rectangle(190, 320, 17, 10);
  g2.setColor(Color.RED);
  g2.fill(leftFoot);

  //Drawing RightLeg
  g2.setColor(Color.BLUE);
  g2.drawLine( 260,240,300,320 );
  //drawing RightFoot
  Rectangle RightFoot = new Rectangle(297, 320, 17, 10);
  g2.setColor(Color.RED);
  g2.fill(RightFoot);

  //drawing LeftArm
  g2.setColor(Color.BLUE);
  g2.drawLine( 260,240,150,120);
  //drawing LeftHand
  Rectangle LeftHand = new Rectangle(150, 120, 14, 10);
  g2.setColor(Color.RED);
  g2.fill(LeftHand);

  //drawing RightArm
  g2.setColor(Color.BLUE);
  g2.drawLine( 240,220,360,200);
  //RightHand
  Rectangle RightHand = new Rectangle(350, 200, 14, 10);
  g2.setColor(Color.RED);
  g2.fill(RightHand);


  Ellipse2D basketball1 = new Ellipse2D.Double(350, 210, 35, 35);
   g2.setColor(Color.ORANGE);
   g2.fill(basketball1);

  Ellipse2D basketball2 = new Ellipse2D.Double(360, 250, 35, 35); // this is for dribbling effect
    g2.setColor(Color.ORANGE);
    g2.fill(basketball2);


  Ellipse2D basketball3 = new Ellipse2D.Double(370, 290, 35, 35); // this is for dribbling effect
     g2.setColor(Color.ORANGE);
     g2.fill(basketball3);

   Rectangle BasketballHoop = new Rectangle(650, 100, 40, 240); //Basketball hoop holding part
     g2.setColor(Color.BLACK);
     g2.fill(BasketballHoop);


    Rectangle BasketballHoop2 = new Rectangle(600,20, 80, 130); //Basketball hoop backboard glass
       g2.setColor(Color.LIGHT_GRAY);
       g2.fill(BasketballHoop2);

    Ellipse2D BasketballHoop3 = new Ellipse2D.Double(580, 60, 50, 50); //basketball hoop net
        g2.setColor(Color.WHITE);
        g2.fill(BasketballHoop3);

    //scoring basketball1
    Ellipse2D scoringBasketball1 = new Ellipse2D.Double(450, 3, 35, 35);
         g2.setColor(Color.ORANGE);
         g2.fill(scoringBasketball1);
         //scoring basketball2
     Ellipse2D scoringBasketball2 = new Ellipse2D.Double(490, 20, 35, 35);
         g2.setColor(Color.ORANGE);
         g2.fill(scoringBasketball2);
    //scoring basketball3
    Ellipse2D scoringBasketball3 = new Ellipse2D.Double(540, 40, 35, 35);
         g2.setColor(Color.ORANGE);
         g2.fill(scoringBasketball3);


    //drawing basketballfloor
    Rectangle BasketballFloor = new Rectangle(0,330,800, 40); //Basketball hoop backboard glass
            g2.setColor(Color.GRAY);
            g2.fill(BasketballFloor);

    g2.drawString("Hello",200,100);

    g2.setColor(Color.BLUE);
    g2.drawString("BasketballHoop",680,100);

    g2.drawString("Basketball",350,240);

    g2.setColor(Color.RED);
    g2.drawString("Basketball Floor",300,360);

}
 }
