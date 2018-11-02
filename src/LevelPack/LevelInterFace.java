package LevelPack;

import NumenPack.NumenAbstract;

//等级管理接口
public interface LevelInterFace 
{
	public int setGrowingSpeed(int level);//设置升级所需要的经验
	public int deadExp(int level);//返回死亡时对应等级掉落的经验值
	public boolean canLevelup(NumenAbstract n);//判断当前生灵能否升级
	public int getLevelupPoint(int level);//设置升级时对应等级返回的点数
}
