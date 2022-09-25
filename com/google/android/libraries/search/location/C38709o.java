package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.location.o */
/* compiled from: PG */
public final /* synthetic */ class C38709o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102211a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102212b;

    /* renamed from: c */
    public final /* synthetic */ C39226b f102213c;

    public /* synthetic */ C38709o(C38712r rVar, C144889at atVar, C39226b bVar) {
        this.f102211a = rVar;
        this.f102212b = atVar;
        this.f102213c = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C38712r rVar = this.f102211a;
        C144889at atVar = this.f102212b;
        C39226b bVar = this.f102213c;
        if (!rVar.f102225e.containsKey(atVar)) {
            return C60866ct.f164955a;
        }
        C60870cx b = C43205e.m76192b(rVar.f102228h.mo41528b(bVar).mo120478d((C144889at) rVar.f102225e.get(atVar)));
        C38691ai.m67970a(b, new C38702h(rVar, atVar));
        return b;
    }
}
