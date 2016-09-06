package com.os.operando.android.powermock.sample.util;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
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
}