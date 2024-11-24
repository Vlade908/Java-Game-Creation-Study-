package GameCreationStudy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Rectangle{
	
	public boolean left,right,up,down;
	public int spd = 4;
	public int curAnimation = 0;
	public int curFrames = 0, targetFrames = 15;
	
	public static int PlayerTam = 32;
	
	
	public Player(int x, int y) {
		super(x, y, PlayerTam, PlayerTam);
	}
	
	
	public void tick() {
		
		boolean moved = false;
		
		if(right && World.isFree(x+spd, y)) {
			x+=spd;
			moved = true;
		}else if(left && World.isFree(x-spd, y)) {
			x-=spd;
			moved = true;
		}
		
		if(up && World.isFree(x, y-spd)) {
			y-=spd;
			moved = true;
		}else if(down && World.isFree(x, y+spd)) {
			y+=spd;
			moved = true;
		}
		
		if(moved) {
			curFrames++;
			if(curFrames == targetFrames) {
				curFrames = 0;
				curAnimation++;
				if(curAnimation == Spritesheet.player_front.length) {
					curAnimation = 0;
				}
			}
		}
		
		
		
	}
	
	public void render(Graphics g) {
		g.drawImage(Spritesheet.player_right[curAnimation], x, y, PlayerTam, PlayerTam, null);
	}
	
}
