import ddf.minim.*;    
Minim minim;    
AudioPlayer sound;
void setup() {
  
   minim = new Minim(this);    
  sound = minim.loadFile("ding.wav");     
    size(300,300);
    fill(#AA7802);
    ellipse(150,150,300,300);
    fill(#FFC640);
    ellipse(150,150,250,250);
}
void draw() {
  
    
    
    PImage pepperoni = loadImage("pepperoni.jpg");
    pepperoni.resize(30,30);
    if(mousePressed && (mouseButton == RIGHT)){
    image(pepperoni,mouseX,mouseY);
    sound.play();
    sound.rewind();}
    
     PImage mushroom = loadImage("mushroom.jpg");
    mushroom.resize(30,30);
    if(mousePressed && (mouseButton == LEFT)){
    image(mushroom,mouseX ,mouseY );
    sound.play();
    sound.rewind();
}}
