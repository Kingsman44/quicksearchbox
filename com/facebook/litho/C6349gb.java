package com.facebook.litho;

import android.os.Looper;
import com.facebook.litho.p325d.C6180a;

/* renamed from: com.facebook.litho.gb */
/* compiled from: PG */
public final class C6349gb {
    /* renamed from: a */
    public static void m17045a() {
        if (!C6180a.f18235b && !m17046b()) {
            throw new IllegalStateException("This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName())));
        }
    }

    /* renamed from: b */
    public static boolean m17046b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
