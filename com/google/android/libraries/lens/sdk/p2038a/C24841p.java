package com.google.android.libraries.lens.sdk.p2038a;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: com.google.android.libraries.lens.sdk.a.p */
/* compiled from: PG */
public final class C24841p {
    /* renamed from: a */
    public static void m45970a(String str, Object... objArr) {
        if (Log.isLoggable("LensSdk", 3)) {
            Log.d("LensSdk", m45973d(str, objArr));
        }
    }

    /* renamed from: b */
    public static void m45971b(String str, Object... objArr) {
        Log.e("LensSdk", m45973d(str, objArr));
    }

    /* renamed from: c */
    public static void m45972c(Throwable th, String str, Object... objArr) {
        Log.e("LensSdk", m45973d(str, objArr), th);
    }

    /* renamed from: d */
    private static String m45973d(String str, Object... objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            String str2 = Thread.currentThread().getId() + ":" + Thread.currentThread().getName();
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
            String className = stackTraceElement.getClassName();
            int lineNumber = stackTraceElement.getLineNumber();
            return elapsedRealtime + " " + str2 + " <" + className.substring(className.lastIndexOf(".") + 1) + "@" + lineNumber + ">: " + String.format(str, objArr);
        } catch (Exception unused) {
            return elapsedRealtime + " " + String.format(str, objArr);
        }
    }
}
