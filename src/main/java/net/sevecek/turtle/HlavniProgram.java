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

        //napis sve jmeno
    zofka.setLocation(300,100);
    zofka.turnRight(150);

    zofka.penDown();
    napisPismenoV(zofka);
    zofka.move(20);
    zofka.penDown();
    napisPismenoE(zofka);
    zofka. penUp();
    zofka.move(20);
    zofka.penDown();
    napisPismenoR(zofka);
    zofka.turnRight(200);
    zofka.move(30);
    napisPismenoC(zofka);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(17);
    zofka.turnLeft(80);
    zofka.move(15);
    napisPismenoA(zofka);
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
    private void napisPismenoV (Turtle zofka) {
    zofka.penUp();
    zofka.turnLeft(20);
    zofka.penDown();
    zofka.move(40);
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(130);
    zofka.move(43);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(120);
    zofka.move(20);
     }
     private void napisPismenoE(Turtle zofka) {
     zofka.turnLeft(90);
     zofka.move(40);
     zofka.turnRight(90);
     zofka.move(30);
     zofka.turnLeft(180);
     zofka.penUp();
     zofka.move(30);
     zofka.turnLeft(90);
     zofka.move(20);
     zofka.turnLeft(90);
     zofka.penDown();
     zofka.move(30);
     zofka.turnLeft(180);
     zofka.penUp();
     zofka.move(30);
     zofka.turnLeft(90);
     zofka.move(20);
     zofka.turnLeft(90);
     zofka.penDown();
     zofka.move(30);
              }
     private void napisPismenoR (Turtle zofka) {
     zofka.turnLeft(90);
     zofka.move(40);
     zofka.turnRight(45);
     for (int i = 0; i < 60; i++) {
          zofka.turnRight(4);
          zofka.move(1);
              }
              }
     private void napisPismenoC (Turtle zofka) {
     zofka.penUp();
     zofka.turnLeft(40);
     zofka.move(40);
     zofka.turnLeft(80);
     zofka.move(30);
     zofka.penDown();
     for (int i = 0; i < 46; i++) {
          zofka.turnLeft(4);
          zofka.move(1);
                      }
     zofka.move(30);
     zofka.turnLeft(30);
     zofka.penDown();
     for (int i = 0; i < 40; i++) {
          zofka.turnLeft(4);
          zofka.move(1);
                      }
              }
     private void napisPismenoA(Turtle zofka) {
     zofka.turnLeft(70);
     zofka.penDown();
     zofka.move(50);
     zofka.turnLeft(225);
     zofka.move(52);

     zofka.turnLeft(180);
     zofka.penUp();
     zofka.move(16);
     zofka.turnLeft(70);
     zofka.penDown();
     zofka.move(15);
     zofka.move(14);
     zofka.penUp();
     zofka.turnLeft(50);
     zofka.move(30);
     zofka.turnRight(230);
     zofka.move(50);
              }
}