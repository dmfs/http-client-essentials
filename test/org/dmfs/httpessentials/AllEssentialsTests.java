package org.dmfs.httpessentials;

import org.dmfs.httpessentials.methods.IdempotentMethodTest;
import org.dmfs.httpessentials.methods.MethodTest;
import org.dmfs.httpessentials.methods.SafeMethodTest;
import org.dmfs.httpessentials.status.NoneHttpStatusTest;
import org.dmfs.httpessentials.status.SimpleHttpStatusTest;
import org.dmfs.httpessentials.status.StatusLineHttpStatusTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ NoneHttpStatusTest.class, SimpleHttpStatusTest.class, StatusLineHttpStatusTest.class, IdempotentMethodTest.class, SafeMethodTest.class,
	MethodTest.class })
public class AllEssentialsTests
{
}
