package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97888an;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97889ao;
import com.google.android.apps.search.podcasts.p10550b.p10554d.C140055e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.search.podcasts.b.g.ae */
/* compiled from: PG */
final class C140129ae {

    /* renamed from: a */
    public final C21370a f380774a;

    /* renamed from: b */
    public final C60870cx f380775b;

    /* renamed from: c */
    public final C60870cx f380776c;

    public C140129ae(C140055e eVar, C60870cx cxVar, C21370a aVar) {
        this.f380774a = aVar;
        this.f380775b = cxVar;
        C140126ab abVar = new C140126ab(eVar);
        this.f380776c = C60922j.m93044g(cxVar, C47810es.m84963c(abVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final void mo115466a(C140131ag agVar) {
        C140160x xVar = agVar.f380780c;
        C97888an anVar = (C97888an) C97889ao.f273319d.createBuilder();
        Collection values = xVar.f380824a.values();
        anVar.copyOnWrite();
        C97889ao aoVar = (C97889ao) anVar.instance;
        C62971cq cqVar = aoVar.f273321a;
        if (!cqVar.mo58948c()) {
            aoVar.f273321a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) values, (List) aoVar.f273321a);
        ArrayList arrayList = xVar.f380825b;
        anVar.copyOnWrite();
        C97889ao aoVar2 = (C97889ao) anVar.instance;
        C62971cq cqVar2 = aoVar2.f273322b;
        if (!cqVar2.mo58948c()) {
            aoVar2.f273322b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll((Iterable) arrayList, (List) aoVar2.f273322b);
        ArrayDeque arrayDeque = agVar.f380781d;
        anVar.copyOnWrite();
        C97889ao aoVar3 = (C97889ao) anVar.instance;
        C62971cq cqVar3 = aoVar3.f273323c;
        if (!cqVar3.mo58948c()) {
            aoVar3.f273323c = C62942bv.mutableCopy(cqVar3);
        }
        C62947c.addAll((Iterable) arrayDeque, (List) aoVar3.f273323c);
        C46459k.m82829b(C47633f.m84733g(this.f380776c).mo51516i(new C140161y((C97889ao) anVar.build()), C60826bg.f164896a), "saveToLocalStorage failed", new Object[0]);
    }
}
