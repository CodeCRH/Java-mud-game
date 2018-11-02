package GamePack;

import java.util.Scanner;

import EquipPack.EquipShop;
import NumenPack.NumenBoss;
import NumenPack.Player;

//运行游戏
public class GameStart {

	public static void main(String[] args) 
	{
			System.out.println("欢迎你来到佩恩沃星球，这个堕落腐朽之地");
			System.out.println("在这里所有的部族在战斗中成长进化，所有生灵在痛苦和折磨中变得强大。 ");
			System.out.println("在这里若想解决纷争，必先陷入纷争！");
			System.out.println("记住，均衡存乎万物之间");
			System.out.println("请用你的聪明才智，将我们引领向胜利吧");
			
			Player p = new Player();
			
			Scanner input = new Scanner(System.in);
			try
			{
				while(true)
				{
					System.out.println("------------主菜单---------------");
					System.out.println("请输入对应的数字进入功能");
					System.out.println("征服佩恩沃星球.................【1】");
					System.out.println("查看我的个人信息................【2】");
					System.out.println("设置升级点数..................【3】");
					System.out.println("治疗站......................【4】");
					System.out.println("武器店.......................【5】");
					System.out.println("BOSS决战....................【6】");
					System.out.println("结束游戏.....................【0】");
					System.out.println("------------------------------");
					System.out.println("");
					int in = input.nextInt();
					switch(in)
					{
						case 1: 
						    new Register(p);
							continue;
						case 2:
							p.Show();
							continue;
						case 3:
						     new SetPoint(p);
							continue;
						case 4:	
							new Cure(p);
							continue;
						case 5:
							new EquipShop(p);
							continue;
						case 6:
						//	NumenBoss boss=	new NumenBoss();
							new Register(p,new NumenBoss());
							continue;
						case 10086:
							p.setMoney(500);
							continue;
						case 0:  
							System.out.println("你要离开了吗？那么请下次再光临佩恩沃星球吧。");
							break;
						default :
							System.out.println("您的输入有误");
							continue;
					}
					break;
				}
			}
			catch(Exception ex)
			{
				System.out.println("您的输入有误，游戏强制退出!");
			}
	}

}
