package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p787c.p790b.p793b.p794a.p795a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.assistant.auto.tng.common.p900c.C13221a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.p4456g.C57974a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.c.b.b.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C12376b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12379e f39206a;

    /* renamed from: b */
    public final /* synthetic */ C57974a f39207b;

    public /* synthetic */ C12376b(C12379e eVar, C57974a aVar) {
        this.f39206a = eVar;
        this.f39207b = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12379e eVar = this.f39206a;
        C57974a aVar = this.f39207b;
        if (eVar.f39214e) {
            return C118826c.f331423b;
        }
        for (C13221a a : eVar.f39211b) {
            C60870cx a2 = a.mo20001a();
            C12356a aVar2 = new C12356a(aVar);
            C60856cj.m92911t(a2, C47810es.m84974n(aVar2), eVar.f39212c);
            eVar.f39210a.add(a2);
        }
        return C47638k.m84750a(eVar.f39210a).mo51520a(new C12378d(eVar), eVar.f39212c);
    }
}
