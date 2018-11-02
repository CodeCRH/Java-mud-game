package LevelPack;

import NumenPack.NumenAbstract;

public class LevelConfig extends LevelAbsteract
{

	@Override
	public int setGrowingSpeed(int level) //设置升级所需要的经验
	{
		int exp;
		switch (level) 
		{
			case 1:
				exp = 5;
				break;
			case 2:
				exp = 10;
				break;
			case 3:
				exp = 15;
				break;
			case 4:
				exp = 30;
				break;
			case 5:
				exp = 48;
				break;
			case 6:
				exp = 72;
				break;
			case 7:
				exp = 120;
				break;
			case 8:
				exp = 260;
				break;
			case 9:
				exp = 900;
				break;
			default:
				exp = 1000;
				break;
		}
		return exp;
	}

	@Override
	public int deadExp(int level) //返回死亡时对应等级掉落的经验值
	{
		int exp;
		switch (level) 
		{
			case 1:
				exp = 3;
				break;
			case 2:
				exp = 6;
				break;
			case 3:
				exp = 11;
				break;
			case 4:
				exp = 25;
				break;
			case 5:
				exp = 42;
				break;
			case 6:
				exp = 68;
				break;
			case 7:
				exp = 110;
				break;
			case 8:
				exp =  240;
				break;
			case 9:
				exp = 850;
				break;
			default:
				exp = 960;
				break;
		}
		return exp;
	}

	@Override
	public boolean canLevelup(NumenAbstract n) //判断当前生灵能否升级
	{
		int level = n.getLevel();
		if(n.getExp()==setGrowingSpeed(level))
			return true;
		else
			return false;
	}

	@Override
	public int getLevelupPoint(int level) //设置升级时对应等级返回的点数
	{
		int point;
		switch (level) {
		case 1:
			point = 3;
			break;
		case 2:
			point = 3;
			break;
		case 3:
			point = 3;
			break;
		case 4:
			point = 4;
			break;
		case 5:
			point = 4;
			break;
		case 6:
			point = 4;
			break;
		case 7:
			point = 6;
			break;
		case 8:
			point = 6;
			break;
		case 9:
			point = 6;
			break;
		default:
			point = 7;
			break;
		}
		return point;
	}

}
