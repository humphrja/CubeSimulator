import processing.core.PApplet;
import pgui.win.WindowHandler;
import pgui.type.Palette;
import pgui.win.Window;

// This is a test comment

// Main class used to run application
public class Simulator extends PApplet {
    WindowHandler app;
    Window main;

    // This is used to declare the size of the sketch window
    public void settings() {
        size(400, 400);
    }

    // This is run once, before the first frame of draw()
    public void setup() {
        app = new WindowHandler(this);
        Palette mainPalette = new Palette(color(0,11,39), color(255), color(49,63,98), color(78, 101,155), color(141, 158, 191));
        main = app.addWindow(mainPalette);
        main.addSwitch(200, 200, 70, 40);
    }

    // This is run every frame
    public void draw() {
        app.displayCurrentWindow();
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] {"App"}, new Simulator());
    }
}
