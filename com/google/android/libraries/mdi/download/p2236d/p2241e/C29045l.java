package com.google.android.libraries.mdi.download.p2236d.p2241e;

import android.util.Log;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.google.android.libraries.mdi.download.d.e.l */
/* compiled from: PG */
public final class C29045l {

    /* renamed from: a */
    private static final Random f78842a = new Random();

    /* renamed from: a */
    public static boolean m53929a(long j) {
        if (j <= 0) {
            if (j < 0) {
                m53935g("Bad sample interval: %d", Long.valueOf(j));
            }
            return false;
        } else if (f78842a.nextLong() % j == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static void m53930b(String str, Object obj) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", String.format(Locale.US, str, new Object[]{obj}));
        }
    }

    /* renamed from: c */
    public static void m53931c(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", String.format(Locale.US, str, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: d */
    public static void m53932d(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: e */
    public static void m53933e(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 3)) {
            Log.d("MDD", String.format(Locale.US, str, objArr), th);
        }
    }

    /* renamed from: f */
    public static void m53934f(String str) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", str);
        }
    }

    /* renamed from: g */
    public static void m53935g(String str, Object obj) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", String.format(Locale.US, str, new Object[]{obj}));
        }
    }

    /* renamed from: h */
    public static void m53936h(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", String.format(Locale.US, str, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: i */
    public static void m53937i(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            Log.e("MDD", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: j */
    public static void m53938j(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("MDD", 6)) {
            m53947s(th, String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: k */
    public static void m53939k() {
        if (Log.isLoggable("MDD", 2)) {
            Log.v("MDD", String.format(Locale.US, "%s: Failed to release the leases in the android shared storage. UnsupportedFileStorageOperation was thrown", new Object[]{"SharedFileManager"}));
        }
    }

    /* renamed from: l */
    public static void m53940l(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 2)) {
            Log.v("MDD", String.format(Locale.US, str, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: m */
    public static void m53941m(String str, Object... objArr) {
        if (Log.isLoggable("MDD", 2)) {
            Log.v("MDD", String.format(Locale.US, str, objArr));
        }
    }

    /* renamed from: n */
    public static void m53942n() {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", "No download stage experiment ids found even though experiment info is set.");
        }
    }

    /* renamed from: o */
    public static void m53943o(String str, Object obj) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", String.format(Locale.US, str, new Object[]{obj}));
        }
    }

    /* renamed from: p */
    public static void m53944p(String str, Object obj, Object obj2) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", String.format(Locale.US, str, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: q */
    public static void m53945q(Object... objArr) {
        if (Log.isLoggable("MDD", 5)) {
            Log.w("MDD", String.format(Locale.US, "%s: %d Handbag personalized info records in Geller for key %s, expect 1", objArr));
        }
    }

    /* renamed from: r */
    public static void m53946r(Throwable th, String str, Object... objArr) {
        if (!Log.isLoggable("MDD", 5)) {
            return;
        }
        if (Log.isLoggable("MDD", 3)) {
            Log.w("MDD", String.format(Locale.US, str, objArr), th);
            return;
        }
        String format = String.format(Locale.US, str, objArr);
        String valueOf = String.valueOf(th);
        Log.w("MDD", format + ": " + valueOf);
    }

    /* renamed from: s */
    public static void m53947s(Throwable th, String str) {
        if (!Log.isLoggable("MDD", 6)) {
            return;
        }
        if (Log.isLoggable("MDD", 3)) {
            Log.e("MDD", str, th);
            return;
        }
        String valueOf = String.valueOf(th);
        Log.e("MDD", str + ": " + valueOf);
    }
}
