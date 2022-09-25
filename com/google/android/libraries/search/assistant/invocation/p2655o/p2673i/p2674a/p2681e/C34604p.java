package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e;

import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e.p */
/* compiled from: PG */
public final class C34604p extends C34607s {

    /* renamed from: a */
    private final C34593e f91917a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34604p(C69585o oVar, C34593e eVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(eVar, "backend");
        this.f91917a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39446b(com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34590b r6, p5462h.p5466c.C69577g r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34603o
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.o r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34603o) r0
            int r1 = r0.f91916e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91916e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.o r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.o
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f91914c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91916e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r6 = r0.f91913b
            java.lang.Object r0 = r0.f91912a
            p5462h.C69714l.m101134b(r7)
            goto L_0x006c
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.d r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34592d.f91897b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.c r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34591c) r7
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r2)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.k r2 = new com.google.android.libraries.search.assistant.invocation.o.i.a.e.k
            r2.<init>(r7)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.e r7 = r5.f91917a
            com.google.android.libraries.search.n.an r6 = r6.f91896b
            if (r6 != 0) goto L_0x0055
            com.google.android.libraries.search.n.an r6 = com.google.android.libraries.search.p3055n.C39264an.f103427d
        L_0x0055:
            java.lang.String r4 = "request.params"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r4)
            com.google.common.util.concurrent.cx r6 = r7.mo39444a(r6)
            r0.f91912a = r2
            r0.f91913b = r2
            r0.f91916e = r3
            java.lang.Object r7 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r7 == r1) goto L_0x0095
            r6 = r2
            r0 = r6
        L_0x006c:
            com.google.speech.j.ko r7 = (com.google.speech.p5218j.C67087ko) r7
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.k r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34599k) r6
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.c r6 = r6.f91910a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.d r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34592d) r6
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.d r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34592d.f91897b
            r7.getClass()
            r6.f91899a = r7
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.k r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34599k) r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.c r6 = r0.f91910a
            com.google.protobuf.bv r6 = r6.build()
            java.lang.String r7 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            com.google.android.libraries.search.assistant.invocation.o.i.a.e.d r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34592d) r6
            return r6
        L_0x0095:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2681e.C34604p.mo39446b(com.google.android.libraries.search.assistant.invocation.o.i.a.e.b, h.c.g):java.lang.Object");
    }
}
