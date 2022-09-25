package com.google.android.apps.gsa.staticplugins.p7825dm.p7826a;

import com.google.android.apps.gsa.search.core.p6500ac.C84405i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.p2927f.C37587a;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4412k.p4413a.C57833a;
import com.google.p4283bv.p4412k.p4413a.C57834b;
import com.google.p4283bv.p4412k.p4413a.C57836d;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.a.b */
/* compiled from: PG */
public final /* synthetic */ class C99730b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C99747s f279072a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f279073b;

    public /* synthetic */ C99730b(C99747s sVar, C60870cx cxVar) {
        this.f279072a = sVar;
        this.f279073b = cxVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C99747s sVar = this.f279072a;
        C60870cx cxVar = this.f279073b;
        C37514du duVar = ((C37418bw) obj).f99354b;
        if (duVar == null) {
            duVar = C37514du.f99629c;
        }
        if (duVar.f99631a == 1) {
            C37587a aVar = new C37587a(cxVar);
            C57833a aVar2 = (C57833a) C57834b.f154523d.createBuilder();
            C63088z F = C63088z.m96144F(aVar);
            aVar2.copyOnWrite();
            C57834b bVar = (C57834b) aVar2.instance;
            F.getClass();
            bVar.f154525a = 1 | bVar.f154525a;
            bVar.f154526b = F;
            C57836d dVar = sVar.f279099h;
            dVar.getClass();
            int i = dVar.f154530a;
            aVar2.copyOnWrite();
            C57834b bVar2 = (C57834b) aVar2.instance;
            bVar2.f154525a |= 2;
            bVar2.f154527c = i;
            return (C57834b) aVar2.build();
        }
        throw new C84405i("Failed closing listening session.");
    }
}
