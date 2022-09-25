package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.assistant.p4008y.C53539a;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53631a;
import com.google.assistant.p4008y.p4013d.C53650b;
import com.google.assistant.p4008y.p4013d.C53659k;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.h */
/* compiled from: PG */
public final /* synthetic */ class C109886h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109889k f306183a;

    public /* synthetic */ C109886h(C109889k kVar) {
        this.f306183a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C53539a aVar;
        C109889k kVar = this.f306183a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            aVar = (C53539a) C53618b.f140732c.createBuilder((C53618b) axVar.mo56107c());
        } else {
            aVar = (C53539a) C53618b.f140732c.createBuilder();
        }
        C53659k kVar2 = (C53659k) C53660l.f140838d.createBuilder();
        C53631a aVar2 = (C53631a) C53650b.f140812d.createBuilder();
        aVar2.copyOnWrite();
        C53650b bVar = (C53650b) aVar2.instance;
        bVar.f140814a |= 1;
        bVar.f140815b = true;
        kVar2.copyOnWrite();
        C53660l lVar = (C53660l) kVar2.instance;
        C53650b bVar2 = (C53650b) aVar2.build();
        bVar2.getClass();
        lVar.f140841b = bVar2;
        lVar.f140840a |= 1;
        aVar.mo53993a((C53660l) kVar2.build());
        return ((C108013bm) kVar.f306189d.mo27525b()).mo96354E((C53618b) aVar.build());
    }
}
