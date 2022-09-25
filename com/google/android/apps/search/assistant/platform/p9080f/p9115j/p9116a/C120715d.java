package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9005b.p9041d.C119942a;
import com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9091b.C120529b;
import com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120561l;
import com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9122b.C120781b;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.d */
/* compiled from: PG */
public final class C120715d {

    /* renamed from: a */
    public static final C59071e f335738a = C59071e.m91331h();

    /* renamed from: b */
    public final C120561l f335739b;

    /* renamed from: c */
    public final C71422aw f335740c;

    /* renamed from: d */
    public final C120781b f335741d;

    /* renamed from: e */
    public final C120529b f335742e;

    public C120715d(C120561l lVar, C71422aw awVar, C119942a aVar, C120781b bVar, C120529b bVar2) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "utteranceClientExecutionProxy");
        C69664n.m101061g(bVar, "opaHandoverControllerProducer");
        C69664n.m101061g(bVar2, "remoteExecutionControllerProducer");
        this.f335739b = lVar;
        this.f335740c = awVar;
        this.f335741d = bVar;
        this.f335742e = bVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104905a(com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c r6, com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9122b.C120781b r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120713b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.f.j.a.b r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120713b) r0
            int r1 = r0.f335733d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335733d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.j.a.b r0 = new com.google.android.apps.search.assistant.platform.f.j.a.b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f335731b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335733d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0070
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            java.lang.Object r6 = r0.f335730a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0049
        L_0x0038:
            p5462h.C69714l.m101134b(r8)
            com.google.common.util.concurrent.cx r7 = r7.mo104931a()
            r0.f335730a = r6
            r0.f335733d = r4
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r8 == r1) goto L_0x0077
        L_0x0049:
            j$.util.Optional r8 = (p3186j$.util.Optional) r8
            boolean r7 = r8.isPresent()
            if (r7 == 0) goto L_0x0076
            java.lang.Object r7 = r8.get()
            com.google.android.apps.search.assistant.platform.f.k.c r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9120k.C120782c) r7
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60856cj.m92900i(r6)
            com.google.common.util.concurrent.cx r6 = r7.mo104927c(r6, r4)
            java.lang.String r7 = "opaHandoverControllerOpt…Final = */ true\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r7 = 0
            r0.f335730a = r7
            r0.f335733d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r8 != r1) goto L_0x0070
            return r1
        L_0x0070:
            java.lang.String r6 = "opaHandoverControllerOpt…       )\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            return r8
        L_0x0076:
            return r6
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120715d.mo104905a(com.google.android.apps.search.assistant.platform.f.f.c, com.google.android.apps.search.assistant.platform.f.k.b.b, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104906b(com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c r7, com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9091b.C120529b r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120714c
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.platform.f.j.a.c r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120714c) r0
            int r1 = r0.f335737d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335737d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.j.a.c r0 = new com.google.android.apps.search.assistant.platform.f.j.a.c
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f335735b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335737d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0090
        L_0x002a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0032:
            java.lang.Object r7 = r0.f335734a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0049
        L_0x0038:
            p5462h.C69714l.m101134b(r9)
            com.google.common.util.concurrent.cx r8 = r8.mo104805a()
            r0.f335734a = r7
            r0.f335737d = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r9 == r1) goto L_0x0097
        L_0x0049:
            j$.util.Optional r9 = (p3186j$.util.Optional) r9
            com.google.common.f.e r8 = f335738a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            boolean r2 = r9.isPresent()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 35577(0x8af9, float:4.9854E-41)
            r4.<init>(r5)
            r8.mo56379ah(r4)
            java.lang.String r4 = "remote execution controller is present %s"
            r8.mo56389s(r4, r2)
            boolean r8 = r9.isPresent()
            if (r8 == 0) goto L_0x0096
            java.lang.Object r8 = r9.get()
            com.google.android.apps.search.assistant.platform.f.c.a r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9089c.C120518a) r8
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            com.google.common.util.concurrent.cx r7 = r8.mo104801b(r7)
            java.lang.String r8 = "remoteExecutionControlle…uture(fulfillmentResult))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r8 = 0
            r0.f335734a = r8
            r0.f335737d = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r9 != r1) goto L_0x0090
            return r1
        L_0x0090:
            java.lang.String r7 = "remoteExecutionControlle…Result))\n        .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)
            return r9
        L_0x0096:
            return r7
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120715d.mo104906b(com.google.android.apps.search.assistant.platform.f.f.c, com.google.android.apps.search.assistant.platform.f.c.b.b, h.c.g):java.lang.Object");
    }
}
