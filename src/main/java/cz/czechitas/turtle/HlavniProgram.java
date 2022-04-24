package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle anakin;
        anakin = new Turtle();


      //  nakresliZmrzku(anakin);

        nakresliSnehulaka(anakin);


    }

    private void nakresliSnehulaka(Turtle anakin) {
        anakin.setLocation(500, 90);
        nakresliKolo(anakin, 50, Color.cyan);
        anakin.setLocation(539.34, 133.81);
        anakin.turnRight(90);
        nakresliKolo(anakin, 75, Color.cyan);
        anakin.setLocation(539.14, 283.26);
        nakresliKolo(anakin, 100, Color.cyan);
        anakin.setLocation(471.95, 208.64);
        anakin.turnRight(90);
        nakresliKolo(anakin, 30, Color.cyan);
        anakin.setLocation(622.23, 212.24);
        anakin.turnLeft(180);
        nakresliKolo(anakin, 30, Color.cyan);
    }

    private void nakresliZmrzku(Turtle anakin) {
        anakin.setLocation(100, 200);
        nakresliKolo (anakin, 100.0, Color.yellow);
        anakin.turnRight(90);
        anakin.setLocation(112.87, 239.61);
        nakresliKornout (anakin, 175.0, Color.orange);
    }


    private void nakresliKornout(Turtle anakin, double velikostZakladny, Color barva) {
        anakin.setPenColor(barva);
        anakin.move(velikostZakladny);
        anakin.turnRight(113.7);
        anakin.move(218.3);
        anakin.turnRight(132.75);
        anakin.move(218.3);
        anakin.turnRight(23.625);
}

    private void nakresliCtverec(Turtle anakin, double velikostStrany, Color barva) {
        double uhel = 90;
        for (int i = 0; i < 4; i++) {
            anakin.setPenColor(barva);
            anakin.move(velikostStrany);
            anakin.turnRight(uhel);

        }
    }

    private void nakresliObdelnik(Turtle anakin, double velikostStranyA, double velikostStranyB, Color barva) {
        double uhel = 90;
        for (int i = 0; i < 2; i++) {
            anakin.setPenColor(barva);
            anakin.move(velikostStranyA);
            anakin.turnRight(uhel);
            anakin.move(velikostStranyB);
            anakin.turnRight(uhel);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(Turtle anakin, double velikostStrany, Color barva) {
        double uhel = 120;
        for (int i = 0; i < 3; i++) {
            anakin.move(velikostStrany);
            anakin.turnRight(uhel);
        }
    }

    private void nakresliKolo(Turtle anakin, double polomer, Color barva) {
        double uhel = 12;
        double pi = 3.141592653589;
        double obvod = 30;
        double neco = (polomer*2*pi)/obvod;
        for (int i = 0; i < 30; i++) {
            anakin.setPenColor(barva);
            anakin.move(neco);
            anakin.turnRight(uhel);
        }
    }

    private void nakresliPluh(Turtle anakin, double delkaStrany, Color barva) {
        anakin.setPenColor(barva);
        anakin.turnRight(45);
        anakin.move(60);
        anakin.turnRight(135);
        anakin.move(delkaStrany);
        anakin.turnRight(90);
        anakin.move(delkaStrany);
}
}

