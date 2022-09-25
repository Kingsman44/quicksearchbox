package com.google.android.apps.search.podcasts.autodownload;

import com.google.android.apps.search.podcasts.autodownload.C139980p;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.autodownload.r */
/* compiled from: PG */
final class C139983r extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C139980p f380484a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C139983r(C139980p pVar) {
        super(1);
        this.f380484a = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        AccountId accountId = (AccountId) obj;
        C69664n.m101061g(accountId, "it");
        C60870cx c = ((C139980p.C139981a) C47245e.m84045a(this.f380484a.f380482e, C139980p.C139981a.class, accountId)).mo115374da().mo115678c();
        C69664n.m101060f(c, "getEntryPoint(context, A…nager\n        .preference");
        C139980p pVar = this.f380484a;
        return C140989k.m228947e(c, pVar.f380478a, new C139982q(pVar));
    }
}
