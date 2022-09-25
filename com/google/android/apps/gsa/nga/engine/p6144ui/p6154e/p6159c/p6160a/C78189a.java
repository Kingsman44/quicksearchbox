package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.p6160a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78241b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80836ao;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80840as;
import com.google.android.apps.gsa.nga.shared.p6417x.C83346ag;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C78189a implements C83346ag {

    /* renamed from: a */
    public static final /* synthetic */ C78189a f215275a = new C78189a();

    private /* synthetic */ C78189a() {
    }

    /* renamed from: a */
    public final Object mo73128a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C78245d dVar = (C78245d) obj;
        C78224b bVar = (C78224b) obj2;
        C78815q qVar = (C78815q) obj3;
        C78241b bVar2 = (C78241b) obj4;
        C80836ao aoVar = (C80836ao) obj5;
        C80840as asVar = (C80840as) obj6;
        boolean z = false;
        if (qVar.f216929a != 7 && dVar.mo73185h() && !C78816r.m126607l(qVar) && !C78816r.m126604i(qVar) && !bVar.mo73122c()) {
            C78241b bVar3 = C78241b.CHIP_EXPANDED;
            int ordinal = bVar2.ordinal();
            if (!(ordinal == 0 || ordinal == 2 || ordinal == 3 || C78202e.m125546a(dVar.mo73179a()) || C78202e.m125546a(dVar.mo73180b()))) {
                int h = dVar.mo73180b().mo73175h();
                int i = h - 1;
                if (h == 0) {
                    throw null;
                } else if (i == 0 || (i == 2 ? !(dVar.mo73186i() || dVar.mo73187j() || C78816r.m126606k(qVar) || (!C78816r.m126605j(qVar) && !C78816r.m126603h(qVar) && (!aoVar.f221765a || !bVar.mo73148k(C89160q.DEMAND_STATE)))) : !(i != 3 || !bVar.mo73148k(C89160q.DEMAND_STATE) || !aoVar.f221765a))) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
