package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54304ah;
import com.google.p4017at.p4082j.p4083a.C54305ai;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.n.g */
/* compiled from: PG */
final class C140678g implements Callable {

    /* renamed from: a */
    final /* synthetic */ C60870cx f382079a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382080b;

    public C140678g(C60870cx cxVar, C60870cx cxVar2) {
        this.f382079a = cxVar;
        this.f382080b = cxVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C54304ah ahVar = (C54304ah) C54305ai.f142667c.createBuilder();
        boolean z = C60856cj.m92909r(this.f382079a) == C54362bo.DISABLE_PERSONALIZATION;
        ahVar.copyOnWrite();
        ((C54305ai) ahVar.instance).f142669a = z;
        Iterable iterable = (Iterable) C60856cj.m92909r(this.f382080b);
        ahVar.copyOnWrite();
        C54305ai aiVar = (C54305ai) ahVar.instance;
        C62971cq cqVar = aiVar.f142670b;
        if (!cqVar.mo58948c()) {
            aiVar.f142670b = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) aiVar.f142670b);
        return (C54305ai) ahVar.build();
    }
}
