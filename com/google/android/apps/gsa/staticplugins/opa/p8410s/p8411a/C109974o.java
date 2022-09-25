package com.google.android.apps.gsa.staticplugins.opa.p8410s.p8411a;

import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87782dj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87783dk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87784dl;
import com.google.android.libraries.logging.C28294l;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62940bt;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.s.a.o */
/* compiled from: PG */
public final /* synthetic */ class C109974o implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C109975p f306427a;

    /* renamed from: b */
    public final /* synthetic */ C57696b f306428b;

    public /* synthetic */ C109974o(C109975p pVar, C57696b bVar) {
        this.f306427a = pVar;
        this.f306428b = bVar;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C109975p pVar = this.f306427a;
        C57696b bVar = this.f306428b;
        C88489j jVar = new C88489j(C87739bu.ELEMENTS_LOG_CLICK);
        C62940bt btVar = C87782dj.f237560a;
        C87783dk dkVar = (C87783dk) C87784dl.f237561d.createBuilder();
        C60214n nVar = bVar.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        String c = C28294l.m52913c(nVar);
        dkVar.copyOnWrite();
        C87784dl dlVar = (C87784dl) dkVar.instance;
        dlVar.f237563a |= 1;
        dlVar.f237564b = c;
        String str = bVar.f154148i;
        dkVar.copyOnWrite();
        C87784dl dlVar2 = (C87784dl) dkVar.instance;
        str.getClass();
        dlVar2.f237563a |= 2;
        dlVar2.f237565c = str;
        jVar.mo82014b(btVar, (C87784dl) dkVar.build());
        pVar.f306429a.mo81961c(jVar.mo82013a());
    }
}
