package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;
import com.google.common.p4575r.C60757n;
import java.io.Serializable;
import java.nio.charset.Charset;

/* renamed from: com.google.common.i.af */
/* compiled from: PG */
public final class C59276af extends C59277b implements Serializable {

    /* renamed from: a */
    static final C59290o f157401a = new C59276af(0);

    /* renamed from: b */
    public static final C59290o f157402b = new C59276af(C59294s.f157421a);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    private final int f157403c;

    /* renamed from: d */
    private final boolean f157404d = true;

    public C59276af(int i) {
        this.f157403c = i;
    }

    /* renamed from: f */
    public static int m92045f(byte[] bArr, int i) {
        return C60757n.m92744e(bArr[i + 3], bArr[i + 2], bArr[i + 1], bArr[i]);
    }

    /* renamed from: g */
    public static int m92046g(int i, int i2) {
        return (Integer.rotateLeft(i ^ i2, 13) * 5) - 430675100;
    }

    /* renamed from: h */
    public static int m92047h(int i) {
        return Integer.rotateLeft(i * -862048943, 15) * 461845907;
    }

    /* renamed from: i */
    public static long m92048i(char c) {
        return ((long) (c >>> 12)) | 224 | ((long) ((((c >>> 6) & 63) | 128) << 8)) | ((long) (((c & '?') | 128) << 16));
    }

    /* renamed from: j */
    public static long m92049j(char c) {
        return ((long) (c >>> 6)) | 192 | ((long) (((c & '?') | 128) << 8));
    }

    /* renamed from: k */
    public static long m92050k(int i) {
        return ((long) (i >>> 18)) | 240 | ((((long) ((i >>> 12) & 63)) | 128) << 8) | ((((long) ((i >>> 6) & 63)) | 128) << 16) | ((((long) (i & 63)) | 128) << 24);
    }

    /* renamed from: l */
    public static C59289n m92051l(int i, int i2) {
        int i3 = i ^ i2;
        int i4 = (i3 ^ (i3 >>> 16)) * -2048144789;
        int i5 = (i4 ^ (i4 >>> 13)) * -1028477387;
        return C59289n.m92111h(i5 ^ (i5 >>> 16));
    }

    /* renamed from: a */
    public final C59289n mo56759a(CharSequence charSequence, Charset charset) {
        int i;
        long j;
        if (C58913w.f156754c.equals(charset)) {
            int length = charSequence.length();
            int i2 = this.f157403c;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i4 + 4;
                j = 0;
                if (i6 > length) {
                    break;
                }
                char charAt = charSequence.charAt(i4);
                char charAt2 = charSequence.charAt(i4 + 1);
                char charAt3 = charSequence.charAt(i4 + 2);
                char charAt4 = charSequence.charAt(i4 + 3);
                if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                    break;
                }
                i2 = m92046g(i2, m92047h((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
                i5 = i + 4;
                i4 = i6;
            }
            while (i4 < length) {
                char charAt5 = charSequence.charAt(i4);
                if (charAt5 < 128) {
                    j |= ((long) charAt5) << i3;
                    i3 += 8;
                    i++;
                } else if (charAt5 < 2048) {
                    j |= m92049j(charAt5) << i3;
                    i3 += 16;
                    i += 2;
                } else if (charAt5 < 55296 || charAt5 > 57343) {
                    j |= m92048i(charAt5) << i3;
                    i3 += 24;
                    i += 3;
                } else {
                    int codePointAt = Character.codePointAt(charSequence, i4);
                    if (codePointAt == charAt5) {
                        byte[] bytes = charSequence.toString().getBytes(charset);
                        return mo56761d(bytes, bytes.length);
                    }
                    i4++;
                    j |= m92050k(codePointAt) << i3;
                    i3 += 32;
                    i += 4;
                }
                if (i3 >= 32) {
                    i2 = m92046g(i2, m92047h((int) j));
                    j >>>= 32;
                    i3 -= 32;
                }
                i4++;
            }
            return m92051l(m92047h((int) j) ^ i2, i);
        }
        byte[] bytes2 = charSequence.toString().getBytes(charset);
        return mo56761d(bytes2, bytes2.length);
    }

    /* renamed from: b */
    public final C59289n mo56760b(CharSequence charSequence) {
        int i = this.f157403c;
        for (int i2 = 1; i2 < charSequence.length(); i2 += 2) {
            i = m92046g(i, m92047h(charSequence.charAt(i2 - 1) | (charSequence.charAt(i2) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            i ^= m92047h(charSequence.charAt(charSequence.length() - 1));
        }
        int length = charSequence.length();
        return m92051l(i, length + length);
    }

    /* renamed from: d */
    public final C59289n mo56761d(byte[] bArr, int i) {
        int i2 = 0;
        C58838bb.m90882q(0, i, bArr.length);
        int i3 = this.f157403c;
        int i4 = 0;
        while (true) {
            int i5 = i4 + 4;
            if (i5 > i) {
                break;
            }
            i3 = m92046g(i3, m92047h(m92045f(bArr, i4)));
            i4 = i5;
        }
        int i6 = i4;
        int i7 = 0;
        while (i6 < i) {
            i2 ^= (bArr[i6] & 255) << i7;
            i6++;
            i7 += 8;
        }
        return m92051l(m92047h(i2) ^ i3, i);
    }

    /* renamed from: e */
    public final C59291p mo56748e() {
        return new C59275ae(this.f157403c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59276af) {
            C59276af afVar = (C59276af) obj;
            if (this.f157403c == afVar.f157403c) {
                boolean z = afVar.f157404d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.f157403c;
    }

    public final String toString() {
        return "Hashing.murmur3_32(" + this.f157403c + ")";
    }
}
