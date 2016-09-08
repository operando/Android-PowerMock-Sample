package com.os.operando.android.powermock.sample.util;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberMatcher;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({StringUtil.class,})
public class StringUtilTest {

    @Test
    public void isEmptyMethodTest() {
        PowerMockito.mockStatic(StringUtil.class);
        Mockito.when(StringUtil.isEmpty("")).thenReturn(false);

        Assert.assertFalse(StringUtil.isEmpty(""));
    }

    @Test
    public void isEmptyFinalMethodTest() {
        PowerMockito.mockStatic(StringUtil.class);
        Mockito.when(StringUtil.isEmptyFinal("")).thenReturn(false);

        Assert.assertFalse(StringUtil.isEmptyFinal(""));
    }

    @Test
    public void isEmptyNativeMethodTest() {
        PowerMockito.mockStatic(StringUtil.class);
        Mockito.when(StringUtil.isEmptyNative("")).thenReturn(false);

        Assert.assertFalse(StringUtil.isEmptyNative(""));
    }

    @Test
    public void isEmptyPrivateMethodTest() throws Exception {
        PowerMockito.mockStatic(StringUtil.class);
        PowerMockito.when(StringUtil.class,
                MemberMatcher.method(StringUtil.class, "isEmptyPrivate", String.class))
                .withArguments("").thenReturn(false);

        Assert.assertFalse(StringUtil.isEmptyPrivateCall(""));
    }
}