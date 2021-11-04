package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Spritesheet {
	
	public static BufferedImage spritesheet;
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage tileWall;
	
	public static BufferedImage[] inimigo_front;
	
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/Spritesheet.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		player_front=  new BufferedImage[2];
		
		inimigo_front=  new BufferedImage[2];
		
		player_front[0] = Spritesheet.getSprite(2, 11, 16, 16);
		player_front[1] = Spritesheet.getSprite(20, 11, 16, 16);
		
		inimigo_front[0] = Spritesheet.getSprite(174, 12, 16, 16);
		inimigo_front[1] = Spritesheet.getSprite(174+16, 12, 16, 16);
		
		
		tileWall = Spritesheet.getSprite(300, 263, 8, 8 );
	}

	
	public static BufferedImage getSprite(int x, int y, int width, int heigth) {
		return spritesheet.getSubimage(x, y, width, heigth);
	}
}
	
		
	
		

	

	
	
	
	
	


