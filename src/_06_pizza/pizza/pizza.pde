
void setup() {
    size(600,600);

}
void draw() {
  noStroke();
  fill(#DEB06B);
    ellipse(300,300, 400,400);
    fill(#DE5151);
    ellipse(300,300, 320,320);
     fill(#FAD472);
    ellipse(300,300, 260,260);
    
    if (mousePressed){
    fill(#D34535);
    ellipse (mouseX, mouseY, 100,100);
    
    
    
    
    
    
    }  
    
}
