package com.google.p3723ar.imp.view;

import android.view.Surface;

/* renamed from: com.google.ar.imp.view.x */
/* compiled from: PG */
public final /* synthetic */ class C48014x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C48016z f124252a;

    /* renamed from: b */
    public final /* synthetic */ View f124253b;

    /* renamed from: c */
    public final /* synthetic */ Surface f124254c;

    public /* synthetic */ C48014x(C48016z zVar, View view, Surface surface) {
        this.f124252a = zVar;
        this.f124253b = view;
        this.f124254c = surface;
    }

    public final void run() {
        C48016z zVar = this.f124252a;
        View view = this.f124253b;
        Surface surface = this.f124254c;
        if (View.nHasSwapChain(view.f124179a)) {
            View.nDestroySwapChain(view.f124179a);
        }
        View.nCreateSwapChain(view.f124179a, surface, true != zVar.f124262d.f124184a.f386972f ? 1 : 0);
    }
}
