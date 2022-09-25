package com.google.android.libraries.assistant.auto.tng.common.p931p;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.p.a */
/* compiled from: PG */
public final /* synthetic */ class C13301a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C13307g f41013a;

    public /* synthetic */ C13301a(C13307g gVar) {
        this.f41013a = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C13307g gVar = this.f41013a;
        gVar.f41021a.mo20338d(gVar);
        C58485gu guVar = gVar.f41024d.f41026b;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C60870cx cxVar = gVar.f41022b;
            C13303c cVar = new C13303c(gVar, (C57981b) guVar.get(i));
            gVar.f41022b = C60922j.m93045h(cxVar, C47810es.m84966f(cVar), gVar.f41024d.f41028d);
        }
        C60870cx cxVar2 = gVar.f41022b;
        C13304d dVar = new C13304d(gVar);
        C60856cj.m92911t(cxVar2, C47810es.m84974n(dVar), gVar.f41024d.f41027c);
        return gVar.f41022b;
    }
}
