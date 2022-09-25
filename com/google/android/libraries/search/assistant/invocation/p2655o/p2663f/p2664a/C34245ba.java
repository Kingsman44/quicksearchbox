package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.ba */
/* compiled from: PG */
public final class C34245ba {

    /* renamed from: a */
    private final C34273cb f91103a;

    public C34245ba(C34273cb cbVar) {
        C69664n.m101061g(cbVar, "stateProvider");
        this.f91103a = cbVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39284a(com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34313w r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34243az
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.o.f.a.az r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34243az) r0
            int r1 = r0.f91101c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91101c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.f.a.az r0 = new com.google.android.libraries.search.assistant.invocation.o.f.a.az
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f91099a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91101c
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r11)
            goto L_0x00d9
        L_0x0028:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0030:
            p5462h.C69714l.m101134b(r11)
            com.google.android.libraries.search.assistant.invocation.o.f.a.cb r11 = r9.f91103a
            int r2 = r10.f91246c
            com.google.android.libraries.search.assistant.invocation.o.a.bf r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.m62692a(r2)
            if (r2 != 0) goto L_0x003f
            com.google.android.libraries.search.assistant.invocation.o.a.bf r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.UNRECOGNIZED
        L_0x003f:
            java.lang.String r4 = "request.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.bl r4 = r10.f91247d
            if (r4 != 0) goto L_0x004a
            com.google.android.libraries.search.assistant.invocation.o.a.bl r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl.f90749a
        L_0x004a:
            java.lang.String r5 = "request.state"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            int r5 = r10.f91244a
            int r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34310t.m62965b(r5)
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x00f7
            if (r7 == 0) goto L_0x00b2
            if (r7 == r3) goto L_0x009b
            r6 = 2
            if (r7 != r6) goto L_0x0084
            com.google.android.libraries.search.assistant.invocation.o.f.a.bl r6 = new com.google.android.libraries.search.assistant.invocation.o.f.a.bl
            r7 = 5
            if (r5 != r7) goto L_0x006a
            java.lang.Object r5 = r10.f91245b
            com.google.android.libraries.search.assistant.invocation.o.f.a.q r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34307q) r5
            goto L_0x006c
        L_0x006a:
            com.google.android.libraries.search.assistant.invocation.o.f.a.q r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34307q.f91233c
        L_0x006c:
            java.lang.String r5 = r5.f91235a
            java.lang.String r8 = "perConfigurationEpoch.connectionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r8)
            int r8 = r10.f91244a
            if (r8 != r7) goto L_0x007c
            java.lang.Object r10 = r10.f91245b
            com.google.android.libraries.search.assistant.invocation.o.f.a.q r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34307q) r10
            goto L_0x007e
        L_0x007c:
            com.google.android.libraries.search.assistant.invocation.o.f.a.q r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34307q.f91233c
        L_0x007e:
            long r7 = r10.f91236b
            r6.<init>(r5, r7)
            goto L_0x00b4
        L_0x0084:
            int r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34310t.m62965b(r5)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34310t.m62964a(r10)
            java.lang.String r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34310t.m62964a(r10)
            java.lang.String r0 = "Invalid state validity policy "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10)
            throw r11
        L_0x009b:
            com.google.android.libraries.search.assistant.invocation.o.f.a.bm r6 = new com.google.android.libraries.search.assistant.invocation.o.f.a.bm
            r7 = 4
            if (r5 != r7) goto L_0x00a5
            java.lang.Object r10 = r10.f91245b
            com.google.android.libraries.search.assistant.invocation.o.f.a.s r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34309s) r10
            goto L_0x00a7
        L_0x00a5:
            com.google.android.libraries.search.assistant.invocation.o.f.a.s r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34309s.f91237b
        L_0x00a7:
            java.lang.String r10 = r10.f91239a
            java.lang.String r5 = "perConnection.connectionId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            r6.<init>(r10)
            goto L_0x00b4
        L_0x00b2:
            com.google.android.libraries.search.assistant.invocation.o.f.a.bx r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34268bx.f91163a
        L_0x00b4:
            r0.f91101c = r3
            java.util.Map r10 = r11.f91169a
            java.lang.Object r10 = r10.get(r2)
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)
            com.google.android.libraries.search.assistant.invocation.o.f.a.bv r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34266bv) r10
            kotlinx.coroutines.b.cx r10 = r10.f91161b
            com.google.android.libraries.search.assistant.invocation.o.f.a.bk r11 = new com.google.android.libraries.search.assistant.invocation.o.f.a.bk
            r11.<init>(r6, r4)
            java.lang.Object r10 = r10.mo20883a(r11, r0)
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r10 == r11) goto L_0x00d2
            h.q r10 = p5462h.C69788q.f186170a
        L_0x00d2:
            if (r10 == r11) goto L_0x00d6
            h.q r10 = p5462h.C69788q.f186170a
        L_0x00d6:
            if (r10 != r1) goto L_0x00d9
            return r1
        L_0x00d9:
            com.google.android.libraries.search.assistant.invocation.o.f.a.y r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34315y.f91249a
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.f.a.x r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34314x) r10
            java.lang.String r11 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            java.lang.String r11 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r11)
            com.google.protobuf.bv r10 = r10.build()
            java.lang.String r11 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.android.libraries.search.assistant.invocation.o.f.a.y r10 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34315y) r10
            return r10
        L_0x00f7:
            r10 = 0
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34245ba.mo39284a(com.google.android.libraries.search.assistant.invocation.o.f.a.w, h.c.g):java.lang.Object");
    }
}
