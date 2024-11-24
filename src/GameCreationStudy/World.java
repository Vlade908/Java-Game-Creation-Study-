package GameCreationStudy;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class World {
	public static List<Block> blocos = new ArrayList<Block>();
	public static int telaWid= (Game.WIDTH);
	public static int telaHei= (Game.HEIGHT);
	public static int tamBloco= Block.tamBloco;
	public static int tamPlayer= Player.PlayerTam;

	public World() {
		for(int xx = 0; xx < (telaWid/tamBloco); xx++) {
			blocos.add(new Block(xx*tamBloco,0));
		}
		
		for(int xx = 0; xx < (telaWid/tamBloco); xx++) {
			blocos.add(new Block(xx*tamBloco,telaHei-tamBloco));
		}
		
		for(int yy = 0; yy < (telaHei/tamBloco); yy++) {
			blocos.add(new Block(0, yy*tamBloco));
		}
		
		for(int yy = 0; yy < (telaHei/tamBloco); yy++) {
			blocos.add(new Block(telaWid-tamBloco, yy*tamBloco));
		}
	}
	
	public void render(Graphics g) {
		for(int i = 0; i < blocos.size(); i++) {
			blocos.get(i).render(g);
		}
	}
	
	public static boolean isFree(int x, int y) {
		for(int i=0; i< blocos.size(); i++) {
			Block blocoAtual = blocos.get(i);
			if(blocoAtual.intersects(new Rectangle(x,y,tamPlayer, tamPlayer))) {
				return false;
			}
		}
		return true;
	}
	
	
}
