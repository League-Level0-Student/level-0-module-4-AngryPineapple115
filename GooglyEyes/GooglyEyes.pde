void setup() {

  size(600, 300);
}
void draw() {
  fill(#FFFFFF);
  ellipse(150, 150, 200, 150);
  ellipse(450, 150, 200, 150);

  if (mouseX>=142&&mouseX<=248&&mouseY>=100&&mouseY<=177) {

    fill(#000000);
    ellipse(mouseX, mouseY, 30, 30);
  }
}
