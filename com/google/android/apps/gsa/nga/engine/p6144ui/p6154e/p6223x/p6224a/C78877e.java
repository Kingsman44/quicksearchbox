package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6223x.p6224a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6417x.C83345af;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.x.a.e */
/* compiled from: PG */
public final /* synthetic */ class C78877e implements C83345af {

    /* renamed from: a */
    public static final /* synthetic */ C78877e f217059a = new C78877e();

    private /* synthetic */ C78877e() {
    }

    /* renamed from: a */
    public final Object mo73105a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C78245d dVar = (C78245d) obj;
        C78224b bVar = (C78224b) obj3;
        Boolean bool = (Boolean) obj4;
        Boolean bool2 = (Boolean) obj5;
        if (!((Boolean) obj2).booleanValue()) {
            return Optional.empty();
        }
        if (bVar.mo73148k(C89160q.DEMAND_STATE) && bool2.booleanValue()) {
            return Optional.empty();
        }
        int g = dVar.mo73180b().mo73174g();
        if (g != 0) {
            if (g == 2 && C78883k.m126757a(dVar, bool.booleanValue())) {
                if (dVar.mo73182e()) {
                    return dVar.mo73180b().mo73170c().map(C78874b.f217056a);
                }
                int h = dVar.mo73180b().mo73175h();
                if (h == 0) {
                    throw null;
                } else if (h == 3) {
                    int f = dVar.mo73180b().mo73173f();
                    if (f == 0) {
                        throw null;
                    } else if (f == 11) {
                        return Optional.m71637of(10);
                    }
                }
            }
            return Optional.empty();
        }
        throw null;
    }
}
