package com.facebook.p313c.p317d;

import android.os.Looper;
import com.facebook.p313c.C6055n;

/* renamed from: com.facebook.c.d.b */
/* compiled from: PG */
public final class C6039b {
    /* renamed from: a */
    public static void m15532a() {
        String concat = "This must run on the main thread; but is running on ".concat(String.valueOf(Thread.currentThread().getName()));
        if (!C6055n.f17820a && !m15533b()) {
            throw new IllegalStateException(concat);
        }
    }

    /* renamed from: b */
    public static boolean m15533b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
