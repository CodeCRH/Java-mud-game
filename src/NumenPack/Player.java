package NumenPack;

import java.util.Scanner;

import EquipPack.EquipAbstract;
import LevelPack.LevelConfig;

public class Player extends NumenAbstract implements NumenInterFace
{

	public Player() 
	{
		System.out.println("请输入您生灵的名字");
		Scanner input = new Scanner(System.in);
		String name = input.next();
		super.setName(name);
		System.out.println("请选择您的生灵的种族");
		System.out.println("1.Fire    2.Water   ");
		int race = input.nextInt();
		if(race==1)
			super.setRace("fire");
		else if(race==2)
			super.setRace("water");
		else
			super.setRace("null");
		
		super.setAtk(2);
		super.setDef(2);
		super.setSep(2);
		super.setHp(100);
		super.setLevel(1);
		super.setExp(0);
		super.setPoint(3);
		super.setMoney(0);
		
		super.setHeadequip(new EquipAbstract());
		super.setBodyequip(new EquipAbstract());
		super.setHandequip(new EquipAbstract());
		super.setWeaponequip(new EquipAbstract());
		super.setFootequip(new EquipAbstract());
	}
	
	public void Show()
	{
		 String name = super.getName();
		 String race=super.getRace();
		 int level=super.getLevel();
		 int exp=super.getExp();
		 int atk=super.getAtk();
		 int def=super.getDef();
		 int sep=super.getSep();
		 int hp=super.getHp();
		 int point = super.getPoint();
		 int money = super.getMoney();
		 System.out.print("名称："+name+"\t");
		 System.out.println("种族："+race);
		 System.out.print("等级："+level+"\t");
		 System.out.println("经验："+exp);
		 System.out.print("攻击力："+atk+"\t");
		 System.out.println("防御力："+def);
		 System.out.print("速度："+sep+"\t");
		 System.out.println("血量："+hp);
		 System.out.println("升级点数："+point+"\t");
		 System.out.println("金币："+money);
		 System.out.println("---------装备----------");
		 System.out.println("头部："+super.getHeadequip());
		 System.out.println("身体："+super.getBodyequip());
		 System.out.println("手部："+super.getHandequip());
		 System.out.println("武器："+super.getWeaponequip());
		 System.out.println("脚部："+super.getFootequip());
	}
	@Override
	public void speak()//空方法。主角不需要
	{
		
	}
	
	@Override
	public void ChangeEquipment(EquipAbstract e) //更换装备
	{
		this.setMoney(this.getMoney()-e.getMoney());
		if(e.getPlace().equals("head"))
			this.setHeadequip(e);
		else if(e.getPlace().equals("body"))
			this.setBodyequip(e);
		else if(e.getPlace().equals("hand"))
			this.setHandequip(e);
		else if(e.getPlace().equals("weapon"))
			this.setWeaponequip(e);
		else if(e.getPlace().equals("foot"))
			this.setFootequip(e);
		else
			;
		System.out.println("这看起来非常适合你！");
	}
	
	@Override
	public void Levelup() //生灵升级
	{
		LevelConfig lc = new LevelConfig();
		this.setExp(0);
		this.setLevel(this.getLevel()+1);
		this.setPoint(lc.getLevelupPoint(this.getLevel()));
		System.out.println("恭喜，您升到了"+this.getLevel()+"级");
		System.out.println("恭喜，您获得了"+this.getPoint()+"个升级点数");
	}
	@Override
	public void UsePoint(int i) //分配升级点数
	{
		int point = this.getPoint();
		switch (i) 
		{
			case 1:
				point=point-1;
				this.setPoint(point);
				this.setAtk(this.getAtk()+1);
				break;
			case 2:
				point=point-1;
				this.setPoint(point);
				this.setDef(this.getDef()+1);
				break;
			case 3:
				point=point-1;
				this.setPoint(point);
				this.setSep(this.getSep()+1);
				break;
			default:
				break;
		}
	}
	@Override
	public  void GetExpAndCanLevelup(NumenAbstract di)//生灵获得经验和判断升级
	{
		System.out.println("恭喜，这场战斗您获胜了！您在这场战斗中获得了"+di.getExp()+"点经验以及"+di.getMoney()+"金币");
		int winexp =di.getExp()+this.getExp();
		int winmon=this.getMoney()+di.getMoney();
		this.setExp(winexp);
		this.setMoney(winmon);
		LevelConfig lc = new LevelConfig();
		if(lc.canLevelup(this)== true)
		{
			this.Levelup();
		}
	}
}


