import processing.core.PApplet;
/*
 * PWrapper instanz ist die implementierung der PApplet welche fenter und taterturevenets abfängt und die bilter schlussendlich rendert 
 */
public class PWrapper extends PApplet
{
    int x;
    int y;
    String name;
    Zeichnung renderer;
    
    public PWrapper(int x, int y, Zeichnung renderer, String name) {
        this.x = x;
        this.y = y;
        this.renderer = renderer;
        this.name = name;
    }
    
    public void settings() {
        this.renderer.aufbau();
    }
    
    public void draw() {
        this.renderer.zeichnen();
    }
    
    public void mousePressed(){
        this.renderer.mausDruck();
    }
    
    public void keyPressed() {
        this.renderer.tastenDruck();
    }
    
    public void runSketch() {
        String[] processingArgs = {name};
        PApplet.runSketch(processingArgs, this);
    }
}
