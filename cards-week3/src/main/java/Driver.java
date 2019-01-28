
public class Driver {
	public static void main(String[] args) {
		
		Card card = new Card(1,"Club");
		IDatabase<Card> db = new CardDatabase();
		
		if(db.save(card)) {
			System.out.println("Card saved successfully");
		}else {
			System.out.println("Unable to save card");
		}
	}

}
