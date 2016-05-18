package org.dmfs.httpclient;

import org.dmfs.httpclient.methods.IdempotentMethodTest;
import org.dmfs.httpclient.methods.MethodTest;
import org.dmfs.httpclient.methods.SafeMethodTest;
import org.dmfs.httpclient.status.NoneHttpStatusTest;
import org.dmfs.httpclient.status.SimpleHttpStatusTest;
import org.dmfs.httpclient.status.StatusLineHttpStatusTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ NoneHttpStatusTest.class, SimpleHttpStatusTest.class, StatusLineHttpStatusTest.class, IdempotentMethodTest.class, SafeMethodTest.class,
	MethodTest.class })
public class AllEssentialsTests
{
}
