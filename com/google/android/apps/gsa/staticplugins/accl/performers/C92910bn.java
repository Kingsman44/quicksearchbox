package com.google.android.apps.gsa.staticplugins.accl.performers;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.p3926e.C51968fu;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.bn */
/* compiled from: PG */
public final /* synthetic */ class C92910bn implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C92915bs f259198a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f259199b;

    /* renamed from: c */
    public final /* synthetic */ String f259200c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f259201d;

    /* renamed from: e */
    public final /* synthetic */ C51971fx f259202e;

    public /* synthetic */ C92910bn(C92915bs bsVar, C60870cx cxVar, String str, C60870cx cxVar2, C51971fx fxVar) {
        this.f259198a = bsVar;
        this.f259199b = cxVar;
        this.f259200c = str;
        this.f259201d = cxVar2;
        this.f259202e = fxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C92915bs bsVar = this.f259198a;
        C60870cx cxVar = this.f259199b;
        String str = this.f259200c;
        C60870cx cxVar2 = this.f259201d;
        C51971fx fxVar = this.f259202e;
        AccountId accountId = (AccountId) C60856cj.m92909r(cxVar);
        C58833ax axVar = (C58833ax) C60856cj.m92909r(cxVar2);
        C51968fu fuVar = fxVar.f136384c;
        if (fuVar == null) {
            fuVar = C51968fu.f136374d;
        }
        C63088z zVar = fuVar.f136377b;
        C51968fu fuVar2 = fxVar.f136385d;
        if (fuVar2 == null) {
            fuVar2 = C51968fu.f136374d;
        }
        return C47633f.m84733g((C60870cx) axVar.mo56106b(C92905bi.f259187a).mo56109e(C60856cj.m92900i(C58836b.f156633a))).mo51513e(Exception.class, C92906bj.f259188a, bsVar.f259222i).mo51516i(new C92907bk(bsVar, accountId, str, zVar, fuVar2.f136377b), bsVar.f259222i);
    }
}
