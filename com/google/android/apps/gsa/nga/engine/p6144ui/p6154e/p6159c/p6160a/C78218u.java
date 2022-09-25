package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78188a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.u */
/* compiled from: PG */
public final /* synthetic */ class C78218u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78190aa f215359a;

    public /* synthetic */ C78218u(C78190aa aaVar) {
        this.f215359a = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78190aa aaVar = this.f215359a;
        C58976aa aaVar2 = C58975e.f156826a;
        if (C78816r.m126609n((C78815q) obj)) {
            C83357g gVar = aaVar.f215281f;
            C78224b bVar = (C78224b) ((C83361k) gVar).f227199b.get();
            gVar.mo76660b(new C78188a(bVar.mo73124e(), bVar.mo73123d(), false, bVar.mo73121b(), bVar.mo73120a()));
            Optional optional = (Optional) ((C83361k) aaVar.f215280e).f227199b.get();
            if (optional.isPresent() && !((Boolean) optional.get()).booleanValue()) {
                aaVar.f215280e.mo76660b(Optional.empty());
            }
        }
    }
}
