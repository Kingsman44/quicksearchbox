package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4850an.p4855d.p4856a.C63452e;
import com.google.protos.p4850an.p4855d.p4856a.C63457j;
import com.google.protos.p4850an.p4855d.p4856a.C63464q;
import com.google.protos.p4850an.p4855d.p4856a.C63465r;
import com.google.protos.p4850an.p4855d.p4856a.C63470w;
import com.google.protos.p4850an.p4855d.p4856a.C63473z;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;
import com.google.protos.p4985f.p4988b.p4993d.C64784d;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.i */
/* compiled from: PG */
public final class C11946i {
    static {
        C58974d.m91134h("MessageExtraction");
    }

    /* renamed from: a */
    public static C63473z m27794a(Query query) {
        String obj = query.f252768g.toString();
        C63470w wVar = (C63470w) C63473z.f171527h.createBuilder();
        C63464q qVar = (C63464q) C63465r.f171513c.createBuilder();
        qVar.copyOnWrite();
        C63465r rVar = (C63465r) qVar.instance;
        obj.getClass();
        rVar.f171515a |= 1;
        rVar.f171516b = obj;
        wVar.copyOnWrite();
        C63473z zVar = (C63473z) wVar.instance;
        C63465r rVar2 = (C63465r) qVar.build();
        rVar2.getClass();
        zVar.f171532c = rVar2;
        zVar.f171530a |= 4;
        C63452e eVar = (C63452e) C63457j.f171489e.createBuilder();
        eVar.copyOnWrite();
        C63457j jVar = (C63457j) eVar.instance;
        jVar.f171492b = 0;
        jVar.f171491a |= 1;
        eVar.copyOnWrite();
        C63457j jVar2 = (C63457j) eVar.instance;
        jVar2.f171493c = 1;
        jVar2.f171491a |= 2;
        wVar.mo59213a(eVar);
        return (C63473z) wVar.build();
    }

    /* renamed from: b */
    public static boolean m27795b(C64782b bVar) {
        if ((bVar.f175581a & 2) == 0) {
            return false;
        }
        C64784d dVar = bVar.f175582b;
        if (dVar == null) {
            dVar = C64784d.f175584d;
        }
        return "reply.MESSAGE".equals(dVar.f175587b) && C11945h.m27791p(bVar, "message") == 1;
    }
}
