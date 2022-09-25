package com.google.android.apps.gsa.staticplugins.smartspace;

import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.smartspace.C92035ae;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.ab */
/* compiled from: PG */
public final /* synthetic */ class C117343ab implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C117350ai f325714a;

    /* renamed from: b */
    public final /* synthetic */ C92035ae f325715b;

    /* renamed from: c */
    public final /* synthetic */ long f325716c;

    /* renamed from: d */
    public final /* synthetic */ AccountId f325717d;

    /* renamed from: e */
    public final /* synthetic */ C58480gp f325718e;

    public /* synthetic */ C117343ab(C117350ai aiVar, C92035ae aeVar, long j, AccountId accountId, C58480gp gpVar) {
        this.f325714a = aiVar;
        this.f325715b = aeVar;
        this.f325716c = j;
        this.f325717d = accountId;
        this.f325718e = gpVar;
    }

    /* renamed from: a */
    public final void mo45928a(C42847bf bfVar) {
        C53245gt gtVar;
        C117350ai aiVar = this.f325714a;
        C92035ae aeVar = this.f325715b;
        long j = this.f325716c;
        AccountId accountId = this.f325717d;
        C58480gp gpVar = this.f325718e;
        C83738aj ajVar = aiVar.mo103270i(aeVar).f228233b;
        if (ajVar == null) {
            ajVar = C83738aj.f228226c;
        }
        if (ajVar.f228228a == 3) {
            gtVar = (C53245gt) ajVar.f228229b;
        } else {
            gtVar = C53245gt.f139564n;
        }
        bfVar.mo45931c("SharedProactiveData", C123611ad.m202943b(1, "weather_current", gtVar, aeVar.mo86688a(), new byte[0], j), 5);
        aiVar.f325767q.mo106284c(1);
        aiVar.f325768r.mo77192a(C118569b.PCP_SMARTSPACE_WEATHER_UPDATE, 1);
        aiVar.f325769s.mo106289b(1, aiVar.f325755c, accountId, "weather_current", gpVar, bfVar);
    }
}
