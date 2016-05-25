package jp.co.nichiwa_system;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoodsTest {

	@Test
	public void testGetGoodsPrice() {
		Goods ice = new Goods(100);
		assertEquals(100, ice.getPrice());
	}

	@Test
	public void testGetTaxIncludedPrice() {
		Goods ice = new Goods(100);
		assertEquals(108, ice.getTaxIncludedPrice());

		Goods handkerchief = new Goods(500);
		assertEquals(540, handkerchief.getTaxIncludedPrice());
	}

}
