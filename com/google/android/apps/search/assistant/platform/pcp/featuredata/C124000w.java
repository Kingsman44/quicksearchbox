package com.google.android.apps.search.assistant.platform.pcp.featuredata;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123714ah;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3897e.p3921j.abe;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.w */
/* compiled from: PG */
public final /* synthetic */ class C124000w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124003z f342485a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f342486b;

    /* renamed from: c */
    public final /* synthetic */ abe f342487c;

    /* renamed from: d */
    public final /* synthetic */ C123714ah f342488d;

    /* renamed from: e */
    public final /* synthetic */ String f342489e;

    public /* synthetic */ C124000w(C124003z zVar, AccountId accountId, abe abe, C123714ah ahVar, String str) {
        this.f342485a = zVar;
        this.f342486b = accountId;
        this.f342487c = abe;
        this.f342488d = ahVar;
        this.f342489e = str;
    }

    public final C60870cx apply(Object obj) {
        C124003z zVar = this.f342485a;
        AccountId accountId = this.f342486b;
        abe abe = this.f342487c;
        C123714ah ahVar = this.f342488d;
        String str = this.f342489e;
        if (((Boolean) obj).booleanValue()) {
            return zVar.mo106227b(accountId, abe, ahVar, str);
        }
        ((C58970a) ((C58970a) zVar.f342497c.mo56224b()).mo56372aa(35212)).mo56386p("Skip hotel check out data because location history is not enabled.");
        return C60866ct.f164955a;
    }
}
