import processing.core.PApplet;

public class Sketch extends PApplet {
/**
 * Program Sketch.java
 * @author: E. Yap
 */

  public void settings() {
	// Size call
    size(400, 400);
  }

  /** 
   * Initial set up values
   * Background colour
   * i.e., stroke, fill etc.
   */
  public void setup() {
    background(214, 245, 255);
  }

  // Everything drawn to the screen
  public void draw() {
    // Size and fill call
    textSize(25);
    fill(255, 255, 255);

    // Variables for current time (hours and minutes)
    int intHours = hour();    // Values from 0 - 23
    int intMinutes = minute();  // Values from 0 - 59

    // Output current time
    text(intHours, 10, 30);
    text(intMinutes, 50, 30);
  }
}