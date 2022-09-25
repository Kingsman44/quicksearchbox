package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78533ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78540aw;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.C78846b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.dx */
/* compiled from: PG */
public final /* synthetic */ class C78455dx implements C83343ad {

    /* renamed from: a */
    public final /* synthetic */ C78393bp f216022a;

    public /* synthetic */ C78455dx(C78393bp bpVar) {
        this.f216022a = bpVar;
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78393bp bpVar = this.f216022a;
        C78846b bVar = (C78846b) obj;
        Boolean bool = (Boolean) obj3;
        if (((C78224b) obj2).mo73148k(C89160q.DEMAND_STATE)) {
            return C78540aw.f216294a;
        }
        Optional empty = Optional.empty();
        C78537at atVar = C78537at.f216290a;
        if (bpVar.mo73360h()) {
            if (bpVar.mo73356c().isPresent()) {
                empty = bpVar.mo73356c();
            }
            atVar = (C78537at) bpVar.mo73355b().mo76657c();
        }
        C78356af c = C78356af.m125854c(C78355ae.m125853a(bool.booleanValue()));
        C78356af afVar = c;
        afVar.mo73312b(empty, Optional.empty(), Optional.empty(), Optional.empty(), atVar);
        c.f215722e = bpVar.mo73359f();
        if (!bool.booleanValue()) {
            c.f215723f = C78533ap.f216279c;
        }
        if (bVar.mo73650d()) {
            c.f215719b = Optional.m71637of(bVar.mo73642a());
        }
        return c.mo73311a();
    }
}
