package h02;



//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Appletop extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Joy", 50, 60);
        g.setColor(Color.red);
        g.drawString("Martodrono", 70, 80);

        }
    }