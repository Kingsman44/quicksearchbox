package com.google.android.enterprise.connectedapps.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.enterprise.connectedapps.internal.i */
/* compiled from: PG */
public final class C142584i {
    /* renamed from: a */
    public static void m231220a(RuntimeException runtimeException) {
        new Handler(Looper.getMainLooper()).postDelayed(new C142583h(runtimeException), 1000);
    }

    /* renamed from: b */
    public static void m231221b() {
        new Handler(Looper.getMainLooper()).postDelayed(new C142583h(), 1000);
    }
}
