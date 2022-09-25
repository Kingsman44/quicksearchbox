package com.google.common.p4574q;

import com.google.common.base.C58902l;
import com.google.common.base.C58912v;
import java.nio.charset.Charset;

/* renamed from: com.google.common.q.u */
/* compiled from: PG */
public final class C60742u {

    /* renamed from: a */
    public static final Charset f164776a;

    /* renamed from: b */
    private static final Charset f164777b;

    /* renamed from: c */
    private static final char[] f164778c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: d */
    private static final C58912v f164779d = C58912v.m91034k("-_.*").mo56182e(new C58902l('0', '9')).mo56182e(new C58902l('A', 'Z')).mo56182e(new C58902l('a', 'z'));

    static {
        Charset forName = Charset.forName("UTF-8");
        f164777b = forName;
        f164776a = forName;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m92708a(java.lang.String r21, java.nio.charset.Charset r22) {
        /*
            r0 = r21
            java.nio.charset.Charset r1 = f164776a
            r2 = r22
            boolean r1 = r2.equals(r1)
            r3 = 32
            r5 = 0
            if (r1 == 0) goto L_0x0241
            com.google.common.e.g r1 = com.google.common.p4574q.C60737p.f164755a
            r21.getClass()
            int r2 = r21.length()
            r7 = 0
        L_0x0019:
            if (r7 >= r2) goto L_0x029f
            char r8 = r0.charAt(r7)
            r9 = r1
            com.google.common.q.q r9 = (com.google.common.p4574q.C60738q) r9
            boolean[] r10 = r9.f164759d
            int r11 = r10.length
            if (r8 >= r11) goto L_0x002f
            boolean r8 = r10[r8]
            if (r8 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            int r7 = r7 + 1
            goto L_0x0019
        L_0x002f:
            int r1 = r21.length()
            char[] r2 = com.google.common.p4525e.C58963k.m91120a()
            r8 = 0
            r10 = 0
        L_0x0039:
            if (r7 >= r1) goto L_0x022b
            if (r7 >= r1) goto L_0x0223
            int r11 = r7 + 1
            char r12 = r0.charAt(r7)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r13) goto L_0x00c2
            r13 = 57343(0xdfff, float:8.0355E-41)
            if (r12 <= r13) goto L_0x004e
            goto L_0x00c2
        L_0x004e:
            r13 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r14 = "'"
            java.lang.String r15 = " in '"
            java.lang.String r6 = " at index "
            java.lang.String r4 = "' with value "
            if (r12 > r13) goto L_0x0097
            if (r11 != r1) goto L_0x005f
            int r12 = -r12
            goto L_0x00c2
        L_0x005f:
            char r13 = r0.charAt(r11)
            boolean r18 = java.lang.Character.isLowSurrogate(r13)
            if (r18 == 0) goto L_0x006e
            int r12 = java.lang.Character.toCodePoint(r12, r13)
            goto L_0x00c2
        L_0x006e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected low surrogate but got char '"
            r2.<init>(r3)
            r2.append(r13)
            r2.append(r4)
            r2.append(r13)
            r2.append(r6)
            r2.append(r11)
            r2.append(r15)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected low surrogate character '"
            r2.<init>(r3)
            r2.append(r12)
            r2.append(r4)
            r2.append(r12)
            r2.append(r6)
            int r11 = r11 + -1
            r2.append(r11)
            r2.append(r15)
            r2.append(r0)
            r2.append(r14)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00c2:
            if (r12 < 0) goto L_0x021b
            boolean[] r4 = r9.f164759d
            int r6 = r4.length
            r11 = 2
            if (r12 >= r6) goto L_0x00d1
            boolean r4 = r4[r12]
            if (r4 == 0) goto L_0x00d1
            r4 = 0
            goto L_0x01c5
        L_0x00d1:
            if (r12 != r3) goto L_0x00db
            boolean r4 = r9.f164758c
            if (r4 == 0) goto L_0x00db
            char[] r4 = com.google.common.p4574q.C60738q.f164756a
            goto L_0x01c5
        L_0x00db:
            r4 = 127(0x7f, float:1.78E-43)
            r6 = 3
            if (r12 > r4) goto L_0x00f7
            char[] r4 = new char[r6]
            r6 = 37
            r4[r5] = r6
            char[] r6 = com.google.common.p4574q.C60738q.f164757b
            r13 = r12 & 15
            char r13 = r6[r13]
            r4[r11] = r13
            int r13 = r12 >>> 4
            char r6 = r6[r13]
            r13 = 1
            r4[r13] = r6
            goto L_0x01c5
        L_0x00f7:
            r4 = 2047(0x7ff, float:2.868E-42)
            r13 = 12
            r14 = 5
            r15 = 6
            r18 = 8
            r19 = 4
            if (r12 > r4) goto L_0x012f
            char[] r4 = new char[r15]
            r15 = 37
            r4[r5] = r15
            r4[r6] = r15
            char[] r6 = com.google.common.p4574q.C60738q.f164757b
            r15 = r12 & 15
            char r15 = r6[r15]
            r4[r14] = r15
            int r14 = r12 >>> 4
            r15 = r14 & 3
            r15 = r15 | 8
            char r15 = r6[r15]
            r4[r19] = r15
            int r14 = r14 >>> r11
            r15 = r14 & 15
            char r15 = r6[r15]
            r4[r11] = r15
            int r14 = r14 >>> 4
            r13 = r13 | r14
            char r6 = r6[r13]
            r16 = 1
            r4[r16] = r6
            goto L_0x01c5
        L_0x012f:
            r16 = 1
            r4 = 65535(0xffff, float:9.1834E-41)
            r20 = 7
            r3 = 9
            if (r12 > r4) goto L_0x0171
            char[] r4 = new char[r3]
            r3 = 37
            r4[r5] = r3
            r13 = 69
            r4[r16] = r13
            r4[r6] = r3
            r4[r15] = r3
            char[] r3 = com.google.common.p4574q.C60738q.f164757b
            r6 = r12 & 15
            char r6 = r3[r6]
            r4[r18] = r6
            int r6 = r12 >>> 4
            r13 = r6 & 3
            r13 = r13 | 8
            char r13 = r3[r13]
            r4[r20] = r13
            int r6 = r6 >>> r11
            r13 = r6 & 15
            char r13 = r3[r13]
            r4[r14] = r13
            int r6 = r6 >>> 4
            r13 = r6 & 3
            r13 = r13 | 8
            char r13 = r3[r13]
            r4[r19] = r13
            int r6 = r6 >>> r11
            char r3 = r3[r6]
            r4[r11] = r3
            goto L_0x01c5
        L_0x0171:
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r12 > r4) goto L_0x0207
            char[] r4 = new char[r13]
            r13 = 37
            r4[r5] = r13
            r17 = 70
            r16 = 1
            r4[r16] = r17
            r4[r6] = r13
            r4[r15] = r13
            r4[r3] = r13
            char[] r3 = com.google.common.p4574q.C60738q.f164757b
            r6 = r12 & 15
            char r6 = r3[r6]
            r13 = 11
            r4[r13] = r6
            int r6 = r12 >>> 4
            r13 = r6 & 3
            r13 = r13 | 8
            char r13 = r3[r13]
            r15 = 10
            r4[r15] = r13
            int r6 = r6 >>> r11
            r13 = r6 & 15
            char r13 = r3[r13]
            r4[r18] = r13
            int r6 = r6 >>> 4
            r13 = r6 & 3
            r13 = r13 | 8
            char r13 = r3[r13]
            r4[r20] = r13
            int r6 = r6 >>> r11
            r13 = r6 & 15
            char r13 = r3[r13]
            r4[r14] = r13
            int r6 = r6 >>> 4
            r13 = r6 & 3
            r13 = r13 | 8
            char r13 = r3[r13]
            r4[r19] = r13
            int r6 = r6 >>> r11
            char r3 = r3[r6]
            r4[r11] = r3
        L_0x01c5:
            boolean r3 = java.lang.Character.isSupplementaryCodePoint(r12)
            r6 = 1
            if (r6 == r3) goto L_0x01cd
            r11 = 1
        L_0x01cd:
            int r11 = r11 + r7
            if (r4 == 0) goto L_0x01ef
            int r3 = r7 - r8
            int r12 = r10 + r3
            int r13 = r4.length
            int r14 = r12 + r13
            int r15 = r2.length
            if (r15 >= r14) goto L_0x01e4
            int r15 = r1 - r7
            int r14 = r14 + r15
            r15 = 32
            int r14 = r14 + r15
            char[] r2 = com.google.common.p4525e.C58968p.m91125b(r2, r10, r14)
        L_0x01e4:
            if (r3 <= 0) goto L_0x01ea
            r0.getChars(r8, r7, r2, r10)
            r10 = r12
        L_0x01ea:
            java.lang.System.arraycopy(r4, r5, r2, r10, r13)
            int r10 = r10 + r13
            r8 = r11
        L_0x01ef:
            r7 = r11
        L_0x01f0:
            if (r7 >= r1) goto L_0x0203
            char r3 = r0.charAt(r7)
            boolean[] r4 = r9.f164759d
            int r11 = r4.length
            if (r3 >= r11) goto L_0x0203
            boolean r3 = r4[r3]
            if (r3 != 0) goto L_0x0200
            goto L_0x0203
        L_0x0200:
            int r7 = r7 + 1
            goto L_0x01f0
        L_0x0203:
            r3 = 32
            goto L_0x0039
        L_0x0207:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid unicode character value "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x021b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Trailing high surrogate at end of input"
            r0.<init>(r1)
            throw r0
        L_0x0223:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Index exceeds specified range"
            r0.<init>(r1)
            throw r0
        L_0x022b:
            int r3 = r1 - r8
            if (r3 <= 0) goto L_0x023b
            int r3 = r3 + r10
            int r4 = r2.length
            if (r4 >= r3) goto L_0x0237
            char[] r2 = com.google.common.p4525e.C58968p.m91125b(r2, r10, r3)
        L_0x0237:
            r0.getChars(r8, r1, r2, r10)
            r10 = r3
        L_0x023b:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r5, r10)
            goto L_0x029f
        L_0x0241:
            r6 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r21.length()
            int r3 = r3 + r3
            r1.<init>(r3)
            byte[] r2 = r21.getBytes(r22)
            int r3 = r2.length
            r4 = 0
            r7 = 0
        L_0x0253:
            if (r5 >= r3) goto L_0x0293
            byte r8 = r2[r5]
            r8 = r8 & 255(0xff, float:3.57E-43)
            char r9 = (char) r8
            com.google.common.base.v r10 = f164779d
            boolean r10 = r10.mo56144c(r9)
            if (r10 == 0) goto L_0x026c
            r1.append(r9)
            int r7 = r7 + 1
            r9 = 32
        L_0x0269:
            r10 = 37
            goto L_0x0290
        L_0x026c:
            r9 = 32
            if (r8 != r9) goto L_0x0279
            r4 = 43
            r1.append(r4)
            int r7 = r7 + 1
            r4 = 1
            goto L_0x0269
        L_0x0279:
            r10 = 37
            r1.append(r10)
            char[] r11 = f164778c
            int r12 = r8 >> 4
            char r12 = r11[r12]
            r1.append(r12)
            r8 = r8 & 15
            char r8 = r11[r8]
            r1.append(r8)
            int r7 = r7 + 3
        L_0x0290:
            int r5 = r5 + 1
            goto L_0x0253
        L_0x0293:
            if (r4 != 0) goto L_0x029b
            int r2 = r21.length()
            if (r7 == r2) goto L_0x029f
        L_0x029b:
            java.lang.String r0 = r1.toString()
        L_0x029f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4574q.C60742u.m92708a(java.lang.String, java.nio.charset.Charset):java.lang.String");
    }
}
