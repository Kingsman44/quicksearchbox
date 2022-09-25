package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.nga.api.a.ay;
import com.google.android.apps.gsa.nga.api.a.be;
import com.google.android.apps.gsa.nga.api.a.bf;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107555d;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107523b;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107536o;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107537p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C107812i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107820q f299990a;

    /* renamed from: b */
    public final /* synthetic */ bf f299991b;

    public /* synthetic */ C107812i(C107820q qVar, bf bfVar) {
        this.f299990a = qVar;
        this.f299991b = bfVar;
    }

    public final void run() {
        C107820q qVar = this.f299990a;
        bf bfVar = this.f299991b;
        if (bfVar.d == ((bf) ((C83361k) qVar.f300033l.f296619a).f227199b.get()).d) {
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
            C107537p pVar = (C107537p) oVar.instance;
            pVar.f299183b = a2.d;
            pVar.f299182a |= 1;
            dVar.mo58885m(btVar, (C107537p) oVar.build());
            qVar.mo96303h((C107556e) dVar.build());
        }
    }
}
