package org.dmfs.httpclient.methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SafeMethodTest
{

	@Test
	public void testIsSafe()
	{
		assertTrue(new SafeMethod("BOGUS").isSafe());
	}


	@Test
	public void testIsIdempotent()
	{
		assertTrue(new SafeMethod("BOGUS").isIdempotent());
	}


	@Test
	public void testVerb()
	{
		assertEquals("BOGUS", new SafeMethod("BOGUS").verb());
	}


	@Test
	public void testEqualsObject()
	{
		assertTrue(new SafeMethod("BOGUS").equals(new SafeMethod("BOGUS")));
		assertFalse(new SafeMethod("BOGUS").equals(new SafeMethod("FAKE")));
	}

}
