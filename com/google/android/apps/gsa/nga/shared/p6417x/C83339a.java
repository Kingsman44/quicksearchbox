package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.a */
/* compiled from: PG */
public final /* synthetic */ class C83339a implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C83352b f227154a;

    public /* synthetic */ C83339a(C83352b bVar) {
        this.f227154a = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C83352b bVar = this.f227154a;
        synchronized (bVar.f227183a) {
            Object b = bVar.mo76654b();
            if (!C58832aw.m90831a(bVar.f227186d.getAndSet(b), b)) {
                C58485gu j = C58485gu.m89842j(bVar.f227184b);
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    ((C90919bp) j.get(i)).mo17870a(b);
                }
            }
        }
    }
}
