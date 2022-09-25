package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.l */
/* compiled from: PG */
public final class C34139l extends C34143p {

    /* renamed from: a */
    private final C34130c f90901a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34139l(C34130c cVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(cVar, "deferredHotwordArchitecture");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f90901a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39229b(p5462h.p5466c.C69577g r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34138k
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.o.d.a.k r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34138k) r0
            int r1 = r0.f90900e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90900e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.d.a.k r0 = new com.google.android.libraries.search.assistant.invocation.o.d.a.k
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f90898c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90900e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r1 = r0.f90897b
            java.lang.Object r0 = r0.f90896a
            p5462h.C69714l.m101134b(r6)
            goto L_0x006a
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0033:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.invocation.o.d.a.z r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34153z.f90924b
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.d.a.x r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34151x) r6
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r2)
            com.google.android.libraries.search.assistant.invocation.o.d.a.f r2 = new com.google.android.libraries.search.assistant.invocation.o.d.a.f
            r2.<init>(r6)
            com.google.android.libraries.search.assistant.invocation.o.d.a.c r6 = r5.f90901a
            h.f r6 = r6.f90883b
            java.lang.Object r6 = r6.mo5768a()
            java.lang.String r4 = "<get-value>(...)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r4)
            com.google.common.util.concurrent.cx r6 = (com.google.common.util.concurrent.C60870cx) r6
            r0.f90896a = r2
            r0.f90897b = r2
            r0.f90900e = r3
            java.lang.Object r6 = kotlinx.coroutines.p5578d.C71663i.m104690c(r6, r0)
            if (r6 == r1) goto L_0x00a9
            r0 = r2
            r1 = r0
        L_0x006a:
            com.google.android.libraries.search.assistant.invocation.o.d.a.g r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g) r6
            com.google.android.libraries.search.assistant.invocation.o.d.a.g r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g.LEGACY
            int r6 = r6.ordinal()
            if (r6 == 0) goto L_0x007f
            if (r6 != r3) goto L_0x0079
            com.google.android.libraries.search.assistant.invocation.o.d.a.y r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34152y.HDM
            goto L_0x0081
        L_0x0079:
            h.g r6 = new h.g
            r6.<init>()
            throw r6
        L_0x007f:
            com.google.android.libraries.search.assistant.invocation.o.d.a.y r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34152y.LEGACY
        L_0x0081:
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r2)
            com.google.android.libraries.search.assistant.invocation.o.d.a.f r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34133f) r1
            com.google.android.libraries.search.assistant.invocation.o.d.a.x r1 = r1.f90887a
            r1.copyOnWrite()
            com.google.protobuf.bv r1 = r1.instance
            com.google.android.libraries.search.assistant.invocation.o.d.a.z r1 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34153z) r1
            com.google.android.libraries.search.assistant.invocation.o.d.a.z r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34153z.f90924b
            int r6 = r6.getNumber()
            r1.f90926a = r6
            com.google.android.libraries.search.assistant.invocation.o.d.a.f r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34133f) r0
            com.google.android.libraries.search.assistant.invocation.o.d.a.x r6 = r0.f90887a
            com.google.protobuf.bv r6 = r6.build()
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            com.google.android.libraries.search.assistant.invocation.o.d.a.z r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34153z) r6
            return r6
        L_0x00a9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34139l.mo39229b(h.c.g):java.lang.Object");
    }
}
