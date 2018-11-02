package EquipPack;


public  class EquipAbstract 
{
	private String equipname;
	private int effatk;//装备的攻击力
	private int effdef;//装备的防御力
	private int effsep;//装备的速度
	private int money;//售价
	private String place;//武器的装备部位
	
	
	
	
	public EquipAbstract() 
	{

	}


	public EquipAbstract(String equipname,int effatk,int effdef,int effsep,int money,String place) 
	{
		this.setEquipname(equipname);
		this.setEffatk(effatk);
		this.setEffdef(effdef);
		this.setEffsep(effsep);
		this.setMoney(money);
		this.setPlace(place);	
	}
	
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getEffatk() {
		return effatk;
	}
	public void setEffatk(int effatk) {
		this.effatk = effatk;
	}
	public int getEffdef() {
		return effdef;
	}
	public void setEffdef(int effdef) {
		this.effdef = effdef;
	}
	public int getEffsep() {
		return effsep;
	}
	public void setEffsep(int effsep) {
		this.effsep = effsep;
	}
	public String getEquipname() {
		return equipname;
	}
	public void setEquipname(String equipname) {
		this.equipname = equipname;
	}



	
}
