
void setup() {
  size(500,600);
PImage zombie = loadImage("zomb.png");
zombie.resize(500,500);
image(zombie, 10, 10);


}
void draw() {
ellipse(160, 175, 100, 70);
fill(255,mouseX,mouseY);
ellipse(360, 160, 100, 70);
fill(255, mouseX,mouseY);
}
