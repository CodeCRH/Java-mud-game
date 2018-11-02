package NumenPack;


public class NumenBoss extends NumenAbstract
{
	public NumenBoss()
	{
		super.setName("莫德雷德");
		super.setRace("Lengend");
		super.setLevel(20);
		super.setExp(200);
		super.setHp(1000);
		super.setAtk(60);
		super.setDef(40);
		super.setSep(20);
		super.setMoney(30);
	}
	
	@Override
	public void speak() 
	{
		System.out.println(this.getName()+":看到我的脸之后,你就不得不做好死的觉悟！");	
	}
}
