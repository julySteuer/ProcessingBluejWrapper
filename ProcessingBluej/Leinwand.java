/*
 * Die Leinwand ist das zentrale objekt dieses Wrappers mithilfe dieser klasse kann man einen Render kontext erstellen welche es erlaubt 
 * zu zeichnen und events wie maustasten und tatertur tasten abzufangen 
 */
public class Leinwand
{
   public PWrapper kontext;
   
   public Leinwand(int width, int height, Zeichnung zeichnung, String name) {
       kontext = new PWrapper(width, height, zeichnung, name);
   }
   
   public void runSketch() {
       this.kontext.runSketch();
   }
}
