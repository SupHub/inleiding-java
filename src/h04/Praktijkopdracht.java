package h04;

import java.applet.*;
import java.awt.*;

 public class Praktijkopdracht extends Applet{
    public void init(){
    }

    public void paint(Graphics g) {
    setBackground(Color.white);
    g.setColor(Color.black);

    //*Rij 1*//
    g.drawLine(5,20,155,20);
    g.drawString("Lijn",65,30);

    g.drawRect(5,35,150,80);
    g.drawString("Rechthoek",50,130);

    g.drawRoundRect(5,140,150,80,25,25);
    g.drawString("Afgeronde rechthoek",25,230);

    //*Rij 2*//
    g.setColor(Color.magenta);
    g.fillRect(165,36,150,80);
    g.setColor(Color.black);
    g.drawOval(165,35,150,80);
    g.drawString("Gevulde rechthoek met ovaal",170,130);

    g.setColor(Color.magenta);
    g.fillOval(165,140,150,80);
    g.setColor(Color.black);
    g.drawString("Gevulde ovaal",200,230);

    //*Rij 3*//
    g.setColor(Color.magenta);
    g.fillArc(320,35,150,80,360,45);
    g.setColor(Color.black);
    g.drawOval(320,35,150,80);
    g.drawString("Taartpunt met ovaal eromheen",330,130);

    g.setColor(Color.black);
    g.drawArc(350,140,80,80,360,360);
    g.drawString("Cirkel",375,230);
    }


}

