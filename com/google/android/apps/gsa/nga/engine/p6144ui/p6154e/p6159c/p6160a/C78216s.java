package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78188a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.s */
/* compiled from: PG */
public final /* synthetic */ class C78216s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78190aa f215355a;

    /* renamed from: b */
    public final /* synthetic */ boolean f215356b;

    public /* synthetic */ C78216s(C78190aa aaVar, boolean z) {
        this.f215355a = aaVar;
        this.f215356b = z;
    }

    public final void run() {
        Object obj;
        C78190aa aaVar = this.f215355a;
        boolean z = this.f215356b;
        if (((C78224b) ((C83361k) aaVar.f215281f).f227199b.get()).mo73124e() != z) {
            C58976aa aaVar2 = C58975e.f156826a;
            C83357g gVar = aaVar.f215281f;
            C78224b bVar = (C78224b) ((C83361k) gVar).f227199b.get();
            if (!bVar.mo73122c() || !z) {
                obj = new C78188a(z, bVar.mo73123d(), false, bVar.mo73121b(), bVar.mo73120a());
            } else {
                obj = bVar.mo73143f();
            }
            gVar.mo76660b(obj);
        }
    }
}
