package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.o */
/* compiled from: PG */
public final class C120772o implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f335885a;

    /* renamed from: b */
    final /* synthetic */ C120777t f335886b;

    public C120772o(C71588o oVar, C120777t tVar) {
        this.f335885a = oVar;
        this.f335886b = tVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120771n
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.apps.search.assistant.platform.f.k.a.n r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120771n) r0
            int r1 = r0.f335883b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335883b = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.f.k.a.n r0 = new com.google.android.apps.search.assistant.platform.f.k.a.n
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f335882a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f335883b
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r11)
            goto L_0x010f
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            p5462h.C69714l.m101134b(r11)
            kotlinx.coroutines.b.o r11 = r9.f335885a
            com.google.assistant.e.j.en r10 = (com.google.assistant.p3897e.p3921j.C52081en) r10
            com.google.android.apps.search.assistant.platform.f.k.a.t r2 = r9.f335886b
            java.lang.String r4 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r4)
            com.google.android.apps.search.assistant.platform.b.d.a r4 = r2.f335900d
            com.google.common.b.gu r4 = r4.mo104605c()
            java.lang.String r5 = "clientExecutionProxy.supportedClientOps()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r7 = p5462h.p5463a.C69540x.m100804k(r4, r6)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x0058:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x006a
            java.lang.Object r7 = r4.next()
            com.google.assistant.e.j.da r7 = (com.google.assistant.p3897e.p3921j.C51785da) r7
            java.lang.String r7 = r7.f135878b
            r5.add(r7)
            goto L_0x0058
        L_0x006a:
            java.util.Set r4 = p5462h.p5463a.C69540x.m100846ab(r5)
            h.f r2 = r2.f335906j
            java.lang.Object r2 = r2.mo5768a()
            com.google.android.libraries.search.assistant.performer.h.a.f r2 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36114f) r2
            com.google.protobuf.cq r2 = r2.f94449a
            java.lang.String r5 = "properties.clientOpsAlwaysForwardedToClientList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.util.Set r2 = p5462h.p5463a.C69540x.m100846ab(r2)
            com.google.protobuf.cq r10 = r10.f136684d
            java.lang.String r5 = "conversationDelta.interactionDeltaList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p5462h.p5463a.C69540x.m100804k(r10, r6)
            r5.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x00b9
            java.lang.Object r6 = r10.next()
            com.google.assistant.e.j.ep r6 = (com.google.assistant.p3897e.p3921j.C52083ep) r6
            int r7 = r6.f136692b
            r8 = 4
            if (r7 != r8) goto L_0x00ab
            java.lang.Object r6 = r6.f136693c
            com.google.assistant.e.j.ei r6 = (com.google.assistant.p3897e.p3921j.C52076ei) r6
            goto L_0x00ad
        L_0x00ab:
            com.google.assistant.e.j.ei r6 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
        L_0x00ad:
            com.google.assistant.e.j.dy r6 = r6.f136668c
            if (r6 != 0) goto L_0x00b3
            com.google.assistant.e.j.dy r6 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x00b3:
            java.lang.String r6 = r6.f135936b
            r5.add(r6)
            goto L_0x0095
        L_0x00b9:
            java.util.List r10 = p5462h.p5463a.C69540x.m100840V(r5)
            boolean r5 = r10 instanceof java.util.Collection
            if (r5 == 0) goto L_0x00c8
            boolean r6 = r10.isEmpty()
            if (r6 == 0) goto L_0x00c8
            goto L_0x00e1
        L_0x00c8:
            java.util.Iterator r6 = r10.iterator()
        L_0x00cc:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00e1
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r2.contains(r7)
            if (r7 == 0) goto L_0x00cc
            com.google.android.apps.search.assistant.platform.f.k.a.a r10 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a.FORWARD_TO_CLIENT
            goto L_0x0106
        L_0x00e1:
            if (r5 == 0) goto L_0x00ea
            boolean r2 = r10.isEmpty()
            if (r2 == 0) goto L_0x00ea
            goto L_0x0104
        L_0x00ea:
            java.util.Iterator r10 = r10.iterator()
        L_0x00ee:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0104
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.contains(r2)
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x00ee
            com.google.android.apps.search.assistant.platform.f.k.a.a r10 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a.HANDOVER_TO_OPA
            goto L_0x0106
        L_0x0104:
            com.google.android.apps.search.assistant.platform.f.k.a.a r10 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a.NO_DECISION
        L_0x0106:
            r0.f335883b = r3
            java.lang.Object r10 = r11.mo20883a(r10, r0)
            if (r10 != r1) goto L_0x010f
            return r1
        L_0x010f:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120772o.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
