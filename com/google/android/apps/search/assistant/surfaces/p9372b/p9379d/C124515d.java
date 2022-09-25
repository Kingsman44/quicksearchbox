package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119845cm;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119850cr;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119861db;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124381a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62912at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.d */
/* compiled from: PG */
final class C124515d implements C124381a {

    /* renamed from: a */
    final /* synthetic */ C124516e f343579a;

    /* renamed from: b */
    private final C119748c f343580b;

    public C124515d(C124516e eVar, C119748c cVar) {
        this.f343579a = eVar;
        this.f343580b = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo106404a() {
        C58976aa aaVar = C58975e.f156826a;
        C119748c cVar = this.f343580b;
        C119845cm cmVar = (C119845cm) C119851cs.f333803i.createBuilder();
        C34053bp a = C34708c.m63442a("nga");
        cmVar.copyOnWrite();
        C119851cs csVar = (C119851cs) cmVar.instance;
        a.getClass();
        csVar.f333808d = a;
        csVar.f333805a |= 1;
        C119850cr crVar = C119850cr.f333797d;
        cmVar.copyOnWrite();
        C119851cs csVar2 = (C119851cs) cmVar.instance;
        crVar.getClass();
        csVar2.f333807c = crVar;
        csVar2.f333806b = 2;
        return C60922j.m93045h(cVar.mo104498a((C119851cs) cmVar.build()), C47810es.m84966f(new C124514c(this)), this.f343579a.f343581a);
    }

    /* renamed from: b */
    public final C60870cx mo106405b() {
        C119861db dbVar = (C119861db) C119863dd.f333821c.createBuilder();
        C62912at atVar = C62912at.f169862a;
        dbVar.copyOnWrite();
        C119863dd ddVar = (C119863dd) dbVar.instance;
        atVar.getClass();
        ddVar.f333824b = atVar;
        ddVar.f333823a = 1;
        C60870cx b = this.f343580b.mo104499b((C119863dd) dbVar.build());
        C124502b bVar = new C124502b(this);
        return C60922j.m93045h(b, C47810es.m84966f(bVar), this.f343579a.f343581a);
    }

    public final void close() {
        this.f343580b.mo104501d();
        this.f343579a.f343583c = null;
    }
}
