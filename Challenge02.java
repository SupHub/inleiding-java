package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Challenge02 extends Applet {
    Button Fris;
    Button Bier;
    Button Wijn;
    Button Koffie;
    Button Binngedist;
    Button Buitgedist;
    Button Nieuwebestelling;
    int teller;
    int teller1;
    int teller2;
    int teller3;
    int teller4;
    int teller5;
    int teller6;
    int totaal;

    public void init() {
        setSize(500,500);
        KnopListener kl = new KnopListener();


        Fris = new Button("Fris ");
        Fris.addActionListener(kl);
        Bier = new Button("Bier ");
        Bier.addActionListener(new Bier());
        Wijn = new Button("Wijn ");
        Wijn.addActionListener(new Wijn());
        Koffie = new Button("Koffie ");
        Koffie.addActionListener(new Koffie());
        Binngedist = new Button("Binngedist ");
        Binngedist.addActionListener(new Binngedist());
        Buitgedist = new Button("Buitgedist ");
        Buitgedist.addActionListener(new Buitgedist());
        Nieuwebestelling = new Button("Nieuwebestelling");
        Nieuwebestelling.addActionListener(new Nieuwebestelling());
        teller  = 0;
        teller1 = 0;
        teller2 = 0;
        teller3 = 0;
        teller4 = 0;
        teller5 = 0;
        teller6 = 0;


        add(Fris);
        add(Bier);
        add(Wijn);
        add(Koffie);
        add(Binngedist);
        add(Buitgedist);
        add(Nieuwebestelling);


    }


    public void paint(Graphics g) {
        g.drawString("Bestelling totaal:" + teller + teller1 + teller2 + teller3 + teller4 + teller5 +teller6, 20, 95);

        g.drawString("Totaal dagomzet:" + totaal , 20, 110);
        totaal= teller + teller1 + teller2 + teller3 + teller4 + teller5 + teller6;

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller++;
            totaal++;
            repaint();

        }
    }

    class Bier implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller1++;
            totaal++;
            repaint();
        }
    }

    class Wijn implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller2++;
            totaal++;
            repaint();
        }
    }

    class Koffie implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller3++;
            totaal++;
            repaint();
        }
    }

    class Binngedist implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            teller4++;
            totaal++;
            repaint();
        }
    }

    class Buitgedist implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller5++;
            totaal++;
            repaint();
        }
    }

    class Nieuwebestelling implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            teller6++;
            totaal++;
            repaint();
        }
    }



}
