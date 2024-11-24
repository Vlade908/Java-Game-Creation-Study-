package GameCreationStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle{
	
	public boolean left,right,up,down;
	public int spd = 4;
	
	public static int PlayerTam = 32;
	
	
	public Player(int x, int y) {
		super(x, y, PlayerTam, PlayerTam);
	}
	
	
	public void tick() {
		
		if(right && World.isFree(x+spd, y)) {
			x+=spd;
		}else if(left && World.isFree(x-spd, y)) {
			x-=spd;
		}
		
		if(up && World.isFree(x, y-spd)) {
			y-=spd;
		}else if(down && World.isFree(x, y+spd)) {
			y+=spd;
		}
	}
	
	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
	}
	
}
