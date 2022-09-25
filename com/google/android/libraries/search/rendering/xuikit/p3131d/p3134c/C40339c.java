package com.google.android.libraries.search.rendering.xuikit.p3131d.p3134c;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.c.c */
/* compiled from: PG */
public final /* synthetic */ class C40339c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40340d f105949a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f105950b;

    public /* synthetic */ C40339c(C40340d dVar, Runnable runnable) {
        this.f105949a = dVar;
        this.f105950b = runnable;
    }

    public final void run() {
        boolean remove;
        C40340d dVar = this.f105949a;
        Runnable runnable = this.f105950b;
        synchronized (dVar.f105951a) {
            remove = dVar.f105951a.remove(runnable);
        }
        if (remove) {
            runnable.run();
        }
    }
}
