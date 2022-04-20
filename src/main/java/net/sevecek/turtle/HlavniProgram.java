package net.sevecek.turtle;
import net.sevecek.turtle.engine.*;
public class HlavniProgram<zofka> {
    public void main(String[] args) {
        Turtle zofka;
        zofka = new Turtle();
        zofka.setLocation(100,80);
        nakresliSlunicko(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
        nakresliCaru(zofka);
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


}
