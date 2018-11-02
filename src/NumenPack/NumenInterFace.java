package NumenPack;

import EquipPack.EquipAbstract;


//生灵的接口
public interface NumenInterFace 
{
	public void ChangeEquipment(EquipAbstract e);//更换装备
	public void Levelup();//生灵升级
	public void UsePoint(int i);//分配升级点数
	public void GetExpAndCanLevelup(NumenAbstract n);//生灵获得经验和判断升级

}
