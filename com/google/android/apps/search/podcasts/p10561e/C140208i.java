package com.google.android.apps.search.podcasts.p10561e;

import android.content.Context;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.i */
/* compiled from: PG */
public final class C140208i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140211l f380921a;

    /* renamed from: b */
    final /* synthetic */ Context f380922b;

    /* renamed from: c */
    final /* synthetic */ C140201b f380923c;

    public C140208i(C140211l lVar, Context context, C140201b bVar) {
        this.f380921a = lVar;
        this.f380922b = context;
        this.f380923c = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f380921a.f380928c.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41580));
        cVar.mo56386p("Failed to play episode in background.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        AccountId accountId = (AccountId) obj;
        C69664n.m101061g(accountId, "accountId");
        this.f380921a.mo115499c(this.f380922b, accountId, this.f380923c);
    }
}
