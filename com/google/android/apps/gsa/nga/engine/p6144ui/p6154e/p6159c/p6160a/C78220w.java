package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.shared.p6983ah.C89153j;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.w */
/* compiled from: PG */
public final /* synthetic */ class C78220w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C78190aa f215361a;

    public /* synthetic */ C78220w(C78190aa aaVar) {
        this.f215361a = aaVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C78190aa aaVar = this.f215361a;
        C78224b bVar = (C78224b) obj;
        if (!bVar.mo73148k(C89160q.DEMAND_STATE)) {
            aaVar.f215282g.mo73107a(1);
            return;
        }
        int a = C89153j.m145039a(bVar.mo73120a().f241704c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 0 || i == 1) {
            aaVar.f215282g.mo73107a(2);
        } else if (i == 2) {
            aaVar.f215282g.mo73107a(4);
        } else if (i != 3) {
            aaVar.f215282g.mo73107a(5);
        } else {
            aaVar.f215282g.mo73107a(3);
        }
    }
}
