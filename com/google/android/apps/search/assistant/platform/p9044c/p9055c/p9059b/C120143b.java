package com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b;

import java.util.Set;
import kotlinx.coroutines.p5574b.C71588o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.c.b.b */
/* compiled from: PG */
public final class C120143b implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71588o f334391a;

    /* renamed from: b */
    final /* synthetic */ Set f334392b;

    /* renamed from: c */
    final /* synthetic */ Set f334393c;

    public C120143b(C71588o oVar, Set set, Set set2) {
        this.f334391a = oVar;
        this.f334392b = set;
        this.f334393c = set2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0065 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20883a(java.lang.Object r17, p5462h.p5466c.C69577g r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120142a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.google.android.apps.search.assistant.platform.c.c.b.a r2 = (com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120142a) r2
            int r3 = r2.f334389b
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f334389b = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.platform.c.c.b.a r2 = new com.google.android.apps.search.assistant.platform.c.c.b.a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f334388a
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f334389b
            r5 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r5) goto L_0x002c
            p5462h.C69714l.m101134b(r1)
            goto L_0x011c
        L_0x002c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0034:
            p5462h.C69714l.m101134b(r1)
            kotlinx.coroutines.b.o r1 = r0.f334391a
            r4 = r17
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            h.a.a.k r6 = new h.a.a.k
            r7 = 8
            r6.<init>(r7)
            java.util.Set r7 = r0.f334392b
            java.util.Iterator r7 = r7.iterator()
        L_0x004e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x010f
            java.lang.Object r8 = r7.next()
            com.google.android.libraries.search.assistant.invocation.o.a.bf r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf) r8
            java.util.Set r9 = r0.f334393c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0065:
            boolean r11 = r9.hasNext()
            r12 = 0
            if (r11 == 0) goto L_0x00af
            java.lang.Object r11 = r9.next()
            com.google.android.libraries.search.assistant.invocation.o.e.l r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34201l) r11
            com.google.android.libraries.search.assistant.invocation.o.c.a r14 = r11.f91021b
            com.google.android.libraries.search.assistant.invocation.o.a.b r14 = r14.f90869a
            com.google.android.libraries.search.assistant.invocation.o.a.bf r15 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_UNKNOWN
            com.google.android.libraries.search.assistant.invocation.o.a.b r15 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN
            int r14 = r14.ordinal()
            if (r14 == r5) goto L_0x009c
            r12 = 2
            if (r14 == r12) goto L_0x009c
            r15 = 3
            if (r14 == r15) goto L_0x0097
            r13 = 5
            if (r14 == r13) goto L_0x008e
            r12 = 7
            if (r14 == r12) goto L_0x0097
        L_0x008c:
            r12 = 0
            goto L_0x00a0
        L_0x008e:
            int r13 = r8.ordinal()
            if (r13 == r12) goto L_0x0097
            if (r13 == r15) goto L_0x0097
            goto L_0x008c
        L_0x0097:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            goto L_0x00a0
        L_0x009c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
        L_0x00a0:
            if (r12 == 0) goto L_0x00a8
            h.i r13 = new h.i
            r13.<init>(r11, r12)
            goto L_0x00a9
        L_0x00a8:
            r13 = 0
        L_0x00a9:
            if (r13 == 0) goto L_0x0065
            r10.add(r13)
            goto L_0x0065
        L_0x00af:
            java.util.Iterator r9 = r10.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto L_0x00bb
            r10 = 0
            goto L_0x00ef
        L_0x00bb:
            java.lang.Object r10 = r9.next()
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00ef
            r11 = r10
            h.i r11 = (p5462h.C69685i) r11
            java.lang.Object r11 = r11.f186053b
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
        L_0x00d0:
            java.lang.Object r13 = r9.next()
            r14 = r13
            h.i r14 = (p5462h.C69685i) r14
            java.lang.Object r14 = r14.f186053b
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r11 <= r14) goto L_0x00e3
            r15 = r14
            goto L_0x00e4
        L_0x00e3:
            r15 = r11
        L_0x00e4:
            if (r11 <= r14) goto L_0x00e7
            r10 = r13
        L_0x00e7:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00ef
            r11 = r15
            goto L_0x00d0
        L_0x00ef:
            h.i r10 = (p5462h.C69685i) r10
            if (r10 != 0) goto L_0x00f5
        L_0x00f3:
            r13 = 0
            goto L_0x0108
        L_0x00f5:
            java.lang.Object r9 = r10.f186052a
            com.google.android.libraries.search.assistant.invocation.o.e.l r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2662e.C34201l) r9
            com.google.android.libraries.search.assistant.invocation.o.c.a r10 = r9.f91021b
            com.google.android.libraries.search.assistant.invocation.o.a.b r10 = r10.f90869a
            com.google.android.libraries.search.assistant.invocation.o.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_MAIN_ASSISTANT
            if (r10 != r11) goto L_0x0102
            r12 = 1
        L_0x0102:
            r10 = r12 & r4
            if (r10 == 0) goto L_0x0107
            goto L_0x00f3
        L_0x0107:
            r13 = r9
        L_0x0108:
            if (r13 == 0) goto L_0x004e
            r6.put(r8, r13)
            goto L_0x004e
        L_0x010f:
            java.util.Map r4 = p5462h.p5463a.C69505av.m100861c(r6)
            r2.f334389b = r5
            java.lang.Object r1 = r1.mo20883a(r4, r2)
            if (r1 != r3) goto L_0x011c
            return r3
        L_0x011c:
            h.q r1 = p5462h.C69788q.f186170a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9059b.C120143b.mo20883a(java.lang.Object, h.c.g):java.lang.Object");
    }
}
