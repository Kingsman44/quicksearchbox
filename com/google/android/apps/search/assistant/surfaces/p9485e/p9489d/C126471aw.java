package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import java.util.concurrent.atomic.AtomicBoolean;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$shouldRetry$1", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.aw */
/* compiled from: PG */
final class C126471aw extends C69572j implements C69630p {

    /* renamed from: a */
    /* synthetic */ Object f348308a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f348309b;

    /* renamed from: c */
    final /* synthetic */ C69644aa f348310c;

    /* renamed from: d */
    final /* synthetic */ C126473ay f348311d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126471aw(AtomicBoolean atomicBoolean, C69644aa aaVar, C126473ay ayVar, C69577g gVar) {
        super(2, gVar);
        this.f348309b = atomicBoolean;
        this.f348310c = aaVar;
        this.f348311d = ayVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126471aw) mo5194c((Throwable) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
        if (r0.getQuicDetailedErrorCode() != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r0.getCronetInternalErrorCode() == 0) goto L_0x00a8;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            p5462h.C69714l.m101134b(r6)
            java.lang.Object r6 = r5.f348308a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126473ay.f348317a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r0 = r0.mo56382g(r6)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 38892(0x97ec, float:5.45E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "voicesearch network failure"
            r0.mo56386p(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f348309b
            boolean r1 = r6 instanceof com.google.android.libraries.search.assistant.p2783s.p2784a.C36381b
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x003a
            r4 = r6
            com.google.android.libraries.search.assistant.s.a.b r4 = (com.google.android.libraries.search.assistant.p2783s.p2784a.C36381b) r4
            boolean r4 = r4.mo40149b()
            if (r4 == 0) goto L_0x003a
            r4 = 1
            goto L_0x003b
        L_0x003a:
            r4 = 0
        L_0x003b:
            r0.set(r4)
            h.f.b.aa r0 = r5.f348310c
            boolean r0 = r0.f186023a
            if (r0 != 0) goto L_0x00a8
            if (r1 == 0) goto L_0x00a8
            com.google.android.libraries.search.assistant.s.a.b r6 = (com.google.android.libraries.search.assistant.p2783s.p2784a.C36381b) r6
            boolean r0 = r6.mo40149b()
            if (r0 != 0) goto L_0x008e
            java.lang.Throwable r0 = r6.f94995a
            boolean r1 = r0 instanceof p5488io.grpc.C70761fa
            if (r1 == 0) goto L_0x00a8
            io.grpc.fa r0 = (p5488io.grpc.C70761fa) r0
            java.lang.Throwable r0 = r0.getCause()
            boolean r0 = r0 instanceof org.chromium.net.NetworkException
            if (r0 == 0) goto L_0x00a8
            java.lang.Throwable r0 = r6.f94995a
            io.grpc.fa r0 = (p5488io.grpc.C70761fa) r0
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r1 = "null cannot be cast to non-null type org.chromium.net.NetworkException"
            p5462h.p5473f.p5475b.C69664n.m101059e(r0, r1)
            org.chromium.net.NetworkException r0 = (org.chromium.net.NetworkException) r0
            boolean r1 = r0.immediatelyRetryable()
            if (r1 == 0) goto L_0x0074
            goto L_0x008e
        L_0x0074:
            boolean r1 = r0 instanceof org.chromium.net.QuicException
            if (r1 == 0) goto L_0x0087
            org.chromium.net.QuicException r0 = (org.chromium.net.QuicException) r0
            int r1 = r0.getCronetInternalErrorCode()
            if (r1 == 0) goto L_0x00a8
            int r0 = r0.getQuicDetailedErrorCode()
            if (r0 != 0) goto L_0x008e
            goto L_0x00a8
        L_0x0087:
            int r0 = r0.getCronetInternalErrorCode()
            if (r0 != 0) goto L_0x008e
            goto L_0x00a8
        L_0x008e:
            com.google.android.apps.search.assistant.surfaces.e.d.ay r0 = r5.f348311d
            com.google.android.apps.search.assistant.surfaces.e.c.e r0 = r0.f348321e
            com.google.android.libraries.search.assistant.n.a r1 = r6.f94996b
            int r1 = r1.mo39520a()
            com.google.android.libraries.search.assistant.n.a r6 = r6.f94996b
            java.lang.String r6 = r6.mo39522e()
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96967cf
            com.google.android.libraries.search.b.i.a r6 = r3.mo40810a(r1, r6)
            r0.mo107613e(r6)
            goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126471aw.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126471aw awVar = new C126471aw(this.f348309b, this.f348310c, this.f348311d, gVar);
        awVar.f348308a = obj;
        return awVar;
    }
}
