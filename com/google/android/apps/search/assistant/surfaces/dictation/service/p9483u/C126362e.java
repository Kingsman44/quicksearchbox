package com.google.android.apps.search.assistant.surfaces.dictation.service.p9483u;

import com.google.android.apps.gsa.binaries.satin.app.asb;
import com.google.apps.tiktok.experiments.C46897i;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4523c.C58917a;
import com.google.common.p4523c.C58920ac;
import com.google.common.p4523c.C58929d;
import com.google.common.p4523c.C58935j;
import com.google.common.p4523c.C58936k;
import com.google.common.p4523c.C58937l;
import com.google.common.p4575r.C60755l;
import com.google.protos.p4985f.p4986a.C64692bs;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.u.e */
/* compiled from: PG */
public final /* synthetic */ class C126362e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C126366i f348055a;

    public /* synthetic */ C126362e(C126366i iVar) {
        this.f348055a = iVar;
    }

    public final Object apply(Object obj) {
        C126366i iVar = this.f348055a;
        C58485gu guVar = (C58485gu) obj;
        if (guVar.isEmpty()) {
            return Optional.empty();
        }
        C64692bs bsVar = (C64692bs) guVar.get(0);
        bsVar.f175356b.size();
        C58936k kVar = C58929d.f156773b;
        C58485gu<Object> i = C58485gu.m89841i((Iterable) Collection.EL.stream(bsVar.f175356b).flatMap(C126364g.f348057a).collect(C58370cn.f155946a));
        C58920ac a = kVar.f156778a.mo56209a(i);
        C58480gp e = C58485gu.m89837e();
        for (Object b : i) {
            e.mo55395g(a.mo56201b(b));
        }
        C58485gu f = e.mo55394f();
        C58935j jVar = kVar.f156779b;
        int a2 = a.mo56199a();
        C58480gp e2 = C58485gu.m89837e();
        int i2 = ((C58724pq) f).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            e2.mo55395g(jVar.mo56207a((C60755l) f.get(i3), a2));
        }
        C58937l lVar = new C58937l(a, new C58917a(e2.mo55394f()), i);
        asb asb = iVar.f348061c;
        return Optional.m71637of(new C126358a(lVar, ((C46897i) asb.f201451a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45363201").mo50902a(), ((C46897i) asb.f201451a.a.d.f201488a.a.f202914g.mo17428b()).mo50901a("com.google.android.apps.search.assistant.device 45363202").mo50903b()));
    }
}
