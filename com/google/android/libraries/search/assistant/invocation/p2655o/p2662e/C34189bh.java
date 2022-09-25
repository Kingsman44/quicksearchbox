package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.bh */
/* compiled from: PG */
public final class C34189bh implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f91008a;

    public C34189bh(C71588o oVar) {
        this.f91008a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r17, p5462h.p5466c.C69577g r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34188bg
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.libraries.search.assistant.invocation.o.e.bg r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34188bg) r2
            int r3 = r2.f91006b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91006b = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.o.e.bg r2 = new com.google.android.libraries.search.assistant.invocation.o.e.bg
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f91005a
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f91006b
            r5 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r5) goto L_0x002c
            p5462h.C69714l.m101134b(r1)
            goto L_0x0176
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0034:
            p5462h.C69714l.m101134b(r1)
            kotlinx.coroutines.b.o r1 = r0.f91008a
            r4 = r17
            com.google.android.libraries.search.assistant.invocation.o.e.at r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34174at) r4
            com.google.android.libraries.search.assistant.invocation.o.e.g r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34196g.f91014b
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.e.e r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34194e) r6
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.lang.String r8 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r8)
            java.util.Set r4 = r4.mo39238b()
            java.util.Iterator r4 = r4.iterator()
        L_0x0057:
            boolean r9 = r4.hasNext()
            java.lang.String r10 = "_builder.build()"
            if (r9 == 0) goto L_0x0163
            java.lang.Object r9 = r4.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r11 = r9.getKey()
            com.google.android.libraries.search.assistant.invocation.o.a.bf r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf) r11
            java.lang.Object r9 = r9.getValue()
            com.google.android.libraries.search.assistant.invocation.o.e.au r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34175au) r9
            com.google.protobuf.a.c r12 = new com.google.protobuf.a.c
            com.google.protobuf.bv r13 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.e.g r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34196g) r13
            com.google.protobuf.dn r13 = r13.f91016a
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r13)
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r13)
            java.lang.String r14 = "_builder.getMappingMap()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            r12.<init>(r13)
            int r11 = r11.getNumber()
            com.google.android.libraries.search.assistant.invocation.o.e.b r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b.f90992h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.e.a r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34154a) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r8)
            com.google.android.libraries.search.assistant.invocation.o.c.b r13 = r9.f90972b
            com.google.android.libraries.search.assistant.invocation.o.c.a r13 = r13.f90872a
            com.google.android.libraries.search.assistant.invocation.o.a.b r13 = r13.f90869a
            java.lang.String r14 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r14)
            r12.copyOnWrite()
            com.google.protobuf.bv r15 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r15 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r15
            int r13 = r13.getNumber()
            r15.f90995b = r13
            int r13 = r15.f90994a
            r13 = r13 | r5
            r15.f90994a = r13
            com.google.android.libraries.search.assistant.invocation.o.c.b r13 = r9.f90972b
            com.google.android.libraries.search.assistant.invocation.o.c.a r13 = r13.f90872a
            com.google.apps.tiktok.account.AccountId r13 = r13.f90870b
            int r13 = r13.mo50068a()
            r12.copyOnWrite()
            com.google.protobuf.bv r15 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r15 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r15
            int r5 = r15.f90994a
            r5 = r5 | 2
            r15.f90994a = r5
            r15.f90996c = r13
            com.google.android.libraries.search.assistant.invocation.o.c.b r5 = r9.f90972b
            com.google.android.libraries.search.assistant.invocation.o.c.a r5 = r5.f90872a
            java.lang.String r5 = r5.f90871c
            if (r5 == 0) goto L_0x00e8
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r13
            int r15 = r13.f90994a
            r15 = r15 | 4
            r13.f90994a = r15
            r13.f90997d = r5
        L_0x00e8:
            com.google.android.libraries.search.assistant.invocation.o.c.b r5 = r9.f90972b
            java.lang.Object r5 = r5.f90873b
            com.google.android.libraries.search.assistant.invocation.o.a.ad r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad) r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r14)
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r13
            r5.getClass()
            r13.f90998e = r5
            int r5 = r13.f90994a
            r5 = r5 | 8
            r13.f90994a = r5
            com.google.android.libraries.search.assistant.invocation.o.c.b r5 = r9.f90972b
            r17 = r4
            long r4 = r5.f90875d
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r13 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r13
            int r15 = r13.f90994a
            r15 = r15 | 16
            r13.f90994a = r15
            r13.f90999f = r4
            com.google.android.libraries.search.assistant.invocation.o.h.a.a r4 = r9.f90971a
            java.lang.String r4 = r4.mo39322c()
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r14)
            r12.copyOnWrite()
            com.google.protobuf.bv r5 = r12.instance
            com.google.android.libraries.search.assistant.invocation.o.e.b r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r5
            r4.getClass()
            int r9 = r5.f90994a
            r9 = r9 | 32
            r5.f90994a = r9
            r5.f91000g = r4
            com.google.protobuf.bv r4 = r12.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            com.google.android.libraries.search.assistant.invocation.o.e.b r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34181b) r4
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r14)
            r4.getClass()
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.libraries.search.assistant.invocation.o.e.g r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34196g) r5
            com.google.protobuf.dn r9 = r5.f91016a
            boolean r10 = r9.f170058b
            if (r10 != 0) goto L_0x0155
            com.google.protobuf.dn r9 = r9.mo58980a()
            r5.f91016a = r9
        L_0x0155:
            com.google.protobuf.dn r5 = r5.f91016a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r5.put(r9, r4)
            r4 = r17
            r5 = 1
            goto L_0x0057
        L_0x0163:
            com.google.protobuf.bv r4 = r6.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            com.google.android.libraries.search.assistant.invocation.o.e.g r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34196g) r4
            r5 = 1
            r2.f91006b = r5
            java.lang.Object r1 = r1.mo20883a(r4, r2)
            if (r1 != r3) goto L_0x0176
            return r3
        L_0x0176:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34189bh.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
