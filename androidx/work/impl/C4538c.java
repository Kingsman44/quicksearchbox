package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.work.C4392ap;

/* renamed from: androidx.work.impl.c */
/* compiled from: PG */
public final class C4538c implements C4392ap {

    /* renamed from: a */
    private final Handler f14349a = Handler.createAsync(Looper.getMainLooper());

    /* renamed from: a */
    public final void mo9321a(Runnable runnable) {
        this.f14349a.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public final void mo9322b(long j, Runnable runnable) {
        this.f14349a.postDelayed(runnable, j);
    }
}
