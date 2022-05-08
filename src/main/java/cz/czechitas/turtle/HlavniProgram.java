package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle leia;
        leia = new Turtle();

        nakresliZmrzku(leia);

        nakresliSnehulaka(leia);

        nakresliMašinku(leia);


    }

    private void nakresliMašinku(Turtle leia) {
        leia.setLocation(900, 300);
        nakresliPluh(leia, 100.0, Color.green);

        leia.setLocation(900, 370);
        leia.turnLeft(45);
        nakresliObdelnik(leia, 100,200, Color.green);

        leia.turnRight(90);
        leia.move(320);
        leia.turnRight(180);
        nakresliObdelnik(leia, 120,180, Color.green);

        leia.move(120);
        leia.turnRight(90);
        nakresliKolo(leia, 60.0, Color.black);

        leia.penUp();
        leia.turnLeft(90);
        leia.move(90);
        leia.turnLeft(180);
        leia.penDown();
        nakresliKolo(leia, 25.0, Color.black);

        leia.turnLeft(180);
        leia.penUp();
        leia.move(70);
        leia.turnLeft(180);
        leia.penDown();
        nakresliKolo(leia, 25.0, Color.black);
    }

    private void nakresliPluh(Turtle leia, double velikostStrany, Color barva){
     leia.setPenColor(barva);
     leia.turnLeft(180);
     leia.move(velikostStrany);
     leia.turnRight(90);
     leia.move(velikostStrany);
     leia.turnRight(135);
     leia.move(Math.sqrt((Math.pow(velikostStrany,2))+(Math.pow(velikostStrany,2))));


    }

    private void nakresliSnehulaka(Turtle leia) {
        leia.setLocation(500, 90);
        nakresliKolo(leia, 50, Color.cyan);
        leia.setLocation(539.34, 133.81);
        leia.turnRight(90);
        nakresliKolo(leia, 75, Color.cyan);
        leia.setLocation(539.14, 283.26);
        nakresliKolo(leia, 100, Color.cyan);
        leia.setLocation(471.95, 208.64);
        leia.turnRight(90);
        nakresliKolo(leia, 30, Color.cyan);
        leia.setLocation(622.23, 212.24);
        leia.turnLeft(180);
        nakresliKolo(leia, 30, Color.cyan);
    }

    private void nakresliZmrzku(Turtle leia) {
        leia.setLocation(100, 200);
        nakresliKolo (leia, 100.0, Color.yellow);
        leia.turnRight(90);
        leia.setLocation(112.87, 239.61);
        nakresliKornout (leia, 175.0, Color.orange);
    }


    private void nakresliKornout(Turtle leia, double velikostZakladny, Color barva) {
        leia.setPenColor(barva);
        leia.move(velikostZakladny);
        leia.turnRight(113.7);
        leia.move(218.3);
        leia.turnRight(132.75);
        leia.move(218.3);
        leia.turnRight(23.625);
}

    private void nakresliCtverec(Turtle leia, double velikostStrany, Color barva) {
        double uhel = 90;
        for (int i = 0; i < 4; i++) {
            leia.setPenColor(barva);
            leia.move(velikostStrany);
            leia.turnRight(uhel);

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

    private void nakresliRovnostrannyTrojuhelnik(Turtle leia, double velikostStrany, Color barva) {
        double uhel = 120;
        for (int i = 0; i < 3; i++) {
            leia.move(velikostStrany);
            leia.turnRight(uhel);
        }
    }

    private void nakresliKolo(Turtle leia, double polomer, Color barva) {
        double uhel = 12;
        double pi = 3.141592653589;
        double obvod = 30;
        double neco = (polomer*2*pi)/obvod;
        for (int i = 0; i < 30; i++) {
            leia.setPenColor(barva);
            leia.move(neco);
            leia.turnRight(uhel);
        }
    }


}


