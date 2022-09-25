package com.facebook.litho;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.litho.dl */
/* compiled from: PG */
public final class C6192dl extends Handler implements C6193dm {
    public C6192dl(Looper looper) {
        super(looper);
    }

    /* renamed from: a */
    public final void mo13163a(Runnable runnable, String str) {
        post(runnable);
    }

    /* renamed from: b */
    public final void mo13164b(Runnable runnable) {
        removeCallbacks(runnable);
    }

    /* renamed from: c */
    public final boolean mo13165c() {
        return false;
    }
}
