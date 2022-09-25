package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ml */
/* compiled from: PG */
final class C7121ml {

    /* renamed from: a */
    private static final byte[] f22936a = aeu.m18555y("OpusHead");

    /* renamed from: a */
    public static C7243qz m21146a(C7113md mdVar, boolean z) {
        if (z) {
            return null;
        }
        aee aee = mdVar.f22910a;
        aee.mo14554h(8);
        while (aee.mo14550d() >= 8) {
            int g = aee.mo14553g();
            int v = aee.mo14568v();
            if (aee.mo14568v() == 1835365473) {
                aee.mo14554h(g);
                int i = g + v;
                aee.mo14557k(12);
                while (true) {
                    if (aee.mo14553g() >= i) {
                        break;
                    }
                    int g2 = aee.mo14553g();
                    int v2 = aee.mo14568v();
                    if (aee.mo14568v() == 1768715124) {
                        aee.mo14554h(g2);
                        int i2 = g2 + v2;
                        aee.mo14557k(8);
                        ArrayList arrayList = new ArrayList();
                        while (aee.mo14553g() < i2) {
                            C7242qy a = C7129mt.m21178a(aee);
                            if (a != null) {
                                arrayList.add(a);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            return new C7243qz((List) arrayList);
                        }
                    } else {
                        aee.mo14554h(g2 + v2);
                    }
                }
                return null;
            }
            aee.mo14554h(g + v);
        }
        return null;
    }

    /* renamed from: b */
    public static C7243qz m21147b(C7112mc mcVar) {
        C7285sn snVar;
        C7113md c = mcVar.mo16169c(1751411826);
        C7113md c2 = mcVar.mo16169c(1801812339);
        C7113md c3 = mcVar.mo16169c(1768715124);
        if (c == null || c2 == null || c3 == null || m21149d(c.f22910a) != 1835299937) {
            return null;
        }
        aee aee = c2.f22910a;
        aee.mo14554h(12);
        int v = aee.mo14568v();
        String[] strArr = new String[v];
        for (int i = 0; i < v; i++) {
            int v2 = aee.mo14568v();
            aee.mo14557k(4);
            strArr[i] = aee.mo14541E(v2 - 8);
        }
        aee aee2 = c3.f22910a;
        aee2.mo14554h(8);
        ArrayList arrayList = new ArrayList();
        while (aee2.mo14550d() > 8) {
            int g = aee2.mo14553g();
            int v3 = aee2.mo14568v();
            int v4 = aee2.mo14568v() - 1;
            if (v4 < 0 || v4 >= v) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(v4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[v4];
                int i2 = g + v3;
                int i3 = C7129mt.f23000b;
                while (true) {
                    int g2 = aee2.mo14553g();
                    if (g2 >= i2) {
                        snVar = null;
                        break;
                    }
                    int v5 = aee2.mo14568v();
                    if (aee2.mo14568v() == 1684108385) {
                        int v6 = aee2.mo14568v();
                        int v7 = aee2.mo14568v();
                        int i4 = v5 - 16;
                        byte[] bArr = new byte[i4];
                        aee2.mo14559m(bArr, 0, i4);
                        snVar = new C7285sn(str, bArr, v7, v6);
                        break;
                    }
                    aee2.mo14554h(g2 + v5);
                }
                if (snVar != null) {
                    arrayList.add(snVar);
                }
            }
            aee2.mo14554h(g + v3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C7243qz((List) arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: com.google.ads.interactivemedia.v3.internal.arn} */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        if (r7 == 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        r7 = -9223372036854775807L;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x06e4  */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x08ef  */
    /* JADX WARNING: Removed duplicated region for block: B:442:0x0995  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x09a8  */
    /* JADX WARNING: Removed duplicated region for block: B:450:0x09c5 A[LOOP:13: B:450:0x09c5->B:454:0x09cf, LOOP_START, PHI: r26 
      PHI: (r26v6 int) = (r26v5 int), (r26v7 int) binds: [B:449:0x09c3, B:454:0x09cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x09d8  */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0a15  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0a28  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0a2b  */
    /* JADX WARNING: Removed duplicated region for block: B:478:0x0a8c  */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0aa5  */
    /* JADX WARNING: Removed duplicated region for block: B:612:0x09bc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x021c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m21148c(com.google.ads.interactivemedia.p367v3.internal.C7112mc r45, com.google.ads.interactivemedia.p367v3.internal.C7064ki r46, long r47, com.google.ads.interactivemedia.p367v3.internal.C7031jc r49, boolean r50, com.google.ads.interactivemedia.p367v3.internal.apw r51) {
        /*
            r0 = r45
            r1 = r46
            r12 = r49
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.f22909c
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0d33
            java.util.List r2 = r0.f22909c
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.ads.interactivemedia.v3.internal.mc r11 = (com.google.ads.interactivemedia.p367v3.internal.C7112mc) r11
            int r2 = r11.f22911d
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r32 = r15
            goto L_0x0d28
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.ads.interactivemedia.v3.internal.md r2 = r0.mo16169c(r2)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.ads.interactivemedia.v3.internal.mc r3 = r11.mo16170d(r10)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.ads.interactivemedia.v3.internal.md r4 = r3.mo16169c(r4)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r4)
            com.google.ads.interactivemedia.v3.internal.aee r4 = r4.f22910a
            int r4 = m21149d(r4)
            r5 = 1936684398(0x736f756e, float:1.8971874E31)
            r8 = 4
            r6 = -1
            if (r4 != r5) goto L_0x0056
            r5 = 1
            goto L_0x007c
        L_0x0056:
            r5 = 1986618469(0x76696465, float:1.1834389E33)
            if (r4 != r5) goto L_0x005d
            r5 = 2
            goto L_0x007c
        L_0x005d:
            r5 = 1952807028(0x74657874, float:7.272211E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1935832172(0x7362746c, float:1.7941596E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1937072756(0x73756274, float:1.944137E31)
            if (r4 == r5) goto L_0x007b
            r5 = 1668047728(0x636c6370, float:4.3605968E21)
            if (r4 != r5) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r4 != r5) goto L_0x0079
            r5 = 4
            goto L_0x007c
        L_0x0079:
            r5 = -1
            goto L_0x007c
        L_0x007b:
            r5 = 3
        L_0x007c:
            r32 = r15
            r14 = 0
            r33 = 0
            if (r5 != r6) goto L_0x008e
            r1 = r51
            r2 = r11
            r34 = r13
            r0 = r33
            r8 = 2
            goto L_0x0713
        L_0x008e:
            r9 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.ads.interactivemedia.v3.internal.md r9 = r11.mo16169c(r9)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)
            com.google.ads.interactivemedia.v3.internal.aee r9 = r9.f22910a
            r7 = 8
            r9.mo14554h(r7)
            int r20 = r9.mo14568v()
            int r20 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r20)
            if (r20 != 0) goto L_0x00ac
            r10 = 8
            goto L_0x00ae
        L_0x00ac:
            r10 = 16
        L_0x00ae:
            r9.mo14557k(r10)
            int r10 = r9.mo14568v()
            r9.mo14557k(r8)
            int r23 = r9.mo14553g()
            if (r20 != 0) goto L_0x00bf
            r7 = 4
        L_0x00bf:
            r8 = 0
        L_0x00c0:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r7) goto L_0x00e4
            byte[] r28 = r9.mo14555i()
            int r29 = r23 + r8
            byte r4 = r28[r29]
            if (r4 == r6) goto L_0x00e1
            if (r20 != 0) goto L_0x00d8
            long r7 = r9.mo14566t()
            goto L_0x00dc
        L_0x00d8:
            long r7 = r9.mo14540D()
        L_0x00dc:
            int r4 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r4 != 0) goto L_0x00e9
            goto L_0x00e7
        L_0x00e1:
            int r8 = r8 + 1
            goto L_0x00c0
        L_0x00e4:
            r9.mo14557k(r7)
        L_0x00e7:
            r7 = r26
        L_0x00e9:
            r4 = 16
            r9.mo14557k(r4)
            int r20 = r9.mo14568v()
            int r4 = r9.mo14568v()
            r14 = 4
            r9.mo14557k(r14)
            int r15 = r9.mo14568v()
            int r9 = r9.mo14568v()
            r6 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            if (r20 != 0) goto L_0x011a
            if (r4 != r6) goto L_0x0118
            if (r15 != r14) goto L_0x0116
            if (r9 != 0) goto L_0x0111
            r4 = 90
            goto L_0x013b
        L_0x0111:
            r4 = 65536(0x10000, float:9.18355E-41)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0118
        L_0x0116:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x0118:
            r20 = 0
        L_0x011a:
            if (r20 != 0) goto L_0x012c
            if (r4 != r14) goto L_0x0129
            if (r15 != r6) goto L_0x0125
            if (r9 != 0) goto L_0x0126
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x013b
        L_0x0125:
            r6 = r15
        L_0x0126:
            r4 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x012a
        L_0x0129:
            r6 = r15
        L_0x012a:
            r15 = 0
            goto L_0x012f
        L_0x012c:
            r6 = r15
            r15 = r20
        L_0x012f:
            if (r15 != r14) goto L_0x013a
            if (r4 != 0) goto L_0x013a
            if (r6 != 0) goto L_0x013a
            if (r9 != r14) goto L_0x013a
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x013b
        L_0x013a:
            r4 = 0
        L_0x013b:
            com.google.ads.interactivemedia.v3.internal.mk r14 = new com.google.ads.interactivemedia.v3.internal.mk
            r14.<init>(r10, r7, r4)
            int r4 = (r47 > r26 ? 1 : (r47 == r26 ? 0 : -1))
            if (r4 != 0) goto L_0x014b
            long r6 = r14.f22934b
            r34 = r6
            goto L_0x014d
        L_0x014b:
            r34 = r47
        L_0x014d:
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            r4 = 8
            r2.mo14554h(r4)
            int r4 = r2.mo14568v()
            int r4 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r4)
            if (r4 != 0) goto L_0x0161
            r4 = 8
            goto L_0x0163
        L_0x0161:
            r4 = 16
        L_0x0163:
            r2.mo14557k(r4)
            long r28 = r2.mo14566t()
            int r2 = (r34 > r26 ? 1 : (r34 == r26 ? 0 : -1))
            if (r2 != 0) goto L_0x016f
            goto L_0x017a
        L_0x016f:
            r36 = 1000000(0xf4240, double:4.940656E-318)
            r38 = r28
            long r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r34, r36, r38)
            r26 = r6
        L_0x017a:
            r2 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.ads.interactivemedia.v3.internal.mc r4 = r3.mo16170d(r2)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r4)
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.ads.interactivemedia.v3.internal.mc r2 = r4.mo16170d(r6)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.ads.interactivemedia.v3.internal.md r3 = r3.mo16169c(r4)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r3)
            com.google.ads.interactivemedia.v3.internal.aee r3 = r3.f22910a
            r7 = 8
            r3.mo14554h(r7)
            int r4 = r3.mo14568v()
            int r4 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r4)
            if (r4 != 0) goto L_0x01ac
            r8 = 8
            goto L_0x01ae
        L_0x01ac:
            r8 = 16
        L_0x01ae:
            r3.mo14557k(r8)
            long r8 = r3.mo14566t()
            if (r4 != 0) goto L_0x01b9
            r4 = 4
            goto L_0x01bb
        L_0x01b9:
            r4 = 8
        L_0x01bb:
            r3.mo14557k(r4)
            int r3 = r3.mo14561o()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r10 = 3
            r4.<init>(r10)
            int r15 = r3 >> 10
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r4.append(r15)
            int r15 = r3 >> 5
            r15 = r15 & 31
            int r15 = r15 + 96
            char r15 = (char) r15
            r4.append(r15)
            r3 = r3 & 31
            int r3 = r3 + 96
            char r3 = (char) r3
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            android.util.Pair r15 = android.util.Pair.create(r4, r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.ads.interactivemedia.v3.internal.md r2 = r2.mo16169c(r3)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            com.google.ads.interactivemedia.v3.internal.aee r9 = r2.f22910a
            int r8 = r14.f22933a
            int r4 = r14.f22935c
            java.lang.Object r2 = r15.second
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            r2 = 12
            r9.mo14554h(r2)
            int r0 = r9.mo14568v()
            r34 = r13
            com.google.ads.interactivemedia.v3.internal.mh r13 = new com.google.ads.interactivemedia.v3.internal.mh
            r13.<init>(r0)
            r1 = 0
        L_0x021a:
            if (r1 >= r0) goto L_0x065a
            r17 = r0
            int r0 = r9.mo14553g()
            r19 = r15
            int r15 = r9.mo14568v()
            if (r15 <= 0) goto L_0x022c
            r2 = 1
            goto L_0x022d
        L_0x022c:
            r2 = 0
        L_0x022d:
            java.lang.String r6 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p367v3.internal.ary.m19465r(r2, r6)
            int r6 = r9.mo14568v()
            r2 = 1635148593(0x61766331, float:2.840654E20)
            r7 = 1701733238(0x656e6376, float:7.035987E22)
            if (r6 == r2) goto L_0x040c
            r2 = 1635148595(0x61766333, float:2.8406544E20)
            if (r6 == r2) goto L_0x040c
            if (r6 == r7) goto L_0x040c
            r2 = 1836070006(0x6d703476, float:4.646239E27)
            if (r6 == r2) goto L_0x040c
            r2 = 1752589105(0x68766331, float:4.6541277E24)
            if (r6 == r2) goto L_0x040c
            r2 = 1751479857(0x68657631, float:4.3344087E24)
            if (r6 == r2) goto L_0x040c
            r2 = 1932670515(0x73323633, float:1.4119387E31)
            if (r6 == r2) goto L_0x040c
            r2 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 == r2) goto L_0x040c
            r2 = 1987063865(0x76703039, float:1.2178997E33)
            if (r6 == r2) goto L_0x040c
            r2 = 1635135537(0x61763031, float:2.8383572E20)
            if (r6 == r2) goto L_0x040c
            r2 = 1685479798(0x64766176, float:1.8179687E22)
            if (r6 == r2) goto L_0x040c
            r2 = 1685479729(0x64766131, float:1.817961E22)
            if (r6 == r2) goto L_0x040c
            r2 = 1685481573(0x64766865, float:1.8181686E22)
            if (r6 == r2) goto L_0x040c
            r2 = 1685481521(0x64766831, float:1.8181627E22)
            if (r6 != r2) goto L_0x027e
            goto L_0x040c
        L_0x027e:
            r2 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r6 == r2) goto L_0x03d5
            r2 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r6 == r2) goto L_0x03d5
            r2 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r6 == r2) goto L_0x03d5
            r2 = 1685353315(0x64747363, float:1.803728E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1685353317(0x64747365, float:1.8037282E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1685353320(0x64747368, float:1.8037286E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1685353324(0x6474736c, float:1.803729E22)
            if (r6 == r2) goto L_0x03d5
            r2 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r6 == r2) goto L_0x03d5
            r2 = 1935767394(0x73617762, float:1.7863284E31)
            if (r6 == r2) goto L_0x03d5
            r2 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r6 == r2) goto L_0x03d5
            r2 = 1936684916(0x736f7774, float:1.89725E31)
            if (r6 == r2) goto L_0x03d5
            r2 = 1953984371(0x74776f73, float:7.841539E31)
            if (r6 == r2) goto L_0x03d5
            r2 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r6 == r2) goto L_0x03d5
            r2 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r6 == r2) goto L_0x03d5
            r2 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r6 == r2) goto L_0x03d5
            r2 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r6 == r2) goto L_0x03d5
            r2 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r6 == r2) goto L_0x03d5
            r2 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r6 == r2) goto L_0x03d5
            r2 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r6 != r2) goto L_0x02e9
            goto L_0x03d5
        L_0x02e9:
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r6 == r2) goto L_0x0355
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 == r2) goto L_0x0355
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 == r2) goto L_0x0355
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 == r2) goto L_0x0355
            r2 = 1664495672(0x63363038, float:3.360782E21)
            if (r6 != r2) goto L_0x0303
            goto L_0x0355
        L_0x0303:
            r2 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r6 != r2) goto L_0x0328
            int r2 = r0 + 16
            r9.mo14554h(r2)
            r9.mo14544H()
            java.lang.String r2 = r9.mo14544H()
            if (r2 == 0) goto L_0x0340
            com.google.ads.interactivemedia.v3.internal.cx r6 = new com.google.ads.interactivemedia.v3.internal.cx
            r6.<init>()
            r6.mo15616R(r8)
            r6.mo15630ae(r2)
            com.google.ads.interactivemedia.v3.internal.cy r2 = r6.mo15625a()
            r13.f22922b = r2
            goto L_0x0340
        L_0x0328:
            r2 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r6 != r2) goto L_0x0340
            com.google.ads.interactivemedia.v3.internal.cx r2 = new com.google.ads.interactivemedia.v3.internal.cx
            r2.<init>()
            r2.mo15616R(r8)
            java.lang.String r6 = "application/x-camera-motion"
            r2.mo15630ae(r6)
            com.google.ads.interactivemedia.v3.internal.cy r2 = r2.mo15625a()
            r13.f22922b = r2
        L_0x0340:
            r24 = r0
            r18 = r1
            r20 = r3
            r2 = r4
            r21 = r5
            r1 = r8
            r42 = r11
            r23 = r14
            r31 = r15
            r6 = 3
            r8 = 2
            r14 = r9
            goto L_0x0637
        L_0x0355:
            int r2 = r0 + 16
            r9.mo14554h(r2)
            r2 = 1414810956(0x54544d4c, float:3.64731957E12)
            r35 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r6 != r2) goto L_0x036d
            java.lang.String r2 = "application/ttml+xml"
        L_0x0366:
            r31 = r11
            r6 = r33
            r10 = r35
            goto L_0x03a6
        L_0x036d:
            r2 = 1954034535(0x74783367, float:7.865797E31)
            if (r6 != r2) goto L_0x038a
            int r2 = r15 + -16
            byte[] r6 = new byte[r2]
            r7 = 0
            r9.mo14559m(r6, r7, r2)
            com.google.ads.interactivemedia.v3.internal.arn r2 = com.google.ads.interactivemedia.p367v3.internal.arn.m19403j(r6)
            java.lang.String r6 = "application/x-quicktime-tx3g"
            r31 = r11
            r10 = r35
            r44 = r6
            r6 = r2
            r2 = r44
            goto L_0x03a6
        L_0x038a:
            r2 = 2004251764(0x77767474, float:4.998699E33)
            if (r6 != r2) goto L_0x0392
            java.lang.String r2 = "application/x-mp4-vtt"
            goto L_0x0366
        L_0x0392:
            r2 = 1937010800(0x73747070, float:1.9366469E31)
            if (r6 != r2) goto L_0x03a0
            java.lang.String r2 = "application/ttml+xml"
            r31 = r11
            r6 = r33
            r10 = 0
            goto L_0x03a6
        L_0x03a0:
            r2 = 1
            r13.f22924d = r2
            java.lang.String r2 = "application/x-mp4-cea-608"
            goto L_0x0366
        L_0x03a6:
            com.google.ads.interactivemedia.v3.internal.cx r7 = new com.google.ads.interactivemedia.v3.internal.cx
            r7.<init>()
            r7.mo15616R(r8)
            r7.mo15630ae(r2)
            r7.mo15620V(r3)
            r7.mo15634ai(r10)
            r7.mo15618T(r6)
            com.google.ads.interactivemedia.v3.internal.cy r2 = r7.mo15625a()
            r13.f22922b = r2
            r24 = r0
            r18 = r1
            r20 = r3
            r2 = r4
            r21 = r5
            r1 = r8
            r23 = r14
            r42 = r31
            r6 = 3
            r8 = 2
            r14 = r9
            r31 = r15
            goto L_0x0637
        L_0x03d5:
            r31 = r11
            r7 = 12
            r2 = r9
            r20 = r3
            r3 = r6
            r11 = r4
            r6 = 16
            r10 = 1937007212(0x7374626c, float:1.9362132E31)
            r4 = r0
            r21 = r5
            r5 = r15
            r23 = r14
            r14 = 16
            r6 = r8
            r7 = r20
            r41 = r8
            r8 = r50
            r14 = r9
            r9 = r49
            r10 = r13
            r43 = r11
            r42 = r31
            r11 = r1
            m21150e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r24 = r0
            r18 = r1
            r31 = r15
            r1 = r41
            r2 = r43
            r6 = 3
            r8 = 2
            goto L_0x0637
        L_0x040c:
            r20 = r3
            r43 = r4
            r21 = r5
            r41 = r8
            r42 = r11
            r23 = r14
            r14 = r9
            int r2 = r0 + 16
            r14.mo14554h(r2)
            r2 = 16
            r14.mo14557k(r2)
            int r3 = r14.mo14561o()
            int r4 = r14.mo14561o()
            r5 = 50
            r14.mo14557k(r5)
            int r5 = r14.mo14553g()
            if (r6 != r7) goto L_0x0465
            android.util.Pair r6 = m21152g(r14, r0, r15)
            if (r6 == 0) goto L_0x045d
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r12 != 0) goto L_0x0449
            r8 = r33
            goto L_0x0453
        L_0x0449:
            java.lang.Object r8 = r6.second
            com.google.ads.interactivemedia.v3.internal.nc r8 = (com.google.ads.interactivemedia.p367v3.internal.C7139nc) r8
            java.lang.String r8 = r8.f23045b
            com.google.ads.interactivemedia.v3.internal.jc r8 = r12.mo16061b(r8)
        L_0x0453:
            com.google.ads.interactivemedia.v3.internal.nc[] r9 = r13.f22921a
            java.lang.Object r6 = r6.second
            com.google.ads.interactivemedia.v3.internal.nc r6 = (com.google.ads.interactivemedia.p367v3.internal.C7139nc) r6
            r9[r1] = r6
            r6 = r7
            goto L_0x0461
        L_0x045d:
            r8 = r12
            r6 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0461:
            r14.mo14554h(r5)
            goto L_0x0466
        L_0x0465:
            r8 = r12
        L_0x0466:
            r7 = 1065353216(0x3f800000, float:1.0)
            r18 = r1
            r22 = r8
            r1 = r33
            r2 = r1
            r11 = r2
            r12 = r11
            r9 = -1
            r10 = 0
        L_0x0473:
            int r8 = r5 - r0
            if (r8 >= r15) goto L_0x05f4
            r14.mo14554h(r5)
            int r8 = r14.mo14553g()
            int r24 = r14.mo14568v()
            if (r24 != 0) goto L_0x0494
            int r24 = r14.mo14553g()
            r25 = r1
            int r1 = r24 - r0
            if (r1 != r15) goto L_0x0492
            r24 = r0
            goto L_0x05f8
        L_0x0492:
            r1 = 0
            goto L_0x0498
        L_0x0494:
            r25 = r1
            r1 = r24
        L_0x0498:
            if (r1 <= 0) goto L_0x04a0
            r24 = r0
            r31 = r15
            r0 = 1
            goto L_0x04a5
        L_0x04a0:
            r24 = r0
            r31 = r15
            r0 = 0
        L_0x04a5:
            java.lang.String r15 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p367v3.internal.ary.m19465r(r0, r15)
            int r0 = r14.mo14568v()
            r15 = 1635148611(0x61766343, float:2.8406573E20)
            if (r0 != r15) goto L_0x04d1
            if (r11 != 0) goto L_0x04b7
            r0 = 1
            goto L_0x04b8
        L_0x04b7:
            r0 = 0
        L_0x04b8:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            int r8 = r8 + 8
            r14.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.aev r0 = com.google.ads.interactivemedia.p367v3.internal.aev.m18557a(r14)
            java.util.List r8 = r0.f20480a
            int r11 = r0.f20481b
            r13.f22923c = r11
            if (r10 != 0) goto L_0x04ce
            float r7 = r0.f20484e
        L_0x04ce:
            java.lang.String r11 = "video/avc"
            goto L_0x04ef
        L_0x04d1:
            r15 = 1752589123(0x68766343, float:4.6541328E24)
            if (r0 != r15) goto L_0x04f7
            if (r11 != 0) goto L_0x04da
            r0 = 1
            goto L_0x04db
        L_0x04da:
            r0 = 0
        L_0x04db:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            int r8 = r8 + 8
            r14.mo14554h(r8)
            com.google.ads.interactivemedia.v3.internal.afb r0 = com.google.ads.interactivemedia.p367v3.internal.afb.m18568a(r14)
            java.util.List r8 = r0.f20504a
            int r0 = r0.f20505b
            r13.f22923c = r0
            java.lang.String r11 = "video/hevc"
        L_0x04ef:
            r35 = r6
            r25 = r8
        L_0x04f3:
            r6 = 3
        L_0x04f4:
            r8 = 2
            goto L_0x05e9
        L_0x04f7:
            r15 = 1685480259(0x64766343, float:1.8180206E22)
            if (r0 == r15) goto L_0x05db
            r15 = 1685485123(0x64767643, float:1.8185683E22)
            if (r0 != r15) goto L_0x0503
            goto L_0x05db
        L_0x0503:
            r15 = 1987076931(0x76706343, float:1.21891066E33)
            if (r0 != r15) goto L_0x051c
            if (r11 != 0) goto L_0x050c
            r0 = 1
            goto L_0x050d
        L_0x050c:
            r0 = 0
        L_0x050d:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            r0 = 1987063864(0x76703038, float:1.21789965E33)
            if (r6 != r0) goto L_0x0518
            java.lang.String r0 = "video/x-vnd.on2.vp8"
            goto L_0x051a
        L_0x0518:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
        L_0x051a:
            r11 = r0
            goto L_0x052b
        L_0x051c:
            r15 = 1635135811(0x61763143, float:2.8384055E20)
            if (r0 != r15) goto L_0x052e
            if (r11 != 0) goto L_0x0525
            r0 = 1
            goto L_0x0526
        L_0x0525:
            r0 = 0
        L_0x0526:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            java.lang.String r11 = "video/av01"
        L_0x052b:
            r35 = r6
            goto L_0x04f3
        L_0x052e:
            r15 = 1681012275(0x64323633, float:1.3149704E22)
            if (r0 != r15) goto L_0x053e
            if (r11 != 0) goto L_0x0537
            r0 = 1
            goto L_0x0538
        L_0x0537:
            r0 = 0
        L_0x0538:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            java.lang.String r11 = "video/3gpp"
            goto L_0x052b
        L_0x053e:
            r15 = 1702061171(0x65736473, float:7.183675E22)
            if (r0 != r15) goto L_0x0561
            if (r11 != 0) goto L_0x0547
            r0 = 1
            goto L_0x0548
        L_0x0547:
            r0 = 0
        L_0x0548:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r0)
            android.util.Pair r0 = m21151f(r14, r8)
            java.lang.Object r8 = r0.first
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x052b
            com.google.ads.interactivemedia.v3.internal.arn r0 = com.google.ads.interactivemedia.p367v3.internal.arn.m19403j(r0)
            r25 = r0
            goto L_0x052b
        L_0x0561:
            r15 = 1885434736(0x70617370, float:2.7909473E29)
            if (r0 != r15) goto L_0x057e
            int r8 = r8 + 8
            r14.mo14554h(r8)
            int r0 = r14.mo14538B()
            float r0 = (float) r0
            int r7 = r14.mo14538B()
            float r7 = (float) r7
            float r0 = r0 / r7
            r7 = r0
            r35 = r6
            r6 = 3
            r8 = 2
            r10 = 1
            goto L_0x05e9
        L_0x057e:
            r15 = 1937126244(0x73763364, float:1.9506033E31)
            if (r0 != r15) goto L_0x05b1
            int r0 = r8 + 8
        L_0x0585:
            int r12 = r0 - r8
            if (r12 >= r1) goto L_0x05ab
            r14.mo14554h(r0)
            int r12 = r14.mo14568v()
            int r15 = r14.mo14568v()
            r35 = r6
            r6 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r15 != r6) goto L_0x05a7
            byte[] r6 = r14.mo14555i()
            int r12 = r12 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r6, r0, r12)
            r12 = r0
            goto L_0x04f3
        L_0x05a7:
            int r0 = r0 + r12
            r6 = r35
            goto L_0x0585
        L_0x05ab:
            r35 = r6
            r12 = r33
            goto L_0x04f3
        L_0x05b1:
            r35 = r6
            r6 = 1936995172(0x73743364, float:1.9347576E31)
            if (r0 != r6) goto L_0x04f3
            int r0 = r14.mo14560n()
            r6 = 3
            r14.mo14557k(r6)
            if (r0 != 0) goto L_0x04f4
            int r0 = r14.mo14560n()
            if (r0 == 0) goto L_0x05d8
            r8 = 1
            if (r0 == r8) goto L_0x05d5
            r8 = 2
            if (r0 == r8) goto L_0x05d3
            if (r0 == r6) goto L_0x05d1
            goto L_0x05e9
        L_0x05d1:
            r9 = 3
            goto L_0x05e9
        L_0x05d3:
            r9 = 2
            goto L_0x05e9
        L_0x05d5:
            r8 = 2
            r9 = 1
            goto L_0x05e9
        L_0x05d8:
            r8 = 2
            r9 = 0
            goto L_0x05e9
        L_0x05db:
            r35 = r6
            r6 = 3
            r8 = 2
            com.google.ads.interactivemedia.v3.internal.aey r0 = com.google.ads.interactivemedia.p367v3.internal.aey.m18559a(r14)
            if (r0 == 0) goto L_0x05e9
            java.lang.String r2 = r0.f20490a
            java.lang.String r11 = "video/dolby-vision"
        L_0x05e9:
            int r5 = r5 + r1
            r0 = r24
            r1 = r25
            r15 = r31
            r6 = r35
            goto L_0x0473
        L_0x05f4:
            r24 = r0
            r25 = r1
        L_0x05f8:
            r31 = r15
            r6 = 3
            r8 = 2
            if (r11 == 0) goto L_0x0633
            com.google.ads.interactivemedia.v3.internal.cx r0 = new com.google.ads.interactivemedia.v3.internal.cx
            r0.<init>()
            r1 = r41
            r0.mo15616R(r1)
            r0.mo15630ae(r11)
            r0.mo15607I(r2)
            r0.mo15635aj(r3)
            r0.mo15615Q(r4)
            r0.mo15626aa(r7)
            r2 = r43
            r0.mo15629ad(r2)
            r0.mo15627ab(r12)
            r0.mo15633ah(r9)
            r3 = r25
            r0.mo15618T(r3)
            r12 = r22
            r0.mo15610L(r12)
            com.google.ads.interactivemedia.v3.internal.cy r0 = r0.mo15625a()
            r13.f22922b = r0
            goto L_0x0637
        L_0x0633:
            r1 = r41
            r2 = r43
        L_0x0637:
            int r0 = r24 + r31
            r14.mo14554h(r0)
            int r0 = r18 + 1
            r12 = r49
            r8 = r1
            r4 = r2
            r9 = r14
            r15 = r19
            r3 = r20
            r5 = r21
            r14 = r23
            r11 = r42
            r2 = 12
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            r7 = 8
            r10 = 3
            r1 = r0
            r0 = r17
            goto L_0x021a
        L_0x065a:
            r21 = r5
            r42 = r11
            r23 = r14
            r19 = r15
            r8 = 2
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r42
            com.google.ads.interactivemedia.v3.internal.mc r0 = r2.mo16170d(r0)
            if (r0 == 0) goto L_0x06d7
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            com.google.ads.interactivemedia.v3.internal.md r0 = r0.mo16169c(r1)
            if (r0 != 0) goto L_0x067a
            r0 = r33
            goto L_0x06c8
        L_0x067a:
            com.google.ads.interactivemedia.v3.internal.aee r0 = r0.f22910a
            r1 = 8
            r0.mo14554h(r1)
            int r1 = r0.mo14568v()
            int r1 = com.google.ads.interactivemedia.p367v3.internal.C7114me.m21130e(r1)
            int r3 = r0.mo14538B()
            long[] r4 = new long[r3]
            long[] r5 = new long[r3]
            r6 = 0
        L_0x0692:
            if (r6 >= r3) goto L_0x06c4
            r7 = 1
            if (r1 != r7) goto L_0x069c
            long r9 = r0.mo14540D()
            goto L_0x06a0
        L_0x069c:
            long r9 = r0.mo14566t()
        L_0x06a0:
            r4[r6] = r9
            if (r1 != r7) goto L_0x06a9
            long r9 = r0.mo14570x()
            goto L_0x06ae
        L_0x06a9:
            int r9 = r0.mo14568v()
            long r9 = (long) r9
        L_0x06ae:
            r5[r6] = r9
            short r9 = r0.mo14563q()
            if (r9 != r7) goto L_0x06bc
            r0.mo14557k(r8)
            int r6 = r6 + 1
            goto L_0x0692
        L_0x06bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x06c4:
            android.util.Pair r0 = android.util.Pair.create(r4, r5)
        L_0x06c8:
            if (r0 == 0) goto L_0x06d7
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r31 = r0
            r30 = r1
            goto L_0x06db
        L_0x06d7:
            r30 = r33
            r31 = r30
        L_0x06db:
            com.google.ads.interactivemedia.v3.internal.cy r0 = r13.f22922b
            if (r0 != 0) goto L_0x06e4
            r1 = r51
            r0 = r33
            goto L_0x0713
        L_0x06e4:
            com.google.ads.interactivemedia.v3.internal.nb r0 = new com.google.ads.interactivemedia.v3.internal.nb
            int r18 = r23.f22933a
            r1 = r19
            java.lang.Object r1 = r1.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            com.google.ads.interactivemedia.v3.internal.cy r1 = r13.f22922b
            int r5 = r13.f22924d
            com.google.ads.interactivemedia.v3.internal.nc[] r6 = r13.f22921a
            int r7 = r13.f22923c
            r17 = r0
            r19 = r21
            r20 = r3
            r22 = r28
            r24 = r26
            r26 = r1
            r27 = r5
            r28 = r6
            r29 = r7
            r17.<init>(r18, r19, r20, r22, r24, r26, r27, r28, r29, r30, r31)
            r1 = r51
        L_0x0713:
            java.lang.Object r0 = r1.apply(r0)
            com.google.ads.interactivemedia.v3.internal.nb r0 = (com.google.ads.interactivemedia.p367v3.internal.C7138nb) r0
            if (r0 == 0) goto L_0x0d26
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.ads.interactivemedia.v3.internal.mc r2 = r2.mo16170d(r3)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.ads.interactivemedia.v3.internal.mc r2 = r2.mo16170d(r3)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.ads.interactivemedia.v3.internal.mc r2 = r2.mo16170d(r3)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.ads.interactivemedia.v3.internal.md r3 = r2.mo16169c(r3)
            if (r3 == 0) goto L_0x0748
            com.google.ads.interactivemedia.v3.internal.mi r4 = new com.google.ads.interactivemedia.v3.internal.mi
            r4.<init>(r3)
            goto L_0x0756
        L_0x0748:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.ads.interactivemedia.v3.internal.md r3 = r2.mo16169c(r3)
            if (r3 == 0) goto L_0x0d1e
            com.google.ads.interactivemedia.v3.internal.mj r4 = new com.google.ads.interactivemedia.v3.internal.mj
            r4.<init>(r3)
        L_0x0756:
            int r3 = r4.mo16173a()
            if (r3 != 0) goto L_0x077e
            com.google.ads.interactivemedia.v3.internal.ne r2 = new com.google.ads.interactivemedia.v3.internal.ne
            r3 = 0
            long[] r4 = new long[r3]
            int[] r5 = new int[r3]
            r21 = 0
            long[] r6 = new long[r3]
            int[] r7 = new int[r3]
            r24 = 0
            r17 = r2
            r18 = r0
            r19 = r4
            r20 = r5
            r22 = r6
            r23 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
        L_0x077a:
            r0 = r34
            goto L_0x0d1a
        L_0x077e:
            r5 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.ads.interactivemedia.v3.internal.md r5 = r2.mo16169c(r5)
            if (r5 != 0) goto L_0x0793
            r5 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.ads.interactivemedia.v3.internal.md r5 = r2.mo16169c(r5)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r5)
            r6 = 1
            goto L_0x0794
        L_0x0793:
            r6 = 0
        L_0x0794:
            com.google.ads.interactivemedia.v3.internal.aee r5 = r5.f22910a
            r7 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.ads.interactivemedia.v3.internal.md r7 = r2.mo16169c(r7)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r7)
            com.google.ads.interactivemedia.v3.internal.aee r7 = r7.f22910a
            r9 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.ads.interactivemedia.v3.internal.md r9 = r2.mo16169c(r9)
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)
            com.google.ads.interactivemedia.v3.internal.aee r9 = r9.f22910a
            r10 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.ads.interactivemedia.v3.internal.md r10 = r2.mo16169c(r10)
            if (r10 == 0) goto L_0x07ba
            com.google.ads.interactivemedia.v3.internal.aee r10 = r10.f22910a
            goto L_0x07bc
        L_0x07ba:
            r10 = r33
        L_0x07bc:
            r11 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.ads.interactivemedia.v3.internal.md r2 = r2.mo16169c(r11)
            if (r2 == 0) goto L_0x07c8
            com.google.ads.interactivemedia.v3.internal.aee r2 = r2.f22910a
            goto L_0x07ca
        L_0x07c8:
            r2 = r33
        L_0x07ca:
            com.google.ads.interactivemedia.v3.internal.mf r11 = new com.google.ads.interactivemedia.v3.internal.mf
            r11.<init>(r7, r5, r6)
            r5 = 12
            r9.mo14554h(r5)
            int r6 = r9.mo14538B()
            r7 = -1
            int r6 = r6 + r7
            int r12 = r9.mo14538B()
            int r13 = r9.mo14538B()
            if (r2 == 0) goto L_0x07ec
            r2.mo14554h(r5)
            int r14 = r2.mo14538B()
            goto L_0x07ed
        L_0x07ec:
            r14 = 0
        L_0x07ed:
            if (r10 == 0) goto L_0x0800
            r10.mo14554h(r5)
            int r5 = r10.mo14538B()
            if (r5 <= 0) goto L_0x0803
            int r15 = r10.mo14538B()
            int r15 = r15 + r7
            r33 = r10
            goto L_0x0804
        L_0x0800:
            r33 = r10
            r5 = 0
        L_0x0803:
            r15 = -1
        L_0x0804:
            int r10 = r4.mo16174b()
            com.google.ads.interactivemedia.v3.internal.cy r8 = r0.f23038f
            java.lang.String r8 = r8.f21812l
            if (r10 == r7) goto L_0x08d0
            java.lang.String r7 = "audio/raw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0826
            java.lang.String r7 = "audio/g711-mlaw"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0826
            java.lang.String r7 = "audio/g711-alaw"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x08d0
        L_0x0826:
            if (r6 != 0) goto L_0x08d0
            if (r14 != 0) goto L_0x08cf
            if (r5 != 0) goto L_0x08cf
            int r2 = r11.f22912a
            long[] r4 = new long[r2]
            int[] r5 = new int[r2]
        L_0x0832:
            boolean r6 = r11.mo16172a()
            if (r6 == 0) goto L_0x0843
            int r6 = r11.f22913b
            long r7 = r11.f22915d
            r4[r6] = r7
            int r7 = r11.f22914c
            r5[r6] = r7
            goto L_0x0832
        L_0x0843:
            long r6 = (long) r13
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r10
            r9 = 0
            r11 = 0
        L_0x0849:
            if (r9 >= r2) goto L_0x0855
            r12 = r5[r9]
            int r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18488F(r12, r8)
            int r11 = r11 + r12
            int r9 = r9 + 1
            goto L_0x0849
        L_0x0855:
            long[] r9 = new long[r11]
            int[] r12 = new int[r11]
            long[] r13 = new long[r11]
            int[] r11 = new int[r11]
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = 0
        L_0x0863:
            if (r14 >= r2) goto L_0x08a8
            r18 = r5[r14]
            r21 = r4[r14]
            r1 = r18
            r18 = r2
            r2 = r20
        L_0x086f:
            if (r1 <= 0) goto L_0x089b
            int r19 = java.lang.Math.min(r8, r1)
            r9[r17] = r21
            r23 = r4
            int r4 = r10 * r19
            r12[r17] = r4
            int r2 = java.lang.Math.max(r2, r4)
            r24 = r5
            long r4 = (long) r15
            long r4 = r4 * r6
            r13[r17] = r4
            r4 = 1
            r11[r17] = r4
            r4 = r12[r17]
            long r4 = (long) r4
            long r21 = r21 + r4
            int r15 = r15 + r19
            int r1 = r1 - r19
            int r17 = r17 + 1
            r4 = r23
            r5 = r24
            goto L_0x086f
        L_0x089b:
            r23 = r4
            r24 = r5
            int r14 = r14 + 1
            r1 = r51
            r20 = r2
            r2 = r18
            goto L_0x0863
        L_0x08a8:
            com.google.ads.interactivemedia.v3.internal.mn r1 = new com.google.ads.interactivemedia.v3.internal.mn
            long r4 = (long) r15
            long r23 = r6 * r4
            r17 = r1
            r18 = r9
            r19 = r12
            r21 = r13
            r22 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23)
            long[] r2 = r1.f22941a
            int[] r4 = r1.f22942b
            int r5 = r1.f22943c
            long[] r6 = r1.f22944d
            int[] r7 = r1.f22945e
            long r8 = r1.f22946f
            r1 = r4
            r21 = r5
            r10 = r6
            r11 = r7
            r19 = r8
            goto L_0x0a7d
        L_0x08cf:
            r6 = 0
        L_0x08d0:
            long[] r1 = new long[r3]
            int[] r7 = new int[r3]
            long[] r8 = new long[r3]
            int[] r10 = new int[r3]
            r18 = r5
            r19 = r6
            r20 = r12
            r26 = r14
            r5 = 0
            r6 = 0
            r12 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r24 = 0
        L_0x08eb:
            java.lang.String r14 = "AtomParsers"
            if (r5 >= r3) goto L_0x09bc
            r27 = 1
        L_0x08f1:
            if (r21 != 0) goto L_0x0916
            boolean r27 = r11.mo16172a()
            if (r27 == 0) goto L_0x090e
            r29 = r12
            r28 = r13
            long r12 = r11.f22915d
            r30 = r3
            int r3 = r11.f22914c
            r21 = r3
            r22 = r12
            r13 = r28
            r12 = r29
            r3 = r30
            goto L_0x08f1
        L_0x090e:
            r30 = r3
            r29 = r12
            r28 = r13
            r3 = 0
            goto L_0x091e
        L_0x0916:
            r30 = r3
            r29 = r12
            r28 = r13
            r3 = r21
        L_0x091e:
            if (r27 != 0) goto L_0x093a
            java.lang.String r3 = "Unexpected end of chunk data"
            android.util.Log.w(r14, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r5)
            int[] r7 = java.util.Arrays.copyOf(r7, r5)
            long[] r8 = java.util.Arrays.copyOf(r8, r5)
            int[] r10 = java.util.Arrays.copyOf(r10, r5)
            r3 = r5
            r12 = r29
            goto L_0x09c0
        L_0x093a:
            if (r2 == 0) goto L_0x0959
            r14 = r26
            r12 = r29
        L_0x0940:
            if (r17 != 0) goto L_0x0953
            if (r14 <= 0) goto L_0x094f
            int r17 = r2.mo14538B()
            int r12 = r2.mo14568v()
            int r14 = r14 + -1
            goto L_0x0940
        L_0x094f:
            r13 = -1
            r17 = 0
            goto L_0x0954
        L_0x0953:
            r13 = -1
        L_0x0954:
            int r17 = r17 + -1
            r26 = r14
            goto L_0x095b
        L_0x0959:
            r12 = r29
        L_0x095b:
            r1[r5] = r22
            int r13 = r4.mo16175c()
            r7[r5] = r13
            if (r13 <= r6) goto L_0x0966
            r6 = r13
        L_0x0966:
            long r13 = (long) r12
            long r13 = r24 + r13
            r8[r5] = r13
            if (r33 != 0) goto L_0x096f
            r13 = 1
            goto L_0x0970
        L_0x096f:
            r13 = 0
        L_0x0970:
            r10[r5] = r13
            if (r5 != r15) goto L_0x0988
            r13 = 1
            r10[r5] = r13
            int r18 = r18 + -1
            if (r18 <= 0) goto L_0x0988
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r33)
            int r13 = r33.mo14538B()
            r14 = -1
            int r13 = r13 + r14
            r27 = r11
            r15 = r13
            goto L_0x098a
        L_0x0988:
            r27 = r11
        L_0x098a:
            r13 = r28
            r28 = r10
            long r10 = (long) r13
            long r24 = r24 + r10
            int r10 = r20 + -1
            if (r10 != 0) goto L_0x09a8
            if (r19 <= 0) goto L_0x09a5
            int r10 = r9.mo14538B()
            int r11 = r9.mo14568v()
            int r19 = r19 + -1
            r20 = r10
            r13 = r11
            goto L_0x09aa
        L_0x09a5:
            r20 = 0
            goto L_0x09aa
        L_0x09a8:
            r20 = r10
        L_0x09aa:
            r10 = r7[r5]
            long r10 = (long) r10
            long r22 = r22 + r10
            r10 = -1
            int r21 = r3 + -1
            int r5 = r5 + 1
            r11 = r27
            r10 = r28
            r3 = r30
            goto L_0x08eb
        L_0x09bc:
            r30 = r3
            r28 = r10
        L_0x09c0:
            long r4 = (long) r12
            long r4 = r24 + r4
            if (r2 == 0) goto L_0x09d5
        L_0x09c5:
            if (r26 <= 0) goto L_0x09d5
            int r9 = r2.mo14538B()
            if (r9 == 0) goto L_0x09cf
            r2 = 0
            goto L_0x09d6
        L_0x09cf:
            r2.mo14568v()
            int r26 = r26 + -1
            goto L_0x09c5
        L_0x09d5:
            r2 = 1
        L_0x09d6:
            if (r18 != 0) goto L_0x0a15
            if (r20 != 0) goto L_0x0a0b
            if (r21 != 0) goto L_0x0a02
            if (r19 != 0) goto L_0x09fa
            if (r17 != 0) goto L_0x09f3
            if (r2 != 0) goto L_0x09eb
            r17 = r1
            r2 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x0a21
        L_0x09eb:
            r17 = r1
            r18 = r3
            r19 = r4
            goto L_0x0a74
        L_0x09f3:
            r15 = r17
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            goto L_0x0a1f
        L_0x09fa:
            r15 = r17
            r13 = r19
            r9 = 0
            r11 = 0
            r12 = 0
            goto L_0x0a1f
        L_0x0a02:
            r15 = r17
            r13 = r19
            r12 = r21
            r9 = 0
            r11 = 0
            goto L_0x0a1f
        L_0x0a0b:
            r15 = r17
            r13 = r19
            r11 = r20
            r12 = r21
            r9 = 0
            goto L_0x0a1f
        L_0x0a15:
            r15 = r17
            r9 = r18
            r13 = r19
            r11 = r20
            r12 = r21
        L_0x0a1f:
            r17 = r1
        L_0x0a21:
            int r1 = r0.f23033a
            r18 = r3
            r3 = 1
            if (r3 == r2) goto L_0x0a2b
            java.lang.String r2 = ", ctts invalid"
            goto L_0x0a2d
        L_0x0a2b:
            java.lang.String r2 = ""
        L_0x0a2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r19 = r4
            int r4 = r2.length()
            int r4 = r4 + 262
            r3.<init>(r4)
            java.lang.String r4 = "Inconsistent stbl box for track "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ": remainingSynchronizationSamples "
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = ", remainingSamplesAtTimestampDelta "
            r3.append(r1)
            r3.append(r11)
            java.lang.String r1 = ", remainingSamplesInChunk "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = ", remainingTimestampDeltaChanges "
            r3.append(r1)
            r3.append(r13)
            java.lang.String r1 = ", remainingSamplesAtTimestampOffset "
            r3.append(r1)
            r3.append(r15)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r14, r1)
        L_0x0a74:
            r21 = r6
            r1 = r7
            r11 = r10
            r2 = r17
            r3 = r18
            r10 = r8
        L_0x0a7d:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r0.f23035c
            r4 = r19
            long r24 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r4, r6, r8)
            long[] r4 = r0.f23040h
            if (r4 != 0) goto L_0x0aa5
            long r3 = r0.f23035c
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18528as(r10, r3)
            com.google.ads.interactivemedia.v3.internal.ne r3 = new com.google.ads.interactivemedia.v3.internal.ne
            r17 = r3
            r18 = r0
            r19 = r2
            r20 = r1
            r22 = r10
            r23 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
        L_0x0aa2:
            r2 = r3
            goto L_0x077a
        L_0x0aa5:
            int r4 = r4.length
            r5 = 1
            if (r4 != r5) goto L_0x0b5e
            int r4 = r0.f23034b
            if (r4 != r5) goto L_0x0b5e
            int r4 = r10.length
            r5 = 2
            if (r4 < r5) goto L_0x0b5e
            long[] r5 = r0.f23041i
            java.lang.Object r5 = com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r5)
            long[] r5 = (long[]) r5
            r6 = 0
            r7 = r5[r6]
            long[] r5 = r0.f23040h
            r12 = r5[r6]
            long r14 = r0.f23035c
            r22 = r7
            long r6 = r0.f23036d
            r16 = r6
            long r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r12, r14, r16)
            long r6 = r22 + r6
            int r8 = r4 + -1
            r5 = 4
            r9 = 0
            int r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18490H(r5, r9, r8)
            int r4 = r4 + -4
            int r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18490H(r4, r9, r8)
            r12 = r10[r9]
            int r8 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r8 > 0) goto L_0x0b5e
            r8 = r10[r5]
            int r5 = (r22 > r8 ? 1 : (r22 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x0b5e
            r4 = r10[r4]
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0b5e
            int r4 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r4 > 0) goto L_0x0b5e
            long r24 = r22 - r12
            com.google.ads.interactivemedia.v3.internal.cy r4 = r0.f23038f
            int r4 = r4.f21826z
            long r4 = (long) r4
            long r8 = r0.f23035c
            r26 = r4
            r28 = r8
            long r4 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r24, r26, r28)
            long r22 = r19 - r6
            com.google.ads.interactivemedia.v3.internal.cy r6 = r0.f23038f
            int r6 = r6.f21826z
            long r6 = (long) r6
            long r8 = r0.f23035c
            r24 = r6
            r26 = r8
            long r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r22, r24, r26)
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x0b20
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0b5e
            r4 = 0
        L_0x0b20:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 > 0) goto L_0x0b5e
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 > 0) goto L_0x0b5e
            int r3 = (int) r4
            r4 = r46
            r4.f22617a = r3
            int r3 = (int) r6
            r4.f22618b = r3
            long r5 = r0.f23035c
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18528as(r10, r5)
            long[] r3 = r0.f23040h
            r5 = 0
            r22 = r3[r5]
            long r5 = r0.f23036d
            r24 = 1000000(0xf4240, double:4.940656E-318)
            r26 = r5
            long r24 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r22, r24, r26)
            com.google.ads.interactivemedia.v3.internal.ne r3 = new com.google.ads.interactivemedia.v3.internal.ne
            r17 = r3
            r18 = r0
            r19 = r2
            r20 = r1
            r22 = r10
            r23 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0aa2
        L_0x0b5e:
            r4 = r46
            long[] r5 = r0.f23040h
            int r6 = r5.length
            r7 = 1
            if (r6 != r7) goto L_0x0bb3
            r7 = 0
            r8 = r5[r7]
            r5 = 0
            int r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x0bb1
            long[] r3 = r0.f23041i
            java.lang.Object r3 = com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r3)
            long[] r3 = (long[]) r3
            r5 = r3[r7]
            r3 = 0
        L_0x0b7a:
            int r8 = r10.length
            if (r3 >= r8) goto L_0x0b91
            r8 = r10[r3]
            long r12 = r8 - r5
            r14 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r0.f23035c
            r16 = r8
            long r8 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r12, r14, r16)
            r10[r3] = r8
            int r3 = r3 + 1
            goto L_0x0b7a
        L_0x0b91:
            long r8 = r0.f23035c
            long r12 = r19 - r5
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r8
            long r24 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r12, r14, r16)
            com.google.ads.interactivemedia.v3.internal.ne r3 = new com.google.ads.interactivemedia.v3.internal.ne
            r17 = r3
            r18 = r0
            r19 = r2
            r20 = r1
            r22 = r10
            r23 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0aa2
        L_0x0bb1:
            r6 = 1
            goto L_0x0bb4
        L_0x0bb3:
            r7 = 0
        L_0x0bb4:
            int r5 = r0.f23034b
            r8 = 1
            if (r5 != r8) goto L_0x0bbb
            r5 = 1
            goto L_0x0bbc
        L_0x0bbb:
            r5 = 0
        L_0x0bbc:
            int[] r8 = new int[r6]
            int[] r6 = new int[r6]
            long[] r9 = r0.f23041i
            java.lang.Object r9 = com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)
            long[] r9 = (long[]) r9
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0bcc:
            long[] r7 = r0.f23040h
            int r4 = r7.length
            if (r12 >= r4) goto L_0x0c2f
            r17 = r1
            r4 = r2
            r1 = r9[r12]
            r18 = -1
            int r20 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r20 == 0) goto L_0x0c1f
            r22 = r7[r12]
            r7 = r3
            r18 = r4
            long r3 = r0.f23035c
            r19 = r14
            r20 = r15
            long r14 = r0.f23036d
            r24 = r3
            r26 = r14
            long r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r22, r24, r26)
            r14 = 1
            int r15 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18523an(r10, r1, r14)
            r8[r12] = r15
            long r1 = r1 + r3
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18520ak(r10, r1, r5)
            r6[r12] = r1
        L_0x0bff:
            r1 = r8[r12]
            r2 = r6[r12]
            if (r1 >= r2) goto L_0x0c10
            r3 = r11[r1]
            r3 = r3 & r14
            if (r3 != 0) goto L_0x0c10
            int r1 = r1 + 1
            r8[r12] = r1
            r14 = 1
            goto L_0x0bff
        L_0x0c10:
            int r3 = r2 - r1
            int r13 = r13 + r3
            r3 = r19
            if (r3 == r1) goto L_0x0c19
            r1 = 1
            goto L_0x0c1a
        L_0x0c19:
            r1 = 0
        L_0x0c1a:
            r1 = r20 | r1
            r15 = r1
            r14 = r2
            goto L_0x0c25
        L_0x0c1f:
            r7 = r3
            r18 = r4
            r3 = r14
            r20 = r15
        L_0x0c25:
            int r12 = r12 + 1
            r4 = r46
            r3 = r7
            r1 = r17
            r2 = r18
            goto L_0x0bcc
        L_0x0c2f:
            r17 = r1
            r18 = r2
            r7 = r3
            r20 = r15
            if (r13 == r7) goto L_0x0c3a
            r7 = 1
            goto L_0x0c3b
        L_0x0c3a:
            r7 = 0
        L_0x0c3b:
            r1 = r20 | r7
            if (r1 == 0) goto L_0x0c42
            long[] r2 = new long[r13]
            goto L_0x0c44
        L_0x0c42:
            r2 = r18
        L_0x0c44:
            if (r1 == 0) goto L_0x0c49
            int[] r3 = new int[r13]
            goto L_0x0c4b
        L_0x0c49:
            r3 = r17
        L_0x0c4b:
            r4 = 1
            if (r4 != r1) goto L_0x0c50
            r7 = 0
            goto L_0x0c52
        L_0x0c50:
            r7 = r21
        L_0x0c52:
            if (r1 == 0) goto L_0x0c57
            int[] r4 = new int[r13]
            goto L_0x0c58
        L_0x0c57:
            r4 = r11
        L_0x0c58:
            long[] r5 = new long[r13]
            r14 = r7
            r7 = 0
            r9 = 0
            r12 = 0
        L_0x0c5f:
            long[] r15 = r0.f23040h
            int r15 = r15.length
            if (r7 >= r15) goto L_0x0cf5
            long[] r15 = r0.f23041i
            r25 = r15[r7]
            r15 = r8[r7]
            r27 = r8
            r8 = r6[r7]
            if (r1 == 0) goto L_0x0c84
            r28 = r6
            int r6 = r8 - r15
            r29 = r14
            r14 = r18
            java.lang.System.arraycopy(r14, r15, r2, r9, r6)
            r14 = r17
            java.lang.System.arraycopy(r14, r15, r3, r9, r6)
            java.lang.System.arraycopy(r11, r15, r4, r9, r6)
            goto L_0x0c8a
        L_0x0c84:
            r28 = r6
            r29 = r14
            r14 = r17
        L_0x0c8a:
            r6 = r29
        L_0x0c8c:
            if (r15 >= r8) goto L_0x0cd4
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r17 = r7
            r30 = r8
            long r7 = r0.f23036d
            r19 = r12
            r23 = r7
            long r7 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r19, r21, r23)
            r19 = r10[r15]
            r21 = r10
            r22 = r11
            long r10 = r19 - r25
            r19 = r12
            r12 = 0
            long r35 = java.lang.Math.max(r12, r10)
            r37 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r0.f23035c
            r39 = r10
            long r10 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r35, r37, r39)
            long r7 = r7 + r10
            r5[r9] = r7
            if (r1 == 0) goto L_0x0cc5
            r7 = r3[r9]
            if (r7 <= r6) goto L_0x0cc5
            r6 = r14[r15]
        L_0x0cc5:
            int r9 = r9 + 1
            int r15 = r15 + 1
            r7 = r17
            r12 = r19
            r10 = r21
            r11 = r22
            r8 = r30
            goto L_0x0c8c
        L_0x0cd4:
            r17 = r7
            r21 = r10
            r22 = r11
            r19 = r12
            r12 = 0
            long[] r7 = r0.f23040h
            r10 = r7[r17]
            long r7 = r19 + r10
            int r10 = r17 + 1
            r12 = r7
            r7 = r10
            r17 = r14
            r10 = r21
            r11 = r22
            r8 = r27
            r14 = r6
            r6 = r28
            goto L_0x0c5f
        L_0x0cf5:
            r19 = r12
            r29 = r14
            long r6 = r0.f23036d
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r23 = r6
            long r24 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r19, r21, r23)
            com.google.ads.interactivemedia.v3.internal.ne r1 = new com.google.ads.interactivemedia.v3.internal.ne
            r17 = r1
            r18 = r0
            r19 = r2
            r20 = r3
            r21 = r29
            r22 = r5
            r23 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            r2 = r1
            goto L_0x077a
        L_0x0d1a:
            r0.add(r2)
            goto L_0x0d28
        L_0x0d1e:
            com.google.ads.interactivemedia.v3.internal.dt r0 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r1 = "Track has no sample table size information"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0d26:
            r0 = r34
        L_0x0d28:
            int r15 = r32 + 1
            r1 = r46
            r12 = r49
            r13 = r0
            r0 = r45
            goto L_0x000c
        L_0x0d33:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7121ml.m21148c(com.google.ads.interactivemedia.v3.internal.mc, com.google.ads.interactivemedia.v3.internal.ki, long, com.google.ads.interactivemedia.v3.internal.jc, boolean, com.google.ads.interactivemedia.v3.internal.apw):java.util.List");
    }

    /* renamed from: d */
    private static int m21149d(aee aee) {
        aee.mo14554h(16);
        return aee.mo14568v();
    }

    /* JADX WARNING: type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m21150e(com.google.ads.interactivemedia.p367v3.internal.aee r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, com.google.ads.interactivemedia.p367v3.internal.C7031jc r28, com.google.ads.interactivemedia.p367v3.internal.C7117mh r29, int r30) {
        /*
            r0 = r21
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r6 = r29
            int r7 = r1 + 16
            r0.mo14554h(r7)
            r7 = 6
            if (r27 == 0) goto L_0x001e
            int r9 = r21.mo14561o()
            r0.mo14557k(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.mo14557k(r9)
            r9 = 0
        L_0x0024:
            r10 = 20
            r11 = 2
            r12 = 1
            r13 = 16
            if (r9 == 0) goto L_0x004a
            if (r9 != r12) goto L_0x002f
            goto L_0x004a
        L_0x002f:
            if (r9 != r11) goto L_0x0049
            r0.mo14557k(r13)
            long r13 = r21.mo14570x()
            double r13 = java.lang.Double.longBitsToDouble(r13)
            long r13 = java.lang.Math.round(r13)
            int r7 = (int) r13
            int r9 = r21.mo14538B()
            r0.mo14557k(r10)
            goto L_0x005b
        L_0x0049:
            return
        L_0x004a:
            int r14 = r21.mo14561o()
            r0.mo14557k(r7)
            int r7 = r21.mo14572z()
            if (r9 != r12) goto L_0x005a
            r0.mo14557k(r13)
        L_0x005a:
            r9 = r14
        L_0x005b:
            int r13 = r21.mo14553g()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r15 = r22
            if (r15 != r14) goto L_0x008e
            android.util.Pair r15 = m21152g(r0, r1, r2)
            if (r15 == 0) goto L_0x008a
            java.lang.Object r14 = r15.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0078
            r5 = 0
            goto L_0x0082
        L_0x0078:
            java.lang.Object r10 = r15.second
            com.google.ads.interactivemedia.v3.internal.nc r10 = (com.google.ads.interactivemedia.p367v3.internal.C7139nc) r10
            java.lang.String r10 = r10.f23045b
            com.google.ads.interactivemedia.v3.internal.jc r5 = r5.mo16061b(r10)
        L_0x0082:
            com.google.ads.interactivemedia.v3.internal.nc[] r10 = r6.f22921a
            java.lang.Object r15 = r15.second
            com.google.ads.interactivemedia.v3.internal.nc r15 = (com.google.ads.interactivemedia.p367v3.internal.C7139nc) r15
            r10[r30] = r15
        L_0x008a:
            r0.mo14554h(r13)
            goto L_0x008f
        L_0x008e:
            r14 = r15
        L_0x008f:
            r10 = 1633889587(0x61632d33, float:2.6191674E20)
            r15 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r8 = "audio/ac4"
            if (r14 != r10) goto L_0x009e
            java.lang.String r10 = "audio/ac3"
        L_0x009b:
            r14 = -1
            goto L_0x0132
        L_0x009e:
            r10 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r14 != r10) goto L_0x00a6
            java.lang.String r10 = "audio/eac3"
            goto L_0x009b
        L_0x00a6:
            r10 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r14 != r10) goto L_0x00ad
            r10 = r8
            goto L_0x009b
        L_0x00ad:
            r10 = 1685353315(0x64747363, float:1.803728E22)
            if (r14 != r10) goto L_0x00b5
            java.lang.String r10 = "audio/vnd.dts"
            goto L_0x009b
        L_0x00b5:
            r10 = 1685353320(0x64747368, float:1.8037286E22)
            if (r14 == r10) goto L_0x012e
            r10 = 1685353324(0x6474736c, float:1.803729E22)
            if (r14 != r10) goto L_0x00c1
            goto L_0x012e
        L_0x00c1:
            r10 = 1685353317(0x64747365, float:1.8037282E22)
            if (r14 != r10) goto L_0x00c9
            java.lang.String r10 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x009b
        L_0x00c9:
            r10 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r14 != r10) goto L_0x00d1
            java.lang.String r10 = "audio/3gpp"
            goto L_0x009b
        L_0x00d1:
            r10 = 1935767394(0x73617762, float:1.7863284E31)
            if (r14 != r10) goto L_0x00d9
            java.lang.String r10 = "audio/amr-wb"
            goto L_0x009b
        L_0x00d9:
            r10 = 1819304813(0x6c70636d, float:1.1624469E27)
            java.lang.String r18 = "audio/raw"
            if (r14 == r10) goto L_0x012a
            r10 = 1936684916(0x736f7774, float:1.89725E31)
            if (r14 != r10) goto L_0x00e6
            goto L_0x012a
        L_0x00e6:
            r10 = 1953984371(0x74776f73, float:7.841539E31)
            if (r14 != r10) goto L_0x00f2
            r10 = 268435456(0x10000000, float:2.5243549E-29)
            r10 = r18
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0132
        L_0x00f2:
            r10 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r14 == r10) goto L_0x0126
            r10 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r14 != r10) goto L_0x00fd
            goto L_0x0126
        L_0x00fd:
            if (r14 != r15) goto L_0x0102
            java.lang.String r10 = "audio/alac"
            goto L_0x009b
        L_0x0102:
            r10 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r14 != r10) goto L_0x010a
            java.lang.String r10 = "audio/g711-alaw"
            goto L_0x009b
        L_0x010a:
            r10 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r14 != r10) goto L_0x0112
            java.lang.String r10 = "audio/g711-mlaw"
            goto L_0x009b
        L_0x0112:
            r10 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r14 != r10) goto L_0x011a
            java.lang.String r10 = "audio/opus"
            goto L_0x009b
        L_0x011a:
            r10 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r14 != r10) goto L_0x0123
            java.lang.String r10 = "audio/flac"
            goto L_0x009b
        L_0x0123:
            r10 = 0
            goto L_0x009b
        L_0x0126:
            java.lang.String r10 = "audio/mpeg"
            goto L_0x009b
        L_0x012a:
            r10 = r18
            r14 = 2
            goto L_0x0132
        L_0x012e:
            java.lang.String r10 = "audio/vnd.dts.hd"
            goto L_0x009b
        L_0x0132:
            r19 = 0
            r20 = 0
        L_0x0136:
            int r11 = r13 - r1
            if (r11 >= r2) goto L_0x0311
            r0.mo14554h(r13)
            int r11 = r21.mo14568v()
            if (r11 <= 0) goto L_0x0145
            r15 = 1
            goto L_0x0146
        L_0x0145:
            r15 = 0
        L_0x0146:
            java.lang.String r12 = "childAtomSize should be positive"
            com.google.ads.interactivemedia.p367v3.internal.ary.m19465r(r15, r12)
            int r15 = r21.mo14568v()
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r15 == r1) goto L_0x02d5
            if (r27 == 0) goto L_0x0191
            r1 = 2002876005(0x77617665, float:4.5729223E33)
            if (r15 != r1) goto L_0x0191
            int r1 = r21.mo14553g()
        L_0x015f:
            int r15 = r1 - r13
            if (r15 >= r11) goto L_0x0186
            r0.mo14554h(r1)
            int r15 = r21.mo14568v()
            if (r15 <= 0) goto L_0x016e
            r2 = 1
            goto L_0x016f
        L_0x016e:
            r2 = 0
        L_0x016f:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19465r(r2, r12)
            int r2 = r21.mo14568v()
            r18 = r12
            r12 = 1702061171(0x65736473, float:7.183675E22)
            if (r2 == r12) goto L_0x0183
            int r1 = r1 + r15
            r2 = r24
            r12 = r18
            goto L_0x015f
        L_0x0183:
            r2 = r1
            r1 = -1
            goto L_0x0188
        L_0x0186:
            r1 = -1
            r2 = -1
        L_0x0188:
            r12 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            goto L_0x02de
        L_0x0191:
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r15 != r1) goto L_0x01aa
            int r1 = r13 + 8
            r0.mo14554h(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.ads.interactivemedia.v3.internal.cy r1 = com.google.ads.interactivemedia.p367v3.internal.C6963gp.m20515a(r0, r1, r4, r5)
            r6.f22922b = r1
        L_0x01a5:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0245
        L_0x01aa:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r15 != r1) goto L_0x01bf
            int r1 = r13 + 8
            r0.mo14554h(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            com.google.ads.interactivemedia.v3.internal.cy r1 = com.google.ads.interactivemedia.p367v3.internal.C6963gp.m20516b(r0, r1, r4, r5)
            r6.f22922b = r1
            goto L_0x01a5
        L_0x01bf:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r15 != r1) goto L_0x0203
            int r1 = r13 + 8
            r0.mo14554h(r1)
            java.lang.String r1 = java.lang.Integer.toString(r25)
            int r2 = com.google.ads.interactivemedia.p367v3.internal.C6965gr.f22222a
            r2 = 1
            r0.mo14557k(r2)
            int r12 = r21.mo14560n()
            r12 = r12 & 32
            int r12 = r12 >> 5
            if (r2 == r12) goto L_0x01e1
            r2 = 44100(0xac44, float:6.1797E-41)
            goto L_0x01e4
        L_0x01e1:
            r2 = 48000(0xbb80, float:6.7262E-41)
        L_0x01e4:
            com.google.ads.interactivemedia.v3.internal.cx r12 = new com.google.ads.interactivemedia.v3.internal.cx
            r12.<init>()
            r12.mo15617S(r1)
            r12.mo15630ae(r8)
            r1 = 2
            r12.mo15606H(r1)
            r12.mo15631af(r2)
            r12.mo15610L(r5)
            r12.mo15620V(r4)
            com.google.ads.interactivemedia.v3.internal.cy r1 = r12.mo15625a()
            r6.f22922b = r1
            goto L_0x01a5
        L_0x0203:
            r1 = 1684305011(0x64647473, float:1.6856995E22)
            if (r15 != r1) goto L_0x0227
            com.google.ads.interactivemedia.v3.internal.cx r1 = new com.google.ads.interactivemedia.v3.internal.cx
            r1.<init>()
            r1.mo15616R(r3)
            r1.mo15630ae(r10)
            r1.mo15606H(r9)
            r1.mo15631af(r7)
            r1.mo15610L(r5)
            r1.mo15620V(r4)
            com.google.ads.interactivemedia.v3.internal.cy r1 = r1.mo15625a()
            r6.f22922b = r1
            goto L_0x01a5
        L_0x0227:
            r1 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r15 != r1) goto L_0x024e
            int r1 = r11 + -8
            byte[] r2 = f22936a
            int r12 = r2.length
            int r12 = r12 + r1
            byte[] r12 = java.util.Arrays.copyOf(r2, r12)
            int r15 = r13 + 8
            r0.mo14554h(r15)
            int r2 = r2.length
            r0.mo14559m(r12, r2, r1)
            java.util.List r1 = com.google.ads.interactivemedia.p367v3.internal.C7135mz.m21205h(r12)
            r20 = r1
        L_0x0245:
            r12 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            goto L_0x0306
        L_0x024e:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r15 != r1) goto L_0x0283
            int r1 = r11 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r12 = 102(0x66, float:1.43E-43)
            r15 = 0
            r2[r15] = r12
            r12 = 76
            r16 = 1
            r2[r16] = r12
            r12 = 97
            r17 = 2
            r2[r17] = r12
            r12 = 3
            r15 = 67
            r2[r12] = r15
            int r12 = r13 + 12
            r0.mo14554h(r12)
            r12 = 4
            r0.mo14559m(r2, r12, r1)
            com.google.ads.interactivemedia.v3.internal.arn r1 = com.google.ads.interactivemedia.p367v3.internal.arn.m19403j(r2)
            r20 = r1
        L_0x027e:
            r12 = 0
            r15 = 20
            goto L_0x0306
        L_0x0283:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 1
            r17 = 2
            if (r15 != r1) goto L_0x027e
            int r2 = r11 + -12
            byte[] r7 = new byte[r2]
            int r9 = r13 + 12
            r0.mo14554h(r9)
            r12 = 0
            r0.mo14559m(r7, r12, r2)
            com.google.ads.interactivemedia.v3.internal.aee r2 = new com.google.ads.interactivemedia.v3.internal.aee
            r2.<init>((byte[]) r7)
            r9 = 9
            r2.mo14554h(r9)
            int r9 = r2.mo14560n()
            r15 = 20
            r2.mo14554h(r15)
            int r2 = r2.mo14538B()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            android.util.Pair r2 = android.util.Pair.create(r2, r9)
            java.lang.Object r9 = r2.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.ads.interactivemedia.v3.internal.arn r7 = com.google.ads.interactivemedia.p367v3.internal.arn.m19403j(r7)
            r20 = r7
            r7 = r9
            r9 = r2
            goto L_0x0306
        L_0x02d5:
            r12 = 0
            r15 = 20
            r16 = 1
            r17 = 2
            r2 = r13
            r1 = -1
        L_0x02de:
            if (r2 == r1) goto L_0x0306
            android.util.Pair r2 = m21151f(r0, r2)
            java.lang.Object r10 = r2.first
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r2.second
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0306
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0302
            com.google.ads.interactivemedia.v3.internal.gm r1 = com.google.ads.interactivemedia.p367v3.internal.C6961gn.m20510a(r2)
            int r7 = r1.f22200a
            int r9 = r1.f22201b
            java.lang.String r1 = r1.f22202c
            r19 = r1
        L_0x0302:
            com.google.ads.interactivemedia.v3.internal.arn r20 = com.google.ads.interactivemedia.p367v3.internal.arn.m19403j(r2)
        L_0x0306:
            int r13 = r13 + r11
            r1 = r23
            r2 = r24
            r12 = 1
            r15 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0136
        L_0x0311:
            com.google.ads.interactivemedia.v3.internal.cy r0 = r6.f22922b
            if (r0 != 0) goto L_0x0341
            if (r10 == 0) goto L_0x0341
            com.google.ads.interactivemedia.v3.internal.cx r0 = new com.google.ads.interactivemedia.v3.internal.cx
            r0.<init>()
            r0.mo15616R(r3)
            r0.mo15630ae(r10)
            r1 = r19
            r0.mo15607I(r1)
            r0.mo15606H(r9)
            r0.mo15631af(r7)
            r0.mo15623Y(r14)
            r1 = r20
            r0.mo15618T(r1)
            r0.mo15610L(r5)
            r0.mo15620V(r4)
            com.google.ads.interactivemedia.v3.internal.cy r0 = r0.mo15625a()
            r6.f22922b = r0
        L_0x0341:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7121ml.m21150e(com.google.ads.interactivemedia.v3.internal.aee, int, int, int, int, java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.jc, com.google.ads.interactivemedia.v3.internal.mh, int):void");
    }

    /* renamed from: f */
    private static Pair m21151f(aee aee, int i) {
        aee.mo14554h(i + 12);
        aee.mo14557k(1);
        m21153h(aee);
        aee.mo14557k(2);
        int n = aee.mo14560n();
        if ((n & 128) != 0) {
            aee.mo14557k(2);
        }
        if ((n & 64) != 0) {
            aee.mo14557k(aee.mo14561o());
        }
        if ((n & 32) != 0) {
            aee.mo14557k(2);
        }
        aee.mo14557k(1);
        m21153h(aee);
        String i2 = adz.m18357i(aee.mo14560n());
        if ("audio/mpeg".equals(i2) || "audio/vnd.dts".equals(i2) || "audio/vnd.dts.hd".equals(i2)) {
            return Pair.create(i2, (Object) null);
        }
        aee.mo14557k(12);
        aee.mo14557k(1);
        int h = m21153h(aee);
        byte[] bArr = new byte[h];
        aee.mo14559m(bArr, 0, h);
        return Pair.create(i2, bArr);
    }

    /* renamed from: g */
    private static Pair m21152g(aee aee, int i, int i2) {
        Pair pair;
        Integer num;
        C7139nc ncVar;
        int i3;
        int i4;
        byte[] bArr;
        aee aee2 = aee;
        int g = aee.mo14553g();
        while (g - i < i2) {
            aee2.mo14554h(g);
            int v = aee.mo14568v();
            ary.m19465r(v > 0, "childAtomSize should be positive");
            if (aee.mo14568v() == 1936289382) {
                int i5 = g + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - g < v) {
                    aee2.mo14554h(i5);
                    int v2 = aee.mo14568v();
                    int v3 = aee.mo14568v();
                    if (v3 == 1718775137) {
                        num2 = Integer.valueOf(aee.mo14568v());
                    } else if (v3 == 1935894637) {
                        aee2.mo14557k(4);
                        str = aee2.mo14541E(4);
                    } else if (v3 == 1935894633) {
                        i6 = i5;
                        i7 = v2;
                    }
                    i5 += v2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    ary.m19470w(num2, "frma atom is mandatory");
                    ary.m19465r(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            ncVar = null;
                            break;
                        }
                        aee2.mo14554h(i8);
                        int v4 = aee.mo14568v();
                        if (aee.mo14568v() == 1952804451) {
                            int v5 = aee.mo14568v();
                            aee2.mo14557k(1);
                            if (C7114me.m21130e(v5) == 0) {
                                aee2.mo14557k(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int n = aee.mo14560n();
                                i4 = n & 15;
                                i3 = (n & 240) >> 4;
                            }
                            boolean z = aee.mo14560n() == 1;
                            int n2 = aee.mo14560n();
                            byte[] bArr2 = new byte[16];
                            aee2.mo14559m(bArr2, 0, 16);
                            if (!z || n2 != 0) {
                                bArr = null;
                            } else {
                                int n3 = aee.mo14560n();
                                byte[] bArr3 = new byte[n3];
                                aee2.mo14559m(bArr3, 0, n3);
                                bArr = bArr3;
                            }
                            num = num2;
                            ncVar = new C7139nc(z, str, n2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i8 += v4;
                        }
                    }
                    ary.m19470w(ncVar, "tenc atom is mandatory");
                    pair = Pair.create(num, ncVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            g += v;
        }
        return null;
    }

    /* renamed from: h */
    private static int m21153h(aee aee) {
        int n = aee.mo14560n();
        int i = n & 127;
        while ((n & 128) == 128) {
            n = aee.mo14560n();
            i = (i << 7) | (n & 127);
        }
        return i;
    }
}
