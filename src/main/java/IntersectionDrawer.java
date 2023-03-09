import javax.swing.*;
import java.awt.*;

public class IntersectionDrawer extends JComponent {


    public static void main(String[] args) {

        IntersectionDrawer component1 = new IntersectionDrawer();
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Intersection");
        frame.add(component1);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g) {
        Graphics g2 = (Graphics2D) g;
        IntersectionDrawer component1 = new IntersectionDrawer();

        Rectangle rec1 = new Rectangle(5, 10, 100, 250);
        Rectangle rec2 = new Rectangle(55,60,100,250);
        Rectangle rec3 = rec1.intersection(rec2);

        ((Graphics2D) g2).draw(rec1);
        ((Graphics2D) g2).draw(rec2);
        ((Graphics2D) g2).draw(rec3);



        }
    }

