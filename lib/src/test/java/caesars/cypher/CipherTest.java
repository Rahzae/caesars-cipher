package caesars.cypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CipherTest {

	private CaesarsCipher caesarsCipher = new CaesarsCipher();
	
	@Test
	void testCipheredMessage() {
		assertEquals("Zai SdW kag", caesarsCipher.cipher("how are you", 12));
	}

	@Test
	void testEmpty() {
		assertEquals(" ", caesarsCipher.cipher(" ", 12));
	}
}
