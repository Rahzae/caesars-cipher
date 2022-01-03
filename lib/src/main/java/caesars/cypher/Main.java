package caesars.cypher;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "how are you";
		int offset = 12;
		
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		caesarsCipher.cipher(message, offset);
		
		System.out.println("message: " + message);
		System.out.println("offset: " + offset);
		System.out.println("Ciphered message: " + caesarsCipher.cipher(message, offset));
	}

}
