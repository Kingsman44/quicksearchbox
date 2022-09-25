package com.google.android.gms.wearable.p10888a;

import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataMap;
import com.google.android.gms.wearable.p10888a.p10889a.C146400e;
import com.google.android.gms.wearable.p10888a.p10889a.C146402g;
import com.google.android.gms.wearable.p10888a.p10889a.C146403h;
import com.google.android.gms.wearable.p10888a.p10889a.C146404i;
import com.google.common.p4575r.C60752i;
import com.google.common.p4575r.C60761r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.wearable.a.b */
/* compiled from: PG */
public final class C146406b {
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0392 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x038c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.wearable.p10888a.p10889a.C146403h m238334a(java.util.List r16, java.lang.Object r17) {
        /*
            r0 = r16
            r1 = r17
            com.google.android.gms.wearable.a.a.h r2 = com.google.android.gms.wearable.p10888a.p10889a.C146403h.f395502d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.gms.wearable.a.a.c r2 = (com.google.android.gms.wearable.p10888a.p10889a.C146398c) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.gms.wearable.a.a.h r3 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r3
            r4 = 1
            r3.f395505b = r4
            int r5 = r3.f395504a
            r5 = r5 | r4
            r3.f395504a = r5
            r3 = 14
            if (r1 != 0) goto L_0x0034
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r3
            int r1 = r0.f395504a
            r1 = r1 | r4
            r0.f395504a = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            return r0
        L_0x0034:
            com.google.android.gms.wearable.a.a.g r5 = com.google.android.gms.wearable.p10888a.p10889a.C146402g.f395484p
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.gms.wearable.a.a.f r5 = (com.google.android.gms.wearable.p10888a.p10889a.C146401f) r5
            boolean r6 = r1 instanceof java.lang.String
            r7 = 2
            if (r6 == 0) goto L_0x0062
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r7
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | r7
            r1.f395486a = r3
            r1.f395488c = r0
            goto L_0x03c8
        L_0x0062:
            boolean r6 = r1 instanceof java.lang.Integer
            r8 = 6
            if (r6 == 0) goto L_0x008d
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r8
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | 32
            r1.f395486a = r3
            r1.f395492g = r0
            goto L_0x03c8
        L_0x008d:
            boolean r6 = r1 instanceof java.lang.Long
            if (r6 == 0) goto L_0x00b8
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 5
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.gms.wearable.a.a.g r3 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r3
            int r4 = r3.f395486a
            r4 = r4 | 16
            r3.f395486a = r4
            r3.f395491f = r0
            goto L_0x03c8
        L_0x00b8:
            boolean r6 = r1 instanceof java.lang.Double
            r9 = 4
            if (r6 == 0) goto L_0x00e3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 3
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r3 = r5.instance
            com.google.android.gms.wearable.a.a.g r3 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r3
            int r4 = r3.f395486a
            r4 = r4 | r9
            r3.f395486a = r4
            r3.f395489d = r0
            goto L_0x03c8
        L_0x00e3:
            boolean r6 = r1 instanceof java.lang.Float
            r10 = 8
            if (r6 == 0) goto L_0x010e
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r9
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | r10
            r1.f395486a = r3
            r1.f395490e = r0
            goto L_0x03c8
        L_0x010e:
            boolean r6 = r1 instanceof java.lang.Boolean
            if (r6 == 0) goto L_0x0138
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r10
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | 128(0x80, float:1.794E-43)
            r1.f395486a = r3
            r1.f395494i = r0
            goto L_0x03c8
        L_0x0138:
            boolean r6 = r1 instanceof java.lang.Byte
            if (r6 == 0) goto L_0x0163
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 7
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | 64
            r1.f395486a = r3
            r1.f395493h = r0
            goto L_0x03c8
        L_0x0163:
            boolean r6 = r1 instanceof byte[]
            if (r6 == 0) goto L_0x018c
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r0.f395505b = r4
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            byte[] r0 = (byte[]) r0
            com.google.protobuf.z r0 = com.google.protobuf.C63088z.m96139A(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | r4
            r1.f395486a = r3
            r1.f395487b = r0
            goto L_0x03c8
        L_0x018c:
            boolean r6 = r1 instanceof java.lang.String[]
            if (r6 == 0) goto L_0x01c3
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 11
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            com.google.protobuf.cq r3 = r1.f395497l
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x01bc
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f395497l = r3
        L_0x01bc:
            com.google.protobuf.cq r1 = r1.f395497l
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
            goto L_0x03c8
        L_0x01c3:
            boolean r6 = r1 instanceof long[]
            if (r6 == 0) goto L_0x01fa
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 12
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            long[] r0 = (long[]) r0
            java.util.List r0 = com.google.common.p4575r.C60761r.m92759e(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            com.google.protobuf.ck r3 = r1.f395498m
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x01f3
            com.google.protobuf.ck r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62964ck) r3)
            r1.f395498m = r3
        L_0x01f3:
            com.google.protobuf.ck r1 = r1.f395498m
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
            goto L_0x03c8
        L_0x01fa:
            boolean r6 = r1 instanceof float[]
            if (r6 == 0) goto L_0x0231
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            r3 = 15
            r0.f395505b = r3
            int r3 = r0.f395504a
            r3 = r3 | r4
            r0.f395504a = r3
            r0 = r1
            float[] r0 = (float[]) r0
            java.util.List r0 = com.google.common.p4575r.C60752i.m92731e(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            com.google.protobuf.cg r3 = r1.f395499n
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x022a
            com.google.protobuf.cg r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62960cg) r3)
            r1.f395499n = r3
        L_0x022a:
            com.google.protobuf.cg r1 = r1.f395499n
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
            goto L_0x03c8
        L_0x0231:
            boolean r6 = r1 instanceof com.google.android.gms.wearable.Asset
            if (r6 == 0) goto L_0x0262
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.gms.wearable.a.a.h r3 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r3
            r6 = 13
            r3.f395505b = r6
            int r6 = r3.f395504a
            r4 = r4 | r6
            r3.f395504a = r4
            com.google.android.gms.wearable.Asset r1 = (com.google.android.gms.wearable.Asset) r1
            r0.add(r1)
            int r0 = r16.size()
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            int r3 = r1.f395486a
            r3 = r3 | 256(0x100, float:3.59E-43)
            r1.f395486a = r3
            int r0 = r0 + -1
            long r3 = (long) r0
            r1.f395500o = r3
            goto L_0x03c8
        L_0x0262:
            boolean r6 = r1 instanceof com.google.android.gms.wearable.DataMap
            r9 = 0
            r10 = 9
            if (r6 == 0) goto L_0x02f4
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.gms.wearable.a.a.h r3 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r3
            r3.f395505b = r10
            int r6 = r3.f395504a
            r6 = r6 | r4
            r3.f395504a = r6
            com.google.android.gms.wearable.DataMap r1 = (com.google.android.gms.wearable.DataMap) r1
            java.util.TreeSet r3 = new java.util.TreeSet
            java.util.Set r6 = r1.keySet()
            r3.<init>(r6)
            int r6 = r3.size()
            com.google.android.gms.wearable.a.a.i[] r6 = new com.google.android.gms.wearable.p10888a.p10889a.C146404i[r6]
            java.util.Iterator r3 = r3.iterator()
        L_0x028c:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x02d4
            java.lang.Object r8 = r3.next()
            java.lang.String r8 = (java.lang.String) r8
            com.google.android.gms.wearable.a.a.i r10 = com.google.android.gms.wearable.p10888a.p10889a.C146404i.f395508d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.gms.wearable.a.a.b r10 = (com.google.android.gms.wearable.p10888a.p10889a.C146397b) r10
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.gms.wearable.a.a.i r11 = (com.google.android.gms.wearable.p10888a.p10889a.C146404i) r11
            r8.getClass()
            int r12 = r11.f395510a
            r12 = r12 | r4
            r11.f395510a = r12
            r11.f395511b = r8
            java.lang.Object r8 = r1.get(r8)
            com.google.android.gms.wearable.a.a.h r8 = m238334a(r0, r8)
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.gms.wearable.a.a.i r11 = (com.google.android.gms.wearable.p10888a.p10889a.C146404i) r11
            r8.getClass()
            r11.f395512c = r8
            int r8 = r11.f395510a
            r8 = r8 | r7
            r11.f395510a = r8
            com.google.protobuf.bv r8 = r10.build()
            com.google.android.gms.wearable.a.a.i r8 = (com.google.android.gms.wearable.p10888a.p10889a.C146404i) r8
            r6[r9] = r8
            int r9 = r9 + r4
            goto L_0x028c
        L_0x02d4:
            java.util.List r0 = java.util.Arrays.asList(r6)
            r5.copyOnWrite()
            com.google.protobuf.bv r1 = r5.instance
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            com.google.protobuf.cq r3 = r1.f395495j
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x02ed
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r1.f395495j = r3
        L_0x02ed:
            com.google.protobuf.cq r1 = r1.f395495j
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)
            goto L_0x03c8
        L_0x02f4:
            boolean r6 = r1 instanceof java.util.ArrayList
            if (r6 == 0) goto L_0x03e6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.gms.wearable.a.a.h r6 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r6
            r11 = 10
            r6.f395505b = r11
            int r11 = r6.f395504a
            r11 = r11 | r4
            r6.f395504a = r11
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r6 = r1.size()
            r11 = 0
            r12 = 14
        L_0x0311:
            if (r9 >= r6) goto L_0x03c8
            java.lang.Object r13 = r1.get(r9)
            com.google.android.gms.wearable.a.a.h r14 = m238334a(r0, r13)
            int r15 = r14.f395505b
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x0324
            goto L_0x0326
        L_0x0324:
            if (r4 == r3) goto L_0x0359
        L_0x0326:
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x032d
            goto L_0x032f
        L_0x032d:
            if (r4 == r7) goto L_0x0359
        L_0x032f:
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x0336
            goto L_0x0338
        L_0x0336:
            if (r4 == r8) goto L_0x0359
        L_0x0338:
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 == 0) goto L_0x0341
            if (r4 != r10) goto L_0x0341
            goto L_0x0359
        L_0x0341:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r1 = r13.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "The only ArrayList element types supported by DataBundleUtil are String, Integer, Bundle, and null, but this ArrayList contains a "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0359:
            if (r12 != r3) goto L_0x0371
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x0362
            goto L_0x0367
        L_0x0362:
            if (r4 != r3) goto L_0x0367
            r12 = 14
            goto L_0x0371
        L_0x0367:
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x036e
            r4 = 1
        L_0x036e:
            r12 = r4
            r11 = r13
            goto L_0x037a
        L_0x0371:
            int r4 = com.google.android.gms.wearable.p10888a.p10889a.C146400e.m238333a(r15)
            if (r4 != 0) goto L_0x0378
            r4 = 1
        L_0x0378:
            if (r4 != r12) goto L_0x039c
        L_0x037a:
            r5.copyOnWrite()
            com.google.protobuf.bv r4 = r5.instance
            com.google.android.gms.wearable.a.a.g r4 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r4
            r14.getClass()
            com.google.protobuf.cq r13 = r4.f395496k
            boolean r15 = r13.mo58948c()
            if (r15 != 0) goto L_0x0392
            com.google.protobuf.cq r13 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r13)
            r4.f395496k = r13
        L_0x0392:
            com.google.protobuf.cq r4 = r4.f395496k
            r4.add(r14)
            int r9 = r9 + 1
            r4 = 1
            goto L_0x0311
        L_0x039c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Class r2 = r13.getClass()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ArrayList elements must all be of the sameclass, but this one contains a "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " and a "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x03c8:
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            com.google.protobuf.bv r1 = r5.build()
            com.google.android.gms.wearable.a.a.g r1 = (com.google.android.gms.wearable.p10888a.p10889a.C146402g) r1
            r1.getClass()
            r0.f395506c = r1
            int r1 = r0.f395504a
            r1 = r1 | r7
            r0.f395504a = r1
            com.google.protobuf.bv r0 = r2.build()
            com.google.android.gms.wearable.a.a.h r0 = (com.google.android.gms.wearable.p10888a.p10889a.C146403h) r0
            return r0
        L_0x03e6:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Class r1 = r17.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "newFieldValueFromValue: unexpected value "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            goto L_0x03ff
        L_0x03fe:
            throw r0
        L_0x03ff:
            goto L_0x03fe
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.p10888a.C146406b.m238334a(java.util.List, java.lang.Object):com.google.android.gms.wearable.a.a.h");
    }

    /* renamed from: b */
    public static void m238335b(List list, DataMap dataMap, String str, C146403h hVar) {
        int a;
        int a2;
        int a3 = C146400e.m238333a(hVar.f395505b);
        int i = 1;
        if (a3 == 0) {
            a3 = 1;
        }
        if (a3 != 14) {
            C146402g gVar = hVar.f395506c;
            if (gVar == null) {
                gVar = C146402g.f395484p;
            }
            if (a3 == 1) {
                dataMap.putByteArray(str, gVar.f395487b.mo59174N());
            } else if (a3 == 11) {
                dataMap.putStringArray(str, (String[]) gVar.f395497l.toArray(new String[0]));
            } else if (a3 == 12) {
                dataMap.putLongArray(str, C60761r.m92761g(gVar.f395498m));
            } else if (a3 == 15) {
                dataMap.putFloatArray(str, C60752i.m92732f(gVar.f395499n));
            } else if (a3 == 2) {
                dataMap.putString(str, gVar.f395488c);
            } else if (a3 == 3) {
                dataMap.putDouble(str, gVar.f395489d);
            } else if (a3 == 4) {
                dataMap.putFloat(str, gVar.f395490e);
            } else if (a3 == 5) {
                dataMap.putLong(str, gVar.f395491f);
            } else if (a3 == 6) {
                dataMap.putInt(str, gVar.f395492g);
            } else if (a3 == 7) {
                dataMap.putByte(str, (byte) gVar.f395493h);
            } else if (a3 == 8) {
                dataMap.putBoolean(str, gVar.f395494i);
            } else if (a3 == 13) {
                dataMap.putAsset(str, (Asset) list.get((int) gVar.f395500o));
            } else if (a3 == 9) {
                DataMap dataMap2 = new DataMap();
                for (C146404i iVar : gVar.f395495j) {
                    String str2 = iVar.f395511b;
                    C146403h hVar2 = iVar.f395512c;
                    if (hVar2 == null) {
                        hVar2 = C146403h.f395502d;
                    }
                    m238335b(list, dataMap2, str2, hVar2);
                }
                dataMap.putDataMap(str, dataMap2);
            } else if (a3 == 10) {
                int i2 = 14;
                for (C146403h hVar3 : gVar.f395496k) {
                    if (i2 == 14) {
                        int i3 = hVar3.f395505b;
                        int a4 = C146400e.m238333a(i3);
                        if ((a4 != 0 && a4 == 9) || (((a = C146400e.m238333a(i3)) != 0 && a == 2) || ((a2 = C146400e.m238333a(i3)) != 0 && a2 == 6))) {
                            i2 = C146400e.m238333a(i3);
                            if (i2 == 0) {
                                i2 = 1;
                            }
                        } else {
                            int a5 = C146400e.m238333a(i3);
                            if (a5 == 0 || a5 != 14) {
                                int a6 = C146400e.m238333a(i3);
                                if (a6 != 0) {
                                    i = a6;
                                }
                                String num = Integer.toString(i);
                                throw new IllegalArgumentException("Unexpected TypedValue type: " + num + " for key " + str);
                            }
                        }
                    } else {
                        int a7 = C146400e.m238333a(hVar3.f395505b);
                        if (a7 == 0) {
                            a7 = 1;
                        }
                        if (a7 != i2) {
                            String num2 = Integer.toString(i2);
                            int a8 = C146400e.m238333a(hVar3.f395505b);
                            if (a8 != 0) {
                                i = a8;
                            }
                            String num3 = Integer.toString(i);
                            throw new IllegalArgumentException("The ArrayList elements should all be the same type, but ArrayList with key " + str + " contains items of type " + num2 + " and " + num3);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(gVar.f395496k.size());
                for (C146403h hVar4 : gVar.f395496k) {
                    int a9 = C146400e.m238333a(hVar4.f395505b);
                    if (a9 != 0 && a9 == 14) {
                        arrayList.add((Object) null);
                    } else if (i2 == 9) {
                        DataMap dataMap3 = new DataMap();
                        C146402g gVar2 = hVar4.f395506c;
                        if (gVar2 == null) {
                            gVar2 = C146402g.f395484p;
                        }
                        for (C146404i iVar2 : gVar2.f395495j) {
                            String str3 = iVar2.f395511b;
                            C146403h hVar5 = iVar2.f395512c;
                            if (hVar5 == null) {
                                hVar5 = C146403h.f395502d;
                            }
                            m238335b(list, dataMap3, str3, hVar5);
                        }
                        arrayList.add(dataMap3);
                    } else if (i2 == 2) {
                        C146402g gVar3 = hVar4.f395506c;
                        if (gVar3 == null) {
                            gVar3 = C146402g.f395484p;
                        }
                        arrayList.add(gVar3.f395488c);
                    } else if (i2 == 6) {
                        C146402g gVar4 = hVar4.f395506c;
                        if (gVar4 == null) {
                            gVar4 = C146402g.f395484p;
                        }
                        arrayList.add(Integer.valueOf(gVar4.f395492g));
                    } else {
                        throw new IllegalArgumentException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                    }
                }
                if (i2 == 14) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (i2 == 9) {
                    dataMap.putDataMapArrayList(str, arrayList);
                } else if (i2 == 2) {
                    dataMap.putStringArrayList(str, arrayList);
                } else if (i2 == 6) {
                    dataMap.putIntegerArrayList(str, arrayList);
                } else {
                    throw new IllegalStateException("Unexpected typeOfArrayList: ".concat(Integer.toString(i2)));
                }
            } else {
                throw new RuntimeException("populateBundle: unexpected type ".concat(Integer.toString(a3)));
            }
        } else {
            dataMap.putString(str, (String) null);
        }
    }
}
