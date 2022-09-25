package com.google.android.libraries.social.populous.logging;

import com.google.android.gms.clearcut.C143623ad;
import com.google.android.libraries.social.populous.p3289c.p3291b.C42213b;

/* renamed from: com.google.android.libraries.social.populous.logging.d */
/* compiled from: PG */
public final class C42569d implements C42566ad {

    /* renamed from: a */
    private final C42582q f111714a;

    /* renamed from: b */
    private final C143623ad f111715b;

    /* renamed from: c */
    private final C42213b f111716c;

    public C42569d(C42213b bVar, C42582q qVar, C143623ad adVar) {
        this.f111714a = qVar;
        this.f111716c = bVar;
        this.f111715b = adVar;
    }

    /* renamed from: b */
    private static int m75125b(int i) {
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    return 2;
                case 2:
                    return 3;
                case 3:
                    return 4;
                case 4:
                    return 5;
                case 5:
                    return 6;
                case 6:
                    return 7;
                case 7:
                    return 8;
                case 8:
                    return 9;
                default:
                    return 1;
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x062d  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x077a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45645a(com.google.android.libraries.social.populous.logging.LogEvent r21, boolean r22) {
        /*
            r20 = this;
            r0 = r20
            if (r22 != 0) goto L_0x0031
            e.a.a.w.a.ah r1 = p5304e.p5305a.p5306a.p5442w.p5443a.C69288ah.f185401a
            e.a.a.w.a.ai r1 = r1.mo6453a()
            boolean r1 = r1.mo60943a()
            if (r1 == 0) goto L_0x0031
            com.google.common.b.gu r1 = r21.mo45597d()
            com.google.android.libraries.social.populous.logging.c r2 = com.google.android.libraries.social.populous.logging.C42568c.f111713a
            java.lang.Iterable r1 = com.google.common.p4522b.C58557jl.m90124e(r1, r2)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89841i(r1)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0025
            return
        L_0x0025:
            com.google.android.libraries.social.populous.logging.v r2 = r21.mo45596c()
            r2.mo45644b(r1)
            com.google.android.libraries.social.populous.logging.LogEvent r1 = r2.mo45643a()
            goto L_0x0033
        L_0x0031:
            r1 = r21
        L_0x0033:
            com.google.android.libraries.social.populous.logging.q r2 = r0.f111714a
            java.lang.String r3 = "event is a required parameter"
            com.google.common.base.C58838bb.m90866a(r1, r3)
            o.c.g r3 = p5602o.p5607c.C71936g.f191596f
            com.google.protobuf.bn r3 = r3.createBuilder()
            o.c.f r3 = (p5602o.p5607c.C71935f) r3
            long r4 = r1.mo45594a()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            o.c.g r6 = (p5602o.p5607c.C71936g) r6
            int r7 = r6.f191598a
            r8 = 2
            r7 = r7 | r8
            r6.f191598a = r7
            r6.f191600c = r4
            long r4 = r1.mo45595b()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            o.c.g r6 = (p5602o.p5607c.C71936g) r6
            int r7 = r6.f191598a
            r9 = 4
            r7 = r7 | r9
            r6.f191598a = r7
            r6.f191601d = r4
            java.lang.Long r4 = r1.mo45601g()
            r5 = 1
            if (r4 == 0) goto L_0x0085
            java.lang.Long r4 = r1.mo45601g()
            long r6 = r4.longValue()
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            o.c.g r4 = (p5602o.p5607c.C71936g) r4
            int r10 = r4.f191598a
            r10 = r10 | r5
            r4.f191598a = r10
            r4.f191599b = r6
        L_0x0085:
            java.lang.Integer r4 = r1.mo45598e()
            if (r4 == 0) goto L_0x00a2
            java.lang.Integer r4 = r1.mo45598e()
            int r4 = r4.intValue()
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            o.c.g r6 = (p5602o.p5607c.C71936g) r6
            int r7 = r6.f191598a
            r7 = r7 | 16
            r6.f191598a = r7
            r6.f191602e = r4
        L_0x00a2:
            o.c.e r4 = p5602o.p5607c.C71934e.f191590e
            com.google.protobuf.bn r4 = r4.createBuilder()
            o.c.d r4 = (p5602o.p5607c.C71933d) r4
            int r6 = r1.mo45612k()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            o.c.e r7 = (p5602o.p5607c.C71934e) r7
            int r10 = r7.f191592a
            r10 = r10 | r5
            r7.f191592a = r10
            r7.f191593b = r6
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            o.c.e r6 = (p5602o.p5607c.C71934e) r6
            com.google.protobuf.bv r3 = r3.build()
            o.c.g r3 = (p5602o.p5607c.C71936g) r3
            r3.getClass()
            r6.f191595d = r3
            int r3 = r6.f191592a
            r3 = r3 | r9
            r6.f191592a = r3
            e.a.a.w.a.ah r3 = p5304e.p5305a.p5306a.p5442w.p5443a.C69288ah.f185401a
            e.a.a.w.a.ai r3 = r3.mo6453a()
            boolean r3 = r3.mo60947e()
            r6 = 3
            if (r3 == 0) goto L_0x0101
            int r3 = r1.mo45605j()
            if (r3 != r6) goto L_0x0101
            java.lang.String r3 = r1.mo45602h()
            if (r3 == 0) goto L_0x0101
            java.lang.String r3 = r1.mo45602h()
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            o.c.e r7 = (p5602o.p5607c.C71934e) r7
            r3.getClass()
            int r10 = r7.f191592a
            r10 = r10 | r8
            r7.f191592a = r10
            r7.f191594c = r3
        L_0x0101:
            o.c.af r3 = p5602o.p5607c.C71929af.f191569f
            com.google.protobuf.bn r3 = r3.createBuilder()
            o.c.ae r3 = (p5602o.p5607c.C71928ae) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            o.c.af r7 = (p5602o.p5607c.C71929af) r7
            com.google.protobuf.bv r4 = r4.build()
            o.c.e r4 = (p5602o.p5607c.C71934e) r4
            r4.getClass()
            r7.f191572b = r4
            int r4 = r7.f191571a
            r4 = r4 | r5
            r7.f191571a = r4
            int r4 = r1.mo45605j()
            r7 = 0
            if (r4 == r8) goto L_0x012d
            int r4 = r1.mo45605j()
            if (r4 != r6) goto L_0x0178
        L_0x012d:
            com.google.common.b.gu r4 = r1.mo45597d()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0178
            com.google.common.b.gu r4 = r1.mo45597d()
            java.lang.Object r4 = r4.get(r7)
            com.google.android.libraries.social.populous.logging.LogEntity r4 = (com.google.android.libraries.social.populous.logging.LogEntity) r4
            java.lang.Integer r4 = r4.mo45571e()
            if (r4 == 0) goto L_0x0178
            o.c.k r10 = p5602o.p5607c.C71940k.f191604c
            com.google.protobuf.bn r10 = r10.createBuilder()
            o.c.j r10 = (p5602o.p5607c.C71939j) r10
            int r4 = r4.intValue()
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            o.c.k r11 = (p5602o.p5607c.C71940k) r11
            int r12 = r11.f191606a
            r12 = r12 | r8
            r11.f191606a = r12
            r11.f191607b = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            o.c.af r4 = (p5602o.p5607c.C71929af) r4
            com.google.protobuf.bv r10 = r10.build()
            o.c.k r10 = (p5602o.p5607c.C71940k) r10
            r10.getClass()
            r4.f191574d = r10
            int r10 = r4.f191571a
            r10 = r10 | r9
            r4.f191571a = r10
        L_0x0178:
            o.c.c r4 = p5602o.p5607c.C71932c.f191583f
            com.google.protobuf.bn r4 = r4.createBuilder()
            o.c.b r4 = (p5602o.p5607c.C71931b) r4
            java.lang.Long r10 = r1.mo45600f()
            if (r10 == 0) goto L_0x0188
            r10 = 1
            goto L_0x0189
        L_0x0188:
            r10 = 0
        L_0x0189:
            if (r10 == 0) goto L_0x01c6
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Long r12 = r1.mo45600f()
            long r12 = r12.longValue()
            long r11 = r11.toMicros(r12)
            r4.copyOnWrite()
            com.google.protobuf.bv r13 = r4.instance
            o.c.c r13 = (p5602o.p5607c.C71932c) r13
            int r14 = r13.f191585a
            r14 = r14 | r9
            r13.f191585a = r14
            r13.f191588d = r11
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r12 = java.lang.System.currentTimeMillis()
            long r11 = r11.toMicros(r12)
            com.google.protobuf.bv r13 = r4.instance
            o.c.c r13 = (p5602o.p5607c.C71932c) r13
            long r13 = r13.f191588d
            r4.copyOnWrite()
            com.google.protobuf.bv r15 = r4.instance
            o.c.c r15 = (p5602o.p5607c.C71932c) r15
            int r7 = r15.f191585a
            r7 = r7 | r8
            r15.f191585a = r7
            long r11 = r11 - r13
            r15.f191587c = r11
        L_0x01c6:
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            o.c.c r7 = (p5602o.p5607c.C71932c) r7
            int r11 = r7.f191585a
            r11 = r11 | r5
            r7.f191585a = r11
            r7.f191586b = r10
            boolean r7 = r1.mo45604i()
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            o.c.c r10 = (p5602o.p5607c.C71932c) r10
            int r11 = r10.f191585a
            r12 = 8
            r11 = r11 | r12
            r10.f191585a = r11
            r10.f191589e = r7
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            o.c.af r7 = (p5602o.p5607c.C71929af) r7
            com.google.protobuf.bv r4 = r4.build()
            o.c.c r4 = (p5602o.p5607c.C71932c) r4
            r4.getClass()
            r7.f191575e = r4
            int r4 = r7.f191571a
            r4 = r4 | 16
            r7.f191571a = r4
            java.lang.Integer r4 = r1.mo45598e()
            if (r4 == 0) goto L_0x021c
            java.lang.Integer r4 = r1.mo45598e()
            int r4 = r4.intValue()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            o.c.af r7 = (p5602o.p5607c.C71929af) r7
            int r10 = r7.f191571a
            r10 = r10 | r8
            r7.f191571a = r10
            r7.f191573c = r4
        L_0x021c:
            o.c.ag r4 = p5602o.p5607c.C71930ag.f191576f
            com.google.protobuf.bn r4 = r4.createBuilder()
            o.c.h r4 = (p5602o.p5607c.C71937h) r4
            int r7 = r1.mo45605j()
            int r10 = r7 + -1
            if (r7 == 0) goto L_0x077c
            switch(r10) {
                case 1: goto L_0x0242;
                case 2: goto L_0x0240;
                case 3: goto L_0x023d;
                case 4: goto L_0x023a;
                case 5: goto L_0x0237;
                case 6: goto L_0x0234;
                case 7: goto L_0x0231;
                default: goto L_0x022f;
            }
        L_0x022f:
            r7 = 1
            goto L_0x0243
        L_0x0231:
            r7 = 11
            goto L_0x0243
        L_0x0234:
            r7 = 10
            goto L_0x0243
        L_0x0237:
            r7 = 8
            goto L_0x0243
        L_0x023a:
            r7 = 9
            goto L_0x0243
        L_0x023d:
            r7 = 18
            goto L_0x0243
        L_0x0240:
            r7 = 3
            goto L_0x0243
        L_0x0242:
            r7 = 2
        L_0x0243:
            r4.copyOnWrite()
            com.google.protobuf.bv r10 = r4.instance
            o.c.ag r10 = (p5602o.p5607c.C71930ag) r10
            int r7 = r7 + -1
            r10.f191579b = r7
            int r7 = r10.f191578a
            r7 = r7 | r5
            r10.f191578a = r7
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            o.c.ag r7 = (p5602o.p5607c.C71930ag) r7
            com.google.protobuf.bv r3 = r3.build()
            o.c.af r3 = (p5602o.p5607c.C71929af) r3
            r3.getClass()
            r7.f191581d = r3
            int r3 = r7.f191578a
            r3 = r3 | r9
            r7.f191578a = r3
            com.google.common.b.gu r3 = r1.mo45597d()
            int r7 = r3.size()
            r10 = 0
        L_0x0273:
            if (r10 >= r7) goto L_0x05c1
            java.lang.Object r13 = r3.get(r10)
            com.google.android.libraries.social.populous.logging.LogEntity r13 = (com.google.android.libraries.social.populous.logging.LogEntity) r13
            o.c.q r14 = p5602o.p5607c.C71946q.f191621e
            com.google.protobuf.bn r14 = r14.createBuilder()
            o.c.p r14 = (p5602o.p5607c.C71945p) r14
            o.c.w r15 = p5602o.p5607c.C71952w.f191645c
            com.google.protobuf.bn r15 = r15.createBuilder()
            o.c.v r15 = (p5602o.p5607c.C71951v) r15
            if (r22 != 0) goto L_0x02b4
            int r16 = r1.mo45612k()
            if (r16 != 0) goto L_0x029a
            com.google.android.libraries.social.populous.core.ClientConfigInternal r11 = r2.f111750b
            int r11 = r11.f110716R
            if (r11 != r8) goto L_0x02a1
            goto L_0x02b4
        L_0x029a:
            com.google.android.libraries.social.populous.core.ClientConfigInternal r11 = r2.f111750b
            int r11 = r11.f110717S
            if (r11 != r8) goto L_0x02a1
            goto L_0x02b4
        L_0x02a1:
            int r11 = r13.mo45568b()
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            o.c.w r9 = (p5602o.p5607c.C71952w) r9
            int r6 = r9.f191647a
            r6 = r6 | r5
            r9.f191647a = r6
            r9.f191648b = r11
            goto L_0x02c6
        L_0x02b4:
            int r6 = r13.mo45569c()
            r15.copyOnWrite()
            com.google.protobuf.bv r9 = r15.instance
            o.c.w r9 = (p5602o.p5607c.C71952w) r9
            int r11 = r9.f191647a
            r11 = r11 | r5
            r9.f191647a = r11
            r9.f191648b = r6
        L_0x02c6:
            o.c.u r6 = p5602o.p5607c.C71950u.f191635i
            com.google.protobuf.bn r6 = r6.createBuilder()
            o.c.t r6 = (p5602o.p5607c.C71949t) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            com.google.protobuf.bv r11 = r15.build()
            o.c.w r11 = (p5602o.p5607c.C71952w) r11
            r11.getClass()
            r9.f191638b = r11
            int r11 = r9.f191637a
            r11 = r11 | r5
            r9.f191637a = r11
            if (r22 == 0) goto L_0x037f
            java.lang.String r9 = r13.mo45579k()
            if (r9 == 0) goto L_0x02fc
            r14.copyOnWrite()
            com.google.protobuf.bv r11 = r14.instance
            o.c.q r11 = (p5602o.p5607c.C71946q) r11
            int r15 = r11.f191623a
            r15 = r15 | r5
            r11.f191623a = r15
            r11.f191624b = r9
            goto L_0x030f
        L_0x02fc:
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            o.c.q r9 = (p5602o.p5607c.C71946q) r9
            int r11 = r9.f191623a
            r11 = r11 & -2
            r9.f191623a = r11
            o.c.q r11 = p5602o.p5607c.C71946q.f191621e
            java.lang.String r11 = r11.f191624b
            r9.f191624b = r11
        L_0x030f:
            com.google.protobuf.bv r9 = r14.instance
            o.c.q r9 = (p5602o.p5607c.C71946q) r9
            o.c.s r9 = r9.f191625c
            if (r9 != 0) goto L_0x0319
            o.c.s r9 = p5602o.p5607c.C71948s.f191627g
        L_0x0319:
            com.google.protobuf.bn r9 = r9.toBuilder()
            o.c.r r9 = (p5602o.p5607c.C71947r) r9
            java.lang.String r11 = r13.mo45577i()
            if (r11 == 0) goto L_0x0333
            r9.copyOnWrite()
            com.google.protobuf.bv r15 = r9.instance
            o.c.s r15 = (p5602o.p5607c.C71948s) r15
            int r8 = r15.f191629a
            r8 = r8 | r12
            r15.f191629a = r8
            r15.f191633e = r11
        L_0x0333:
            java.lang.Long r8 = r13.mo45573f()
            r15 = r6
            if (r8 == 0) goto L_0x034d
            long r5 = r8.longValue()
            r9.copyOnWrite()
            com.google.protobuf.bv r8 = r9.instance
            o.c.s r8 = (p5602o.p5607c.C71948s) r8
            int r11 = r8.f191629a
            r11 = r11 | 16
            r8.f191629a = r11
            r8.f191634f = r5
        L_0x034d:
            int r5 = r13.mo45593x()
            int r5 = m75125b(r5)
            r9.copyOnWrite()
            com.google.protobuf.bv r6 = r9.instance
            o.c.s r6 = (p5602o.p5607c.C71948s) r6
            int r5 = r5 + -1
            r6.f191630b = r5
            int r5 = r6.f191629a
            r8 = 1
            r5 = r5 | r8
            r6.f191629a = r5
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            o.c.q r5 = (p5602o.p5607c.C71946q) r5
            com.google.protobuf.bv r6 = r9.build()
            o.c.s r6 = (p5602o.p5607c.C71948s) r6
            r6.getClass()
            r5.f191625c = r6
            int r6 = r5.f191623a
            r8 = 2
            r6 = r6 | r8
            r5.f191623a = r6
            goto L_0x03d3
        L_0x037f:
            r15 = r6
            java.lang.String r5 = r13.mo45578j()
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            o.c.q r6 = (p5602o.p5607c.C71946q) r6
            r5.getClass()
            int r8 = r6.f191623a
            r9 = 1
            r8 = r8 | r9
            r6.f191623a = r8
            r6.f191624b = r5
            o.c.s r5 = r6.f191625c
            if (r5 != 0) goto L_0x039c
            o.c.s r5 = p5602o.p5607c.C71948s.f191627g
        L_0x039c:
            com.google.protobuf.bn r5 = r5.toBuilder()
            o.c.r r5 = (p5602o.p5607c.C71947r) r5
            int r6 = r13.mo45592w()
            int r6 = m75125b(r6)
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            o.c.s r8 = (p5602o.p5607c.C71948s) r8
            int r6 = r6 + -1
            r8.f191630b = r6
            int r6 = r8.f191629a
            r9 = 1
            r6 = r6 | r9
            r8.f191629a = r6
            r14.copyOnWrite()
            com.google.protobuf.bv r6 = r14.instance
            o.c.q r6 = (p5602o.p5607c.C71946q) r6
            com.google.protobuf.bv r5 = r5.build()
            o.c.s r5 = (p5602o.p5607c.C71948s) r5
            r5.getClass()
            r6.f191625c = r5
            int r5 = r6.f191623a
            r8 = 2
            r5 = r5 | r8
            r6.f191623a = r5
        L_0x03d3:
            com.google.protobuf.bv r5 = r14.instance
            o.c.q r5 = (p5602o.p5607c.C71946q) r5
            o.c.s r5 = r5.f191625c
            if (r5 != 0) goto L_0x03dd
            o.c.s r5 = p5602o.p5607c.C71948s.f191627g
        L_0x03dd:
            com.google.protobuf.bn r5 = r5.toBuilder()
            o.c.r r5 = (p5602o.p5607c.C71947r) r5
            int r6 = r1.mo45605j()
            r8 = 5
            if (r6 == r8) goto L_0x0408
            int r6 = r1.mo45605j()
            if (r6 == r12) goto L_0x0408
            int r6 = r1.mo45605j()
            r8 = 7
            if (r6 == r8) goto L_0x0408
            int r6 = r1.mo45605j()
            r8 = 3
            if (r6 != r8) goto L_0x0405
            boolean r6 = r13.mo45611C()
            if (r6 == 0) goto L_0x0405
            goto L_0x0408
        L_0x0405:
            r8 = r15
            goto L_0x0483
        L_0x0408:
            java.lang.String r6 = r13.mo45575h()
            if (r6 == 0) goto L_0x041f
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            o.c.s r8 = (p5602o.p5607c.C71948s) r8
            int r9 = r8.f191629a
            r18 = 2
            r9 = r9 | 2
            r8.f191629a = r9
            r8.f191631c = r6
        L_0x041f:
            java.lang.String r6 = r13.mo45580l()
            if (r6 == 0) goto L_0x0436
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            o.c.s r8 = (p5602o.p5607c.C71948s) r8
            int r9 = r8.f191629a
            r17 = 4
            r9 = r9 | 4
            r8.f191629a = r9
            r8.f191632d = r6
        L_0x0436:
            java.lang.String r6 = r13.mo45577i()
            if (r6 == 0) goto L_0x044a
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            o.c.s r8 = (p5602o.p5607c.C71948s) r8
            int r9 = r8.f191629a
            r9 = r9 | r12
            r8.f191629a = r9
            r8.f191633e = r6
        L_0x044a:
            o.c.y r6 = p5602o.p5607c.C71954y.f191649c
            com.google.protobuf.bn r6 = r6.createBuilder()
            o.c.x r6 = (p5602o.p5607c.C71953x) r6
            java.lang.String r8 = r13.mo45574g()
            r6.copyOnWrite()
            com.google.protobuf.bv r9 = r6.instance
            o.c.y r9 = (p5602o.p5607c.C71954y) r9
            r8.getClass()
            int r11 = r9.f191651a
            r19 = 1
            r11 = r11 | 1
            r9.f191651a = r11
            r9.f191652b = r8
            r15.copyOnWrite()
            r8 = r15
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            com.google.protobuf.bv r6 = r6.build()
            o.c.y r6 = (p5602o.p5607c.C71954y) r6
            r6.getClass()
            r9.f191639c = r6
            int r6 = r9.f191637a
            r11 = 2
            r6 = r6 | r11
            r9.f191637a = r6
        L_0x0483:
            e.a.a.w.a.ah r6 = p5304e.p5305a.p5306a.p5442w.p5443a.C69288ah.f185401a
            e.a.a.w.a.ai r6 = r6.mo6453a()
            boolean r6 = r6.mo60946d()
            if (r6 == 0) goto L_0x04a1
            boolean r6 = r13.mo45591v()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            int r11 = r9.f191637a
            r11 = r11 | r12
            r9.f191637a = r11
            r9.f191642f = r6
        L_0x04a1:
            boolean r6 = r13.mo45590u()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            int r11 = r9.f191637a
            r11 = r11 | 16
            r9.f191637a = r11
            r9.f191643g = r6
            o.c.m r6 = r13.mo45584p()
            if (r6 == 0) goto L_0x04d0
            o.c.m r6 = r13.mo45584p()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            r6.getClass()
            r9.f191644h = r6
            int r6 = r9.f191637a
            r6 = r6 | 32
            r9.f191637a = r6
        L_0x04d0:
            java.util.EnumSet r6 = r13.mo45583o()
            r14.copyOnWrite()
            com.google.protobuf.bv r9 = r14.instance
            o.c.q r9 = (p5602o.p5607c.C71946q) r9
            com.google.protobuf.bv r5 = r5.build()
            o.c.s r5 = (p5602o.p5607c.C71948s) r5
            r5.getClass()
            r9.f191625c = r5
            int r5 = r9.f191623a
            r11 = 2
            r5 = r5 | r11
            r9.f191623a = r5
            int r5 = r6.size()
            o.c.aa[] r5 = new p5602o.p5607c.C71924aa[r5]
            java.util.Iterator r9 = r6.iterator()
            r11 = 0
        L_0x04f7:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L_0x050f
            int r15 = r11 + 1
            java.lang.Object r19 = r9.next()
            r12 = r19
            com.google.android.libraries.social.populous.core.dc r12 = (com.google.android.libraries.social.populous.core.C42331dc) r12
            o.c.aa r12 = r12.f111028o
            r5[r11] = r12
            r11 = r15
            r12 = 8
            goto L_0x04f7
        L_0x050f:
            java.util.List r5 = java.util.Arrays.asList(r5)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            com.google.protobuf.ch r11 = r9.f191640d
            boolean r12 = r11.mo58948c()
            if (r12 != 0) goto L_0x0528
            com.google.protobuf.ch r11 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r11)
            r9.f191640d = r11
        L_0x0528:
            java.util.Iterator r5 = r5.iterator()
        L_0x052c:
            boolean r11 = r5.hasNext()
            if (r11 == 0) goto L_0x0540
            java.lang.Object r11 = r5.next()
            o.c.aa r11 = (p5602o.p5607c.C71924aa) r11
            com.google.protobuf.ch r12 = r9.f191640d
            int r11 = r11.f191566o
            r12.mo58916g(r11)
            goto L_0x052c
        L_0x0540:
            boolean r5 = r13.mo45585q()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            o.c.u r9 = (p5602o.p5607c.C71950u) r9
            int r11 = r9.f191637a
            r12 = 4
            r11 = r11 | r12
            r9.f191637a = r11
            r9.f191641e = r5
            r14.copyOnWrite()
            com.google.protobuf.bv r5 = r14.instance
            o.c.q r5 = (p5602o.p5607c.C71946q) r5
            com.google.protobuf.bv r8 = r8.build()
            o.c.u r8 = (p5602o.p5607c.C71950u) r8
            r8.getClass()
            r5.f191626d = r8
            int r8 = r5.f191623a
            r8 = r8 | r12
            r5.f191623a = r8
            com.google.protobuf.bv r5 = r4.instance
            o.c.ag r5 = (p5602o.p5607c.C71930ag) r5
            int r5 = r5.f191579b
            int r5 = p5602o.p5607c.C71927ad.m105229a(r5)
            if (r5 != 0) goto L_0x0578
            r8 = 3
            goto L_0x0594
        L_0x0578:
            r8 = 3
            if (r5 != r8) goto L_0x0594
            com.google.android.libraries.social.populous.core.dc r5 = com.google.android.libraries.social.populous.core.C42331dc.PREPOPULATED
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L_0x0594
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            o.c.ag r5 = (p5602o.p5607c.C71930ag) r5
            r6 = 15
            r5.f191579b = r6
            int r6 = r5.f191578a
            r9 = 1
            r6 = r6 | r9
            r5.f191578a = r6
        L_0x0594:
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            o.c.ag r5 = (p5602o.p5607c.C71930ag) r5
            com.google.protobuf.bv r6 = r14.build()
            o.c.q r6 = (p5602o.p5607c.C71946q) r6
            r6.getClass()
            com.google.protobuf.cq r9 = r5.f191580c
            boolean r12 = r9.mo58948c()
            if (r12 != 0) goto L_0x05b2
            com.google.protobuf.cq r9 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r9)
            r5.f191580c = r9
        L_0x05b2:
            com.google.protobuf.cq r5 = r5.f191580c
            r5.add(r6)
            int r10 = r10 + 1
            r5 = 1
            r6 = 3
            r8 = 2
            r9 = 4
            r12 = 8
            goto L_0x0273
        L_0x05c1:
            com.google.by.a.a.e r3 = com.google.p4420by.p4421a.p4422a.C57868e.f154587c
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.by.a.a.d r3 = (com.google.p4420by.p4421a.p4422a.C57867d) r3
            com.google.android.libraries.social.populous.core.ClientConfigInternal r5 = r2.f111750b
            int r5 = r5.f110715Q
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.by.a.a.e r6 = (com.google.p4420by.p4421a.p4422a.C57868e) r6
            int r5 = r5 + -1
            r6.f154590b = r5
            int r5 = r6.f154589a
            r7 = 2
            r5 = r5 | r7
            r6.f154589a = r5
            com.google.protobuf.bv r3 = r3.build()
            com.google.by.a.a.e r3 = (com.google.p4420by.p4421a.p4422a.C57868e) r3
            o.c.o r5 = p5602o.p5607c.C71944o.f191610j
            com.google.protobuf.bn r5 = r5.createBuilder()
            o.c.n r5 = (p5602o.p5607c.C71943n) r5
            com.google.android.libraries.social.populous.core.ClientVersion r6 = r2.f111752d
            java.lang.String r6 = r6.mo44953c()
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            o.c.o r7 = (p5602o.p5607c.C71944o) r7
            r6.getClass()
            int r8 = r7.f191612a
            r9 = 8
            r8 = r8 | r9
            r7.f191612a = r8
            r7.f191616e = r6
            e.a.a.w.a.ah r6 = p5304e.p5305a.p5306a.p5442w.p5443a.C69288ah.f185401a
            e.a.a.w.a.ai r6 = r6.mo6453a()
            boolean r6 = r6.mo60945c()
            if (r6 == 0) goto L_0x0639
            com.google.common.b.gu r6 = r1.mo45597d()
            int r7 = r6.size()
            r8 = 0
            r9 = 0
        L_0x061b:
            if (r8 >= r7) goto L_0x062b
            java.lang.Object r9 = r6.get(r8)
            com.google.android.libraries.social.populous.logging.LogEntity r9 = (com.google.android.libraries.social.populous.logging.LogEntity) r9
            boolean r9 = r9.mo45588t()
            int r8 = r8 + 1
            if (r9 != 0) goto L_0x061b
        L_0x062b:
            if (r9 == 0) goto L_0x0639
            if (r22 == 0) goto L_0x0634
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            int r1 = r1.f110822c
            goto L_0x0681
        L_0x0634:
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            int r1 = r1.f110825f
            goto L_0x0681
        L_0x0639:
            com.google.common.b.gu r6 = r1.mo45597d()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0644
            goto L_0x0668
        L_0x0644:
            com.google.common.b.gu r6 = r1.mo45597d()
            int r7 = r6.size()
            r8 = 0
        L_0x064d:
            if (r8 >= r7) goto L_0x0684
            java.lang.Object r9 = r6.get(r8)
            com.google.android.libraries.social.populous.logging.LogEntity r9 = (com.google.android.libraries.social.populous.logging.LogEntity) r9
            if (r22 == 0) goto L_0x065c
            java.util.EnumSet r9 = r9.mo45582n()
            goto L_0x0660
        L_0x065c:
            java.util.EnumSet r9 = r9.mo45583o()
        L_0x0660:
            int r8 = r8 + 1
            boolean r9 = com.google.android.libraries.social.populous.core.C42331dc.m74557b(r9)
            if (r9 != 0) goto L_0x064d
        L_0x0668:
            int r1 = r1.mo45612k()
            if (r1 != 0) goto L_0x0678
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            if (r22 == 0) goto L_0x0675
            int r1 = r1.f110821b
            goto L_0x0681
        L_0x0675:
            int r1 = r1.f110824e
            goto L_0x0681
        L_0x0678:
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            if (r22 == 0) goto L_0x067f
            int r1 = r1.f110820a
            goto L_0x0681
        L_0x067f:
            int r1 = r1.f110823d
        L_0x0681:
            r19 = r1
            goto L_0x06c0
        L_0x0684:
            com.google.common.b.gu r1 = r1.mo45597d()
            r6 = 0
            java.lang.Object r1 = r1.get(r6)
            com.google.android.libraries.social.populous.logging.LogEntity r1 = (com.google.android.libraries.social.populous.logging.LogEntity) r1
            if (r22 == 0) goto L_0x0696
            java.util.EnumSet r1 = r1.mo45582n()
            goto L_0x069a
        L_0x0696:
            java.util.EnumSet r1 = r1.mo45583o()
        L_0x069a:
            com.google.android.libraries.social.populous.core.dc r6 = com.google.android.libraries.social.populous.core.C42331dc.SMART_ADDRESS_EXPANSION
            boolean r6 = r1.contains(r6)
            if (r6 == 0) goto L_0x06ac
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            if (r22 == 0) goto L_0x06a9
            int r1 = r1.f110826g
            goto L_0x0681
        L_0x06a9:
            int r1 = r1.f110827h
            goto L_0x0681
        L_0x06ac:
            com.google.android.libraries.social.populous.core.dc r6 = com.google.android.libraries.social.populous.core.C42331dc.SMART_ADDRESS_REPLACEMENT
            boolean r1 = r1.contains(r6)
            if (r1 == 0) goto L_0x06be
            com.google.android.libraries.social.populous.core.SocialAffinityAllEventSource r1 = r2.f111751c
            if (r22 == 0) goto L_0x06bb
            int r1 = r1.f110828i
            goto L_0x0681
        L_0x06bb:
            int r1 = r1.f110829j
            goto L_0x0681
        L_0x06be:
            r19 = 1
        L_0x06c0:
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            o.c.o r1 = (p5602o.p5607c.C71944o) r1
            int r6 = r19 + -1
            if (r19 == 0) goto L_0x077a
            r1.f191613b = r6
            int r6 = r1.f191612a
            r7 = 1
            r6 = r6 | r7
            r1.f191612a = r6
            com.google.android.libraries.social.populous.core.ClientVersion r1 = r2.f111752d
            java.lang.String r1 = r1.mo44952b()
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            o.c.o r6 = (p5602o.p5607c.C71944o) r6
            r1.getClass()
            int r7 = r6.f191612a
            r8 = 4
            r7 = r7 | r8
            r6.f191612a = r7
            r6.f191615d = r1
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            o.c.o r1 = (p5602o.p5607c.C71944o) r1
            int r6 = r1.f191612a
            r6 = r6 | 16
            r1.f191612a = r6
            r6 = 475194430(0x1c52e43e, double:2.34777243E-315)
            r1.f191617f = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            o.c.o r1 = (p5602o.p5607c.C71944o) r1
            r3.getClass()
            r1.f191614c = r3
            int r3 = r1.f191612a
            r6 = 2
            r3 = r3 | r6
            r1.f191612a = r3
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            o.c.o r1 = (p5602o.p5607c.C71944o) r1
            r3 = 4
            r1.f191619h = r3
            int r3 = r1.f191612a
            r3 = r3 | 64
            r1.f191612a = r3
            com.google.android.libraries.social.populous.core.ClientConfigInternal r1 = r2.f111750b
            com.google.android.libraries.social.populous.core.Experiments r1 = r1.f110705G
            java.lang.String[] r1 = r1.mo45142a()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.mo63128a(r1)
            com.google.android.libraries.social.populous.core.SessionContext r1 = r2.f111753e
            com.google.common.base.ax r1 = r1.f110811e
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x0753
            com.google.android.libraries.social.populous.core.SessionContext r1 = r2.f111753e
            com.google.common.base.ax r1 = r1.f110811e
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.social.d.a.l r1 = (com.google.android.libraries.social.p3269d.p3270a.C41937l) r1
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            o.c.o r2 = (p5602o.p5607c.C71944o) r2
            int r1 = r1.f109467ap
            r2.f191620i = r1
            int r1 = r2.f191612a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.f191612a = r1
        L_0x0753:
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            o.c.ag r1 = (p5602o.p5607c.C71930ag) r1
            com.google.protobuf.bv r2 = r5.build()
            o.c.o r2 = (p5602o.p5607c.C71944o) r2
            r2.getClass()
            r1.f191582e = r2
            int r2 = r1.f191578a
            r3 = 8
            r2 = r2 | r3
            r1.f191578a = r2
            com.google.protobuf.bv r1 = r4.build()
            o.c.ag r1 = (p5602o.p5607c.C71930ag) r1
            com.google.android.libraries.social.populous.c.b.b r2 = r0.f111716c
            com.google.android.gms.clearcut.ad r3 = r0.f111715b
            r2.mo44910a(r1, r3)
            return
        L_0x077a:
            r1 = 0
            throw r1
        L_0x077c:
            r1 = 0
            goto L_0x077f
        L_0x077e:
            throw r1
        L_0x077f:
            goto L_0x077e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.logging.C42569d.mo45645a(com.google.android.libraries.social.populous.logging.LogEvent, boolean):void");
    }
}
