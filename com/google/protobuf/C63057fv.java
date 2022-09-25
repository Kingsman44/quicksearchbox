package com.google.protobuf;

import java.nio.ByteBuffer;

/* renamed from: com.google.protobuf.fv */
/* compiled from: PG */
final class C63057fv extends C63056fu {
    /* renamed from: a */
    public final int mo59143a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        char charAt;
        int length = charSequence.length();
        int i6 = i2 + i;
        int i7 = 0;
        while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
            bArr[i5] = (byte) charAt;
            i7++;
        }
        if (i7 == length) {
            return i + length;
        }
        int i8 = i + i7;
        while (i7 < length) {
            char charAt2 = charSequence.charAt(i7);
            if (charAt2 < 128 && i8 < i6) {
                i4 = i8 + 1;
                bArr[i8] = (byte) charAt2;
            } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 6) | 960);
                i8 = i9 + 1;
                bArr[i9] = (byte) ((charAt2 & '?') | 128);
                i7++;
            } else if ((charAt2 < 55296 || charAt2 > 57343) && i8 <= i6 - 3) {
                int i10 = i8 + 1;
                bArr[i8] = (byte) ((charAt2 >>> 12) | 480);
                int i11 = i10 + 1;
                bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i4 = i11 + 1;
                bArr[i11] = (byte) ((charAt2 & '?') | 128);
            } else if (i8 <= i6 - 4) {
                int i12 = i7 + 1;
                if (i12 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i12);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        int i13 = i8 + 1;
                        bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i15 = i14 + 1;
                        bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i8 = i15 + 1;
                        bArr[i15] = (byte) ((codePoint & 63) | 128);
                        i7 = i12;
                        i7++;
                    } else {
                        i7 = i12;
                    }
                }
                throw new C63058fw(i7 - 1, length);
            } else if (charAt2 < 55296 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
            } else {
                throw new C63058fw(i7, length);
            }
            i8 = i4;
            i7++;
        }
        return i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0084, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r13[r14] <= -65) goto L_0x001e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo59144b(int r12, byte[] r13, int r14, int r15) {
        /*
            r11 = this;
            r0 = -19
            r1 = -62
            r2 = -16
            r3 = 0
            r4 = -96
            r5 = -32
            r6 = -65
            r7 = -1
            if (r12 == 0) goto L_0x0088
            if (r14 < r15) goto L_0x0013
            return r12
        L_0x0013:
            byte r8 = (byte) r12
            if (r8 >= r5) goto L_0x0022
            if (r8 < r1) goto L_0x0021
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0021
        L_0x001e:
            r14 = r12
            goto L_0x0088
        L_0x0021:
            return r7
        L_0x0022:
            if (r8 >= r2) goto L_0x004b
            int r12 = r12 >> 8
            r12 = r12 ^ r7
            byte r12 = (byte) r12
            if (r12 != 0) goto L_0x0039
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x0034
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0039
        L_0x0034:
            int r12 = com.google.protobuf.C63059fx.m95999b(r8, r14)
            return r12
        L_0x0039:
            if (r12 > r6) goto L_0x004a
            if (r8 != r5) goto L_0x003f
            if (r12 < r4) goto L_0x004a
        L_0x003f:
            if (r8 != r0) goto L_0x0043
            if (r12 >= r4) goto L_0x004a
        L_0x0043:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x004a
            goto L_0x001e
        L_0x004a:
            return r7
        L_0x004b:
            int r9 = r12 >> 8
            r9 = r9 ^ r7
            byte r9 = (byte) r9
            if (r9 != 0) goto L_0x005f
            int r12 = r14 + 1
            byte r9 = r13[r14]
            if (r12 >= r15) goto L_0x005a
            r14 = r12
            r12 = 0
            goto L_0x0062
        L_0x005a:
            int r12 = com.google.protobuf.C63059fx.m95999b(r8, r9)
            return r12
        L_0x005f:
            int r12 = r12 >> 16
            byte r12 = (byte) r12
        L_0x0062:
            if (r12 != 0) goto L_0x0073
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r12 >= r15) goto L_0x006e
            r10 = r14
            r14 = r12
            r12 = r10
            goto L_0x0073
        L_0x006e:
            int r12 = com.google.protobuf.C63059fx.m96000c(r8, r9, r14)
            return r12
        L_0x0073:
            if (r9 > r6) goto L_0x0087
            int r8 = r8 << 28
            int r9 = r9 + 112
            int r8 = r8 + r9
            int r8 = r8 >> 30
            if (r8 != 0) goto L_0x0087
            if (r12 > r6) goto L_0x0087
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 > r6) goto L_0x0087
            goto L_0x001e
        L_0x0087:
            return r7
        L_0x0088:
            if (r14 >= r15) goto L_0x0091
            byte r12 = r13[r14]
            if (r12 < 0) goto L_0x0091
            int r14 = r14 + 1
            goto L_0x0088
        L_0x0091:
            if (r14 < r15) goto L_0x0095
            goto L_0x00f3
        L_0x0095:
            if (r14 < r15) goto L_0x0098
            goto L_0x00f3
        L_0x0098:
            int r12 = r14 + 1
            byte r14 = r13[r14]
            if (r14 >= 0) goto L_0x00f4
            if (r14 >= r5) goto L_0x00ae
            if (r12 >= r15) goto L_0x00ac
            if (r14 < r1) goto L_0x00aa
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0095
        L_0x00aa:
            r3 = -1
            goto L_0x00f3
        L_0x00ac:
            r3 = r14
            goto L_0x00f3
        L_0x00ae:
            if (r14 >= r2) goto L_0x00ce
            int r8 = r15 + -1
            if (r12 < r8) goto L_0x00b9
            int r3 = com.google.protobuf.C63059fx.m96001d(r13, r12, r15)
            goto L_0x00f3
        L_0x00b9:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00aa
            if (r14 != r5) goto L_0x00c3
            if (r12 < r4) goto L_0x00aa
        L_0x00c3:
            if (r14 != r0) goto L_0x00c7
            if (r12 >= r4) goto L_0x00aa
        L_0x00c7:
            int r14 = r8 + 1
            byte r12 = r13[r8]
            if (r12 <= r6) goto L_0x0095
            goto L_0x00aa
        L_0x00ce:
            int r8 = r15 + -2
            if (r12 < r8) goto L_0x00d7
            int r3 = com.google.protobuf.C63059fx.m96001d(r13, r12, r15)
            goto L_0x00f3
        L_0x00d7:
            int r8 = r12 + 1
            byte r12 = r13[r12]
            if (r12 > r6) goto L_0x00aa
            int r14 = r14 << 28
            int r12 = r12 + 112
            int r14 = r14 + r12
            int r12 = r14 >> 30
            if (r12 != 0) goto L_0x00aa
            int r12 = r8 + 1
            byte r14 = r13[r8]
            if (r14 > r6) goto L_0x00aa
            int r14 = r12 + 1
            byte r12 = r13[r12]
            if (r12 <= r6) goto L_0x0095
            goto L_0x00aa
        L_0x00f3:
            return r3
        L_0x00f4:
            r14 = r12
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63057fv.mo59144b(int, byte[], int, int):int");
    }

    /* renamed from: d */
    public final String mo59146d(byte[] bArr, int i, int i2) {
        int i3;
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) >= 0) {
            int i4 = i + i2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (r12 < i4) {
                byte b = bArr[r12];
                if (!C63055ft.m95979d(b)) {
                    break;
                }
                i = r12 + 1;
                cArr[i3] = (char) b;
                i5 = i3 + 1;
            }
            while (r12 < i4) {
                int i6 = r12 + 1;
                byte b2 = bArr[r12];
                if (C63055ft.m95979d(b2)) {
                    int i7 = i3 + 1;
                    cArr[i3] = (char) b2;
                    r12 = i6;
                    while (true) {
                        i3 = i7;
                        if (r12 >= i4) {
                            break;
                        }
                        byte b3 = bArr[r12];
                        if (!C63055ft.m95979d(b3)) {
                            break;
                        }
                        r12++;
                        i7 = i3 + 1;
                        cArr[i3] = (char) b3;
                    }
                } else if (C63055ft.m95981f(b2)) {
                    if (i6 < i4) {
                        C63055ft.m95978c(b2, bArr[i6], cArr, i3);
                        r12 = i6 + 1;
                        i3++;
                    } else {
                        throw C62974ct.m95553c();
                    }
                } else if (C63055ft.m95980e(b2)) {
                    if (i6 < i4 - 1) {
                        int i8 = i6 + 1;
                        C63055ft.m95977b(b2, bArr[i6], bArr[i8], cArr, i3);
                        r12 = i8 + 1;
                        i3++;
                    } else {
                        throw C62974ct.m95553c();
                    }
                } else if (i6 < i4 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    C63055ft.m95976a(b2, bArr[i6], bArr[i9], bArr[i10], cArr, i3);
                    i3 += 2;
                    r12 = i10 + 1;
                } else {
                    throw C62974ct.m95553c();
                }
            }
            return new String(cArr, 0, i3);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* renamed from: e */
    public final String mo59147e(ByteBuffer byteBuffer, int i, int i2) {
        return m95983i(byteBuffer, i, i2);
    }

    /* renamed from: g */
    public final void mo59149g(CharSequence charSequence, ByteBuffer byteBuffer) {
        m95984j(charSequence, byteBuffer);
    }
}
