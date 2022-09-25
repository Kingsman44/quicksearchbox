package com.google.android.apps.search.googleapp.search.p10412h.p10413a;

import com.google.android.apps.search.googleapp.config.C133665d;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.p10405b.C137396a;
import com.google.android.apps.search.googleapp.search.srp.p10431a.C137696d;
import com.google.android.libraries.web.profile.p3431a.C44058f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.frameworks.client.data.android.C61531o;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.h.a.h */
/* compiled from: PG */
public final class C137468h {

    /* renamed from: a */
    public final C137696d f373893a;

    /* renamed from: b */
    public final AccountId f373894b;

    /* renamed from: c */
    public final C46128f f373895c;

    /* renamed from: d */
    public final C137396a f373896d;

    /* renamed from: e */
    public final C136832c f373897e;

    /* renamed from: f */
    public final C44058f f373898f;

    /* renamed from: g */
    public final C133665d f373899g;

    /* renamed from: h */
    public final C71422aw f373900h;

    /* renamed from: i */
    private final C61531o f373901i;

    public C137468h(C137696d dVar, C61531o oVar, AccountId accountId, C46128f fVar, C137396a aVar, C136832c cVar, C44058f fVar2, C133665d dVar2, C71422aw awVar) {
        C69664n.m101061g(dVar, "adShieldClientHelper");
        C69664n.m101061g(oVar, "httpClient");
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(fVar, "gcoreAccountName");
        C69664n.m101061g(aVar, "agsaClassicSearchData");
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        C69664n.m101061g(fVar2, "cookieManagerFactory");
        C69664n.m101061g(dVar2, "userAgentHelper");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f373893a = dVar;
        this.f373901i = oVar;
        this.f373894b = accountId;
        this.f373895c = fVar;
        this.f373896d = aVar;
        this.f373897e = cVar;
        this.f373898f = fVar2;
        this.f373899g = dVar2;
        this.f373900h = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113749a(android.net.Uri r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, p5462h.p5466c.C69577g r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.search.p10412h.p10413a.C137461a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.search.h.a.a r0 = (com.google.android.apps.search.googleapp.search.p10412h.p10413a.C137461a) r0
            int r1 = r0.f373868c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f373868c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.h.a.a r0 = new com.google.android.apps.search.googleapp.search.h.a.a
            r0.<init>(r4, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f373866a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f373868c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r9)     // Catch:{ ac -> 0x0027 }
            goto L_0x0094
        L_0x0027:
            r5 = move-exception
            goto L_0x009a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r9 = "uri.toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)
            com.google.frameworks.client.data.android.ae r9 = new com.google.frameworks.client.data.android.ae
            r9.<init>()
            java.lang.String r2 = "GET"
            r9.mo57933b(r2)
            r5.getClass()
            r9.f165930a = r5
            r5 = 0
            r9.f165933d = r5
            java.lang.String r5 = "Cache-Control"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            java.lang.String r2 = "no-cache, no-store"
            r9.mo57932a(r5, r2)
            java.lang.String r5 = "X-AGSA-User-Is-Unicorn"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            r9.mo57932a(r5, r6)
            java.lang.String r5 = "User-Agent"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            r9.mo57932a(r5, r7)
            int r5 = r8.length()
            if (r5 <= 0) goto L_0x007b
            java.lang.String r5 = "Cookie"
            com.google.frameworks.client.data.android.ad r5 = com.google.frameworks.client.data.android.C61362ad.m93870b(r5)
            r9.mo57932a(r5, r8)
        L_0x007b:
            com.google.frameworks.client.data.android.o r5 = r4.f373901i     // Catch:{ ac -> 0x0027 }
            com.google.frameworks.client.data.android.ag r6 = new com.google.frameworks.client.data.android.ag     // Catch:{ ac -> 0x0027 }
            r6.<init>(r9)     // Catch:{ ac -> 0x0027 }
            com.google.common.util.concurrent.cx r5 = r5.mo42484a(r6)     // Catch:{ ac -> 0x0027 }
            java.lang.String r6 = "httpClient.makeRequest(builder.build())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ ac -> 0x0027 }
            r0.f373868c = r3     // Catch:{ ac -> 0x0027 }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ ac -> 0x0027 }
            if (r9 != r1) goto L_0x0094
            return r1
        L_0x0094:
            java.lang.String r5 = "httpClient.makeRequest(builder.build()).await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)     // Catch:{ ac -> 0x0027 }
            return r9
        L_0x009a:
            com.google.android.apps.search.googleapp.urlhandler.a r6 = new com.google.android.apps.search.googleapp.urlhandler.a
            r6.<init>((java.lang.Throwable) r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.p10412h.p10413a.C137468h.mo113749a(android.net.Uri, java.lang.String, java.lang.String, java.lang.String, h.c.g):java.lang.Object");
    }
}
