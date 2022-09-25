package dagger.hilt.android.internal;

import android.os.Looper;

/* renamed from: dagger.hilt.android.internal.b */
/* compiled from: PG */
public final class C68309b {

    /* renamed from: a */
    private static Thread f184652a;

    /* renamed from: a */
    public static void m98647a() {
        if (f184652a == null) {
            f184652a = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != f184652a) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }
}
