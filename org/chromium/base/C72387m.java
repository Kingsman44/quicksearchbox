package org.chromium.base;

import android.util.Log;
import java.util.Locale;

/* renamed from: org.chromium.base.m */
/* compiled from: PG */
public final class C72387m {
    /* renamed from: a */
    public static String m107040a(String str) {
        if (str.startsWith("cr_")) {
            return str;
        }
        return "cr_".concat(String.valueOf(str.substring(true != str.startsWith("cr.") ? 0 : 3, str.length())));
    }

    /* renamed from: b */
    public static void m107041b(String str, String str2, Object... objArr) {
        Throwable f = m107045f(objArr);
        String e = m107044e(str2, f, objArr);
        if (f != null) {
            Log.e(m107040a(str), e, f);
        } else {
            Log.e(m107040a(str), e);
        }
    }

    /* renamed from: c */
    public static void m107042c(String str, String str2, Object... objArr) {
        Throwable f = m107045f(objArr);
        String e = m107044e(str2, f, objArr);
        if (f != null) {
            Log.i(m107040a(str), e, f);
        } else {
            Log.i(m107040a(str), e);
        }
    }

    /* renamed from: d */
    public static void m107043d(String str, String str2, Object... objArr) {
        Throwable f = m107045f(objArr);
        String e = m107044e(str2, f, objArr);
        if (f != null) {
            Log.w(m107040a(str), e, f);
        } else {
            Log.w(m107040a(str), e);
        }
    }

    /* renamed from: e */
    private static String m107044e(String str, Throwable th, Object... objArr) {
        return ((th != null || objArr.length <= 0) && objArr.length <= 1) ? str : String.format(Locale.US, str, objArr);
    }

    /* renamed from: f */
    private static Throwable m107045f(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return null;
        }
        Throwable th = objArr[length - 1];
        if (!(th instanceof Throwable)) {
            return null;
        }
        return th;
    }
}
