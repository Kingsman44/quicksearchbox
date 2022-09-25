package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.l */
/* compiled from: PG */
public final /* synthetic */ class C78706l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C78710p f216635a;

    /* renamed from: b */
    public final /* synthetic */ C83357g f216636b;

    /* renamed from: c */
    public final /* synthetic */ Supplier f216637c;

    /* renamed from: d */
    public final /* synthetic */ int f216638d;

    public /* synthetic */ C78706l(C78710p pVar, C83357g gVar, Supplier supplier, int i) {
        this.f216635a = pVar;
        this.f216636b = gVar;
        this.f216637c = supplier;
        this.f216638d = i;
    }

    public final void run() {
        C78710p pVar = this.f216635a;
        C83349aj.m132647b(pVar.f216648c, this.f216636b, this.f216637c.get(), String.valueOf(this.f216638d));
    }
}
