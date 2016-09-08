package com.os.operando.android.powermock.sample.util;

public final class StringUtil {

    private StringUtil() {
    }

    public static boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }

    public static final boolean isEmptyFinal(String s) {
        return s == null || s.isEmpty();
    }

    public static final native boolean isEmptyNative(String string);

    public static boolean isEmptyPrivateCall(String s) {
        return isEmptyPrivate(s);
    }

    private static boolean isEmptyPrivate(String s) {
        return s == null || s.isEmpty();
    }
}
