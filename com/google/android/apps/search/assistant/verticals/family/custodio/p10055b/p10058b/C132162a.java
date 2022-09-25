package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10058b;

import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132201a;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132207g;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132208h;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10059c.C132209i;
import com.google.common.base.C58817ah;
import com.google.p427am.p432b.p433a.C8662bn;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C132162a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132165d f360734a;

    /* renamed from: b */
    public final /* synthetic */ C8662bn f360735b;

    public /* synthetic */ C132162a(C132165d dVar, C8662bn bnVar) {
        this.f360734a = dVar;
        this.f360735b = bnVar;
    }

    public final Object apply(Object obj) {
        C132165d dVar = this.f360734a;
        C8662bn bnVar = this.f360735b;
        C63042fg b = C62950b.m95471b(dVar.f360742b);
        C132201a aVar = (C132201a) ((C132209i) obj).toBuilder();
        if (bnVar != null) {
            C132207g gVar = (C132207g) C132208h.f360848d.createBuilder();
            gVar.copyOnWrite();
            C132208h hVar = (C132208h) gVar.instance;
            b.getClass();
            hVar.f360851b = b;
            hVar.f360850a |= 1;
            gVar.copyOnWrite();
            C132208h hVar2 = (C132208h) gVar.instance;
            hVar2.f360852c = bnVar;
            hVar2.f360850a |= 2;
            aVar.copyOnWrite();
            C132209i iVar = (C132209i) aVar.instance;
            C132208h hVar3 = (C132208h) gVar.build();
            hVar3.getClass();
            iVar.f360859e = hVar3;
            iVar.f360855a |= 4;
        } else {
            C132207g gVar2 = (C132207g) C132208h.f360848d.createBuilder();
            gVar2.copyOnWrite();
            C132208h hVar4 = (C132208h) gVar2.instance;
            b.getClass();
            hVar4.f360851b = b;
            hVar4.f360850a |= 1;
            aVar.copyOnWrite();
            C132209i iVar2 = (C132209i) aVar.instance;
            C132208h hVar5 = (C132208h) gVar2.build();
            hVar5.getClass();
            iVar2.f360859e = hVar5;
            iVar2.f360855a |= 4;
        }
        return (C132209i) aVar.build();
    }
}
