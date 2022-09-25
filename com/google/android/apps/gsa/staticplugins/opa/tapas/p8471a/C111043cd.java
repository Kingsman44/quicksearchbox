package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48644e;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48645f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.cd */
/* compiled from: PG */
public final /* synthetic */ class C111043cd implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C111053cn f309246a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f309247b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f309248c;

    public /* synthetic */ C111043cd(C111053cn cnVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f309246a = cnVar;
        this.f309247b = cxVar;
        this.f309248c = cxVar2;
    }

    public final Object call() {
        C111053cn cnVar = this.f309246a;
        C60870cx cxVar = this.f309247b;
        C60870cx cxVar2 = this.f309248c;
        List list = (List) C60856cj.m92909r(cxVar);
        C58485gu guVar = (C58485gu) Collection.EL.stream(list).filter(C111046cg.f309252a).map(C111047ch.f309253a).collect(C58370cn.f155946a);
        cnVar.f309267e.mo99076a(C111255r.SIGNAL_MANAGER, String.format("App actions fetcher, fetched %d total app actions from Geller, of which %d app actions are valid", new Object[]{Integer.valueOf(list.size()), Integer.valueOf(guVar.size())}));
        C48644e eVar = (C48644e) C48645f.f125726c.createBuilder();
        eVar.copyOnWrite();
        C48645f fVar = (C48645f) eVar.instance;
        C62971cq cqVar = fVar.f125728a;
        if (!cqVar.mo58948c()) {
            fVar.f125728a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) fVar.f125728a);
        Iterable iterable = (Iterable) C60856cj.m92909r(cxVar2);
        eVar.copyOnWrite();
        C48645f fVar2 = (C48645f) eVar.instance;
        C62971cq cqVar2 = fVar2.f125729b;
        if (!cqVar2.mo58948c()) {
            fVar2.f125729b = C62942bv.mutableCopy(cqVar2);
        }
        C62947c.addAll(iterable, (List) fVar2.f125729b);
        return (C48645f) eVar.build();
    }
}
