package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.staticplugins.p7666ci.C97764ae;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.u */
/* compiled from: PG */
public final /* synthetic */ class C97849u implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C97764ae f273239a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f273240b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f273241c;

    public /* synthetic */ C97849u(C97764ae aeVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f273239a = aeVar;
        this.f273240b = cxVar;
        this.f273241c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C97764ae aeVar = this.f273239a;
        C60870cx cxVar = this.f273240b;
        C60870cx cxVar2 = this.f273241c;
        ArrayList arrayList = new ArrayList();
        for (AccountId a : (Set) C60856cj.m92909r(cxVar)) {
            C58976aa aaVar = C58975e.f156826a;
            arrayList.add(C47633f.m84733g(((C97764ae.C97765a) C47245e.m84045a(aeVar.f272972b, C97764ae.C97765a.class, a)).mo90809Z().mo106229b(C53306j.ALL_PCP_CLIENTS, (C123755bv) C60856cj.m92909r(cxVar2), Optional.empty(), false, C123777f.f341922a)).mo51516i(C97852x.f273251a, aeVar.f272974d));
        }
        return C47638k.m84750a(arrayList).mo51520a(C97853y.f273252a, aeVar.f272974d);
    }
}
