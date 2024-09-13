import org.code.neighborhood.*;

public class MinecraftPainter extends MuralPainter {

  /*Method to draw the entire villager character
  this helps to create the full face of the villager using the second painter*/
  public void drawVillager() {
   drawskin(); // Draws the skin section of villager
   draweyesandrestofskin(); // Draws the eyes and remaining skin details
  }
  // Method to paint the skin of villager

 public void drawskin(){
turnRight();
paintLine("LightSalmon", 3); // Paint the top part of the skin
turnLeft();
move();
move();
turnLeft();
move();
move();
move();
paintLine("LightSalmon", 1); // Paint the left side of the face
turnRight();
move();
move();
move();
move();
turnRight();
paintLine("LightSalmon", 3); // Paint the bottom part of the face
turnRight();
paintLine("black", 6);   // Outline the eyebrows
turnLeft();
move();
paintLine("LightSalmon", 1); 
paintLine("sienna", 3); 
turnLeft();
move();
turnLeft();
paintLine("LightSalmon", 3);

 }
   //Paints rest of facial features
 public void draweyesandrestofskin() {
   
paintLine("white", 1); //Paint EYES
turnRight();
move();
turnRight();
move();
turnLeft();
paintLine("ForestGreen", 1); //Paint EYES
move();
move(); 
paintLine("ForestGreen", 1); //Paint EYES
paintLine("white", 1); //Paint EYES
paintLine("LightSalmon", 1); //Rest is to finish face details
turnRight();
move();
paintLine("sienna", 3);
turnRight();
move();
turnRight();
paintLine("LightSalmon", 3);
turnLeft();
turnLeft();
move();
turnRight();
move();
move();
turnLeft();
paintLine("sienna", 3);
turnRight();
move();
turnRight();
paintLine("sienna", 3);
turnLeft();
move();
turnLeft();
move();
move();
paintLine("brown", 1); //Paint for nose
paintLine("LightSalmon", 1);
turnLeft();
move();
move();
move();
turnLeft();   
paintLine("LightSalmon", 1);
paintLine("brown", 1); //Paint for nose
turnRight(); //Sets painter back with other painter
move();
move();
turnRight();
move();
move();

 } 
   }  