package androidx.work.impl.background.systemalarm;

import android.content.Intent;

/* renamed from: androidx.work.impl.background.systemalarm.j */
/* compiled from: PG */
final class C4530j implements Runnable {

    /* renamed from: a */
    private final C4533m f14323a;

    /* renamed from: b */
    private final Intent f14324b;

    /* renamed from: c */
    private final int f14325c;

    public C4530j(C4533m mVar, Intent intent, int i) {
        this.f14323a = mVar;
        this.f14324b = intent;
        this.f14325c = i;
    }

    public final void run() {
        this.f14323a.mo9492d(this.f14324b, this.f14325c);
    }
}
