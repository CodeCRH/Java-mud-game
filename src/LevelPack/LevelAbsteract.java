package LevelPack;

import NumenPack.NumenAbstract;

//等级管理抽象类
public abstract class LevelAbsteract implements LevelInterFace
{
	public abstract int setGrowingSpeed(int level);//设置升级所需要的经验
	public abstract int deadExp(int level);//返回死亡时对应等级掉落的经验值
	public abstract boolean canLevelup(NumenAbstract n);//判断当前生灵能否升级
	public abstract int getLevelupPoint(int level);//设置升级时对应等级返回的点数
}
