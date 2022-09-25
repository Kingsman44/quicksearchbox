package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6218v.C78846b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ep */
/* compiled from: PG */
public final /* synthetic */ class C78474ep implements C83343ad {

    /* renamed from: a */
    public final /* synthetic */ C78391bn f216116a;

    public /* synthetic */ C78474ep(C78391bn bnVar) {
        this.f216116a = bnVar;
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78391bn bnVar = this.f216116a;
        C78846b bVar = (C78846b) obj;
        C78537at atVar = (C78537at) obj2;
        bnVar.mo73344b().mo73355b().mo76657c();
        C78356af c = C78356af.m125854c(bnVar.mo73348f());
        if (!((C78224b) obj3).mo73148k(C89160q.DEMAND_STATE)) {
            c.mo73313d(bnVar.mo73344b());
            c.f215720c = Optional.m71637of(atVar);
        }
        if (bVar.mo73650d()) {
            c.f215719b = Optional.m71637of(bVar.mo73642a());
        }
        return c.mo73311a();
    }
}
