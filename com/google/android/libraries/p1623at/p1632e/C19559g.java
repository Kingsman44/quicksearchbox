package com.google.android.libraries.p1623at.p1632e;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.google.android.libraries.at.e.g */
/* compiled from: PG */
public final class C19559g {

    /* renamed from: a */
    private static Thread f54455a;

    /* renamed from: b */
    private static volatile Handler f54456b;

    /* renamed from: a */
    public static Handler m37302a() {
        if (f54456b == null) {
            f54456b = new Handler(Looper.getMainLooper());
        }
        return f54456b;
    }

    /* renamed from: b */
    public static void m37303b() {
        if (m37305d(Thread.currentThread())) {
            throw new C19558f("Must be called on a background thread");
        }
    }

    /* renamed from: c */
    public static void m37304c() {
        if (!m37305d(Thread.currentThread())) {
            throw new C19558f("Must be called on the main thread");
        }
    }

    /* renamed from: d */
    public static boolean m37305d(Thread thread) {
        if (f54455a == null) {
            f54455a = Looper.getMainLooper().getThread();
        }
        return thread == f54455a;
    }
}
