package com.android.p275j;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.android.j.ab */
/* compiled from: PG */
public final class C5188ab {

    /* renamed from: a */
    public static final String f16467a = "Volley";

    /* renamed from: b */
    public static final boolean f16468b = Log.isLoggable(f16467a, 2);

    /* renamed from: c */
    private static final String f16469c = C5188ab.class.getName();

    /* renamed from: a */
    public static String m14146a(String str, Object... objArr) {
        String str2;
        String format = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f16469c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, format});
    }

    /* renamed from: b */
    public static void m14147b(String str, Object... objArr) {
        Log.d(f16467a, m14146a(str, objArr));
    }

    /* renamed from: c */
    public static void m14148c(String str, Object... objArr) {
        Log.e(f16467a, m14146a(str, objArr));
    }

    /* renamed from: d */
    public static void m14149d(Throwable th, String str, Object... objArr) {
        Log.e(f16467a, m14146a(str, objArr), th);
    }

    /* renamed from: e */
    public static void m14150e(String str, Object... objArr) {
        if (f16468b) {
            Log.v(f16467a, m14146a(str, objArr));
        }
    }
}
