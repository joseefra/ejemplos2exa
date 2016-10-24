import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.awt.Color;

/**
 * A paddle is a rectangular object that can be moved via the left
 * and right arrow keys.  
 * 
 * @author Barbara Ericson, Georgia Tech
 * @version 1.0 April 6, 2007
 */
public class Paddle extends Actor
{
    /////////////// fields ////////////////////
    public int direcion;
      private int activado = 0;
      private int speed = 5;
    
    /** Width of the paddle */
    private int width = 60;
  
    /** Height of the paddle */
    private int height = 10;
    
    /** amount to move */
    private int moveAmount = 5;
    
    /** color of this paddle */
    private Color color = Color.BLACK;
    
    ///////////// constructors ///////////////////////////
  
    /**
     * No argument constructor 
     */
    public Paddle()
    {
        updateImage();
    }
    
    /**
     * Constructor that takes the width, height, color, and moveAmount
     * @param theWidth the width to use
     * @param theHeight the height to use
     * @param theColor the color to use
     * @param theAmount the number of cells (pixels) to move
     */
    public Paddle(int theWidth, int theHeight, 
                  Color theColor, int theAmount)
    {
        width = theWidth;
        height = theHeight;
        color = theColor;
        moveAmount = theAmount;
        updateImage();
    }
    
    ///////////////////// Methods ///////////////////////////////

    /**
     * Act - a paddle will move in reaction to a left or right
     * arrow key being pressed
     */
    public void act() 
    {
         if (activado==0)
        {
        mover();
        }
    }
    
    /**
     * Method to create and set the image for this paddle.  Invoke
     * this method again when the width, height, or color change.
     */
    public void updateImage()
    {
        GreenfootImage image = new GreenfootImage(width,height);
        image.setColor(color);
        image.fillRect(0,0,width,height);
        setImage(image);
    }
    public void mover()
    {
        if (Greenfoot.isKeyDown("right"))
         {
             direcion=1;
            // if(Greenfoot.getHeight()=!this.getX())
             
             this.setLocation(this.getX()+speed,this.getY());
                     
            }
         if (Greenfoot.isKeyDown("left"))
         {
             direcion=2;
             this.setLocation(this.getX()-speed,this.getY());
         }
    }
}
