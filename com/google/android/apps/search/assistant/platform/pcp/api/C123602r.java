package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124110ci;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124112ck;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124114cm;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.r */
/* compiled from: PG */
public final /* synthetic */ class C123602r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123604t f341504a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f341505b;

    public /* synthetic */ C123602r(C123604t tVar, C53306j jVar) {
        this.f341504a = tVar;
        this.f341505b = jVar;
    }

    public final C60870cx apply(Object obj) {
        C123604t tVar = this.f341504a;
        C53306j jVar = this.f341505b;
        Set<AccountId> set = (Set) obj;
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            return C60866ct.f164955a;
        }
        for (AccountId a : set) {
            C124114cm a2 = C124114cm.m203535a(tVar.f341513c, a);
            arrayList.add(C47633f.m84733g(C47633f.m84733g(a2.f342785a.mo106077d(jVar, C58485gu.m89846n(1), C123777f.f341922a)).mo51515h(new C124112ck(a2), a2.f342790f)).mo51516i(new C124110ci(a2, jVar), a2.f342790f));
        }
        return C60856cj.m92894c(arrayList).mo57335b(C47810es.m84965e(C123599o.f341501a), C60826bg.f164896a);
    }
}
