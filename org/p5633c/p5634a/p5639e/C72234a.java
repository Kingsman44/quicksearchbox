package org.p5633c.p5634a.p5639e;

import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: org.c.a.e.a */
/* compiled from: PG */
public final class C72234a {

    /* renamed from: a */
    private static final ConcurrentHashMap f192210a = new ConcurrentHashMap();

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ed, code lost:
        r13 = (org.p5633c.p5634a.p5639e.C72245b) r1.putIfAbsent(r13, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01f7 A[PHI: r0 
      PHI: (r0v5 org.c.a.e.b) = (r0v4 org.c.a.e.b), (r0v7 org.c.a.e.b), (r0v7 org.c.a.e.b) binds: [B:3:0x000e, B:101:0x01eb, B:103:0x01f3] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.p5633c.p5634a.p5639e.C72245b m106517a(java.lang.String r13) {
        /*
            int r0 = r13.length()
            if (r0 == 0) goto L_0x01f8
            j$.util.concurrent.ConcurrentHashMap r0 = f192210a
            java.lang.Object r0 = r0.get(r13)
            org.c.a.e.b r0 = (org.p5633c.p5634a.p5639e.C72245b) r0
            if (r0 != 0) goto L_0x01f7
            org.c.a.e.q r0 = new org.c.a.e.q
            r0.<init>()
            int r7 = r13.length()
            r8 = 1
            int[] r9 = new int[r8]
            r10 = 0
            r1 = 0
        L_0x001e:
            if (r1 >= r7) goto L_0x01df
            r9[r10] = r1
            java.lang.String r1 = m106518b(r13, r9)
            r11 = r9[r10]
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0030
            goto L_0x01df
        L_0x0030:
            char r3 = r1.charAt(r10)
            r4 = 39
            if (r3 == r4) goto L_0x01c1
            r4 = 75
            r5 = 2
            if (r3 == r4) goto L_0x01bb
            r4 = 77
            r6 = 4
            if (r3 == r4) goto L_0x01a6
            r4 = 83
            if (r3 == r4) goto L_0x01a0
            r4 = 97
            if (r3 == r4) goto L_0x019a
            r4 = 104(0x68, float:1.46E-43)
            if (r3 == r4) goto L_0x0194
            r4 = 107(0x6b, float:1.5E-43)
            if (r3 == r4) goto L_0x018e
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == r4) goto L_0x018a
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L_0x0186
            r4 = 71
            if (r3 == r4) goto L_0x0180
            r4 = 72
            if (r3 == r4) goto L_0x017c
            r4 = 89
            if (r3 == r4) goto L_0x00eb
            r12 = 90
            if (r3 == r12) goto L_0x00c6
            r12 = 100
            if (r3 == r12) goto L_0x00c1
            r12 = 101(0x65, float:1.42E-43)
            if (r3 == r12) goto L_0x00bc
            switch(r3) {
                case 67: goto L_0x00b5;
                case 68: goto L_0x00b0;
                case 69: goto L_0x00a0;
                default: goto L_0x0075;
            }
        L_0x0075:
            switch(r3) {
                case 119: goto L_0x009b;
                case 120: goto L_0x00eb;
                case 121: goto L_0x00eb;
                case 122: goto L_0x0084;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Illegal pattern component: "
            java.lang.String r0 = r0.concat(r1)
            r13.<init>(r0)
            throw r13
        L_0x0084:
            if (r2 < r6) goto L_0x0091
            org.c.a.e.m r1 = new org.c.a.e.m
            r1.<init>(r10)
            r2 = 0
            r0.mo63613e(r1, r2)
            goto L_0x01db
        L_0x0091:
            org.c.a.e.m r1 = new org.c.a.e.m
            r1.<init>(r8)
            r0.mo63613e(r1, r1)
            goto L_0x01db
        L_0x009b:
            r0.mo63634z(r2)
            goto L_0x01db
        L_0x00a0:
            if (r2 < r6) goto L_0x00a9
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192398n
            r0.mo63615g(r1)
            goto L_0x01db
        L_0x00a9:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192398n
            r0.mo63614f(r1)
            goto L_0x01db
        L_0x00b0:
            r0.mo63629u(r2)
            goto L_0x01db
        L_0x00b5:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192389e
            r0.mo63624p(r1, r2, r2)
            goto L_0x01db
        L_0x00bc:
            r0.mo63628t(r2)
            goto L_0x01db
        L_0x00c1:
            r0.mo63627s(r2)
            goto L_0x01db
        L_0x00c6:
            if (r2 != r8) goto L_0x00d4
            r2 = 0
            java.lang.String r3 = "Z"
            r4 = 0
            r5 = 2
            r6 = 2
            r1 = r0
            r1.mo63625q(r2, r3, r4, r5, r6)
            goto L_0x01db
        L_0x00d4:
            if (r2 != r5) goto L_0x00e2
            r2 = 0
            java.lang.String r3 = "Z"
            r4 = 1
            r5 = 2
            r6 = 2
            r1 = r0
            r1.mo63625q(r2, r3, r4, r5, r6)
            goto L_0x01db
        L_0x00e2:
            org.c.a.e.l r1 = org.p5633c.p5634a.p5639e.C72255l.f192254a
            org.c.a.e.l r2 = org.p5633c.p5634a.p5639e.C72255l.f192254a
            r0.mo63613e(r1, r2)
            goto L_0x01db
        L_0x00eb:
            r1 = 120(0x78, float:1.68E-43)
            if (r2 != r5) goto L_0x0141
            int r2 = r11 + 1
            if (r2 >= r7) goto L_0x0108
            r2 = r9[r10]
            int r2 = r2 + r8
            r9[r10] = r2
            java.lang.String r2 = m106518b(r13, r9)
            boolean r2 = m106519c(r2)
            r2 = r2 ^ r8
            r4 = r9[r10]
            int r4 = r4 + -1
            r9[r10] = r4
            goto L_0x0109
        L_0x0108:
            r2 = 1
        L_0x0109:
            if (r3 == r1) goto L_0x0122
            org.c.a.d r1 = new org.c.a.d
            r1.<init>()
            int r1 = r1.mo63375n()
            org.c.a.e.o r3 = new org.c.a.e.o
            org.c.a.g r4 = org.p5633c.p5634a.C72283g.f192391g
            int r1 = r1 + -30
            r3.<init>(r4, r1, r2)
            r0.mo63612d(r3)
            goto L_0x01db
        L_0x0122:
            org.c.a.d r1 = new org.c.a.d
            r1.<init>()
            org.c.a.a r3 = r1.f191963b
            org.c.a.e r3 = r3.mo63368x()
            long r4 = r1.f191962a
            int r1 = r3.mo63444a(r4)
            org.c.a.e.o r3 = new org.c.a.e.o
            org.c.a.g r4 = org.p5633c.p5634a.C72283g.f192396l
            int r1 = r1 + -30
            r3.<init>(r4, r1, r2)
            r0.mo63612d(r3)
            goto L_0x01db
        L_0x0141:
            int r5 = r11 + 1
            r6 = 9
            if (r5 >= r7) goto L_0x015e
            r5 = r9[r10]
            int r5 = r5 + r8
            r9[r10] = r5
            java.lang.String r5 = m106518b(r13, r9)
            boolean r5 = m106519c(r5)
            if (r8 == r5) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r6 = r2
        L_0x0158:
            r5 = r9[r10]
            int r5 = r5 + -1
            r9[r10] = r5
        L_0x015e:
            if (r3 == r4) goto L_0x0176
            if (r3 == r1) goto L_0x016f
            r1 = 121(0x79, float:1.7E-43)
            if (r3 == r1) goto L_0x0168
            goto L_0x01db
        L_0x0168:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192391g
            r0.mo63624p(r1, r2, r6)
            goto L_0x01db
        L_0x016f:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192396l
            r0.mo63624p(r1, r2, r6)
            goto L_0x01db
        L_0x0176:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192388d
            r0.mo63618j(r1, r2, r6)
            goto L_0x01db
        L_0x017c:
            r0.mo63630v(r2)
            goto L_0x01db
        L_0x0180:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192387c
            r0.mo63615g(r1)
            goto L_0x01db
        L_0x0186:
            r0.mo63633y(r2)
            goto L_0x01db
        L_0x018a:
            r0.mo63631w(r2)
            goto L_0x01db
        L_0x018e:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192402r
            r0.mo63618j(r1, r2, r5)
            goto L_0x01db
        L_0x0194:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192401q
            r0.mo63618j(r1, r2, r5)
            goto L_0x01db
        L_0x019a:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192399o
            r0.mo63615g(r1)
            goto L_0x01db
        L_0x01a0:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192406v
            r0.mo63620l(r1, r2, r2)
            goto L_0x01db
        L_0x01a6:
            r1 = 3
            if (r2 < r1) goto L_0x01b7
            if (r2 < r6) goto L_0x01b1
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192393i
            r0.mo63615g(r1)
            goto L_0x01db
        L_0x01b1:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192393i
            r0.mo63614f(r1)
            goto L_0x01db
        L_0x01b7:
            r0.mo63632x(r2)
            goto L_0x01db
        L_0x01bb:
            org.c.a.g r1 = org.p5633c.p5634a.C72283g.f192400p
            r0.mo63618j(r1, r2, r5)
            goto L_0x01db
        L_0x01c1:
            java.lang.String r1 = r1.substring(r8)
            int r2 = r1.length()
            if (r2 != r8) goto L_0x01d3
            char r1 = r1.charAt(r10)
            r0.mo63621m(r1)
            goto L_0x01db
        L_0x01d3:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r1)
            r0.mo63622n(r2)
        L_0x01db:
            int r1 = r11 + 1
            goto L_0x001e
        L_0x01df:
            org.c.a.e.b r0 = r0.mo63610a()
            j$.util.concurrent.ConcurrentHashMap r1 = f192210a
            int r2 = r1.size()
            r3 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r3) goto L_0x01f7
            java.lang.Object r13 = r1.putIfAbsent(r13, r0)
            org.c.a.e.b r13 = (org.p5633c.p5634a.p5639e.C72245b) r13
            if (r13 != 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            return r13
        L_0x01f7:
            return r0
        L_0x01f8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid pattern specification"
            r13.<init>(r0)
            goto L_0x0201
        L_0x0200:
            throw r13
        L_0x0201:
            goto L_0x0200
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72234a.m106517a(java.lang.String):org.c.a.e.b");
    }

    /* renamed from: b */
    private static String m106518b(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char charAt = str.charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= length || str.charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == '\'') {
                    int i3 = i + 1;
                    if (i3 >= length || str.charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i3;
                    }
                } else if (z || ((charAt2 < 'A' || charAt2 > 'Z') && (charAt2 < 'a' || charAt2 > 'z'))) {
                    sb.append(charAt2);
                }
                i++;
            }
            i--;
        }
        iArr[0] = i;
        return sb.toString();
    }

    /* renamed from: c */
    private static boolean m106519c(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    break;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
