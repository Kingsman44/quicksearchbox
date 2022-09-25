package com.google.p4591e.p4592a.p4603d.p4604a;

/* renamed from: com.google.e.a.d.a.c */
/* compiled from: PG */
public final class C61042c extends C61045f {

    /* renamed from: a */
    private static final char[] f165279a = {'+'};

    /* renamed from: b */
    private static final char[] f165280b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private final boolean f165281c;

    /* renamed from: d */
    private final boolean[] f165282d;

    public C61042c(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        } else if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        } else if (!str.contains("%")) {
            this.f165281c = z;
            char[] charArray = str.toCharArray();
            int i = 122;
            for (char max : charArray) {
                i = Math.max(max, i);
            }
            boolean[] zArr = new boolean[(i + 1)];
            for (int i2 = 48; i2 <= 57; i2++) {
                zArr[i2] = true;
            }
            for (int i3 = 65; i3 <= 90; i3++) {
                zArr[i3] = true;
            }
            for (int i4 = 97; i4 <= 122; i4++) {
                zArr[i4] = true;
            }
            for (char c : charArray) {
                zArr[c] = true;
            }
            this.f165282d = zArr;
        } else {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo57591a(java.lang.String r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            int r2 = r22.length()
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x0211
            char r5 = r1.charAt(r4)
            boolean[] r6 = r0.f165282d
            int r7 = r6.length
            if (r5 >= r7) goto L_0x001d
            boolean r5 = r6[r5]
            if (r5 != 0) goto L_0x001a
            goto L_0x001d
        L_0x001a:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x001d:
            int r2 = r22.length()
            java.lang.ThreadLocal r5 = com.google.p4591e.p4592a.p4603d.p4604a.C61044e.f165283a
            java.lang.Object r5 = r5.get()
            char[] r5 = (char[]) r5
            r6 = 0
            r7 = 0
        L_0x002b:
            if (r4 >= r2) goto L_0x01fc
            if (r4 >= r2) goto L_0x01f4
            int r8 = r4 + 1
            char r9 = r1.charAt(r4)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r9 < r10) goto L_0x009e
            r10 = 57343(0xdfff, float:8.0355E-41)
            if (r9 <= r10) goto L_0x0040
            goto L_0x009e
        L_0x0040:
            r10 = 56319(0xdbff, float:7.892E-41)
            java.lang.String r11 = " at index "
            java.lang.String r12 = "' with value "
            if (r9 > r10) goto L_0x007c
            if (r8 != r2) goto L_0x004d
            int r9 = -r9
            goto L_0x009e
        L_0x004d:
            char r10 = r1.charAt(r8)
            boolean r13 = java.lang.Character.isLowSurrogate(r10)
            if (r13 == 0) goto L_0x005c
            int r9 = java.lang.Character.toCodePoint(r9, r10)
            goto L_0x009e
        L_0x005c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected low surrogate but got char '"
            r2.<init>(r3)
            r2.append(r10)
            r2.append(r12)
            r2.append(r10)
            r2.append(r11)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x007c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected low surrogate character '"
            r2.<init>(r3)
            r2.append(r9)
            r2.append(r12)
            r2.append(r9)
            r2.append(r11)
            int r8 = r8 + -1
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x009e:
            if (r9 < 0) goto L_0x01ec
            boolean[] r8 = r0.f165282d
            int r10 = r8.length
            r11 = 32
            r12 = 1
            r13 = 2
            if (r9 >= r10) goto L_0x00b0
            boolean r8 = r8[r9]
            if (r8 == 0) goto L_0x00b0
            r8 = 0
            goto L_0x019a
        L_0x00b0:
            if (r9 != r11) goto L_0x00ba
            boolean r8 = r0.f165281c
            if (r8 == 0) goto L_0x00ba
            char[] r8 = f165279a
            goto L_0x019a
        L_0x00ba:
            r8 = 127(0x7f, float:1.78E-43)
            r10 = 37
            r14 = 3
            if (r9 > r8) goto L_0x00d5
            char[] r8 = new char[r14]
            r8[r3] = r10
            char[] r10 = f165280b
            r14 = r9 & 15
            char r14 = r10[r14]
            r8[r13] = r14
            int r14 = r9 >>> 4
            char r10 = r10[r14]
            r8[r12] = r10
            goto L_0x019a
        L_0x00d5:
            r8 = 2047(0x7ff, float:2.868E-42)
            r15 = 12
            r16 = 5
            r11 = 6
            r17 = 8
            r18 = 4
            if (r9 > r8) goto L_0x010a
            char[] r8 = new char[r11]
            r8[r3] = r10
            r8[r14] = r10
            char[] r10 = f165280b
            r11 = r9 & 15
            char r11 = r10[r11]
            r8[r16] = r11
            int r11 = r9 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r8[r18] = r14
            int r11 = r11 >>> r13
            r14 = r11 & 15
            char r14 = r10[r14]
            r8[r13] = r14
            int r11 = r11 >>> 4
            r11 = r11 | r15
            char r10 = r10[r11]
            r8[r12] = r10
            goto L_0x019a
        L_0x010a:
            r8 = 65535(0xffff, float:9.1834E-41)
            r19 = 7
            r15 = 9
            if (r9 > r8) goto L_0x0148
            char[] r8 = new char[r15]
            r8[r3] = r10
            r15 = 69
            r8[r12] = r15
            r8[r14] = r10
            r8[r11] = r10
            char[] r10 = f165280b
            r11 = r9 & 15
            char r11 = r10[r11]
            r8[r17] = r11
            int r11 = r9 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r8[r19] = r14
            int r11 = r11 >>> r13
            r14 = r11 & 15
            char r14 = r10[r14]
            r8[r16] = r14
            int r11 = r11 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r8[r18] = r14
            int r11 = r11 >>> r13
            char r10 = r10[r11]
            r8[r13] = r10
            goto L_0x019a
        L_0x0148:
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r8) goto L_0x01d8
            r8 = 12
            char[] r8 = new char[r8]
            r8[r3] = r10
            r20 = 70
            r8[r12] = r20
            r8[r14] = r10
            r8[r11] = r10
            r8[r15] = r10
            char[] r10 = f165280b
            r11 = r9 & 15
            char r11 = r10[r11]
            r14 = 11
            r8[r14] = r11
            int r11 = r9 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r15 = 10
            r8[r15] = r14
            int r11 = r11 >>> r13
            r14 = r11 & 15
            char r14 = r10[r14]
            r8[r17] = r14
            int r11 = r11 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r8[r19] = r14
            int r11 = r11 >>> r13
            r14 = r11 & 15
            char r14 = r10[r14]
            r8[r16] = r14
            int r11 = r11 >>> 4
            r14 = r11 & 3
            r14 = r14 | 8
            char r14 = r10[r14]
            r8[r18] = r14
            int r11 = r11 >>> r13
            char r10 = r10[r11]
            r8[r13] = r10
        L_0x019a:
            boolean r9 = java.lang.Character.isSupplementaryCodePoint(r9)
            if (r12 == r9) goto L_0x01a1
            goto L_0x01a2
        L_0x01a1:
            r12 = 2
        L_0x01a2:
            int r12 = r12 + r4
            if (r8 == 0) goto L_0x01c3
            int r9 = r4 - r6
            int r10 = r7 + r9
            int r11 = r8.length
            int r13 = r10 + r11
            int r14 = r5.length
            if (r14 >= r13) goto L_0x01b8
            int r13 = r13 + r2
            int r13 = r13 - r4
            r14 = 32
            int r13 = r13 + r14
            char[] r5 = com.google.p4591e.p4592a.p4603d.p4604a.C61045f.m93383b(r5, r7, r13)
        L_0x01b8:
            if (r9 <= 0) goto L_0x01be
            r1.getChars(r6, r4, r5, r7)
            r7 = r10
        L_0x01be:
            java.lang.System.arraycopy(r8, r3, r5, r7, r11)
            int r7 = r7 + r11
            r6 = r12
        L_0x01c3:
            r4 = r12
        L_0x01c4:
            if (r4 >= r2) goto L_0x002b
            char r8 = r1.charAt(r4)
            boolean[] r9 = r0.f165282d
            int r10 = r9.length
            if (r8 >= r10) goto L_0x002b
            boolean r8 = r9[r8]
            if (r8 != 0) goto L_0x01d5
            goto L_0x002b
        L_0x01d5:
            int r4 = r4 + 1
            goto L_0x01c4
        L_0x01d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid unicode character value "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01ec:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Trailing high surrogate at end of input"
            r1.<init>(r2)
            throw r1
        L_0x01f4:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Index exceeds specified range"
            r1.<init>(r2)
            throw r1
        L_0x01fc:
            int r4 = r2 - r6
            if (r4 <= 0) goto L_0x020c
            int r4 = r4 + r7
            int r8 = r5.length
            if (r8 >= r4) goto L_0x0208
            char[] r5 = com.google.p4591e.p4592a.p4603d.p4604a.C61045f.m93383b(r5, r7, r4)
        L_0x0208:
            r1.getChars(r6, r2, r5, r7)
            r7 = r4
        L_0x020c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r5, r3, r7)
        L_0x0211:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4591e.p4592a.p4603d.p4604a.C61042c.mo57591a(java.lang.String):java.lang.String");
    }
}
