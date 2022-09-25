package com.google.common.p4541l;

import com.google.common.base.C58880cq;
import com.google.common.base.C58890d;
import com.google.common.p4573p.C60715e;
import com.google.common.p4573p.C60716f;
import com.google.common.p4573p.C60719i;
import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: com.google.common.l.c */
/* compiled from: PG */
public final class C59320c {

    /* renamed from: a */
    public final String f157500a;

    /* renamed from: b */
    public final char[] f157501b;

    /* renamed from: c */
    final int f157502c;

    /* renamed from: d */
    final int f157503d;

    /* renamed from: e */
    final int f157504e;

    /* renamed from: f */
    final int f157505f;

    /* renamed from: g */
    public final byte[] f157506g;

    /* renamed from: h */
    public final boolean f157507h;

    /* renamed from: i */
    private final boolean[] f157508i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59320c(java.lang.String r10, char[] r11) {
        /*
            r9 = this;
            r0 = 128(0x80, float:1.794E-43)
            byte[] r1 = new byte[r0]
            r2 = -1
            java.util.Arrays.fill(r1, r2)
            r3 = 0
            r4 = 0
        L_0x000a:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x002b
            char r5 = r11[r4]
            r6 = 1
            if (r5 >= r0) goto L_0x0014
            r7 = 1
            goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            java.lang.String r8 = "Non-ASCII character: %s"
            com.google.common.base.C58838bb.m90870e(r7, r8, r5)
            byte r7 = r1[r5]
            if (r7 != r2) goto L_0x001f
            goto L_0x0020
        L_0x001f:
            r6 = 0
        L_0x0020:
            java.lang.String r7 = "Duplicate character: %s"
            com.google.common.base.C58838bb.m90870e(r6, r7, r5)
            byte r6 = (byte) r4
            r1[r5] = r6
            int r4 = r4 + 1
            goto L_0x000a
        L_0x002b:
            r9.<init>(r10, r11, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4541l.C59320c.<init>(java.lang.String, char[]):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo56812a(char c) {
        if (c <= 127) {
            byte b = this.f157506g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new C59323f("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
            }
            throw new C59323f("Unrecognized character: " + c);
        }
        throw new C59323f("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C59320c mo56813b() {
        if (this.f157507h) {
            return this;
        }
        byte[] bArr = this.f157506g;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i = 65; i <= 90; i++) {
            int i2 = i | 32;
            byte[] bArr2 = this.f157506g;
            byte b = bArr2[i];
            byte b2 = bArr2[i2];
            if (b == -1) {
                copyOf[i] = b2;
            } else {
                char c = (char) i;
                char c2 = (char) i2;
                if (b2 == -1) {
                    copyOf[i2] = b;
                } else {
                    throw new IllegalStateException(C58880cq.m90965a("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c), Character.valueOf(c2)));
                }
            }
        }
        return new C59320c(this.f157500a.concat(".ignoreCase()"), this.f157501b, copyOf, true);
    }

    /* renamed from: c */
    public final boolean mo56814c() {
        for (char f : this.f157501b) {
            if (C58890d.m90991f(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo56815d() {
        for (char g : this.f157501b) {
            if (C58890d.m90992g(g)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo56816e(int i) {
        return this.f157508i[i % this.f157504e];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59320c) {
            C59320c cVar = (C59320c) obj;
            if (this.f157507h != cVar.f157507h || !Arrays.equals(this.f157501b, cVar.f157501b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo56818f(char c) {
        byte[] bArr = this.f157506g;
        return c < bArr.length && bArr[c] != -1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f157501b) + (true != this.f157507h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f157500a;
    }

    private C59320c(String str, char[] cArr, byte[] bArr, boolean z) {
        int i;
        this.f157500a = str;
        cArr.getClass();
        this.f157501b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length > 0) {
                switch (C60715e.f164725a[roundingMode.ordinal()]) {
                    case 1:
                        C60719i.m92655c(((length + -1) & length) == 0);
                        break;
                    case 2:
                    case 3:
                        break;
                    case 4:
                    case 5:
                        i = 32 - Integer.numberOfLeadingZeros(length - 1);
                        break;
                    case 6:
                    case 7:
                    case 8:
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length);
                        i = (31 - numberOfLeadingZeros) + (((-1257966797 >>> numberOfLeadingZeros) - length) >>> 31);
                        break;
                    default:
                        throw new AssertionError();
                }
                i = 31 - Integer.numberOfLeadingZeros(length);
                this.f157503d = i;
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i);
                int i2 = 1 << (3 - numberOfTrailingZeros);
                this.f157504e = i2;
                this.f157505f = i >> numberOfTrailingZeros;
                this.f157502c = length - 1;
                this.f157506g = bArr;
                boolean[] zArr = new boolean[i2];
                for (int i3 = 0; i3 < this.f157505f; i3++) {
                    zArr[C60716f.m92646c(i3 * 8, this.f157503d, RoundingMode.CEILING)] = true;
                }
                this.f157508i = zArr;
                this.f157507h = z;
                return;
            }
            throw new IllegalArgumentException("x (0) must be > 0");
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
