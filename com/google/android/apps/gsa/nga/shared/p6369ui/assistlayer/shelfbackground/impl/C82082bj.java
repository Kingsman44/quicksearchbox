package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.bj */
/* compiled from: PG */
public final /* synthetic */ class C82082bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C82084bl f224378a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f224379b;

    public /* synthetic */ C82082bj(C82084bl blVar, Runnable runnable) {
        this.f224378a = blVar;
        this.f224379b = runnable;
    }

    public final void run() {
        C82084bl blVar = this.f224378a;
        this.f224379b.run();
        C83349aj.m132647b(blVar.f224407g, blVar.f224403c, false, "hasRunningAnimation");
    }
}
