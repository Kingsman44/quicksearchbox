package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.nga.api.a.ay;
import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106288p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107523b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107536o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107537p;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107541t;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107542u;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107544w;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107545x;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.C107833h;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protobuf.C62940bt;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C107805b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107820q f299977a;

    /* renamed from: b */
    public final /* synthetic */ C106286n f299978b;

    public /* synthetic */ C107805b(C107820q qVar, C106286n nVar) {
        this.f299977a = qVar;
        this.f299978b = nVar;
    }

    public final void run() {
        C106288p pVar;
        C107820q qVar = this.f299977a;
        C106286n nVar = this.f299978b;
        if (nVar.f296546b == 21) {
            pVar = (C106288p) nVar.f296547c;
        } else {
            pVar = C106288p.f296551c;
        }
        bf bfVar = pVar.f296554b;
        if (bfVar == null) {
            bfVar = bf.i;
        }
        bf bfVar2 = (bf) ((C83361k) qVar.f300033l.f296619a).f227199b.get();
        qVar.f300033l.f296619a.mo76660b(bfVar);
        ay a = ay.a(bfVar.b);
        if (a == null) {
            a = ay.a;
        }
        qVar.mo96299d(a.equals(ay.a));
        be a2 = be.a(bfVar.c);
        if (a2 == null) {
            a2 = be.a;
        }
        C107555d dVar = (C107555d) C107556e.f299210c.createBuilder();
        dVar.copyOnWrite();
        C107556e eVar = (C107556e) dVar.instance;
        eVar.f299213b = 18;
        eVar.f299212a |= 1;
        C62940bt btVar = C107523b.f299155a;
        C107536o oVar = (C107536o) C107537p.f299180c.createBuilder();
        oVar.copyOnWrite();
        C107537p pVar2 = (C107537p) oVar.instance;
        pVar2.f299183b = a2.d;
        pVar2.f299182a |= 1;
        dVar.mo58885m(btVar, (C107537p) oVar.build());
        qVar.mo96303h((C107556e) dVar.build());
        ay a3 = ay.a(bfVar2.b);
        if (a3 == null) {
            a3 = ay.a;
        }
        if (Objects.equals(a3, ay.a) && !Objects.equals(a, ay.a)) {
            C107555d dVar2 = (C107555d) C107556e.f299210c.createBuilder();
            dVar2.copyOnWrite();
            C107556e eVar2 = (C107556e) dVar2.instance;
            eVar2.f299213b = 21;
            eVar2.f299212a |= 1;
            C62940bt btVar2 = C107545x.f299195a;
            C107541t tVar = (C107541t) C107542u.f299189c.createBuilder();
            C107544w wVar = C107544w.f299193a;
            tVar.copyOnWrite();
            C107542u uVar = (C107542u) tVar.instance;
            wVar.getClass();
            uVar.f299192b = wVar;
            uVar.f299191a |= 1;
            dVar2.mo58885m(btVar2, (C107542u) tVar.build());
            C87684al alVar = new C87684al(C88244um.OPA_SESSION_SERVICE_EVENT);
            alVar.mo81965b(C107505a.f299120a, (C107556e) dVar2.build());
            ((C107932g) ((C107833h) qVar.f300029h.mo27525b()).f300070f.mo27525b()).mo96337a(alVar.mo81964a());
            qVar.mo96305j(17);
        }
    }
}
