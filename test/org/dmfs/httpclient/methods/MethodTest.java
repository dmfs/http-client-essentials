package org.dmfs.httpclient.methods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class MethodTest
{

	@Test
	public void testIsSafe()
	{
		assertFalse(new Method("BOGUS").isSafe());
	}


	@Test
	public void testIsIdempotent()
	{
		assertFalse(new Method("BOGUS").isIdempotent());
	}


	@Test
	public void testVerb()
	{
		assertEquals("BOGUS", new Method("BOGUS").verb());
	}


	@Test
	public void testEqualsObject()
	{
		assertTrue(new Method("BOGUS").equals(new Method("BOGUS")));
		assertFalse(new Method("BOGUS").equals(new Method("FAKE")));
	}

}
