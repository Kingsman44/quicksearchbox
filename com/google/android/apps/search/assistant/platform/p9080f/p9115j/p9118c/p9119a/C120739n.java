package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9104d.p9105a.C120632p;
import com.google.android.apps.search.assistant.platform.p9080f.p9111h.C120704a;
import java.util.concurrent.atomic.AtomicLong;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.n */
/* compiled from: PG */
public final class C120739n {

    /* renamed from: a */
    public final AtomicLong f335822a = new AtomicLong(1);

    /* renamed from: b */
    private final C120632p f335823b;

    /* renamed from: c */
    private final C120704a f335824c;

    /* renamed from: d */
    private final C123033c f335825d;

    /* renamed from: e */
    private final C119829bx f335826e;

    /* renamed from: f */
    private final C119834cb f335827f;

    /* renamed from: g */
    private final long f335828g;

    public C120739n(C120632p pVar, C120704a aVar, C123033c cVar, C119829bx bxVar, C119834cb cbVar, long j) {
        C69664n.m101061g(pVar, "contextFetcher");
        C69664n.m101061g(aVar, "localeProvider");
        C69664n.m101061g(cVar, "accountNameProvider");
        C69664n.m101061g(bxVar, "fulfillmentConfiguration");
        C69664n.m101061g(cbVar, "interactionId");
        this.f335823b = pVar;
        this.f335824c = aVar;
        this.f335825d = cVar;
        this.f335826e = bxVar;
        this.f335827f = cbVar;
        this.f335828g = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104911a(p5462h.p5466c.C69577g r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120738m
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.apps.search.assistant.platform.f.j.c.a.m r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120738m) r0
            int r1 = r0.f335821g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335821g = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.j.c.a.m r0 = new com.google.android.apps.search.assistant.platform.f.j.c.a.m
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f335819e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335821g
            r3 = 3
            r4 = 2
            java.lang.String r5 = "value"
            r6 = 1
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x004d
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r1 = r0.f335816b
            java.lang.Object r0 = r0.f335815a
            com.google.protos.f.q.fk r0 = (com.google.protos.p4985f.p5030q.C65204fk) r0
            p5462h.C69714l.m101134b(r13)
            goto L_0x0177
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x003e:
            java.lang.Object r2 = r0.f335818d
            java.lang.Object r4 = r0.f335817c
            java.lang.Object r7 = r0.f335816b
            java.lang.Object r8 = r0.f335815a
            com.google.android.apps.search.assistant.platform.f.j.c.a.n r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120739n) r8
            p5462h.C69714l.m101134b(r13)
            goto L_0x0106
        L_0x004d:
            java.lang.Object r2 = r0.f335818d
            java.lang.Object r7 = r0.f335817c
            java.lang.Object r8 = r0.f335816b
            java.lang.Object r9 = r0.f335815a
            com.google.android.apps.search.assistant.platform.f.j.c.a.n r9 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120739n) r9
            p5462h.C69714l.m101134b(r13)
            r11 = r9
            r9 = r8
            r8 = r11
            goto L_0x00af
        L_0x005e:
            p5462h.C69714l.m101134b(r13)
            com.google.protos.f.q.ey r13 = com.google.protos.p4985f.p5030q.C65191ey.f176424p
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.protos.f.q.es r13 = (com.google.protos.p4985f.p5030q.C65185es) r13
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.protos.f.q.fk r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            java.util.concurrent.atomic.AtomicLong r13 = r12.f335822a
            long r7 = r13.getAndIncrement()
            com.google.protos.f.q.es r13 = r2.f176484a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.protos.f.q.ey r13 = (com.google.protos.p4985f.p5030q.C65191ey) r13
            r13.f176431f = r7
            long r7 = r12.f335828g
            com.google.protos.f.q.es r13 = r2.f176484a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.protos.f.q.ey r13 = (com.google.protos.p4985f.p5030q.C65191ey) r13
            int r8 = (int) r7
            r13.f176433h = r8
            com.google.android.apps.search.assistant.platform.f.h.a r13 = r12.f335824c
            com.google.common.util.concurrent.cx r13 = r13.mo104903b()
            java.lang.String r7 = "localeProvider.localeLanguageCode()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r7)
            r0.f335815a = r12
            r0.f335816b = r2
            r0.f335817c = r2
            r0.f335818d = r2
            r0.f335821g = r6
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0195
            r8 = r12
            r7 = r2
            r9 = r7
        L_0x00af:
            java.lang.String r10 = "localeProvider.localeLanguageCode().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r10)
            java.lang.String r13 = (java.lang.String) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r5)
            com.google.protos.f.q.fk r2 = (com.google.protos.p4985f.p5030q.C65204fk) r2
            com.google.protos.f.q.es r2 = r2.f176484a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.protos.f.q.ey r2 = (com.google.protos.p4985f.p5030q.C65191ey) r2
            com.google.protos.f.q.ey r10 = com.google.protos.p4985f.p5030q.C65191ey.f176424p
            r13.getClass()
            r2.f176432g = r13
            com.google.android.apps.search.assistant.platform.b.a.d.cb r13 = r8.f335827f
            java.lang.String r13 = r13.f333767a
            java.lang.String r2 = "interactionId.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r5)
            r2 = r7
            com.google.protos.f.q.fk r2 = (com.google.protos.p4985f.p5030q.C65204fk) r2
            com.google.protos.f.q.es r2 = r2.f176484a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.protos.f.q.ey r2 = (com.google.protos.p4985f.p5030q.C65191ey) r2
            r13.getClass()
            int r10 = r2.f176426a
            r10 = r10 | r4
            r2.f176426a = r10
            r2.f176434i = r13
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.j.c r13 = r8.f335825d
            com.google.common.util.concurrent.cx r13 = r13.mo105841a()
            r0.f335815a = r8
            r0.f335816b = r9
            r0.f335817c = r7
            r0.f335818d = r7
            r0.f335821g = r4
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r0)
            if (r13 == r1) goto L_0x0195
            r2 = r7
            r4 = r2
            r7 = r9
        L_0x0106:
            j$.util.Optional r13 = (p3186j$.util.Optional) r13
            java.lang.String r9 = ""
            java.lang.Object r13 = r13.orElse(r9)
            java.lang.String r9 = "accountNameProvider.getA…Name().await().orElse(\"\")"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r9)
            java.lang.String r13 = (java.lang.String) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r5)
            com.google.protos.f.q.fk r2 = (com.google.protos.p4985f.p5030q.C65204fk) r2
            com.google.protos.f.q.es r2 = r2.f176484a
            r2.copyOnWrite()
            com.google.protobuf.bv r2 = r2.instance
            com.google.protos.f.q.ey r2 = (com.google.protos.p4985f.p5030q.C65191ey) r2
            com.google.protos.f.q.ey r9 = com.google.protos.p4985f.p5030q.C65191ey.f176424p
            r13.getClass()
            r2.f176429d = r13
            com.google.protos.f.q.ev r13 = com.google.protos.p4985f.p5030q.C65188ev.REQUEST_TYPE_INITIAL
            r2 = r4
            com.google.protos.f.q.fk r2 = (com.google.protos.p4985f.p5030q.C65204fk) r2
            r2.mo59353b(r13)
            com.google.android.apps.search.assistant.platform.b.a.d.bx r13 = r8.f335826e
            java.lang.String r9 = "fulfillmentConfiguration"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r9)
            com.google.protobuf.ch r9 = r13.f333760b
            int r9 = r9.size()
            r10 = 0
            if (r9 != r6) goto L_0x0155
            com.google.protobuf.ch r13 = r13.f333760b
            int r13 = r13.mo58914d(r10)
            com.google.android.apps.search.assistant.platform.b.a.d.bw r13 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.m198729a(r13)
            if (r13 != 0) goto L_0x0150
            com.google.android.apps.search.assistant.platform.b.a.d.bw r13 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.UNKNOWN_ENGINE
        L_0x0150:
            com.google.android.apps.search.assistant.platform.b.a.d.bw r9 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw.ON_DEVICE
            if (r13 != r9) goto L_0x0155
            r10 = 1
        L_0x0155:
            com.google.protos.f.q.es r13 = r2.f176484a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.protos.f.q.ey r13 = (com.google.protos.p4985f.p5030q.C65191ey) r13
            r2 = r10 ^ 1
            r13.f176438m = r2
            com.google.android.apps.search.assistant.platform.f.f.d.a.p r13 = r8.f335823b
            r0.f335815a = r7
            r0.f335816b = r4
            r2 = 0
            r0.f335817c = r2
            r0.f335818d = r2
            r0.f335821g = r3
            java.lang.Object r13 = r13.mo104860b(r0)
            if (r13 == r1) goto L_0x0195
            r1 = r4
            r0 = r7
        L_0x0177:
            com.google.assistant.e.j.ex r13 = (com.google.assistant.p3897e.p3921j.C52091ex) r13
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r5)
            com.google.protos.f.q.fk r1 = (com.google.protos.p4985f.p5030q.C65204fk) r1
            com.google.protos.f.q.es r1 = r1.f176484a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.protos.f.q.ey r1 = (com.google.protos.p4985f.p5030q.C65191ey) r1
            com.google.protos.f.q.ey r2 = com.google.protos.p4985f.p5030q.C65191ey.f176424p
            r13.getClass()
            r1.f176435j = r13
            com.google.protos.f.q.fk r0 = (com.google.protos.p4985f.p5030q.C65204fk) r0
            com.google.protos.f.q.ey r13 = r0.mo59352a()
            return r13
        L_0x0195:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120739n.mo104911a(h.c.g):java.lang.Object");
    }
}
