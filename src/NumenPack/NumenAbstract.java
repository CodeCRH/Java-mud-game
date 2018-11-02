package NumenPack;

import java.util.Scanner;

import EquipPack.EquipAbstract;



//生灵的抽象类
public abstract class NumenAbstract 
{
	private String name;//名称
	private String race;//种族
	private int level;//等级
	private int exp;//经验
	private int atk;//攻击力
	private int def;//防御力
	private int sep;//速度
	private int hp;//生命值
	private int point;//升级点数
	private int money;//金币
	private EquipAbstract headequip;//生灵头部装备
	private EquipAbstract bodyequip;//生灵身体装备
	private EquipAbstract handequip;//生灵手部装备
	private EquipAbstract weaponequip;//生灵武器装备
	private EquipAbstract footequip;//生灵脚部装备
	
	

	public String getHeadequip() {
		return headequip.getEquipname();
	}
	public void setHeadequip(EquipAbstract headequip) 
	{
			this.headequip = headequip;
			this.setAtk(this.getAtk()+headequip.getEffatk());
			this.setDef(this.getDef()+headequip.getEffdef());
			this.setSep(this.getSep()+headequip.getEffsep());
	}
	public String getBodyequip() {
		return bodyequip.getEquipname();
	}
	public void setBodyequip(EquipAbstract bodyequip) {

			this.bodyequip = bodyequip;
			this.setAtk(this.getAtk()+bodyequip.getEffatk());
			this.setDef(this.getDef()+bodyequip.getEffdef());
			this.setSep(this.getSep()+bodyequip.getEffsep());
	}
	public String getHandequip() {
		return handequip.getEquipname();
	}
	public void setHandequip(EquipAbstract handequip) {
			this.handequip = handequip;
			this.setAtk(this.getAtk()+handequip.getEffatk());
			this.setDef(this.getDef()+handequip.getEffdef());
			this.setSep(this.getSep()+handequip.getEffsep());
	}
	public String getWeaponequip() {
		return weaponequip.getEquipname();
	}
	public void setWeaponequip(EquipAbstract weaponequip) {
			this.weaponequip = weaponequip;
			this.setAtk(this.getAtk()+weaponequip.getEffatk());
			this.setDef(this.getDef()+weaponequip.getEffdef());
			this.setSep(this.getSep()+weaponequip.getEffsep());
	}
	public String getFootequip() {
		return footequip.getEquipname();
		
	}
	public void setFootequip(EquipAbstract footequip) {
			this.footequip = footequip;
			this.setAtk(this.getAtk()+footequip.getEffatk());
			this.setDef(this.getDef()+footequip.getEffdef());
			this.setSep(this.getSep()+footequip.getEffsep());
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) 
	{
		this.exp = exp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
 	public int getSep() {
		return sep;
	}
	public void setSep(int sep) {
		this.sep = sep;
	}
	
	
	

	public  void Attack(NumenAbstract n) //攻击一个生灵的方法
	{
				int hurt=(this.getAtk() - n.getDef());
				if(hurt>0)
				{
					n.setHp(n.getHp()-hurt);
				}
				else
					;
	}

	public void Show()
	{
		 String name = this.getName();
		 String race=this.getRace();
		 int level=this.getLevel();
		 int exp=this.getExp();
		 int atk=this.getAtk();
		 int def=this.getDef();
		 int sep=this.getSep();
		 int hp=this.getHp();
		 System.out.print("名称："+name+"\t");
		 System.out.println("种族："+race);
		 System.out.print("等级："+level+"\t");
		 System.out.println("经验："+exp);
		 System.out.print("攻击力："+atk+"\t");
		 System.out.println("防御力："+def);
		 System.out.print("速度："+sep+"\t");
		 System.out.println("血量："+hp);
	}

	public abstract void speak(); 
}
