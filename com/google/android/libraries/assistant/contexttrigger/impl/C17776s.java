package com.google.android.libraries.assistant.contexttrigger.impl;

import androidx.core.content.C1882h;
import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.C17686e;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.android.libraries.search.location.p3029a.p3031b.C38608a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48916r;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4184bj.p4189b.C55893j;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.s */
/* compiled from: PG */
public final /* synthetic */ class C17776s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17755af f51036a;

    /* renamed from: b */
    public final /* synthetic */ C48917s f51037b;

    /* renamed from: c */
    public final /* synthetic */ C31520m f51038c;

    public /* synthetic */ C17776s(C17755af afVar, C48917s sVar, C31520m mVar) {
        this.f51036a = afVar;
        this.f51037b = sVar;
        this.f51038c = mVar;
    }

    public final C60870cx apply(Object obj) {
        String str;
        C60870cx cxVar;
        C17755af afVar = this.f51036a;
        C48917s sVar = this.f51037b;
        C31520m mVar = this.f51038c;
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
        C17686e eVar = (C17686e) C17693f.f50865e.createBuilder();
        eVar.copyOnWrite();
        C17693f fVar = (C17693f) eVar.instance;
        str.getClass();
        fVar.f50867a |= 1;
        fVar.f50868b = str;
        C48916r rVar = (C48916r) sVar.toBuilder();
        rVar.copyOnWrite();
        C48917s sVar2 = (C48917s) rVar.instance;
        uVar.getClass();
        sVar2.f126581b = uVar;
        sVar2.f126580a |= 1;
        C48917s sVar3 = (C48917s) rVar.build();
        eVar.copyOnWrite();
        C17693f fVar2 = (C17693f) eVar.instance;
        sVar3.getClass();
        fVar2.f50869c = sVar3;
        fVar2.f50867a |= 2;
        long b = afVar.f50991b.mo26870b();
        eVar.copyOnWrite();
        C17693f fVar3 = (C17693f) eVar.instance;
        fVar3.f50867a |= 4;
        fVar3.f50870d = b;
        C17693f fVar4 = (C17693f) eVar.build();
        try {
            C48917s sVar4 = fVar4.f50869c;
            if (sVar4 == null) {
                sVar4 = C48917s.f126578f;
            }
            C48919u uVar2 = sVar4.f126581b;
            if (uVar2 == null) {
                uVar2 = C48919u.f126586g;
            }
            C60870cx c = afVar.mo23458c(uVar2);
            C48917s sVar5 = fVar4.f50869c;
            if (sVar5 == null) {
                sVar5 = C48917s.f126578f;
            }
            C48952az azVar = sVar5.f126582c;
            if (azVar == null) {
                azVar = C48952az.f126657c;
            }
            C58833ax b2 = C17759c.m35027b(azVar).mo56106b(C17758b.f50999a);
            if (b2.mo56113h()) {
                C55893j jVar = (C55893j) b2.mo56107c();
                if (C17755af.m35018d(jVar)) {
                    if (C1882h.m5137c(afVar.f50995f, "android.permission.ACCESS_BACKGROUND_LOCATION") == -1) {
                        cxVar = C60856cj.m92899h(new UnsupportedOperationException("No background location access"));
                    } else if (C1882h.m5137c(afVar.f50995f, "android.permission.ACCESS_FINE_LOCATION") == -1) {
                        cxVar = C60856cj.m92899h(new UnsupportedOperationException("No location access"));
                    }
                    C60856cj.m92911t(cxVar, C47810es.m84974n(new C17753ad(str, mVar, sVar)), afVar.f50992c);
                    return C47633f.m84733g(cxVar).mo51513e(C38608a.class, C17780w.f51044a, afVar.f50992c).mo51513e(UnsupportedOperationException.class, C17781x.f51045a, afVar.f50992c);
                }
                cxVar = C47633f.m84733g(c).mo51516i(new C17777t(afVar, jVar, fVar4), afVar.f50992c);
                C60856cj.m92911t(cxVar, C47810es.m84974n(new C17753ad(str, mVar, sVar)), afVar.f50992c);
                return C47633f.m84733g(cxVar).mo51513e(C38608a.class, C17780w.f51044a, afVar.f50992c).mo51513e(UnsupportedOperationException.class, C17781x.f51045a, afVar.f50992c);
            }
            throw new IllegalArgumentException("ContextTriggerCondition conversion resulted in empty ContextFence.");
        } catch (RuntimeException e) {
            cxVar = C60856cj.m92899h(e);
        }
    }
}
