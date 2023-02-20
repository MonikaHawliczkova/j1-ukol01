package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

        nakresliPrasatko();

        zofka.penUp();
        zofka.move(300);
        zofka.penDown();

        nakresliOsmiUhelnik();

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(200);
        zofka.penDown();

        nakresliKolecko();

        zofka.penUp();
        zofka.move(200);
        zofka.penDown();

        nakresliSlunicko();

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

    private void nakresliOsmiUhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }

    }

    private void nakresliKolecko() {
        for (int i = 0; i <72; i++) {
            zofka.move(5);
            zofka.turnLeft(5);
        }
    }

    private void nakresliSlunicko(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                zofka.move(5);
                zofka.turnLeft(5);
            }
            zofka.turnRight(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.move(30);
            zofka.turnRight(90);
            
        }

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}