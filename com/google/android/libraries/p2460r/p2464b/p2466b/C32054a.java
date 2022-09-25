package com.google.android.libraries.p2460r.p2464b.p2466b;

import android.util.Log;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: com.google.android.libraries.r.b.b.a */
/* compiled from: PG */
public final class C32054a {
    /* renamed from: a */
    static String m59730a(String str, Object[] objArr) {
        if (str == null) {
            return "null";
        }
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
    public static void m59731b(int i, String str, Throwable th, String str2, Object... objArr) {
        String c = m59732c(str);
        if (Log.isLoggable(m59732c(c), i)) {
            String a = m59730a(str2, objArr);
            if (i != 5) {
                if (th != null) {
                    Log.e(c, a, th);
                } else {
                    Log.e(c, a);
                }
            } else if (th != null) {
                Log.w(c, a, th);
            } else {
                Log.w(c, a);
            }
        }
    }

    /* renamed from: c */
    private static String m59732c(String str) {
        if (str.length() <= 23) {
            return str;
        }
        String substring = str.substring(0, 23);
        m59731b(5, substring, (Throwable) null, "Tag [%s] is too long; truncated to [%s]", str, substring);
        return substring;
    }
}
