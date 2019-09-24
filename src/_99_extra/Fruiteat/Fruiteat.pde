void setup(){
size(600,600);
}
void draw(){
fill(#E01D1D);
background(#6A3C01);
ellipse(300,300,300,300);
fill(#0EC643);
rect(285,100,20,50);

if (mousePressed){
fill(#6A3C01);
noStroke();
triangle(550,100,550,400,300,300);
}
}
