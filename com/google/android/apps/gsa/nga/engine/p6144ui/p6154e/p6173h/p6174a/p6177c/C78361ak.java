package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c.C78224b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78521ad;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78533ap;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78536as;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78537at;
import com.google.android.apps.gsa.nga.shared.p6417x.C83345af;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ak */
/* compiled from: PG */
public final /* synthetic */ class C78361ak implements C83345af {

    /* renamed from: a */
    public final /* synthetic */ C78380bc f215733a;

    public /* synthetic */ C78361ak(C78380bc bcVar) {
        this.f215733a = bcVar;
    }

    /* renamed from: a */
    public final Object mo73105a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Optional optional = (Optional) obj;
        C78224b bVar = (C78224b) obj2;
        C78391bn a = this.f215733a.mo73320a();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean isPresent = ((Optional) obj5).isPresent();
        boolean z = false;
        if (optional.isPresent() && booleanValue) {
            z = true;
        }
        C78356af c = C78356af.m125854c(a.mo73348f());
        if (isPresent) {
            C78536as b = C78537at.m126170b();
            ((C78521ad) b).f216265a = 5;
            c.f215720c = Optional.m71637of(b.mo73446a());
            return c.mo73311a();
        }
        if (z) {
            c.f215719b = optional;
        }
        if (!bVar.mo73146i()) {
            if (booleanValue2) {
                C78536as b2 = C78537at.m126170b();
                ((C78521ad) b2).f216265a = 5;
                c.f215720c = Optional.m71637of(b2.mo73446a());
            } else if (a.mo73344b().mo73359f().isPresent()) {
                c.f215724g = C78533ap.f216281e;
            }
        }
        if (bVar.mo73148k(C89160q.DEMAND_STATE) && !z) {
            C78533ap apVar = C78533ap.f216277a;
            c.f215724g = apVar;
            c.f215725h = apVar;
        }
        return c.mo73311a();
    }
}
