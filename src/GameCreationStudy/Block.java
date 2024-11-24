package GameCreationStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Block extends Rectangle {

	public static int tamBloco  = 32;
	
	public Block(int x, int y) {
		super(x,y,tamBloco,tamBloco);
	}
	
	public void render(Graphics g) {
		g.drawImage(Spritesheet.Block_stone_wall, x, y, tamBloco, tamBloco, null);
		
	}
}
