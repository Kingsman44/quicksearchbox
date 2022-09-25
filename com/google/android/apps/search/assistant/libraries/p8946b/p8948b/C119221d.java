package com.google.android.apps.search.assistant.libraries.p8946b.p8948b;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.b.d */
/* compiled from: PG */
public final /* synthetic */ class C119221d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C119223f f332486a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f332487b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f332488c;

    public /* synthetic */ C119221d(C119223f fVar, C65753ak akVar, C60870cx cxVar) {
        this.f332486a = fVar;
        this.f332487b = akVar;
        this.f332488c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C119223f fVar = this.f332486a;
        C65753ak akVar = this.f332487b;
        C60870cx cxVar = this.f332488c;
        if (!((Boolean) obj).booleanValue()) {
            akVar.name();
            return fVar.mo104248a(akVar);
        }
        C60870cx b = fVar.f332492b.mo50215b(fVar.f332495e);
        return C47638k.m84753d(b, cxVar).mo51521b(new C119219b(fVar, b, akVar, cxVar), fVar.f332491a);
    }
}
