package com.google.android.libraries.p1963i.p1968d;

/* renamed from: com.google.android.libraries.i.d.l */
/* compiled from: PG */
public final /* synthetic */ class C23899l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23900m f65377a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f65378b;

    public /* synthetic */ C23899l(C23900m mVar, Runnable runnable) {
        this.f65377a = mVar;
        this.f65378b = runnable;
    }

    public final void run() {
        C23900m mVar = this.f65377a;
        Runnable runnable = this.f65378b;
        long id = Thread.currentThread().getId();
        mVar.f65379a.mo29308d(id);
        try {
            runnable.run();
        } finally {
            mVar.f65379a.mo29307c(id);
        }
    }
}
