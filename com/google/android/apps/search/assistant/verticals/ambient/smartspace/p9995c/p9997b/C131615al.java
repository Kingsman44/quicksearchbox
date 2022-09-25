package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.android.apps.gsa.binaries.satin.app.amt;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.assistant.p2485a.C32242c;
import com.google.android.libraries.search.assistant.p2485a.C32245f;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.al */
/* compiled from: PG */
public final class C131615al implements C131630l, C32242c {

    /* renamed from: a */
    public final C59071e f359623a = C59071e.m91331h();

    /* renamed from: b */
    public final C37215b f359624b;

    /* renamed from: c */
    public final C71788b f359625c;

    /* renamed from: d */
    public C131614ak f359626d;

    /* renamed from: e */
    public final C32240a f359627e;

    /* renamed from: f */
    private final C71422aw f359628f;

    /* renamed from: g */
    private final C47770dh f359629g;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.al$a */
    /* compiled from: PG */
    public interface C131616a {
        /* renamed from: aY */
        C131603a mo110217aY();

        /* renamed from: oe */
        amt mo110218oe();
    }

    public C131615al(C32240a aVar, C32245f fVar, C71422aw awVar, C47770dh dhVar, C38780c cVar) {
        C69664n.m101061g(aVar, "assistantAccountEntryPoints");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(dhVar, "traceCreation");
        C69664n.m101061g(cVar, "appFlowLoggerProvider");
        this.f359627e = aVar;
        this.f359628f = awVar;
        this.f359629g = dhVar;
        this.f359624b = cVar.mo41619a(C38828b.PROACTIVE_ASSISTANT);
        this.f359625c = new C71799m();
        fVar.mo38014a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r1);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38013a() {
        /*
            r5 = this;
            com.google.apps.tiktok.tracing.dh r0 = r5.f359629g
            java.lang.String r1 = "onAssistantAccountChanged"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            kotlinx.coroutines.aw r1 = r5.f359628f     // Catch:{ all -> 0x0018 }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ao r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ao     // Catch:{ all -> 0x0018 }
            r3 = 0
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0018 }
            r4 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r4)     // Catch:{ all -> 0x0018 }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x0018:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001a }
        L_0x001a:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131615al.mo38013a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r5);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo110215b(com.google.apps.tiktok.account.AccountId r5) {
        /*
            r4 = this;
            java.lang.String r0 = "accountId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            com.google.apps.tiktok.tracing.dh r0 = r4.f359629g
            java.lang.String r1 = "#createLocalChannel"
            com.google.apps.tiktok.tracing.ax r0 = r0.mo51613c(r1)
            kotlinx.coroutines.aw r1 = r4.f359628f     // Catch:{ all -> 0x001d }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.am r2 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.am     // Catch:{ all -> 0x001d }
            r3 = 0
            r2.<init>(r4, r5, r3)     // Catch:{ all -> 0x001d }
            r5 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r5)     // Catch:{ all -> 0x001d }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return
        L_0x001d:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x001f }
        L_0x001f:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131615al.mo110215b(com.google.apps.tiktok.account.AccountId):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110216c(com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131618an
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.an r0 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131618an) r0
            int r1 = r0.f359638c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f359638c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.an r0 = new com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.an
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f359636a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f359638c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r4) goto L_0x0028
            p5462h.C69714l.m101134b(r7)
            goto L_0x003e
        L_0x0028:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0030:
            p5462h.C69714l.m101134b(r7)
            if (r6 == 0) goto L_0x0047
            r0.f359638c = r4
            java.lang.Object r7 = r6.mo110210c(r0)
            if (r7 != r1) goto L_0x003e
            return r1
        L_0x003e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 != 0) goto L_0x0047
            r3 = 1
        L_0x0047:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131615al.mo110216c(com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak, h.c.g):java.lang.Object");
    }
}
