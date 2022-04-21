package net.sevecek.turtle;
import net.sevecek.turtle.engine.*;
public class HlavniProgram<zofka> {
    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setLocation(100,80);
       // zofka slunicko
        nakresliSlunicko(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        zofka.turnRight(120);
        zofka.penUp();
        zofka.move(300);
        zofka.turnLeft(90);

        //zofka domecky
        zofka.turnLeft(160);
        zofka.penDown();
        nakreslidomecek(zofka);
        nakreslidomecek(zofka);
        nakreslidomecek(zofka);
        nakreslidomecek(zofka);
        nakreslidomecek(zofka);
        zofka.turnRight(25);
        zofka.penUp();
        zofka.move(470);
        zofka.turnLeft(25);
        zofka.penDown();
        nakreslidomecek(zofka);
        zofka.penUp();
        zofka.turnLeft(145);
        zofka.move(400);
        zofka.turnRight(145);

        zofka.penDown();
        nakreslidomecek(zofka);

        //zofka prasatko
        zofka.penUp();
        zofka.turnRight(35);
        zofka.move(300);
        zofka.turnRight(90);
        zofka.penDown();

        zofka.move(50);
        zofka.turnLeft(120);
        zofka.move(50);
        zofka.turnLeft(115);
        zofka.move(50);
        zofka.turnLeft(36);
        zofka.move(60);
        zofka.turnLeft(90);
        zofka.move(55);
        zofka.turnLeft(90);
        zofka.move(55);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(55);
        zofka.penDown();

        nakresliNozky(zofka);
        zofka.penUp();
        zofka.turnRight(210);
        zofka.move(80);
        zofka.turnRight(110);
        zofka.penDown();
        nakresliNozky(zofka);
    }
        private void nakresliCaru(Turtle zofka) {
                zofka.turnLeft(90);
                zofka.move(40);
                zofka.turnRight(180);
                zofka.move(40);
               zofka.turnRight(90);
                zofka.penUp();
            for (int i = 0; i < 50; i++) {
               zofka.turnLeft(1);
                zofka.move(1);
            }
            zofka.turnLeft(180);
            zofka.penDown();
            }
            private void nakresliSlunicko(Turtle zofka) {
                for (int i = 0; i < 355; i++) {
                    zofka.turnRight(1);
                    zofka.move(1);
            }
            }
    private void nakreslidomecek(Turtle zofka) {
                    zofka.turnLeft(235);
                    for (int i = 0; i < 4; i++) {
                        zofka.move(50);
                        zofka.turnRight(90);
                    }
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(40);
        zofka.turnRight(100);
        zofka.move(40);
        zofka.penUp();
        zofka. move(55);
        zofka.turnLeft(270);
        zofka.penDown();

    }
    private void nakresliNozky (Turtle zofka) {
        zofka.turnLeft(30);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(115);
        zofka.move(40);
     }
}