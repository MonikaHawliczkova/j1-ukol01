package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();
    public void start() {

        //nakresliPrasatko();
        //zofka.penUp();
        //zofka.move(300);
        //zofka.penDown();
        //nakresliOsmiUhelnik();
        //zofka.penUp();
        //zofka.turnRight(135);
        //zofka.move(200);
        //zofka.penDown();
        //nakresliKolecko();
        //zofka.penUp();
        //zofka.move(200);
        //zofka.penDown();
        //nakresliSlunicko();


        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(550);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnLeft(180);
        zofka.penDown();

        nakresliDomecek();

        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek();

        for (int i = 0; i < 4; i++) {
            zofka.penUp();
            zofka.turnLeft(45);
            zofka.move(150);
            zofka.turnLeft(90);
            zofka.penDown();
            nakresliDomecek();
        }

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek();

        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(625);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliPrasatko();

        zofka.penUp();
        zofka.turnRight(7);
        zofka.move(750);
        zofka.penDown();

        nakresliMaleSlunicko();


    }

    private void nakresliPrasatko() {
        nakresliObdelnik();
        nakresliTrojuhelnik();

        zofka.turnRight(135);
        zofka.move(100);

        nakresliNozicku();

        zofka.turnRight(135);
        zofka.move(150);
        zofka.turnRight(90);

        nakresliNozicku();
    }

    private void nakresliTrojuhelnik() {
        zofka.turnLeft(45);
        zofka.move(72);
        zofka.turnRight(90);
        zofka.move(72);
    }

    private void nakresliObdelnik(){
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

    private void nakresliMaleSlunicko() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                zofka.move(3);
                zofka.turnLeft(5);
            }
            zofka.turnRight(90);
            zofka.move(15);
            zofka.turnLeft(180);
            zofka.move(15);
            zofka.turnRight(90);

        }

    }

    private void nakresliDomecek() {
        zofka.turnRight(90);
        nakresliObdelnik();
        nakresliTrojuhelnik();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}