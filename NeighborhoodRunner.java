import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    /* ----------------------------------- TO DO -----------------------------------
     * ✅ Write the BirdPainter class to create a mural of a bird.
     * Then, instantiate a BirdPainter object and paint the mural.
     * -----------------------------------------------------------------------------
     */
//Sets new painter
    MuralPainter Steve = new MuralPainter();
//Paint background with main color used in skin
    Steve.paintBackground("DarkSalmon", 8);
//Sets second painter
    MinecraftPainter Sam = new MinecraftPainter();
//Draws final details of villager   
    Sam.drawVillager();




    
    
    
  }
}
