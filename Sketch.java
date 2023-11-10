import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1000, 600);
  }


  public void setup() {
    background(0, 0, 0);
  }
  
  /*
   * Draws a human using values for the head's diameter, x position and y position
   * @author D. Jin
   * @param headX the first number
   * @param headY the second number
   * @param headDiameter the third number
   * @return the mouthX value and we add 1 to make it work by modulus
   */


  public void drawHuman(int headX,int headY, int headDiameter) 
  {
    // making the lines thicker
    // black background
    strokeWeight(2);
    fill (0, 0, 0);
    // head
    ellipse(headX, headY, headDiameter, headDiameter);
    // torso
    line(headX, headY+15, headX, headY+45);
    // arms
    line(headX, headY+30, headX-15, headY+20);
    line(headX, headY+30, headX+15, headY+20);
    // legs
    line(headX, headY+45, headX-15, headY+60);
    line(headX, headY+45, headX+15, headY+60);
    // eyes
    ellipse(headX - 5, headY-5, 2, 2);
    ellipse(headX + 5, headY-5, 2, 2);
  }

  public int drawMouth(int mouthX, int mouthY, int mouthDiameter)
  {
    // drawing a circle for mouth
    ellipse(mouthX, mouthY, mouthDiameter, mouthDiameter);

    if (mouthX % 3 == 0)
    {
      // smiley face mouth
      stroke(0, 0, 0);
      ellipse(mouthX, mouthY-5, mouthDiameter-3, mouthDiameter-3);
    }
    else 
    {
      // sad face mouth
      stroke(0,0,0);
      ellipse(mouthX, mouthY+5, mouthDiameter-3, mouthDiameter-3);
    }
    // return value
    return mouthX + 1;
  }

  public void draw()
  {    
    // for loop to place the stick figures
    for (int x = 0; x <= 8; x ++)
    {
      // y value of stick figures
      for (int y = 50; y <= 450; y += 100)
      {
      // red color
      if (y == 50)
      {
        stroke(255,0,0);
      }
      // orange color
      else if (y == 150)
      {
        stroke(255,165,0);
      }
      // yellow color
      else if (y == 250)
      {
        stroke(255,255,0);
      }
      // green color
      else if (y == 350)
      {
        stroke (80, 200, 120);
      }
      // blue color
      else
      {
        stroke (30,144,255);
      }
      // the values input to draw stickfigures
      drawHuman(100 * x + 100, y, 30);
      drawHuman(100 * x + 100, y, 30);
      drawHuman(100 * x + 100, y, 30);

      // values input to draw mouth
      drawMouth(x * 100 + 100, y + 5, 10);
      }
    }
  }
}