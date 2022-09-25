package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.Looper;
import android.util.Log;

/* renamed from: com.google.android.libraries.lens.c.a.t */
/* compiled from: PG */
public final class C24092t {
    /* renamed from: a */
    public static void m44741a() {
        m44742b(Looper.myLooper() == Looper.getMainLooper(), "This should be running on the main thread.");
    }

    /* renamed from: b */
    public static void m44742b(boolean z, String str) {
        if (!z) {
            m44744d(new IllegalStateException(str));
        }
    }

    /* renamed from: c */
    public static void m44743c(Object obj) {
        if (obj == null) {
            m44744d(new NullPointerException());
        }
    }

    /* renamed from: d */
    private static void m44744d(RuntimeException runtimeException) {
        Log.e("Preconditions", "Precondition broken. Build is not strict; continuing...", runtimeException);
    }
}
