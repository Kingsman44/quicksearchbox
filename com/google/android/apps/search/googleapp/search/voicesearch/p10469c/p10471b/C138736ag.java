package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.gsa.p8867w.p8879i.C118802c;
import com.google.android.apps.search.googleapp.customtabs.p10151c.C133691m;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.p10411g.C137454c;
import com.google.android.apps.search.googleapp.search.p10418j.C137531e;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.ag */
/* compiled from: PG */
public final class C138736ag {

    /* renamed from: a */
    public static final C58974d f377324a = C58974d.m91134h("QueryFreeRequestDataDS");

    /* renamed from: b */
    public final C71422aw f377325b;

    /* renamed from: c */
    public final C44058f f377326c;

    /* renamed from: d */
    public final C46175b f377327d;

    /* renamed from: e */
    public final AccountId f377328e;

    /* renamed from: f */
    public final C137396a f377329f;

    /* renamed from: g */
    public final C138754o f377330g;

    /* renamed from: h */
    public final C133691m f377331h;

    /* renamed from: i */
    public final C136832c f377332i;

    /* renamed from: j */
    public final C137454c f377333j;

    /* renamed from: k */
    public final C137531e f377334k;

    /* renamed from: l */
    public final C32221c f377335l;

    /* renamed from: m */
    public final boolean f377336m;

    /* renamed from: n */
    public final C118802c f377337n;

    /* renamed from: o */
    private final AtomicReference f377338o;

    /* renamed from: p */
    private final AtomicReference f377339p;

    public C138736ag(C71422aw awVar, C44058f fVar, C46175b bVar, AccountId accountId, C118802c cVar, C137396a aVar, C138754o oVar, C133691m mVar, C136832c cVar2, C137454c cVar3, C137531e eVar, C32221c cVar4, AtomicReference atomicReference, AtomicReference atomicReference2, boolean z) {
        AccountId accountId2 = accountId;
        C137396a aVar2 = aVar;
        C133691m mVar2 = mVar;
        C136832c cVar5 = cVar2;
        C32221c cVar6 = cVar4;
        AtomicReference atomicReference3 = atomicReference;
        AtomicReference atomicReference4 = atomicReference2;
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(fVar, "cookieManagerFactory");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(accountId2, "accountId");
        C69664n.m101061g(aVar2, "agsaClassicSearchData");
        C69664n.m101061g(mVar2, "customTabsAvailability");
        C69664n.m101061g(cVar5, "googleUrlAnalyzer");
        C69664n.m101061g(cVar6, "zwiebackCookieProvider");
        C69664n.m101061g(atomicReference3, "queryFreeRequestData");
        C69664n.m101061g(atomicReference4, "m5QueryFreeRequestData");
        this.f377325b = awVar;
        this.f377326c = fVar;
        this.f377327d = bVar;
        this.f377328e = accountId2;
        this.f377337n = cVar;
        this.f377329f = aVar2;
        this.f377330g = oVar;
        this.f377331h = mVar2;
        this.f377332i = cVar5;
        this.f377333j = cVar3;
        this.f377334k = eVar;
        this.f377335l = cVar6;
        this.f377338o = atomicReference3;
        this.f377339p = atomicReference4;
        this.f377336m = z;
    }

    /* renamed from: a */
    public final Object mo114504a(boolean z, C69577g gVar) {
        return C71423ax.m104196a(new C138764y(this, z, (C69577g) null), gVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114505b(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138732ac
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ac r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138732ac) r0
            int r1 = r0.f377315c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377315c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ac r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.ac
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f377313a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377315c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.af r5 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.af
            r2 = 0
            r5.<init>(r4, r2)
            r0.f377315c = r3
            java.lang.Object r5 = kotlinx.coroutines.C71423ax.m104196a(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            java.lang.String r0 = "private suspend fun getR…stDataBuilder.build()\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138736ag.mo114505b(h.c.g):java.lang.Object");
    }

    /* renamed from: c */
    public final AtomicReference mo114506c(boolean z) {
        return (!this.f377336m || !z) ? this.f377338o : this.f377339p;
    }
}
