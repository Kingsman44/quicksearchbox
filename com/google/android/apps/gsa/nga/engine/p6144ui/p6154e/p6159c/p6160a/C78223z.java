package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78188a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.p6983ah.C89154k;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.z */
/* compiled from: PG */
public final /* synthetic */ class C78223z implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78190aa f215364a;

    /* renamed from: b */
    public final /* synthetic */ C89158o f215365b;

    public /* synthetic */ C78223z(C78190aa aaVar, C89158o oVar) {
        this.f215364a = aaVar;
        this.f215365b = oVar;
    }

    public final void run() {
        C78190aa aaVar = this.f215364a;
        C89158o oVar = this.f215365b;
        C78224b bVar = (C78224b) ((C83361k) aaVar.f215281f).f227199b.get();
        C89160q a = C89160q.m145040a(oVar.f241719b);
        if (a == null) {
            a = C89160q.UNKNOWN;
        }
        if (!bVar.mo73148k(a)) {
            C78224b bVar2 = (C78224b) ((C83361k) aaVar.f215281f).f227199b.get();
            C89160q a2 = C89160q.m145040a(((C78224b) ((C83361k) aaVar.f215281f).f227199b.get()).mo73121b().f241719b);
            if (a2 == null) {
                a2 = C89160q.UNKNOWN;
            }
            if (!a2.equals(C89160q.DEMAND_STATE)) {
                bVar2 = bVar2.mo73145h(C89154k.f241700e);
            }
            C58976aa aaVar2 = C58975e.f156826a;
            aaVar.f215281f.mo76660b(new C78188a(bVar2.mo73124e(), bVar2.mo73123d(), bVar2.mo73122c(), oVar, bVar2.mo73120a()));
        }
    }
}
