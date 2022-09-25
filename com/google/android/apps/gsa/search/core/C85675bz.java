package com.google.android.apps.gsa.search.core;

import com.google.android.libraries.geller.p1815c.C21761b;
import com.google.android.libraries.geller.p1815c.C21762c;
import com.google.android.libraries.geller.p1815c.C21763d;
import com.google.android.libraries.geller.p1815c.C21764e;
import com.google.common.base.C58837ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;

/* renamed from: com.google.android.apps.gsa.search.core.bz */
/* compiled from: PG */
final class C85675bz implements C85740cd {

    /* renamed from: a */
    final /* synthetic */ C21761b f231610a;

    public C85675bz(C21761b bVar) {
        this.f231610a = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo79205a(Object obj, Object obj2) {
        String str = (String) obj;
        C21762c cVar = (C21762c) C21763d.f60062d.createBuilder();
        cVar.copyOnWrite();
        C21763d dVar = (C21763d) cVar.instance;
        str.getClass();
        dVar.f60064a |= 1;
        dVar.f60065b = str;
        String g = C58837ba.m90858g((String) obj2);
        cVar.copyOnWrite();
        C21763d dVar2 = (C21763d) cVar.instance;
        dVar2.f60064a |= 2;
        dVar2.f60066c = g;
        C21763d dVar3 = (C21763d) cVar.build();
        C21761b bVar = this.f231610a;
        bVar.copyOnWrite();
        C21764e eVar = (C21764e) bVar.instance;
        C21764e eVar2 = C21764e.f60067e;
        dVar3.getClass();
        C62971cq cqVar = eVar.f60070b;
        if (!cqVar.mo58948c()) {
            eVar.f60070b = C62942bv.mutableCopy(cqVar);
        }
        eVar.f60070b.add(dVar3);
    }
}
