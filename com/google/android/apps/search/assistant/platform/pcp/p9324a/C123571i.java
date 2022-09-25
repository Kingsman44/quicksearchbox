package com.google.android.apps.search.assistant.platform.pcp.p9324a;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.platform.pcp.p9337g.C124013j;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.p4750c.C62948a;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.a.i */
/* compiled from: PG */
public final /* synthetic */ class C123571i implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123576n f341446a;

    public /* synthetic */ C123571i(C123576n nVar) {
        this.f341446a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C123576n nVar = this.f341446a;
        Set<AccountId> set = (Set) obj;
        if (set.isEmpty()) {
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) nVar.f341460j.mo56224b()).mo56372aa(35163)).mo56386p("PcpDailySynclet start sync.");
        ArrayList arrayList = new ArrayList();
        for (AccountId a : set) {
            arrayList.add(C123624c.m202992a(nVar.f341452b, a).f341550b.mo45938b(new C123567e(nVar.f341456f.mo26870b() - C62948a.m95453d(nVar.f341455e))));
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        if (nVar.f341462l) {
            AccountId accountId = (AccountId) set.iterator().next();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(C47633f.m84733g(nVar.f341457g.mo106145a()).mo51516i(new C123570h(nVar), nVar.f341454d));
            arrayList2.add(C47638k.m84751b(C47638k.m84751b(nVar.f341461k.mo29165e(new C123565c(nVar), C123576n.f341451a.f169860a, TimeUnit.SECONDS)).mo51521b(new C123566d(nVar, accountId), nVar.f341454d)).mo51521b(new C123569g(nVar, accountId), nVar.f341454d));
            C60870cx a2 = nVar.f341459i.mo106152a();
            C123573k kVar = new C123573k(nVar);
            C60856cj.m92911t(a2, C47810es.m84974n(kVar), C60826bg.f164896a);
            arrayList2.add(C47638k.m84751b(a2).mo51520a(C123572j.f341447a, nVar.f341454d));
            cxVar = C60856cj.m92906o(arrayList2);
        } else {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        }
        if (nVar.f341463m) {
            ArrayList arrayList3 = new ArrayList();
            for (AccountId accountId2 : set) {
                arrayList3.add(C47633f.m84733g(nVar.f341453c.mo50246c(accountId2)).mo51516i(new C123564b(((C124013j.C124014a) C47245e.m84045a(nVar.f341452b, C124013j.C124014a.class, accountId2)).mo106230Z()), C60826bg.f164896a));
            }
            cxVar2 = C60856cj.m92906o(arrayList3);
        } else {
            cxVar2 = C60856cj.m92900i(C58485gu.m89845m());
        }
        return C47638k.m84751b(C60856cj.m92907p(o), C60856cj.m92907p(cxVar), C60856cj.m92907p(cxVar2)).mo51520a(C123568f.f341442a, C60826bg.f164896a);
    }
}
