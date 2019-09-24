void setup(){
  size(600,600);
}
void draw(){
fill(#F20727);
noStroke();
//head
ellipse(300,300,300,300);
fill(#ffffff);
ellipse(225,250,50,50);
//mouth
if (mousePressed){
fill(#000000);
arc(300, 325, 200, 200, 0, PI);
}
}
