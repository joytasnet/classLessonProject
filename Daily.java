public class Daily{
	//フィールド
	int balance;

	//コンストラクタ
	public Daily(int balance){
		this.balance = balance;
	}

	//残高確認
	public void display(){
		System.out.printf("現在の残高は%,d円です。%n",this.balance);
	}
	//バイトで稼ぐ
	public void getMoney(int money){
		this.balance += money;
		System.out.printf("バイトで%,d円稼いだ。%n",money);
	}
	//食事する
	public void eat(String meal,int price){
		if(this.balance < price){
			System.out.println("お金が足りません。");
		}else{
			this.balance -= price;
			System.out.printf("%sを食べて%,d円支払った。%n",meal,price);
		}
	}
	//遊ぶ
	public void play(String something,int price){
		if(this.balance < price){
			System.out.println("お金が足りません。");
		}else{
			this.balance -= price;
			System.out.printf("%sを楽しんで%,d円支払った。%n",something,price);
		}
	}
}
