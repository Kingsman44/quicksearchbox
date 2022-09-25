package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import com.google.android.apps.gsa.speech.audio.C92199j;
import com.google.android.apps.gsa.speech.audio.C92202m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.protos.p4985f.p4988b.p4990b.C64748n;
import com.google.protos.p4985f.p4988b.p4990b.C64749o;
import com.google.protos.p4985f.p4988b.p4990b.C64751q;
import com.google.protos.p4985f.p4988b.p4990b.C64752r;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.bk */
/* compiled from: PG */
public final /* synthetic */ class C93027bk implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C93029bm f259488a;

    /* renamed from: b */
    public final /* synthetic */ C92199j f259489b;

    public /* synthetic */ C93027bk(C93029bm bmVar, C92199j jVar) {
        this.f259488a = bmVar;
        this.f259489b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C93029bm bmVar = this.f259488a;
        C92199j jVar = this.f259489b;
        Void voidR = (Void) obj;
        if (bmVar.f259494d.get()) {
            C64748n nVar = (C64748n) C64752r.f175524d.createBuilder();
            C64749o oVar = (C64749o) C64751q.f175519d.createBuilder();
            oVar.copyOnWrite();
            C64751q qVar = (C64751q) oVar.instance;
            qVar.f175522b = 2;
            qVar.f175521a = 1 | qVar.f175521a;
            nVar.copyOnWrite();
            C64752r rVar = (C64752r) nVar.instance;
            C64751q qVar2 = (C64751q) oVar.build();
            qVar2.getClass();
            rVar.f175528c = qVar2;
            rVar.f175526a |= 2;
            return C93029bm.m153091c((C64752r) nVar.build());
        }
        C64748n nVar2 = (C64748n) C64752r.f175524d.createBuilder();
        C64749o oVar2 = (C64749o) C64751q.f175519d.createBuilder();
        oVar2.copyOnWrite();
        C64751q qVar3 = (C64751q) oVar2.instance;
        qVar3.f175522b = 1;
        qVar3.f175521a = 1 | qVar3.f175521a;
        int i = ((C92202m) jVar).f257055c;
        oVar2.copyOnWrite();
        C64751q qVar4 = (C64751q) oVar2.instance;
        qVar4.f175521a |= 2;
        qVar4.f175523c = i;
        nVar2.copyOnWrite();
        C64752r rVar2 = (C64752r) nVar2.instance;
        C64751q qVar5 = (C64751q) oVar2.build();
        qVar5.getClass();
        rVar2.f175528c = qVar5;
        rVar2.f175526a |= 2;
        return C93029bm.m153091c((C64752r) nVar2.build());
    }
}
