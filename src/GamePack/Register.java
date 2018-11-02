package GamePack;

import java.util.Random;

import NumenPack.NumenAbstract;
import NumenPack.NumenFire;
import NumenPack.NumenWater;
import NumenPack.Player;


//准备开始战斗
public  class Register 
{
	public  Register(Player player)
	{
		Random random = new Random();
		int i = random.nextInt(2);
		int level = player.getLevel();
		switch (i) 
		{
			case 1:
				NumenAbstract nf=new NumenFire(level);
				new War(player,nf);
				break;
			case 0:
				NumenAbstract nw=new NumenWater(level);
				new War(player,nw);
				break;	
		}
	}
	
	public Register(Player player,NumenAbstract boss)
	{
		new War(player,boss);
	}
}
