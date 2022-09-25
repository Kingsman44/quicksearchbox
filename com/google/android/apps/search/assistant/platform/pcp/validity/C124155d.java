package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.apps.tiktok.account.AccountId;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.d */
/* compiled from: PG */
public final /* synthetic */ class C124155d implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342866a;

    /* renamed from: b */
    public final /* synthetic */ Optional f342867b;

    /* renamed from: c */
    public final /* synthetic */ C124169r f342868c;

    /* renamed from: d */
    public final /* synthetic */ boolean f342869d;

    public /* synthetic */ C124155d(C124166o oVar, Optional optional, C124169r rVar, boolean z) {
        this.f342866a = oVar;
        this.f342867b = optional;
        this.f342868c = rVar;
        this.f342869d = z;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124166o oVar = this.f342866a;
        Optional optional = this.f342867b;
        C124169r rVar = this.f342868c;
        boolean z = this.f342869d;
        C123623b a = C123624c.m202992a(oVar.f342896b, (AccountId) optional.get());
        return a.f341552d.mo106068l(a.f341550b, C53306j.m86809a(rVar.mo106298a()), rVar.mo106299b(), rVar.mo106304f(), z);
    }
}
