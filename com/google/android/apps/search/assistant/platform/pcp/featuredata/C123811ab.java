package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.ab */
/* compiled from: PG */
public final /* synthetic */ class C123811ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123819aj f342033a;

    /* renamed from: b */
    public final /* synthetic */ MessageLite f342034b;

    public /* synthetic */ C123811ab(C123819aj ajVar, MessageLite messageLite) {
        this.f342033a = ajVar;
        this.f342034b = messageLite;
    }

    public final C60870cx apply(Object obj) {
        C123819aj ajVar = this.f342033a;
        MessageLite messageLite = this.f342034b;
        Set<AccountId> set = (Set) obj;
        if (set.isEmpty()) {
            C59104x b = C123819aj.f342047a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.TipsDataController");
            ((C59052c) ((C59052c) b).mo56372aa(35243)).mo56386p("accountIds is empty");
            return C60866ct.f164955a;
        }
        ArrayList arrayList = new ArrayList();
        for (AccountId accountId : set) {
            C123623b a = C123624c.m202992a(ajVar.f342050d, accountId);
            long b2 = ajVar.f342053g.mo26870b();
            C58480gp e = C58485gu.m89837e();
            C60870cx b3 = a.f341550b.mo45938b(new C123812ac(ajVar, messageLite, b2, accountId, e));
            C123813ad adVar = new C123813ad(e);
            arrayList.add(C60922j.m93044g(b3, C47810es.m84963c(adVar), C60826bg.f164896a));
        }
        return C47638k.m84752c(arrayList).mo51521b(new C123814ae(ajVar, arrayList), ajVar.f342049c);
    }
}
