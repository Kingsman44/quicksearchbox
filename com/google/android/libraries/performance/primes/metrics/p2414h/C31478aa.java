package com.google.android.libraries.performance.primes.metrics.p2414h;

import com.google.android.libraries.performance.primes.metrics.p2404b.C31313p;
import com.google.android.libraries.performance.primes.p2398c.C31209a;
import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;
import p5460g.p5461a.C69464a;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71256cl;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71257cm;

/* renamed from: com.google.android.libraries.performance.primes.metrics.h.aa */
/* compiled from: PG */
public final class C31478aa extends C31507z implements C31313p, C31209a.C31217h {

    /* renamed from: a */
    private static final C59071e f84774a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.h.aa");

    /* renamed from: b */
    private final C31220b f84775b;

    /* renamed from: c */
    private final C69464a f84776c;

    /* renamed from: d */
    private final C69464a f84777d;

    /* renamed from: e */
    private final C69464a f84778e;

    /* renamed from: f */
    private final AtomicBoolean f84779f = new AtomicBoolean();

    public C31478aa(C31220b bVar, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f84775b = bVar;
        this.f84776c = aVar;
        this.f84777d = aVar2;
        this.f84778e = aVar3;
    }

    /* renamed from: b */
    private static long m58688b(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    /* renamed from: c */
    private static C71257cm m58689c(C31488h hVar) {
        C71256cl clVar = (C71256cl) C71257cm.f190244f.createBuilder();
        if (hVar.f84789a != null) {
            String str = hVar.f84789a;
            clVar.copyOnWrite();
            C71257cm cmVar = (C71257cm) clVar.instance;
            str.getClass();
            cmVar.f190246a |= 1;
            cmVar.f190247b = str;
        }
        if (hVar.f84790b != null) {
            long longValue = hVar.f84790b.longValue();
            clVar.copyOnWrite();
            C71257cm cmVar2 = (C71257cm) clVar.instance;
            cmVar2.f190246a |= 2;
            cmVar2.f190248c = longValue;
        }
        if (hVar.f84791c != null) {
            long longValue2 = hVar.f84791c.longValue();
            clVar.copyOnWrite();
            C71257cm cmVar3 = (C71257cm) clVar.instance;
            cmVar3.f190246a |= 4;
            cmVar3.f190249d = longValue2;
        }
        if (hVar.f84792d != null) {
            long longValue3 = hVar.f84792d.longValue();
            clVar.copyOnWrite();
            C71257cm cmVar4 = (C71257cm) clVar.instance;
            cmVar4.f190246a |= 8;
            cmVar4.f190250e = longValue3;
        }
        return (C71257cm) clVar.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:154:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02cc  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36944d(android.app.Activity r17) {
        /*
            r16 = this;
            r0 = r16
            com.google.android.libraries.performance.primes.c.b r1 = r0.f84775b
            com.google.android.libraries.performance.primes.c.e r1 = r1.f84117a
            r1.mo36958b(r0)
            com.google.android.libraries.performance.primes.metrics.h.r r1 = com.google.android.libraries.performance.primes.metrics.p2414h.C31499r.f84816a
            long r2 = r1.f84822g
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0029
            long r2 = r1.f84823h
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x001a
            goto L_0x0029
        L_0x001a:
            com.google.common.f.e r1 = f84774a
            com.google.common.f.x r1 = r1.mo56224b()
            java.lang.String r2 = "missing firstDraw timestamp"
            r3 = 50416(0xc4f0, float:7.0648E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0029:
            boolean r2 = r1.f84817b
            if (r2 == 0) goto L_0x0030
            long r2 = r1.f84818c
            goto L_0x0032
        L_0x0030:
            long r2 = r1.f84820e
        L_0x0032:
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0037
            return
        L_0x0037:
            long r6 = r1.f84822g
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0045
            long r6 = r1.f84823h
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            return
        L_0x0045:
            j.a.i.b.a.cr r2 = p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr.f190253w
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.i.b.a.cn r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71258cn) r2
            boolean r3 = r1.f84817b
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            j.a.i.b.a.cr r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r6
            int r7 = r6.f190255a
            r8 = 65536(0x10000, float:9.18355E-41)
            r7 = r7 | r8
            r6.f190255a = r7
            r6.f190271q = r3
            boolean r3 = r1.f84817b
            r6 = 131072(0x20000, float:1.83671E-40)
            r7 = 1
            r8 = 2
            if (r3 == 0) goto L_0x0076
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            r3.f190272r = r7
            int r9 = r3.f190255a
            r6 = r6 | r9
            r3.f190255a = r6
            goto L_0x0084
        L_0x0076:
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            r3.f190272r = r8
            int r9 = r3.f190255a
            r6 = r6 | r9
            r3.f190255a = r6
        L_0x0084:
            com.google.android.libraries.performance.primes.metrics.h.q r3 = r1.f84827l
            boolean r6 = r3.f84805a
            if (r6 == 0) goto L_0x00a0
            long r9 = r1.f84818c
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            j.a.i.b.a.cr r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r6
            int r11 = r6.f190255a
            r11 = r11 | 16
            r6.f190255a = r11
            r6.f190259e = r9
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            goto L_0x00a1
        L_0x00a0:
            r6 = 0
        L_0x00a1:
            boolean r9 = r3.f84806b
            if (r9 == 0) goto L_0x00be
            long r9 = r1.f84819d
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r12 = r11.f190255a
            r12 = r12 | 128(0x80, float:1.794E-43)
            r11.f190255a = r12
            r11.f190262h = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x00be:
            boolean r9 = r3.f84807c
            boolean r9 = r3.f84808d
            boolean r9 = r3.f84809e
            boolean r9 = r3.f84810f
            if (r9 == 0) goto L_0x00e1
            long r9 = r1.f84820e
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r12 = r11.f190255a
            r12 = r12 | 512(0x200, float:7.175E-43)
            r11.f190255a = r12
            r11.f190264j = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x00e1:
            g.a.a r9 = r0.f84778e
            java.lang.Object r9 = r9.mo17428b()
            java.lang.Long r9 = (java.lang.Long) r9
            int r9 = r9.intValue()
            r10 = -1
            r12 = 4
            if (r9 == r7) goto L_0x0110
            if (r9 == r8) goto L_0x0109
            r13 = 3
            if (r9 == r13) goto L_0x0102
            if (r9 == r12) goto L_0x00fb
        L_0x00f9:
            r13 = r10
            goto L_0x0116
        L_0x00fb:
            boolean r9 = r3.f84812h
            if (r9 == 0) goto L_0x00f9
            long r13 = r1.f84821f
            goto L_0x0116
        L_0x0102:
            boolean r9 = r3.f84811g
            if (r9 == 0) goto L_0x00f9
            long r13 = r1.f84822g
            goto L_0x0116
        L_0x0109:
            boolean r9 = r3.f84814j
            if (r9 == 0) goto L_0x00f9
            long r13 = r1.f84824i
            goto L_0x0116
        L_0x0110:
            boolean r9 = r3.f84813i
            if (r9 == 0) goto L_0x00f9
            long r13 = r1.f84823h
        L_0x0116:
            int r9 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0131
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            j.a.i.b.a.cr r9 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r9
            int r10 = r9.f190255a
            r10 = r10 | 1024(0x400, float:1.435E-42)
            r9.f190255a = r10
            r9.f190265k = r13
            long r9 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x0131:
            boolean r9 = r3.f84811g
            if (r9 == 0) goto L_0x014e
            long r9 = r1.f84822g
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r13 = r11.f190255a
            r13 = r13 | 8192(0x2000, float:1.14794E-41)
            r11.f190255a = r13
            r11.f190268n = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x014e:
            boolean r9 = r3.f84812h
            if (r9 == 0) goto L_0x016b
            long r9 = r1.f84821f
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r13 = r11.f190255a
            r13 = r13 | 16384(0x4000, float:2.2959E-41)
            r11.f190255a = r13
            r11.f190269o = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x016b:
            boolean r9 = r3.f84813i
            if (r9 == 0) goto L_0x0188
            long r9 = r1.f84823h
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r13 = r11.f190255a
            r13 = r13 | 2048(0x800, float:2.87E-42)
            r11.f190255a = r13
            r11.f190266l = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x0188:
            boolean r9 = r3.f84814j
            if (r9 == 0) goto L_0x01a5
            long r9 = r1.f84824i
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            int r13 = r11.f190255a
            r13 = r13 | 4096(0x1000, float:5.74E-42)
            r11.f190255a = r13
            r11.f190267m = r9
            long r9 = m58688b(r6, r9)
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
        L_0x01a5:
            boolean r3 = r3.f84815k
            r9 = 32768(0x8000, float:4.5918E-41)
            if (r3 == 0) goto L_0x01c4
            long r10 = r1.f84825j
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r13 = r3.f190255a
            r13 = r13 | r9
            r3.f190255a = r13
            r3.f190270p = r10
            long r10 = m58688b(r6, r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
        L_0x01c4:
            com.google.android.libraries.performance.primes.metrics.h.h r3 = r1.f84828m
            java.lang.Long r3 = r3.f84790b
            r10 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x0211
            com.google.android.libraries.performance.primes.metrics.h.h r3 = r1.f84828m
            j.a.i.b.a.cm r3 = m58689c(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            j.a.i.b.a.cr r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r11
            r3.getClass()
            r11.f190274t = r3
            int r13 = r11.f190255a
            r13 = r13 | r10
            r11.f190255a = r13
            int r11 = r3.f190246a
            r11 = r11 & r8
            if (r11 == 0) goto L_0x01f2
            long r13 = r3.f190248c
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x01f2:
            int r11 = r3.f190246a
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0201
            long r13 = r3.f190249d
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x0201:
            int r11 = r3.f190246a
            r11 = r11 & 8
            if (r11 == 0) goto L_0x0211
            long r13 = r3.f190250e
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x0211:
            com.google.android.libraries.performance.primes.metrics.h.h r3 = r1.f84829n
            java.lang.Long r3 = r3.f84790b
            r11 = 1048576(0x100000, float:1.469368E-39)
            if (r3 == 0) goto L_0x025e
            com.google.android.libraries.performance.primes.metrics.h.h r3 = r1.f84829n
            j.a.i.b.a.cm r3 = m58689c(r3)
            r2.copyOnWrite()
            com.google.protobuf.bv r13 = r2.instance
            j.a.i.b.a.cr r13 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r13
            r3.getClass()
            r13.f190275u = r3
            int r14 = r13.f190255a
            r14 = r14 | r11
            r13.f190255a = r14
            int r13 = r3.f190246a
            r13 = r13 & r8
            if (r13 == 0) goto L_0x023f
            long r13 = r3.f190248c
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x023f:
            int r13 = r3.f190246a
            r13 = r13 & r12
            if (r13 == 0) goto L_0x024e
            long r13 = r3.f190249d
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x024e:
            int r13 = r3.f190246a
            r13 = r13 & 8
            if (r13 == 0) goto L_0x025e
            long r13 = r3.f190250e
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x025e:
            com.google.common.base.ax r3 = com.google.android.libraries.performance.primes.metrics.p2414h.C31480ac.m58694a()
            boolean r13 = r3.mo56113h()
            if (r13 == 0) goto L_0x028c
            java.lang.Object r3 = r3.mo56107c()
            java.lang.Long r3 = (java.lang.Long) r3
            long r13 = r3.longValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r15 = r2.instance
            j.a.i.b.a.cr r15 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r15
            int r11 = r15.f190255a
            r11 = r11 | r8
            r15.f190255a = r11
            r15.f190257c = r13
            long r13 = r3.longValue()
            long r13 = m58688b(r6, r13)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
        L_0x028c:
            long r13 = android.os.Process.getStartElapsedRealtime()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r11 = r3.f190255a
            r11 = r11 | r12
            r3.f190255a = r11
            r3.f190258d = r13
            long r13 = m58688b(r6, r13)
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            j.a.i.b.a.cr r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r6
            int r11 = r6.f190255a
            r13 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r13
            r6.f190255a = r11
            r6.f190273s = r7
            long r13 = r3.longValue()
            g.a.a r3 = r0.f84777d
            java.lang.Object r3 = r3.mo17428b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x02cc
            goto L_0x04aa
        L_0x02cc:
            if (r3 != 0) goto L_0x02dc
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 | r7
            r3.f190255a = r4
            r3.f190256b = r13
        L_0x02dc:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x02f8
            long r3 = r3.f190259e
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 16
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190259e = r3
        L_0x02f8:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0314
            long r3 = r3.f190262h
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 128(0x80, float:1.794E-43)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190262h = r3
        L_0x0314:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x0330
            long r3 = r3.f190263i
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190263i = r3
        L_0x0330:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 32
            if (r4 == 0) goto L_0x034c
            long r3 = r3.f190260f
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 32
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190260f = r3
        L_0x034c:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 64
            if (r4 == 0) goto L_0x0368
            long r3 = r3.f190261g
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 64
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190261g = r3
        L_0x0368:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x0384
            long r3 = r3.f190264j
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 512(0x200, float:7.175E-43)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190264j = r3
        L_0x0384:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x03a0
            long r3 = r3.f190265k
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 1024(0x400, float:1.435E-42)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190265k = r3
        L_0x03a0:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x03bc
            long r3 = r3.f190266l
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 2048(0x800, float:2.87E-42)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190266l = r3
        L_0x03bc:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x03d8
            long r3 = r3.f190267m
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190267m = r3
        L_0x03d8:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x03f4
            long r3 = r3.f190268n
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190268n = r3
        L_0x03f4:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0410
            long r3 = r3.f190269o
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | 16384(0x4000, float:2.2959E-41)
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190269o = r3
        L_0x0410:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & r9
            if (r4 == 0) goto L_0x042a
            long r3 = r3.f190270p
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | r9
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190270p = r3
        L_0x042a:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & r10
            if (r4 == 0) goto L_0x044e
            j.a.i.b.a.cm r3 = r3.f190274t
            if (r3 != 0) goto L_0x0439
            j.a.i.b.a.cm r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71257cm.f190244f
        L_0x0439:
            j.a.i.b.a.cm r3 = com.google.android.libraries.performance.primes.metrics.p2414h.C31481ad.m58696a(r3, r13)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            j.a.i.b.a.cr r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r4
            r3.getClass()
            r4.f190274t = r3
            int r3 = r4.f190255a
            r3 = r3 | r10
            r4.f190255a = r3
        L_0x044e:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r5 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0476
            j.a.i.b.a.cm r3 = r3.f190275u
            if (r3 != 0) goto L_0x045f
            j.a.i.b.a.cm r3 = p5535j.p5536a.p5562i.p5568b.p5569a.C71257cm.f190244f
        L_0x045f:
            j.a.i.b.a.cm r3 = com.google.android.libraries.performance.primes.metrics.p2414h.C31481ad.m58696a(r3, r13)
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            j.a.i.b.a.cr r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r4
            r3.getClass()
            r4.f190275u = r3
            int r3 = r4.f190255a
            r5 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r5
            r4.f190255a = r3
        L_0x0476:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0490
            long r3 = r3.f190258d
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | r12
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190258d = r3
        L_0x0490:
            com.google.protobuf.bv r3 = r2.instance
            j.a.i.b.a.cr r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r3
            int r4 = r3.f190255a
            r4 = r4 & r8
            if (r4 == 0) goto L_0x04aa
            long r3 = r3.f190257c
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            j.a.i.b.a.cr r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71262cr) r5
            int r6 = r5.f190255a
            r6 = r6 | r8
            r5.f190255a = r6
            long r3 = r3 - r13
            r5.f190257c = r3
        L_0x04aa:
            com.google.android.libraries.performance.primes.au r1 = r1.f84826k
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f84779f
            boolean r3 = r3.getAndSet(r7)
            if (r3 != 0) goto L_0x04cb
            g.a.a r3 = r0.f84776c
            java.lang.Object r3 = r3.mo17428b()
            com.google.android.libraries.performance.primes.metrics.h.x r3 = (com.google.android.libraries.performance.primes.metrics.p2414h.C31505x) r3
            java.lang.String r1 = com.google.android.libraries.performance.primes.C31164au.m58094d(r1)
            com.google.android.libraries.performance.primes.metrics.h.t r4 = new com.google.android.libraries.performance.primes.metrics.h.t
            r4.<init>(r3, r2, r1)
            com.google.common.util.concurrent.db r1 = r3.f84843d
            com.google.common.util.concurrent.C60856cj.m92905n(r4, r1)
            return
        L_0x04cb:
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2414h.C31478aa.mo36944d(android.app.Activity):void");
    }

    /* renamed from: ln */
    public final void mo29159ln() {
        this.f84775b.f84117a.mo36957a(this);
    }
}
