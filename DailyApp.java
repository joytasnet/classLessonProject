import java.util.*;
public class DailyApp{
	public static void main(String[] args){
		Daily d = new Daily(10000);
		Scanner scan = new Scanner(System.in);
		while(true){
			System.out.print("何する？1.残高確認, 2.食事, 3.遊ぶ, 4.バイト, 5.終了>");
			int select = scan.nextInt();
			switch(select){
				case 1:
					d.display();
					break;
				case 2:
					System.out.println("いらっしゃいませ。何を召し上がりますか？");
					System.out.print("1.パスタセット(1,200円) 2.ステーキセット(2,500円) 3.フレンチコース(10,000円)>");
					int sl = scan.nextInt();
					switch(sl){
						case 1:
							d.eat("パスタセット",1200);
							break;
						case 2:
							d.eat("ステーキセット",2500);
							break;
						case 3:
							d.eat("フレンチコース",10000);
							break;
						default:
							return;
					}
					break;
				case 3:
					System.out.print("1.映画(1,800円) 2.ディズニーランド(8,200円) 3.温泉旅行(26,000円)>");
					sl = scan.nextInt();
					switch(sl){
						case 1:
							d.play("映画",1800);
							break;
						case 2:
							d.play("ディズニーランド",8200);
							break;
						case 3:
							d.play("温泉旅行",26000);
							break;
						default:
							return;
					}
					break;
				case 4:
					int[] money = {5000,7000,10000};
					int num = new Random().nextInt(money.length);
					d.getMoney(money[num]);
					break;
				case 5:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
