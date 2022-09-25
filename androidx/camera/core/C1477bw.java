package androidx.camera.core;

import android.util.Log;

/* renamed from: androidx.camera.core.bw */
/* compiled from: PG */
public final class C1477bw {

    /* renamed from: a */
    public static int f4071a = 3;

    /* renamed from: a */
    public static void m3978a(String str, String str2) {
        if (m3985h(str, 3)) {
            Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m3979b(String str, String str2, Throwable th) {
        if (m3985h(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: c */
    public static void m3980c(String str, String str2) {
        if (m3985h(str, 6)) {
            Log.e(str, str2);
        }
    }

    /* renamed from: d */
    public static void m3981d(String str, String str2, Throwable th) {
        if (m3985h(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m3982e(String str, String str2) {
        if (m3985h(str, 4)) {
            Log.i(str, str2);
        }
    }

    /* renamed from: f */
    public static void m3983f(String str, String str2) {
        if (m3985h(str, 5)) {
            Log.w(str, str2);
        }
    }

    /* renamed from: g */
    public static void m3984g(String str, String str2, Throwable th) {
        if (m3985h(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: h */
    public static boolean m3985h(String str, int i) {
        return f4071a <= i || Log.isLoggable(str, i);
    }
}
