package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8269e;

import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p4016z.C53685aj;
import com.google.assistant.p4016z.C53686ak;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.e.a */
/* compiled from: PG */
public final class C107048a {

    /* renamed from: a */
    public final C58974d f298088a;

    /* renamed from: b */
    public final C69464a f298089b;

    /* renamed from: c */
    private final C21370a f298090c;

    public C107048a(C21370a aVar, C69464a aVar2, C83564a aVar3) {
        this.f298090c = aVar;
        this.f298089b = aVar2;
        this.f298088a = aVar3.mo76900a("AA.Context");
    }

    /* renamed from: a */
    public final C63042fg mo95741a() {
        return C62953e.m95484i(this.f298090c.mo26870b());
    }

    /* renamed from: b */
    public final void mo95742b(C53715bm bmVar, long j) {
        mo95743c(bmVar, j, this.f298090c.mo26870b());
    }

    /* renamed from: c */
    public final void mo95743c(C53715bm bmVar, long j, long j2) {
        C53685aj ajVar = (C53685aj) C53686ak.f140913f.createBuilder();
        C63042fg i = C62953e.m95484i(j2);
        ajVar.copyOnWrite();
        C53686ak akVar = (C53686ak) ajVar.instance;
        i.getClass();
        akVar.f140918d = i;
        akVar.f140915a |= 1;
        ajVar.copyOnWrite();
        C53686ak akVar2 = (C53686ak) ajVar.instance;
        bmVar.getClass();
        akVar2.f140917c = bmVar;
        akVar2.f140916b = 4;
        ajVar.copyOnWrite();
        C53686ak akVar3 = (C53686ak) ajVar.instance;
        akVar3.f140915a |= 2;
        akVar3.f140919e = j;
        ((C107058b) this.f298089b.mo17428b()).mo95744a((C53686ak) ajVar.build());
    }
}
