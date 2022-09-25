package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132201a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132202b;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132203c;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132204d;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132205e;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132209i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8680j;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C132163b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132165d f360736a;

    /* renamed from: b */
    public final /* synthetic */ boolean f360737b;

    /* renamed from: c */
    public final /* synthetic */ C8680j f360738c;

    /* renamed from: d */
    public final /* synthetic */ C58485gu f360739d;

    public /* synthetic */ C132163b(C132165d dVar, boolean z, C8680j jVar, C58485gu guVar) {
        this.f360736a = dVar;
        this.f360737b = z;
        this.f360738c = jVar;
        this.f360739d = guVar;
    }

    public final Object apply(Object obj) {
        C132165d dVar = this.f360736a;
        boolean z = this.f360737b;
        C8680j jVar = this.f360738c;
        C58485gu guVar = this.f360739d;
        C63042fg b = C62950b.m95471b(dVar.f360742b);
        C132201a aVar = (C132201a) ((C132209i) obj).toBuilder();
        if (z) {
            aVar.copyOnWrite();
            C132209i iVar = (C132209i) aVar.instance;
            b.getClass();
            iVar.f360857c = b;
            iVar.f360855a |= 1;
            aVar.copyOnWrite();
            ((C132209i) aVar.instance).mo110538a().clear();
        }
        if (jVar != null) {
            C132202b bVar = (C132202b) C132203c.f360837d.createBuilder();
            bVar.copyOnWrite();
            C132203c cVar = (C132203c) bVar.instance;
            b.getClass();
            cVar.f360840b = b;
            cVar.f360839a |= 1;
            bVar.copyOnWrite();
            C132203c cVar2 = (C132203c) bVar.instance;
            cVar2.f360841c = jVar;
            cVar2.f360839a |= 2;
            C132203c cVar3 = (C132203c) bVar.build();
            aVar.copyOnWrite();
            C132209i iVar2 = (C132209i) aVar.instance;
            cVar3.getClass();
            iVar2.f360858d = cVar3;
            iVar2.f360855a |= 2;
        }
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C8675e eVar = (C8675e) guVar.get(i);
            String str = eVar.f29992a;
            C132204d dVar2 = (C132204d) C132205e.f360842d.createBuilder();
            dVar2.copyOnWrite();
            C132205e eVar2 = (C132205e) dVar2.instance;
            b.getClass();
            eVar2.f360845b = b;
            eVar2.f360844a |= 1;
            dVar2.copyOnWrite();
            C132205e eVar3 = (C132205e) dVar2.instance;
            eVar.getClass();
            eVar3.f360846c = eVar;
            eVar3.f360844a |= 2;
            C132205e eVar4 = (C132205e) dVar2.build();
            str.getClass();
            eVar4.getClass();
            aVar.copyOnWrite();
            ((C132209i) aVar.instance).mo110538a().put(str, eVar4);
        }
        return (C132209i) aVar.build();
    }
}
