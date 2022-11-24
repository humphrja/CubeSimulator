import processing.core.*;

// Main class used to run application
public class Simulator extends PApplet {
    // This is used to declare the size of the sketch window
    public void settings() {
        size(100, 100);
    }

    // This is run once, before the first frame of draw()
    public void setup() {

    }

    // This is run every frame
    public void draw() {

    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] {"App"}, new Simulator());
    }
}
