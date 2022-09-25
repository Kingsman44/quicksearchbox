package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.h */
/* compiled from: PG */
public final class C34596h implements C34602n {

    /* renamed from: a */
    public final C71422aw f91907a;

    /* renamed from: b */
    private final C34609u f91908b;

    public C34596h(C34609u uVar, C71422aw awVar) {
        C69664n.m101061g(uVar, "stub");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f91908b = uVar;
        this.f91907a = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e A[Catch:{ all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8 A[Catch:{ all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39445a(com.google.android.libraries.search.p3055n.C39264an r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34595g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.g r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34595g) r0
            int r1 = r0.f91906c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91906c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.g r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.g
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f91904a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91906c
            java.lang.String r3 = "newBuilder()"
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0029 }
            goto L_0x0078
        L_0x0029:
            r7 = move-exception
            goto L_0x014b
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.u r8 = r6.f91908b     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34590b.f91893c     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.a r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34589a) r2     // Catch:{ all -> 0x0029 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)     // Catch:{ all -> 0x0029 }
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r5)     // Catch:{ all -> 0x0029 }
            r2.copyOnWrite()     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bv r5 = r2.instance     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.b r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34590b) r5     // Catch:{ all -> 0x0029 }
            r7.getClass()     // Catch:{ all -> 0x0029 }
            r5.f91896b = r7     // Catch:{ all -> 0x0029 }
            int r7 = r5.f91895a     // Catch:{ all -> 0x0029 }
            r7 = r7 | r4
            r5.f91895a = r7     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bv r7 = r2.build()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.b r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34590b) r7     // Catch:{ all -> 0x0029 }
            r0.f91906c = r4     // Catch:{ all -> 0x0029 }
            io.grpc.de r2 = new io.grpc.de     // Catch:{ all -> 0x0029 }
            r2.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.Object r8 = r8.mo39447b(r7, r2, r0)     // Catch:{ all -> 0x0029 }
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.d r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34592d) r8     // Catch:{ all -> 0x0029 }
            com.google.speech.j.ko r7 = r8.f91899a     // Catch:{ all -> 0x0029 }
            if (r7 != 0) goto L_0x0080
            com.google.speech.j.ko r7 = com.google.speech.p5218j.C67087ko.f182366n     // Catch:{ all -> 0x0029 }
        L_0x0080:
            java.lang.String r8 = "stub\n          .verify(r…arams })\n          .event"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p3055n.C39260aj.f103415g     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r8)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r0 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r8 = r8.f169971d     // Catch:{ all -> 0x0029 }
            boolean r8 = r0.mo58857o(r8)     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x00b8
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p3055n.C39260aj.f103415g     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r8)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r7 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r0 = r8.f169971d     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r7.mo58854l(r0)     // Catch:{ all -> 0x0029 }
            if (r7 != 0) goto L_0x00ae
            java.lang.Object r7 = r8.f169969b     // Catch:{ all -> 0x0029 }
            goto L_0x00b2
        L_0x00ae:
            java.lang.Object r7 = r8.mo58889c(r7)     // Catch:{ all -> 0x0029 }
        L_0x00b2:
            java.lang.String r8 = "event.getExtension(HotwordTriggeredEvent.eventId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x0029 }
            return r7
        L_0x00b8:
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p3055n.C39258ah.f103404j     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r8)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r0 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r8 = r8.f169971d     // Catch:{ all -> 0x0029 }
            boolean r8 = r0.mo58857o(r8)     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x00f2
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.l r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.l     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r0 = com.google.android.libraries.search.p3055n.C39258ah.f103404j     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r0)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r7 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r1 = r0.f169971d     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r7.mo58854l(r1)     // Catch:{ all -> 0x0029 }
            if (r7 != 0) goto L_0x00e3
            java.lang.Object r7 = r0.f169969b     // Catch:{ all -> 0x0029 }
            goto L_0x00e7
        L_0x00e3:
            java.lang.Object r7 = r0.mo58889c(r7)     // Catch:{ all -> 0x0029 }
        L_0x00e7:
            java.lang.String r0 = "event.getExtension(Hotwo…ejectEvent.rejectEventId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.ah r7 = (com.google.android.libraries.search.p3055n.C39258ah) r7     // Catch:{ all -> 0x0029 }
            r8.<init>(r7)     // Catch:{ all -> 0x0029 }
            throw r8     // Catch:{ all -> 0x0029 }
        L_0x00f2:
            com.google.protobuf.bt r8 = com.google.android.libraries.search.p3055n.C39268ar.f103440e     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r8 = com.google.protobuf.C62942bv.checkIsLite(r8)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r8)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r0 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r8 = r8.f169971d     // Catch:{ all -> 0x0029 }
            boolean r8 = r0.mo58857o(r8)     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r8 == 0) goto L_0x012d
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.m r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.m     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r1 = com.google.android.libraries.search.p3055n.C39268ar.f103440e     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)     // Catch:{ all -> 0x0029 }
            r7.mo58887l(r1)     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bf r7 = r7.f169962ag     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bs r2 = r1.f169971d     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r7.mo58854l(r2)     // Catch:{ all -> 0x0029 }
            if (r7 != 0) goto L_0x011e
            java.lang.Object r7 = r1.f169969b     // Catch:{ all -> 0x0029 }
            goto L_0x0122
        L_0x011e:
            java.lang.Object r7 = r1.mo58889c(r7)     // Catch:{ all -> 0x0029 }
        L_0x0122:
            java.lang.String r1 = "event.getExtension(Hotwo…nStartErrorEvent.eventId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r1)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.ar r7 = (com.google.android.libraries.search.p3055n.C39268ar) r7     // Catch:{ all -> 0x0029 }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x0029 }
            throw r8     // Catch:{ all -> 0x0029 }
        L_0x012d:
            com.google.android.libraries.search.n.ar r7 = com.google.android.libraries.search.p3055n.C39268ar.f103439d     // Catch:{ all -> 0x0029 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.ao r7 = (com.google.android.libraries.search.p3055n.C39265ao) r7     // Catch:{ all -> 0x0029 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r3)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.at r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.aq r8 = com.google.android.libraries.search.p3055n.C39267aq.UNSPECIFIED     // Catch:{ all -> 0x0029 }
            r7.mo41752b(r8)     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.n.ar r7 = r7.mo41751a()     // Catch:{ all -> 0x0029 }
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.m r8 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.m     // Catch:{ all -> 0x0029 }
            r8.<init>(r7, r0)     // Catch:{ all -> 0x0029 }
            throw r8     // Catch:{ all -> 0x0029 }
        L_0x014b:
            boolean r8 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34601m
            if (r8 != 0) goto L_0x0171
            boolean r8 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34600l
            if (r8 != 0) goto L_0x0171
            com.google.android.libraries.search.n.ar r8 = com.google.android.libraries.search.p3055n.C39268ar.f103439d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.n.ao r8 = (com.google.android.libraries.search.p3055n.C39265ao) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r3)
            com.google.android.libraries.search.n.at r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")
            com.google.android.libraries.search.n.aq r0 = com.google.android.libraries.search.p3055n.C39267aq.UNSPECIFIED
            r8.mo41752b(r0)
            com.google.android.libraries.search.n.ar r8 = r8.mo41751a()
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.m r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.m
            r0.<init>(r8, r7)
            throw r0
        L_0x0171:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34596h.mo39445a(com.google.android.libraries.search.n.an, h.c.g):java.lang.Object");
    }
}
