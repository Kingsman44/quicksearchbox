package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.j */
/* compiled from: PG */
public final class C34445j implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f91534a;

    /* renamed from: b */
    final /* synthetic */ C34449n f91535b;

    public C34445j(C71588o oVar, C34449n nVar) {
        this.f91534a = oVar;
        this.f91535b = nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d.C34444i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.o.h.d.i r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d.C34444i) r0
            int r1 = r0.f91532b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91532b = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.h.d.i r0 = new com.google.android.libraries.search.assistant.invocation.o.h.d.i
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f91531a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91532b
            r3 = 1
            if (r2 == 0) goto L_0x0030
            if (r2 != r3) goto L_0x0028
            p5462h.C69714l.m101134b(r12)
            goto L_0x0145
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0030:
            p5462h.C69714l.m101134b(r12)
            kotlinx.coroutines.b.o r12 = r10.f91534a
            com.google.android.libraries.search.assistant.invocation.o.h.d.a r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d.C34436a) r11
            com.google.android.libraries.search.assistant.invocation.o.a.bw r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw.f90762f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.a.bv r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34059bv) r2
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.by r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.assistant.invocation.o.c.b r5 = r11.f91507a
            java.lang.Object r5 = r5.f90873b
            com.google.android.libraries.search.assistant.invocation.o.a.ad r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad) r5
            int r6 = r5.f90665a
            r6 = r6 & r3
            java.lang.String r7 = "value"
            if (r6 == 0) goto L_0x00b2
            java.lang.String r5 = r5.f90666b
            java.lang.String r6 = "data.details.configuration.snapshotId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.assistant.invocation.o.a.bv r6 = r2.f90769a
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.a.bw r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw) r6
            com.google.android.libraries.search.assistant.invocation.o.a.w r6 = r6.f90765b
            if (r6 != 0) goto L_0x0068
            com.google.android.libraries.search.assistant.invocation.o.a.w r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34114w.f90859c
        L_0x0068:
            java.lang.String r8 = "_builder.getClientCondition()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            com.google.protobuf.bn r6 = r6.toBuilder()
            java.lang.String r8 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            com.google.android.libraries.search.assistant.invocation.o.a.v r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34113v) r6
            java.lang.String r8 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.a.w r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34114w) r8
            r5.getClass()
            int r9 = r8.f90861a
            r9 = r9 | r3
            r8.f90861a = r9
            r8.f90862b = r5
            com.google.protobuf.bv r5 = r6.build()
            java.lang.String r6 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.assistant.invocation.o.a.w r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34114w) r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r7)
            com.google.android.libraries.search.assistant.invocation.o.a.bv r6 = r2.f90769a
            r6.copyOnWrite()
            com.google.protobuf.bv r6 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.a.bw r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw) r6
            r5.getClass()
            r6.f90765b = r5
            int r5 = r6.f90764a
            r5 = r5 | r3
            r6.f90764a = r5
        L_0x00b2:
            com.google.android.libraries.search.assistant.invocation.o.a.bl r5 = r11.f91509c
            com.google.android.libraries.search.assistant.invocation.o.a.bl r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34049bl.f90749a
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.a.bk r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34048bk) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.bn r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.search.assistant.invocation.o.a.bl r4 = r4.mo39196a()
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r5, r4)
            if (r4 != 0) goto L_0x00e6
            com.google.android.libraries.search.assistant.invocation.o.a.bl r4 = r11.f91509c
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r7)
            com.google.android.libraries.search.assistant.invocation.o.a.bv r5 = r2.f90769a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.invocation.o.a.bw r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw) r5
            r4.getClass()
            r5.f90766c = r4
            int r4 = r5.f90764a
            r4 = r4 | 2
            r5.f90764a = r4
        L_0x00e6:
            com.google.protobuf.a.b r4 = new com.google.protobuf.a.b
            com.google.android.libraries.search.assistant.invocation.o.a.bv r5 = r2.f90769a
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.invocation.o.a.bw r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw) r5
            com.google.protobuf.cj r6 = new com.google.protobuf.cj
            com.google.protobuf.ch r5 = r5.f90767d
            com.google.protobuf.ci r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw.f90761e
            r6.<init>(r5, r7)
            r4.<init>(r6)
            com.google.android.libraries.search.assistant.invocation.o.h.d.n r4 = r10.f91535b
            com.google.android.libraries.search.assistant.invocation.o.e.at r11 = r11.f91508b
            java.util.Set r11 = r4.mo39355a(r11)
            java.lang.String r4 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.bv r4 = r2.f90769a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.libraries.search.assistant.invocation.o.a.bw r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw) r4
            com.google.protobuf.ch r5 = r4.f90767d
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x011e
            com.google.protobuf.ch r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r5)
            r4.f90767d = r5
        L_0x011e:
            java.util.Iterator r11 = r11.iterator()
        L_0x0122:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x0138
            java.lang.Object r5 = r11.next()
            com.google.android.libraries.search.assistant.invocation.o.a.bf r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf) r5
            com.google.protobuf.ch r6 = r4.f90767d
            int r5 = r5.getNumber()
            r6.mo58916g(r5)
            goto L_0x0122
        L_0x0138:
            com.google.android.libraries.search.assistant.invocation.o.a.bw r11 = r2.mo39199a()
            r0.f91532b = r3
            java.lang.Object r11 = r12.mo20883a(r11, r0)
            if (r11 != r1) goto L_0x0145
            return r1
        L_0x0145:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d.C34445j.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
