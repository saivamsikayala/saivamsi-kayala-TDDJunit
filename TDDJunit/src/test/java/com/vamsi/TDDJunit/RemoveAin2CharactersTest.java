package com.vamsi.TDDJunit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAin2CharactersTest {
	/*
	 * 1. 1 char : A => ""
	 * 2. 1 char : B =>"B"
	 * 3. 2 chars : AA => ""
	 * 4. 2 chars : BA/AB => "B"
	 * 5. 3 chars : AAB => "B"
	 * 6. 3 chars : ABA/BAA => "BA"
	 * 7. n chars : ABBSJHVSGVSG => "BBSJHVSGVSG"
	 * 8. 0 chars : "" => ""
	 */
	
	RemoveAin2Characters ra2;
	
	@BeforeEach
	void setup() {
		ra2 = new RemoveAin2Characters();
	}
	@Test
	void testAchar1() {
		String ans = ra2.remove2Chars("A");
		assertEquals("",ans);
	}
	@Test
	void testBchar1() {
		String ans = ra2.remove2Chars("B");
		assertEquals("B",ans);
	}
	
	@Test
	void test2Achar() {
		String ans = ra2.remove2Chars("AA");
		assertEquals("",ans);
	}
	@Test
	void test2ABchar() {
		String ans = ra2.remove2Chars("AAB");
		assertEquals("B",ans);
	}
	@Test
	void testABAchar() {
		String ans = ra2.remove2Chars("ABA");
		assertEquals("BA",ans);
	}
	
	@Test
	void test1AinString() {
		String ans = ra2.remove2Chars("ABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB");
		assertEquals("BAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB",ans);
	}

}