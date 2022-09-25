package com.google.android.apps.search.podcasts.p10588n;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4082j.p4083a.C54300ad;
import com.google.p4017at.p4082j.p4083a.C54301ae;
import com.google.p4017at.p4082j.p4083a.C54362bo;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.podcasts.n.f */
/* compiled from: PG */
final class C140677f implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f382076a;

    /* renamed from: b */
    final /* synthetic */ C60870cx f382077b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f382078c;

    public C140677f(String str, C60870cx cxVar, C60870cx cxVar2) {
        this.f382076a = str;
        this.f382077b = cxVar;
        this.f382078c = cxVar2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C54300ad adVar = (C54300ad) C54301ae.f142657d.createBuilder();
        String str = this.f382076a;
        adVar.copyOnWrite();
        C54301ae aeVar = (C54301ae) adVar.instance;
        str.getClass();
        C62971cq cqVar = aeVar.f142659a;
        if (!cqVar.mo58948c()) {
            aeVar.f142659a = C62942bv.mutableCopy(cqVar);
        }
        aeVar.f142659a.add(str);
        boolean z = C60856cj.m92909r(this.f382077b) == C54362bo.DISABLE_PERSONALIZATION;
        adVar.copyOnWrite();
        ((C54301ae) adVar.instance).f142660b = z;
        Iterable iterable = (Iterable) C60856cj.m92909r(this.f382078c);
        adVar.copyOnWrite();
        C54301ae aeVar2 = (C54301ae) adVar.instance;
        C62971cq cqVar2 = aeVar2.f142661c;
        if (!cqVar2.mo58948c()) {
            aeVar2.f142661c = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll(iterable, (List) aeVar2.f142661c);
        return (C54301ae) adVar.build();
    }
}
