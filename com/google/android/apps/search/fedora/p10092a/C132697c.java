package com.google.android.apps.search.fedora.p10092a;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.fedora.a.c */
/* compiled from: PG */
public final /* synthetic */ class C132697c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C132699e f362105a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f362106b;

    public /* synthetic */ C132697c(C132699e eVar, AccountId accountId) {
        this.f362105a = eVar;
        this.f362106b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C132699e eVar = this.f362105a;
        AccountId accountId = this.f362106b;
        if (!((Boolean) obj).booleanValue()) {
            C59104x d = C132699e.f362111a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FedoraAccountEligibility");
            ((C59052c) ((C59052c) d).mo56372aa(39798)).mo56386p("Account is not a valid Gcore Account, ineligible for FL.");
            return C60856cj.m92900i(Boolean.FALSE);
        }
        C132695a aVar = new C132695a(eVar, accountId);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(aVar), eVar.f362113c));
    }
}
