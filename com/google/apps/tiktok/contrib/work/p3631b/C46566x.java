package com.google.apps.tiktok.contrib.work.p3631b;

import android.os.Handler;
import androidx.work.C4392ap;

/* renamed from: com.google.apps.tiktok.contrib.work.b.x */
/* compiled from: PG */
final class C46566x implements C4392ap {

    /* renamed from: a */
    final Handler f121743a;

    public C46566x(Handler handler) {
        this.f121743a = handler;
    }

    /* renamed from: a */
    public final void mo9321a(Runnable runnable) {
        this.f121743a.removeCallbacks(runnable);
    }

    /* renamed from: b */
    public final void mo9322b(long j, Runnable runnable) {
        this.f121743a.postDelayed(runnable, j);
    }
}
