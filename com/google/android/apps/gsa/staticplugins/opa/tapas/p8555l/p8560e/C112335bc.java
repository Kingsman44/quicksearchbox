package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.research.p5181a.p5187e.C66361k;
import com.google.research.p5181a.p5187e.C66367q;
import com.google.research.p5181a.p5188f.C66376a;
import p3186j$.util.Collection;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.bc */
/* compiled from: PG */
public final /* synthetic */ class C112335bc implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112341bi f311717a;

    /* renamed from: b */
    public final /* synthetic */ C66376a f311718b;

    public /* synthetic */ C112335bc(C112341bi biVar, C66376a aVar) {
        this.f311717a = biVar;
        this.f311718b = aVar;
    }

    public final Object get() {
        C112341bi biVar = this.f311717a;
        C66376a aVar = this.f311718b;
        if (biVar.f180453g.size() == 1) {
            C66367q qVar = new C66367q();
            C66361k kVar = (C66361k) biVar.f180453g.get(0);
            if (!Thread.interrupted()) {
                C121537f fVar = C112341bi.f311728a;
                String e = kVar.mo59575e();
                Collection.EL.stream(((C66367q) fVar.mo105235d("predict_".concat(String.valueOf(e)), new C112333ba(kVar, aVar))).f180459b).limit((long) biVar.mo59598c(kVar).intValue()).forEach(new C112334bb(qVar));
            }
            return C60856cj.m92900i(qVar);
        }
        C66367q qVar2 = new C66367q();
        C58480gp e2 = C58485gu.m89837e();
        for (C66361k kVar2 : biVar.f180453g) {
            if (Thread.interrupted()) {
                return C60856cj.m92900i(qVar2);
            }
            e2.mo55395g(biVar.f311732e.mo28201a("predict", new C112338bf(biVar, kVar2, aVar)));
        }
        C58485gu f = e2.mo55394f();
        return C60856cj.m92894c(f).mo57334a(new C112339bg(qVar2, f), C60826bg.f164896a);
    }
}
