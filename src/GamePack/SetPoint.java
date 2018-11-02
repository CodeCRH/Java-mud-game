package GamePack;

import java.util.Scanner;

import NumenPack.NumenAbstract;
import NumenPack.Player;

//添加升级点数
public class SetPoint 
{

	public SetPoint(Player player)
	{
		while(true)
		{
			int point = player.getPoint();
			System.out.println("------------设置升级点数---------------");
			System.out.println("您当前拥有"+point+"个升级点数。");
			System.out.println("升级1点攻击力.................... ..【1】");
			System.out.println("升级1点防御力.................... ..【2】");
			System.out.println("升级1点速度...................... ..【3】");
			System.out.println("返回........................... ..【0】");
			try
			{
				if(point>0)
				{
					Scanner input = new Scanner(System.in);
					int set= input.nextInt();
					switch (set)
					{
						case 1:
							player.UsePoint(set);
							continue;
						case 2:
							player.UsePoint(set);
							continue;
						case 3:
							player.UsePoint(set);
							continue;
						case 0:
							return;
					}
				}
				else
				{
					System.out.println("您暂时没有可供升级的点数");
					break;
				}
			}
			catch(Exception ex)
			{
				System.out.println("您的输入有误。返回主菜单");
				return;
			}
		}
	}

}
