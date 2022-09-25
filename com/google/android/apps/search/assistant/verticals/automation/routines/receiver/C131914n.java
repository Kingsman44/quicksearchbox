package com.google.android.apps.search.assistant.verticals.automation.routines.receiver;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3861at.afy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.receiver.n */
/* compiled from: PG */
public final /* synthetic */ class C131914n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C131921u f360192a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f360193b;

    public /* synthetic */ C131914n(C131921u uVar, AccountId accountId) {
        this.f360192a = uVar;
        this.f360193b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C131921u uVar = this.f360192a;
        AccountId accountId = this.f360193b;
        afy afy = (afy) obj;
        if (afy.f129191b.isEmpty()) {
            C59104x c = C131921u.f360205a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RoutineGeofenceListener");
            ((C59052c) ((C59052c) c).mo56372aa(39464)).mo56386p("Skipping Routine execution");
            return C60856cj.m92900i(false);
        }
        C131917q qVar = new C131917q(uVar, accountId, afy);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(qVar), uVar.f360209e)).mo51515h(C131918r.f360202a, uVar.f360209e).mo51513e(Throwable.class, C131919s.f360203a, uVar.f360209e);
    }
}
