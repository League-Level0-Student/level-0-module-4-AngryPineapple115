PImage jungle;
PImage creeper;
int x = 40;
int y = 286;
void setup() {

  size(600, 361);
  jungle = loadImage("jungle.jpg");
  background(jungle);

  creeper = loadImage("creeper.png");
  creeper.resize(12, 12);
}

void draw() {
  image(creeper, x, y);

  if (mousePressed) {
    fill(#FF0000);
    ellipse(mouseX, mouseY, 15, 15);
  }

  if (mouseX>=40&&mouseX<=52&&mouseY>=286&&mouseY<=298&&mousePressed) {
    println("You found it!!");

    fill(#00FF00);
    ellipse(mouseX, mouseY, 15, 15);
  }
}