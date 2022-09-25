package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90065dq;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.aq */
/* compiled from: PG */
public final /* synthetic */ class C102555aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C102560av f286236a;

    /* renamed from: b */
    public final /* synthetic */ Query f286237b;

    public /* synthetic */ C102555aq(C102560av avVar, Query query) {
        this.f286236a = avVar;
        this.f286237b = query;
    }

    public final C60870cx apply(Object obj) {
        C102560av avVar = this.f286236a;
        Query query = this.f286237b;
        C58833ax axVar = (C58833ax) obj;
        boolean c = (!((C86124t) avVar.f286246b.mo27525b()).mo79746e(C90065dq.f249655b) || ((C84486a) avVar.f286251g.mo27525b()).mo78207n()) & (true ^ ((C84516aa) avVar.f286249e.mo27525b()).mo78229c());
        if (!((C86124t) avVar.f286246b.mo27525b()).mo79746e(C90065dq.f249654a) || !c) {
            return C60856cj.m92900i(axVar);
        }
        return C47633f.m84733g(avVar.f286250f.mo79697b()).mo51516i(new C102554ap(avVar, axVar, query), avVar.f286247c);
    }
}
