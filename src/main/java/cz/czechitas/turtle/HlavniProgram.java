package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle anakin;
        anakin = new Turtle();
        anakin.setLocation(100, 150);
        nakresliTrojuhelnik(anakin, 100.0, Color.blue);

        Turtle padme;
        padme = new Turtle();
        padme.setLocation(250, 150);
        nakresliCtverec(padme, 100.0, Color.red);

        Turtle leia;
        leia = new Turtle();
        leia.setLocation(400, 150);
        nakresliObdelnik(leia, 100.0, 150.0, Color.yellow);

        Turtle luke;
        luke = new Turtle();
        luke.setLocation(600, 100);
        nakresliKolo(luke, 50.0, Color.green);


    }

    private void nakresliTrojuhelnik(Turtle anakin, double velikostStrany, Color barva) {
        double uhel = 120;
        for (int i = 0; i < 3; i++) {
            anakin.setPenColor(barva);
            anakin.move(velikostStrany);
            anakin.turnRight(uhel);
        }
    }

    private void nakresliCtverec(Turtle padme, double velikostStrany, Color barva) {
        double uhel = 90;
        for (int i = 0; i < 4; i++) {
            padme.setPenColor(barva);
            padme.move(velikostStrany);
            padme.turnRight(uhel);

        }
    }

    private void nakresliObdelnik(Turtle leia, double velikostStranyA, double velikostStranyB, Color barva) {
        double uhel = 90;
        for (int i = 0; i < 2; i++) {
            leia.setPenColor(barva);
            leia.move(velikostStranyA);
            leia.turnRight(uhel);
            leia.move(velikostStranyB);
            leia.turnRight(uhel);
        }
    }

    private void nakresliKolo(Turtle luke, double polomer, Color barva) {
        double uhel = 12;
        double pi = 3.141592653589;
        double obvod = 30;
        double neco = (polomer*2*pi)/obvod;
        for (int i = 0; i < 30; i++) {
            luke.setPenColor(barva);
            luke.move(neco);
            luke.turnRight(uhel);
        }
    }
}

