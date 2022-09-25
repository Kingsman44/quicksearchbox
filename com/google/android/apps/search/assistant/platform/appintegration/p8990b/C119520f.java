package com.google.android.apps.search.assistant.platform.appintegration.p8990b;

import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17853c;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17855e;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17857g;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17858h;
import com.google.android.libraries.assistant.p1467d.p1472c.p1474b.p1475a.C17859i;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17909k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.b.f */
/* compiled from: PG */
public final class C119520f implements C119516b {

    /* renamed from: a */
    public static final C59071e f333135a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.b.f");

    /* renamed from: b */
    private final C17855e f333136b;

    /* renamed from: c */
    private final C17853c f333137c;

    /* renamed from: d */
    private final C60887da f333138d;

    public C119520f(C17855e eVar, C17853c cVar, C60887da daVar) {
        this.f333136b = eVar;
        this.f333137c = cVar;
        this.f333138d = daVar;
    }

    /* renamed from: a */
    public final C70862aj mo104414a(C70862aj ajVar) {
        C17855e eVar = this.f333136b;
        return C70876o.m103761b(eVar.f189039a.mo39510a(C17857g.m35098a(), eVar.f189040b), ajVar, false);
    }

    /* renamed from: b */
    public final void mo104415b(C17909k kVar) {
        ((C59052c) ((C59052c) f333135a.mo56224b()).mo56372aa(34433)).mo56389s("#send: %s", kVar);
        C17858h hVar = (C17858h) C17859i.f51186c.createBuilder();
        hVar.copyOnWrite();
        C17859i iVar = (C17859i) hVar.instance;
        kVar.getClass();
        iVar.f51189b = kVar;
        iVar.f51188a |= 1;
        C17853c cVar = this.f333137c;
        C60856cj.m92911t(C70876o.m103760a(cVar.f189039a.mo39510a(C17857g.m35099b(), cVar.f189040b), (C17859i) hVar.build()), C47810es.m84974n(new C119519e()), this.f333138d);
    }
}
