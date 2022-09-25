package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c.C119679g;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.d.h */
/* compiled from: PG */
public final /* synthetic */ class C119689h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119690i f333492a;

    /* renamed from: b */
    public final /* synthetic */ C119679g f333493b;

    /* renamed from: c */
    public final /* synthetic */ C70862aj f333494c;

    public /* synthetic */ C119689h(C119690i iVar, C119679g gVar, C70862aj ajVar) {
        this.f333492a = iVar;
        this.f333493b = gVar;
        this.f333494c = ajVar;
    }

    public final void run() {
        C119690i iVar = this.f333492a;
        C119679g gVar = this.f333493b;
        C70862aj ajVar = this.f333494c;
        C119692k kVar = iVar.f333495a;
        C32534ai aiVar = (C32534ai) kVar.f333502f.get(gVar.f333476a);
        if (aiVar == null) {
            C59104x c = C119692k.f333497a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ConvEngine.DynamicServices");
            ((C59052c) ((C59052c) c).mo56372aa(34555)).mo56389s("#fetch stream does not exist: %s", gVar.f333476a);
            ajVar.mo20122b(new IllegalArgumentException("Stream id not found: ".concat(String.valueOf(gVar.f333476a))));
            return;
        }
        C60870cx a = aiVar.mo38133a(new C119688g(kVar, ajVar));
        C119691j jVar = new C119691j(ajVar);
        C60856cj.m92911t(a, C47810es.m84974n(jVar), kVar.f333499c);
        C58976aa aaVar = C58975e.f156826a;
    }
}
