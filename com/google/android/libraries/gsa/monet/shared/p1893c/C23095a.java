package com.google.android.libraries.gsa.monet.shared.p1893c;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.gsa.monet.shared.c.a */
/* compiled from: PG */
public final class C23095a {
    /* renamed from: a */
    static String m43278a(String str, Object[] objArr) {
        if (objArr.length == 0) {
            return str;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{objArr[i]});
                objArr[i] = deepToString.substring(1, deepToString.length() - 1);
            }
        }
        try {
            return String.format(Locale.US, str, objArr);
        } catch (IllegalFormatException unused) {
            return str.concat(String.valueOf(Arrays.toString(objArr)));
        }
    }

    /* renamed from: b */
    public static void m43279b(String str, String str2, Object... objArr) {
        String e = m43282e(str);
        if (Log.isLoggable(m43282e(e), 6)) {
            Log.e(e, m43278a(str2, objArr));
        }
    }

    /* renamed from: c */
    public static void m43280c(String str, Throwable th, String str2, Object... objArr) {
        String e = m43282e(str);
        if (Log.isLoggable(m43282e(e), 6)) {
            Log.e(e, m43278a(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m43281d(String str, String str2, Object... objArr) {
        String e = m43282e(str);
        if (Log.isLoggable(m43282e(e), 5)) {
            Log.w(e, m43278a(str2, objArr));
        }
    }

    /* renamed from: e */
    private static String m43282e(String str) {
        if (str.length() <= 23) {
            return str;
        }
        String substring = str.substring(0, 23);
        m43281d(substring, "Tag [%s] is too long; truncated to [%s]", str, substring);
        return substring;
    }
}
