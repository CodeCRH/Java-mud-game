package NumenPack;

public class NumenWater extends NumenAbstract
{

	public NumenWater(int level) 
	{
		super.setName("·Æ×È");
		super.setRace("water");
		super.setHp(100);
		super.setLevel(level);
		switch (level) {
		case 1:
			super.setAtk(2);
			super.setDef(1);
			super.setSep(2);
			super.setExp(1);
			super.setMoney(1);
			break;
		case 2:
			super.setAtk(2);
			super.setDef(3);
			super.setSep(3);
			super.setExp(5);
			super.setMoney(1);
			break;
		case 3:
			super.setAtk(3);
			super.setDef(3);
			super.setSep(4);
			super.setExp(3);
			super.setMoney(1);
			break;
		case 4:
			super.setAtk(3);
			super.setDef(4);
			super.setSep(5);
			super.setExp(5);
			super.setMoney(2);
			break;
		case 5:
			super.setAtk(3);
			super.setDef(6);
			super.setSep(6);
			super.setExp(6);
			super.setMoney(2);
			break;
		case 6:
			super.setAtk(4);
			super.setDef(6);
			super.setSep(7);
			super.setExp(9);
			super.setMoney(3);
			break;
		case 7:
			super.setAtk(5);
			super.setDef(6);
			super.setSep(8);
			super.setExp(12);
			super.setMoney(3);
			break;
		case 8:
			super.setAtk(7);
			super.setDef(6);
			super.setSep(9);
			super.setExp(13);
			super.setMoney(4);
			break;
		case 9:
			super.setAtk(7);
			super.setDef(9);
			super.setSep(10);
			super.setExp(18);
			super.setMoney(4);
			break;
		default:
			super.setAtk(level/2+4);
			super.setDef(level/2+3);
			super.setSep(level+1);
			super.setExp(level*2);
			super.setMoney(6);
			break;
		}
	}
	public void speak()
	{
		System.out.println(this.getName()+":µ½º£µ×È¥°É£¡");
	}

}
