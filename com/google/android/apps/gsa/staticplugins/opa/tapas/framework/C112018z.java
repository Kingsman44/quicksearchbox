package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.C112976k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e.C112312ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112474as;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113164bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.function.Supplier;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.z */
/* compiled from: PG */
public final /* synthetic */ class C112018z implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111825ap f311192a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311193b;

    public /* synthetic */ C112018z(C111825ap apVar, C113405ep epVar) {
        this.f311192a = apVar;
        this.f311193b = epVar;
    }

    public final Object get() {
        C113405ep epVar;
        C111825ap apVar = this.f311192a;
        C113405ep epVar2 = this.f311193b;
        apVar.f310787u.mo99804e(epVar2.mo100016a(), C112976k.DATA_SOURCE_FETCH);
        C121492b a = C111825ap.f310762a.mo105233a("processRequestInternal");
        C60870cx b = ((C112474as) apVar.f310771e.mo27525b()).mo99548b(C113164bv.m187180a(epVar2.mo100022f().f53688p));
        C111811ab abVar = new C111811ab();
        C60856cj.m92911t(b, C47810es.m84974n(abVar), apVar.f310792z);
        C58485gu guVar = (C58485gu) C111825ap.f310762a.mo105235d("fetchForEachSource", new C112015w(apVar, epVar2, ((C111884bv) apVar.f310770d.mo27525b()).mo99271a(epVar2)));
        List list = (List) Collection.EL.stream(guVar).map(C112003k.f311156a).collect(Collectors.toList());
        if (apVar.f310769c.mo79746e(C90063do.f249374cN)) {
            C113404eo e = epVar2.mo100020e();
            e.mo100010j(((C112312ag) apVar.f310776j.mo27525b()).mo99494c(epVar2));
            epVar = e.mo100001a();
        } else {
            epVar = epVar2;
        }
        C111823an anVar = new C111823an(apVar, guVar, epVar, apVar.f310772f);
        long a2 = ((C111885bw) apVar.f310785s.mo27525b()).mo99273a(epVar2.mo100033p(), C111885bw.m185717c(epVar2));
        if (a2 < ((C111885bw) apVar.f310785s.mo27525b()).mo99274b(epVar2.mo100033p(), C111885bw.m185717c(epVar2))) {
            C22871g gVar = apVar.f310773g;
            Objects.requireNonNull(anVar);
            gVar.mo28213m("return TapasSuggestionResponse early after timeout", a2, new C112011s(anVar));
        }
        C90873ag agVar = new C90873ag(C60856cj.m92906o(list), apVar.f310773g, "load all results", new C112012t(apVar, epVar2, guVar, anVar, a));
        agVar.mo85224b(TimeoutException.class, new C112013u(apVar, epVar2, a));
        agVar.mo85223a(new C112014v(apVar, epVar2, a));
        return anVar;
    }
}
