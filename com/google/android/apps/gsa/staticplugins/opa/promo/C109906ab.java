package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.assistant.p4008y.C53539a;
import com.google.assistant.p4008y.C53618b;
import com.google.assistant.p4008y.p4013d.C53653e;
import com.google.assistant.p4008y.p4013d.C53654f;
import com.google.assistant.p4008y.p4013d.C53659k;
import com.google.assistant.p4008y.p4013d.C53660l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.ab */
/* compiled from: PG */
public final /* synthetic */ class C109906ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C109912ah f306236a;

    /* renamed from: b */
    public final /* synthetic */ C53653e f306237b;

    public /* synthetic */ C109906ab(C109912ah ahVar, C53653e eVar) {
        this.f306236a = ahVar;
        this.f306237b = eVar;
    }

    public final C60870cx apply(Object obj) {
        C53539a aVar;
        C109912ah ahVar = this.f306236a;
        C53653e eVar = this.f306237b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            aVar = (C53539a) C53618b.f140732c.createBuilder((C53618b) axVar.mo56107c());
        } else {
            aVar = (C53539a) C53618b.f140732c.createBuilder();
        }
        C53659k kVar = (C53659k) C53660l.f140838d.createBuilder();
        kVar.copyOnWrite();
        C53660l lVar = (C53660l) kVar.instance;
        C53654f fVar = (C53654f) eVar.build();
        fVar.getClass();
        lVar.f140842c = fVar;
        lVar.f140840a |= 2;
        aVar.mo53993a((C53660l) kVar.build());
        return ((C108013bm) ahVar.f306246b.mo27525b()).mo96354E((C53618b) aVar.build());
    }
}
