package com.google.android.apps.gsa.shared.monet;

import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87990lb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87991lc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;

/* renamed from: com.google.android.apps.gsa.shared.monet.o */
/* compiled from: PG */
public final /* synthetic */ class C90344o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C90347r f252296a;

    public /* synthetic */ C90344o(C90347r rVar) {
        this.f252296a = rVar;
    }

    public final void run() {
        C90347r rVar = this.f252296a;
        C87991lc lcVar = (C87991lc) C88012lx.f238010e.createBuilder();
        String str = rVar.f252311e.f252332a;
        lcVar.copyOnWrite();
        C88012lx lxVar = (C88012lx) lcVar.instance;
        str.getClass();
        lxVar.f238012a |= 512;
        lxVar.f238015d = str;
        C87990lb lbVar = C87990lb.f237959a;
        lcVar.copyOnWrite();
        C88012lx lxVar2 = (C88012lx) lcVar.instance;
        lbVar.getClass();
        lxVar2.f238014c = lbVar;
        lxVar2.f238013b = 9;
        C88489j jVar = new C88489j(C87739bu.MONET_CLIENT_EVENT);
        C87680ah ahVar = rVar.f252308b;
        jVar.mo82014b(C87987kz.f237952a, (C88012lx) lcVar.build());
        ahVar.mo81961c(jVar.mo82013a());
    }
}
