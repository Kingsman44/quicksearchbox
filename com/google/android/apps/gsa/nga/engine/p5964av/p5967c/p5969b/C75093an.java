package com.google.android.apps.gsa.nga.engine.p5964av.p5967c.p5969b;

import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.av.c.b.an */
/* compiled from: PG */
public final /* synthetic */ class C75093an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75094ao f209423a;

    public /* synthetic */ C75093an(C75094ao aoVar) {
        this.f209423a = aoVar;
    }

    public final void run() {
        C75094ao aoVar = this.f209423a;
        C75077bo a = aoVar.f209426c.mo71417a();
        if ((a.mo71468n() && !aoVar.f209427d.mo74955p()) || (a.mo71474t() && !aoVar.f209427d.mo74959t())) {
            aoVar.f209425b.b(C83016y.DATA_STORE_CHANGE, C83320io.f227132d);
            aoVar.f209424a.e(C89849ae.NGA_PAUSED_DATA_STORE_CHANGED, C83016y.DATA_STORE_CHANGE);
        }
    }
}
