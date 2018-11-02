package GamePack;

import LevelPack.LevelConfig;
import NumenPack.NumenAbstract;
import NumenPack.Player;

//战斗流程
public class War
{

	public War(Player player,NumenAbstract di) 
	{
		System.out.println("您的对手信息");
		di.Show();
		di.speak();
		
		while((player.getHp()!=0 && di.getHp()!=0) && ( player.getAtk()>di.getDef() )  )//判断战斗结束
		{
			if(player.getSep()>=di.getSep())
			{
				player.Attack(di);
				if(di.getHp()>0)
					di.Attack(player);
			}
			else
			{
				di.Attack(player);
				if(player.getHp()>0)
				player.Attack(di);
			}
		}
		
		int level = player.getLevel();
		int exp = player.getExp();
		LevelConfig lc = new LevelConfig();

		
		if(player.getAtk()<=di.getDef()&&di.getAtk()<=player.getDef())
		{
			System.out.println("平局，您还需要继续磨砺才能打败对手");
		}
		else if(player.getAtk()<=di.getDef()&&di.getAtk()>player.getDef())
		{
			int deadexp = lc.deadExp(level);
			player.setExp(exp-deadexp);//玩家死亡掉落经验
			System.out.println("对不起，这场战斗您失败了！您在这场战斗中损失了"+deadexp+"点经验");
		}
		else if(player.getHp()<=0)
		{
			int deadexp = lc.deadExp(level);
			player.setExp(exp-deadexp);//玩家死亡掉落经验
			System.out.println("对不起，这场战斗您失败了！您在这场战斗中损失了"+deadexp+"点经验");
			
		}
		else
		{
			player.GetExpAndCanLevelup(di);
		}
	}

	
}
