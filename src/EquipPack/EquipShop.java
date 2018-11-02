package EquipPack;

import java.util.Scanner;

import NumenPack.NumenAbstract;
import NumenPack.Player;

public class EquipShop 
{
	public  EquipShop(Player n)
	{
		EquipAbstract ZSTK = new EquipAbstract("战神头盔",0,6,-2,20,"head");
		EquipAbstract LHSZJ = new EquipAbstract("连环锁子甲",0,15,-1,35,"body");
		EquipAbstract LMJZ = new EquipAbstract("蓝魔戒指",12,2,2,37,"hand");
		EquipAbstract QSSSC = new EquipAbstract("欺霜弑神铲",21,5,0,50,"weapon");
		EquipAbstract BSZFX = new EquipAbstract("波斯追风靴",2,3,8,27,"foot");
		while(true)
		{
		System.out.println("-------------装备店-------------");
		System.out.println("哦，这不是"+n.getName()+"吗？");
		System.out.println("欢迎你来到我的装备店，穿上我打造的装备，你会变得更加强大");
		System.out.println("给你一个忠告：如果你想打倒这个世界的BOSS们，你需要非常强大的装备作为后盾");
		System.out.println("我这里现在有这些装备：");
		System.out.println("名称:"+ZSTK.getEquipname()+"  装备攻击力:"+ZSTK.getEffatk()+"  装备防御力:"+ZSTK.getEffdef()+"  装备速度:"+ZSTK.getEffsep()+"  售价:"+ZSTK.getMoney()+"  装备部位:"+ZSTK.getPlace()+".................【1】");
		System.out.println("名称:"+LHSZJ.getEquipname()+"  装备攻击力:"+LHSZJ.getEffatk()+"  装备防御力:"+LHSZJ.getEffdef()+"  装备速度:"+LHSZJ.getEffsep()+"  售价:"+LHSZJ.getMoney()+"  装备部位:"+LHSZJ.getPlace()+"..............【2】");
		System.out.println("名称:"+LMJZ.getEquipname()+"  装备攻击力:"+LMJZ.getEffatk()+"  装备防御力:"+LMJZ.getEffdef()+"  装备速度:"+LMJZ.getEffsep()+"  售价:"+LMJZ.getMoney()+"  装备部位:"+LMJZ.getPlace()+"..................【3】");
		System.out.println("名称:"+QSSSC.getEquipname()+"  装备攻击力:"+QSSSC.getEffatk()+"  装备防御力:"+QSSSC.getEffdef()+"  装备速度:"+QSSSC.getEffsep()+"  售价:"+QSSSC.getMoney()+"  装备部位:"+QSSSC.getPlace()+".............【4】");
		System.out.println("名称:"+BSZFX.getEquipname()+"  装备攻击力:"+BSZFX.getEffatk()+"  装备防御力:"+BSZFX.getEffdef()+"  装备速度:"+BSZFX.getEffsep()+"  售价:"+BSZFX.getMoney()+"  装备部位:"+BSZFX.getPlace()+"...............【5】");
		System.out.println("我不想买了...........................................................【0】");
			try
			{
			
			Scanner input = new Scanner(System.in);
			int in = input.nextInt();

				switch (in) 
				{
				case 1:
					if(muchmoney(n,ZSTK))
						n.ChangeEquipment(ZSTK);
					break;
				case 2:
					if(muchmoney(n,LHSZJ))
						n.ChangeEquipment(LHSZJ);
					
					break;
				case 3:
					if(muchmoney(n,LMJZ))
						n.ChangeEquipment(LMJZ);
					break;
				case 4:
					if(muchmoney(n,QSSSC))
						n.ChangeEquipment(QSSSC);
					break;
				case 5:
					if(muchmoney(n,BSZFX))
						n.ChangeEquipment(BSZFX);
					break;
				case 0:
					return;
				default:
					System.out.println("哦，好像出了点小毛病呢！");
					break;
				}
			}
		
		catch(Exception ex)
		{
			
			System.out.println("您的输入错误，返回主菜单");
			return;
		}
		}
	}
		

	public boolean muchmoney(NumenAbstract n,EquipAbstract e)
	{
		if(n.getMoney()<e.getMoney())
		{
			System.out.println("哦，你的金币好像不太够啊，需要我给你介绍一份工作吗?");
			return false;
		}
		else
		{
			return true;
		}
	}
}
