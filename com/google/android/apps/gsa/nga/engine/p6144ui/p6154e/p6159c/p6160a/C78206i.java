package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.shared.p6983ah.C89153j;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.i */
/* compiled from: PG */
public final /* synthetic */ class C78206i implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78207j f215329a;

    public /* synthetic */ C78206i(C78207j jVar) {
        this.f215329a = jVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78207j jVar = this.f215329a;
        C78224b bVar = (C78224b) obj;
        if (!bVar.mo73148k(C89160q.DEMAND_STATE)) {
            jVar.f215330a.mo76660b(false);
        } else if (bVar.mo73148k(C89160q.DEMAND_STATE)) {
            int a = C89153j.m145039a(bVar.mo73120a().f241704c);
            if (a == 0) {
                a = 1;
            }
            if (a == 3 || a == 5) {
                jVar.f215330a.mo76660b(true);
            }
        }
    }
}
