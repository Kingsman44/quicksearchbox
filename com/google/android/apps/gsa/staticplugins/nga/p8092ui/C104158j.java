package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.j */
/* compiled from: PG */
public final /* synthetic */ class C104158j implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C104163o f289717a;

    /* renamed from: b */
    public final /* synthetic */ long f289718b;

    /* renamed from: c */
    public final /* synthetic */ long f289719c;

    /* renamed from: d */
    public final /* synthetic */ int f289720d;

    public /* synthetic */ C104158j(C104163o oVar, int i, long j, long j2) {
        this.f289717a = oVar;
        this.f289720d = i;
        this.f289718b = j;
        this.f289719c = j2;
    }

    public final void run() {
        C104163o oVar = this.f289717a;
        int i = this.f289720d;
        long j = this.f289718b;
        long j2 = this.f289719c;
        if (i == 0) {
            throw null;
        } else if (i == 5) {
            oVar.mo93979g(4, j, j);
            oVar.f289731g.mo28213m("[NGA] NgaDataUpdateFragment.onDownloadStateChange.fillProgressBar", 500, new C104153e(oVar));
            oVar.f289731g.mo28213m("[NGA] NgaDataUpdateFragment.onDownloadStateChange.exitFragment", 1000, new C104154f(oVar));
        } else {
            oVar.mo93979g(i, j, j2);
        }
    }
}
