package com.google.android.setupcompat.internal;

import android.os.Looper;

/* renamed from: com.google.android.setupcompat.internal.g */
/* compiled from: PG */
public final class C45259g {
    /* renamed from: a */
    public static void m80632a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m80633b(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException(str.concat(" must be called from the UI thread."));
        }
    }

    /* renamed from: c */
    public static void m80634c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
