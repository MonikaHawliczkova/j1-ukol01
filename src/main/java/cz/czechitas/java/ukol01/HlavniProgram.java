package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

        nakresliPrasatko();

    }

    private void nakresliPrasatko() {
        nakresliTelo();
        nakresliHlavu();

        zofka.turnRight(135);
        zofka.move(100);

        nakresliNozicku();

        zofka.turnRight(135);
        zofka.move(150);
        zofka.turnRight(90);

        nakresliNozicku();
    }

    private void nakresliHlavu() {
        zofka.turnLeft(45);
        zofka.move(72);
        zofka.turnRight(90);
        zofka.move(72);
    }

    private void nakresliTelo(){
        for (int i = 0; i <2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(90);
        }
    }

    private void nakresliNozicku() {
        zofka.turnRight(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnLeft(180);
        zofka.move(30);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}