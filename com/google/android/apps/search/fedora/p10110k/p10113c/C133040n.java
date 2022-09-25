package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19417u;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.fedora.k.c.n */
/* compiled from: PG */
public final /* synthetic */ class C133040n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133046t f362766a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362767b;

    public /* synthetic */ C133040n(C133046t tVar, boolean z) {
        this.f362766a = tVar;
        this.f362767b = z;
    }

    public final C60870cx apply(Object obj) {
        C133046t tVar = this.f362766a;
        boolean z = this.f362767b;
        Void voidR = (Void) obj;
        C59104x b = C133046t.f362774a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b).mo56372aa(39988)).mo56386p("Processing FedoraTngLcTrainerOptionsProviders...");
        C47633f g = C47633f.m84733g(C60866ct.f164955a);
        ArrayList arrayList = new ArrayList();
        for (C19417u uVar : tVar.f362777d) {
            C47633f i = g.mo51516i(new C133032f(uVar), tVar.f362778e).mo51516i(new C133033g(tVar, z, uVar), tVar.f362778e);
            arrayList.add(i);
            g = i.mo51514f(Throwable.class, C133034h.f362759a, tVar.f362778e);
        }
        return C47638k.m84752c(arrayList).mo51521b(C133035i.f362760a, tVar.f362778e);
    }
}
