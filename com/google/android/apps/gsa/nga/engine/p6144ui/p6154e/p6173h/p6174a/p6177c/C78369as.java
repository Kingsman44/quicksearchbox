package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.as */
/* compiled from: PG */
public final /* synthetic */ class C78369as implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78381bd f215741a;

    /* renamed from: b */
    public final /* synthetic */ C78378ba f215742b;

    public /* synthetic */ C78369as(C78381bd bdVar, C78378ba baVar) {
        this.f215741a = bdVar;
        this.f215742b = baVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78381bd bdVar = this.f215741a;
        C78378ba baVar = this.f215742b;
        if (((C78224b) obj).mo73148k(C89160q.DEMAND_STATE)) {
            bdVar.mo73329h(C89849ae.ESCAPE_HATCH_NOT_DISPLAYED_DUE_TO_DRL);
            bdVar.f215777o = Optional.m71637of(true);
            bdVar.mo73363p(bdVar.f215768f.mo73336a(bdVar.mo73325d()));
            return;
        }
        bdVar.f215777o = Optional.m71637of(true);
        bdVar.mo73332k(((C78484j) baVar).f216145c);
    }
}
