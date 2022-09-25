package com.google.android.libraries.assistant.contexttrigger.impl;

import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48915q;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.ab */
/* compiled from: PG */
public final /* synthetic */ class C17751ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17755af f50979a;

    /* renamed from: b */
    public final /* synthetic */ C31520m f50980b;

    /* renamed from: c */
    public final /* synthetic */ C48915q f50981c;

    public /* synthetic */ C17751ab(C17755af afVar, C31520m mVar, C48915q qVar) {
        this.f50979a = afVar;
        this.f50980b = mVar;
        this.f50981c = qVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C17755af afVar = this.f50979a;
        C31520m mVar = this.f50980b;
        C48915q qVar = this.f50981c;
        C48919u uVar = (C48919u) obj;
        C17658d dVar = afVar.f50996g;
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        if (dVar.mo23421a(a)) {
            str = uVar.f126591d;
        } else {
            str = C17757ah.m35025a(uVar);
        }
        C47633f i = C47633f.m84733g(afVar.mo23458c(uVar)).mo51516i(new C17752ac(afVar, uVar), afVar.f50992c);
        C17754ae aeVar = new C17754ae(str, mVar, qVar);
        C60856cj.m92911t(i, C47810es.m84974n(aeVar), afVar.f50992c);
        return i;
    }
}
