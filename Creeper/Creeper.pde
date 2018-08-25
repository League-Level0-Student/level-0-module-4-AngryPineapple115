PImage jungle;
PImage creeper;
void setup() {
  size(612,407);
  jungle = loadImage("jungle.jpg");
  creeper = loadImage("creeper.png");
  
  creeper.resize(8,8);
  
  println(mouseX,mouseY);
  
  
}
void draw() {
  
  background(jungle);
  image(creeper,mouseX, mouseY);
  
  
}