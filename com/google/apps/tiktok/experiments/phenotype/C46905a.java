package com.google.apps.tiktok.experiments.phenotype;

import android.content.Context;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.a */
/* compiled from: PG */
public final class C46905a implements C47066t {

    /* renamed from: a */
    private final C68214a f122376a;

    /* renamed from: b */
    private final C68214a f122377b;

    /* renamed from: c */
    private final Context f122378c;

    /* renamed from: com.google.apps.tiktok.experiments.phenotype.a$a */
    /* compiled from: PG */
    public interface C46906a {
        /* renamed from: gX */
        C47052fj mo50911gX();
    }

    public C46905a(C68214a aVar, C68214a aVar2, Context context) {
        C69664n.m101061g(aVar, "accountDataService");
        C69664n.m101061g(aVar2, "gcoreAccountName");
        C69664n.m101061g(context, "context");
        this.f122376a = aVar;
        this.f122377b = aVar2;
        this.f122378c = context;
    }

    /* renamed from: a */
    public final C60870cx mo50908a(String str, AccountId accountId) {
        C69664n.m101061g(accountId, "accountId");
        return C60922j.m93045h(((C46175b) this.f122376a.mo27525b()).mo50246c(accountId), C47810es.m84966f(new C46933b(this, str, accountId)), C60826bg.f164896a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0097, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        throw r8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo50909b(java.lang.String r7, com.google.apps.tiktok.account.AccountId r8, com.google.apps.tiktok.account.data.C46215j r9) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f122378c
            java.lang.Class<com.google.apps.tiktok.experiments.phenotype.a$a> r1 = com.google.apps.tiktok.experiments.phenotype.C46905a.C46906a.class
            java.lang.Object r8 = com.google.apps.tiktok.inject.C47245e.m84045a(r0, r1, r8)
            com.google.apps.tiktok.experiments.phenotype.a$a r8 = (com.google.apps.tiktok.experiments.phenotype.C46905a.C46906a) r8
            com.google.apps.tiktok.experiments.phenotype.fj r8 = r8.mo50911gX()
            dagger.a r0 = r6.f122377b
            java.lang.Object r0 = r0.mo27525b()
            com.google.apps.tiktok.account.data.a.f r0 = (com.google.apps.tiktok.account.data.p3611a.C46128f) r0
            java.lang.String r9 = r0.mo50217e(r9)
            if (r9 != 0) goto L_0x001e
            java.lang.String r9 = ""
        L_0x001e:
            com.google.apps.tiktok.tracing.bn r0 = com.google.apps.tiktok.tracing.C47562bm.f123426a
            java.lang.String r1 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r2 = "Fetching experiments for account"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r2, r0)
            java.lang.String r2 = "PhenotypeApi.getConfigurationSnapshot"
            com.google.apps.tiktok.tracing.bn r3 = com.google.apps.tiktok.tracing.C47562bm.f123426a     // Catch:{ all -> 0x009c }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r1)     // Catch:{ all -> 0x009c }
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r2, r3)     // Catch:{ all -> 0x009c }
            com.google.android.libraries.phenotype.client.a.g r2 = r8.f122636d     // Catch:{ all -> 0x0095 }
            com.google.common.util.concurrent.cx r9 = r2.mo37292f(r7, r9)     // Catch:{ all -> 0x0095 }
            g.a.a r2 = r8.f122633a     // Catch:{ all -> 0x0095 }
            dagger.a.g r2 = (dagger.p5294a.C68221g) r2     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r2.f184583a     // Catch:{ all -> 0x0095 }
            com.google.common.base.ax r2 = (com.google.common.base.C58833ax) r2     // Catch:{ all -> 0x0095 }
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0095 }
            java.lang.Object r2 = r2.mo56109e(r3)     // Catch:{ all -> 0x0095 }
            java.lang.String r3 = "enableTimeout.get().or(true)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0095 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0095 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0072
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0095 }
            java.util.concurrent.ScheduledExecutorService r3 = r8.f122634b     // Catch:{ all -> 0x0095 }
            r4 = 25
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60856cj.m92908q(r9, r4, r2, r3)     // Catch:{ all -> 0x0095 }
            java.lang.Class<java.util.concurrent.TimeoutException> r2 = java.util.concurrent.TimeoutException.class
            com.google.apps.tiktok.experiments.phenotype.fi r3 = com.google.apps.tiktok.experiments.phenotype.C47051fi.f122632a     // Catch:{ all -> 0x0095 }
            java.util.concurrent.ScheduledExecutorService r4 = r8.f122634b     // Catch:{ all -> 0x0095 }
            com.google.common.base.ah r3 = com.google.apps.tiktok.tracing.C47810es.m84963c(r3)     // Catch:{ all -> 0x0095 }
            com.google.common.util.concurrent.cx r9 = com.google.common.util.concurrent.C60846c.m92878g(r9, r2, r3, r4)     // Catch:{ all -> 0x0095 }
        L_0x0072:
            r1.mo51417a(r9)     // Catch:{ all -> 0x0095 }
            r2 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r2)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "beginSpan(name, extras).…oFuture(block.invoke()) }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)     // Catch:{ all -> 0x009c }
            com.google.apps.tiktok.experiments.phenotype.fh r1 = new com.google.apps.tiktok.experiments.phenotype.fh     // Catch:{ all -> 0x009c }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.s r7 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.s r7 = com.google.apps.tiktok.tracing.C47810es.m84966f(r7)     // Catch:{ all -> 0x009c }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93045h(r9, r7, r8)     // Catch:{ all -> 0x009c }
            p5462h.p5472e.C69598b.m101013a(r0, r2)
            return r7
        L_0x0095:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r8 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r7)     // Catch:{ all -> 0x009c }
            throw r8     // Catch:{ all -> 0x009c }
        L_0x009c:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x009e }
        L_0x009e:
            r8 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C46905a.mo50909b(java.lang.String, com.google.apps.tiktok.account.AccountId, com.google.apps.tiktok.account.data.j):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo50910c(String str) {
        return C60922j.m93045h(((C46175b) this.f122376a.mo27525b()).mo50248e(), C47810es.m84966f(new C46960c(this, str)), C60826bg.f164896a);
    }
}
