package GameCreationStudy;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	public static BufferedImage[] player_front;
	public static BufferedImage[] player_down;
	public static BufferedImage[] player_left;
	public static BufferedImage[] player_right;
	
	
	public static BufferedImage Block_stone_wall;
	
	public Spritesheet() {
		
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		player_front = new BufferedImage[2];
		player_down = new BufferedImage[2];
		player_left = new BufferedImage[2];
		player_right = new BufferedImage[2];
		
		
		player_front[0] = Spritesheet.getSprite(0,11,16,16);
		player_front[1] = Spritesheet.getSprite(18,11,16,16);
		
		player_right[0] = Spritesheet.getSprite(34,11,16,16);
		player_right[1] = Spritesheet.getSprite(51,11,16,16);
		
		
		Block_stone_wall = Spritesheet.getSprite(284, 232, 16, 16);
	}
	
	public static BufferedImage getSprite (int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}

}
