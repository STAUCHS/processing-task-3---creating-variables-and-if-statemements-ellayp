import processing.core.PApplet;

public class Sketch extends PApplet {
/**
 * Program Sketch.java
 * @author: E. Yap
 */

  public void settings() {
	// Size call
    size(400, 600);
  }

  /** 
   * Initial set up values
   * Stroke weight
   */
  public void setup() {
    strokeWeight(5);

    // X
    float randomX = random(1, 3);
    float randomY = random(1, 3);

    if (randomX < 2 && randomY < 2) {
      background(26, 56, 79);
    }
    else if (randomX > 1 && randomY > 1) {
      background(214, 245, 255);
    }

    // X
    if (randomX < 2 && randomY < 2) {
      stroke(133, 170, 70);
     }
    else if (randomX > 1 && randomY > 1) {
      stroke(44, 169, 44);
    }

    // Draw stem
    line(width/2, height/3, width/2, height/1);

    // X
    if (randomX < 2 && randomY < 2) {
      fill(133, 170, 70);
     }
    else if (randomX > 1 && randomY > 1) {
      fill(44, 169, 44);
    }
    
    // Draw leaf
    quad(width/2, (float)(height/1.09), width/2, (float)(height/1.2), (float)(width*0.6), (float)(height*0.72), (float)(width*0.6), (float)(height*0.77));

    // X
    if (randomX < 2 && randomY < 2) {
      fill(209, 144, 44);
     }
    else if (randomX > 1 && randomY > 1) {
      fill(240, 210, 209);
    }
    
    // Draw four petals
    ellipse(width/4, height/6, width/2, height/3);
    ellipse((float)(width*0.75), height/6, width/2, height/3);
    ellipse(width/4, height/2, width/2, height/3);
    ellipse((float)(width*0.75), height/2, width/2, height/3);

       // X
       if (randomX < 2 && randomY < 2) {
        fill(112, 67, 50);
       }
      else if (randomX > 1 && randomY > 1) {
        fill(250, 240, 162);
      }
   
    // Draw center of flower
    ellipse(width/2, height/3, width/2, height/3);
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