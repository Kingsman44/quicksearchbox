package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.ap */
/* compiled from: PG */
public final /* synthetic */ class C123843ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123853az f342114a;

    /* renamed from: b */
    public final /* synthetic */ String f342115b;

    public /* synthetic */ C123843ap(C123853az azVar, String str) {
        this.f342114a = azVar;
        this.f342115b = str;
    }

    public final C60870cx apply(Object obj) {
        C123853az azVar = this.f342114a;
        String str = this.f342115b;
        ((C58970a) ((C58970a) ((C58970a) azVar.f342134e.mo56225c()).mo56382g((Exception) obj)).mo56372aa(35292)).mo56386p("Failed to fetch calendar data, enqueuing the worker again.");
        return C47638k.m84753d(azVar.mo106147d(str)).mo51520a(C123848au.f342121a, azVar.f342131b);
    }
}
