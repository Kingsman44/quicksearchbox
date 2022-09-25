package com.google.android.libraries.lens.ondevice;

import com.google.android.libraries.lens.ondevice.p2031h.C24519o;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24805p;
import com.google.android.libraries.lens.ondevice.p2037n.C24808s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.lens.p4701g.C62331d;

/* renamed from: com.google.android.libraries.lens.ondevice.j */
/* compiled from: PG */
public final /* synthetic */ class C24532j implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C24823o f67196a;

    /* renamed from: b */
    public final /* synthetic */ C62331d f67197b;

    /* renamed from: c */
    public final /* synthetic */ C24795f f67198c;

    public /* synthetic */ C24532j(C24823o oVar, C62331d dVar, C24795f fVar) {
        this.f67196a = oVar;
        this.f67197b = dVar;
        this.f67198c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C24823o oVar = this.f67196a;
        C62331d dVar = this.f67197b;
        C24795f fVar = this.f67198c;
        ((C58970a) ((C58970a) C24823o.f67844a.mo56224b()).mo56372aa(48755)).mo56389s("Loading cascade %s", dVar);
        oVar.f67846c.mo29947f(C24805p.ENGINE_INIT_START, (C24808s) null);
        oVar.f67850g = oVar.f67845b.mo29932a(dVar);
        C24519o oVar2 = oVar.f67850g;
        oVar2.getClass();
        C60870cx a = oVar2.mo29929a(fVar);
        C24766n nVar = new C24766n(oVar);
        C60856cj.m92911t(a, C47810es.m84974n(nVar), C60826bg.f164896a);
        return a;
    }
}
