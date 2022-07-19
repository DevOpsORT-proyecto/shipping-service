package uy.edu.ort.devops.shippingserviceexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import uy.edu.ort.devops.shippingserviceexample.domain.Shipping;
import uy.edu.ort.devops.shippingserviceexample.logic.ShippingLogic;

@SpringBootTest
class ShippingServiceExampleApplicationTests {

	ShippingLogic shippingLogic = new ShippingLogic();
	Shipping shipping = new Shipping("Delivered","a");

	@Test
	void shippingLogicTest() {
		assertEquals("Delivered", shippingLogic.getShipping("a").getStatus() );
		assertEquals("In transit", shippingLogic.getShipping("b").getStatus() );
		assertEquals("Preparing", shippingLogic.getShipping("c").getStatus() );
	}

	@Test
	void shippingTest() {
		assertEquals("a", shipping.getId() );
		assertEquals("Delivered", shipping.getStatus() );
	}


}
