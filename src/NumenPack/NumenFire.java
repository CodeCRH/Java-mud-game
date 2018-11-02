package NumenPack;



//炎族生灵类（敌人）
public class NumenFire extends NumenAbstract
{
	public NumenFire(int level)
	{
		super.setName("安妮");
		super.setRace("fire");
		super.setHp(100);
		super.setLevel(level);
		switch (level) {
		case 1:
			super.setAtk(3);
			super.setDef(1);
			super.setSep(2);
			super.setExp(1);
			super.setMoney(1);
			break;
		case 2:
			super.setAtk(5);
			super.setDef(1);
			super.setSep(2);
			super.setExp(2);
			super.setMoney(1);
			break;
		case 3:
			super.setAtk(7);
			super.setDef(1);
			super.setSep(2);
			super.setExp(3);
			super.setMoney(1);
			break;
		case 4:
			super.setAtk(9);
			super.setDef(1);
			super.setSep(2);
			super.setExp(5);
			super.setMoney(2);
			break;
		case 5:
			super.setAtk(13);
			super.setDef(2);
			super.setSep(2);
			super.setExp(6);
			super.setMoney(2);
			break;
		case 6:
			super.setAtk(16);
			super.setDef(2);
			super.setSep(2);
			super.setExp(9);
			super.setMoney(3);
			break;
		case 7:
			super.setAtk(19);
			super.setDef(2);
			super.setSep(2);
			super.setExp(12);
			super.setMoney(3);
			break;
		case 8:
			super.setAtk(22);
			super.setDef(2);
			super.setSep(2);
			super.setExp(13);
			super.setMoney(4);
			break;
		case 9:
			super.setAtk(25);
			super.setDef(2);
			super.setSep(2);
			super.setExp(18);
			super.setMoney(4);
			break;
		default:
			super.setAtk(level*2+level/2);
			super.setDef(2);
			super.setSep(2);
			super.setExp(level*2);
			super.setMoney(6);
			break;
		}
	}
	
	public void speak()
	{
		System.out.println(this.getName()+":火焰，是我最喜欢的玩具！");
	}
}
