package org.dmfs.httpclient.methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class IdempotentMethodTest
{

	@Test
	public void testIsSafe()
	{
		assertFalse(new IdempotentMethod("BOGUS").isSafe());
	}


	@Test
	public void testIsIdempotent()
	{
		assertTrue(new IdempotentMethod("BOGUS").isIdempotent());
	}


	@Test
	public void testVerb()
	{
		assertEquals("BOGUS", new IdempotentMethod("BOGUS").verb());
	}


	@Test
	public void testEqualsObject()
	{
		assertTrue(new IdempotentMethod("BOGUS").equals(new IdempotentMethod("BOGUS")));
		assertFalse(new IdempotentMethod("BOGUS").equals(new IdempotentMethod("FAKE")));
	}

}
