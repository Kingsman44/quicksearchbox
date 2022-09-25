package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9334d;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.d.e */
/* compiled from: PG */
public final /* synthetic */ class C123887e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123904v f342204a;

    public /* synthetic */ C123887e(C123904v vVar) {
        this.f342204a = vVar;
    }

    public final C60870cx apply(Object obj) {
        C123904v vVar = this.f342204a;
        Set<AccountId> set = (Set) obj;
        if (set.isEmpty()) {
            C59104x b = C123904v.f342237a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "PCP.ReminderData");
            ((C59052c) ((C59052c) b).mo56372aa(35330)).mo56386p("accountId list is empty");
        }
        ArrayList arrayList = new ArrayList();
        for (AccountId accountId : set) {
            C60870cx b2 = vVar.f342240d.mo50215b(accountId);
            C123894l lVar = new C123894l(vVar, accountId);
            arrayList.add(C60922j.m93045h(b2, C47810es.m84966f(lVar), vVar.f342242f));
        }
        return C60856cj.m92894c(arrayList).mo57334a(C47810es.m84978r(C123900r.f342225a), C60826bg.f164896a);
    }
}
