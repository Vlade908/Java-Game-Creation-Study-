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
		//g.drawImage(null, x, y, tamBloco, tamBloco, null);
		g.setColor(Color.red);
		g.fillRect(x, y, width, height);
		g.setColor(Color.black);
		g.drawRect(x, y, width, height);
	}
}
