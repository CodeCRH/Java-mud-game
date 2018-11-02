package GamePack;

import java.util.Scanner;

import NumenPack.NumenAbstract;

//治疗站类
public  class Cure 
{

	public Cure(NumenAbstract player) 
	{
		System.out.println("欢迎光临治疗站，在这里可以治愈您的伤口");
		System.out.println("价格是 5金币/次");
		System.out.println("您需要治疗吗？");
		System.out.println("治疗伤口..................【1】");
		System.out.println("放弃.....................【2】");
	
		try
		{
			Scanner input = new Scanner(System.in);
			int set= input.nextInt();
			switch (set) 
			{
				case 1:
					if(player.getMoney()<5)
						System.out.println("对不起，您的金币不够支付治疗费用");
					else
					{
						player.setMoney(player.getMoney()-5);
						player.setHp(100);
						System.out.println("您已经恢复健康，请小心保重");
					}
					break;
				case 2:
					return;
				default:
					System.out.println("您的输入有误。返回主菜单");
					return;
			}
		}
		catch(Exception ex)
		{
			System.out.println("您的输入有误。返回主菜单");
			return;
		}
	}

}
