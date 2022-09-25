package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49792f;
import com.google.assistant.p4016z.C53692aq;
import com.google.assistant.p4016z.C53702b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.d */
/* compiled from: PG */
public final /* synthetic */ class C130774d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C130786p f357993a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f357994b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f357995c;

    public /* synthetic */ C130774d(C130786p pVar, C58485gu guVar, C58485gu guVar2) {
        this.f357993a = pVar;
        this.f357994b = guVar;
        this.f357995c = guVar2;
    }

    public final Object call() {
        C58485gu guVar;
        C58485gu guVar2;
        Object obj;
        C130786p pVar = this.f357993a;
        C58485gu guVar3 = this.f357994b;
        C58485gu guVar4 = this.f357995c;
        if (guVar3.size() != guVar4.size()) {
            ((C59052c) ((C59052c) C130786p.f358007a.mo56225c()).mo56372aa(38956)).mo56386p("Numbers of futures and places are not equal.");
            guVar = C58485gu.m89845m();
        } else {
            C58480gp e = C58485gu.m89837e();
            int size = guVar3.size();
            for (int i = 0; i < size; i++) {
                C58485gu m = C58485gu.m89845m();
                try {
                    m = (C58485gu) C60856cj.m92909r((Future) guVar4.get(i));
                } catch (ExecutionException e2) {
                    ((C59052c) ((C59052c) ((C59052c) C130786p.f358007a.mo56226d()).mo56382g(e2)).mo56372aa(38955)).mo56386p("Error getting personalized app suggestions.");
                }
                C53702b bVar = ((C53692aq) guVar3.get(i)).f140946h;
                if (bVar == null) {
                    bVar = C53702b.f140971f;
                }
                Optional findFirst = Collection.EL.stream(bVar.f140976d).map(C130777g.f357998a).findFirst();
                C53702b bVar2 = ((C53692aq) guVar3.get(i)).f140946h;
                if (bVar2 == null) {
                    bVar2 = C53702b.f140971f;
                }
                C49792f fVar = bVar2.f140975c;
                if (fVar == null) {
                    fVar = C49792f.f128579b;
                }
                if (!pVar.f358010d) {
                    guVar2 = C58485gu.m89845m();
                } else if (fVar.f128581a.size() > 0) {
                    ((C59052c) ((C59052c) C130786p.f358007a.mo56226d()).mo56372aa(38957)).mo56386p("Apps per location shouldn't be propagated as this data are not being built. If you see this error message there is some bug in data build or propagation pipeline.");
                    guVar2 = C58485gu.m89845m();
                } else {
                    guVar2 = C130786p.m213159b(C58485gu.m89847o(C130786p.m213160c(fVar, 2), (C58485gu) findFirst.map(C130775e.f357996a).orElseGet(C130776f.f357997a)));
                }
                C58485gu b = C130786p.m213159b(C58485gu.m89847o(m, guVar2));
                if (!pVar.f358010d) {
                    obj = Collection.EL.stream(b).map(C130783m.f358004a).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C130778h.f357999a))).collect(C58370cn.f155946a);
                } else {
                    obj = Collection.EL.stream(b).map(C130784n.f358005a).sorted(Comparator.EL.reversed(Comparator.CC.comparingDouble(C130778h.f357999a))).collect(C58370cn.f155946a);
                }
                e.mo55395g((C58485gu) obj);
            }
            guVar = C130786p.m213159b(e.mo55394f());
        }
        return (C58485gu) Collection.EL.stream(guVar).filter(C130785o.f358006a).collect(C58370cn.f155946a);
    }
}
