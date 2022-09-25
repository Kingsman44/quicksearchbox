package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import com.google.common.base.C58913w;
import java.nio.charset.Charset;

/* renamed from: com.google.common.i.ae */
/* compiled from: PG */
final class C59275ae extends C59278c {

    /* renamed from: a */
    private int f157396a;

    /* renamed from: b */
    private long f157397b;

    /* renamed from: c */
    private int f157398c;

    /* renamed from: d */
    private int f157399d = 0;

    /* renamed from: e */
    private boolean f157400e = false;

    public C59275ae(int i) {
        this.f157396a = i;
    }

    /* renamed from: h */
    private final void m92037h(int i, long j) {
        long j2 = this.f157397b;
        int i2 = this.f157398c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.f157397b = j3;
        int i3 = i2 + (i * 8);
        this.f157398c = i3;
        this.f157399d += i;
        if (i3 >= 32) {
            this.f157396a = C59276af.m92046g(this.f157396a, C59276af.m92047h((int) j3));
            this.f157397b >>>= 32;
            this.f157398c -= 32;
        }
    }

    /* renamed from: b */
    public final void mo56741b(byte b) {
        m92037h(1, (long) (b & 255));
    }

    /* renamed from: c */
    public final void mo56742c(char c) {
        m92037h(2, (long) c);
    }

    /* renamed from: d */
    public final void mo56743d(byte[] bArr, int i) {
        int i2 = 0;
        C58838bb.m90882q(0, i, bArr.length);
        while (true) {
            int i3 = i2 + 4;
            if (i3 > i) {
                break;
            }
            m92037h(4, (long) C59276af.m92045f(bArr, i2));
            i2 = i3;
        }
        while (i2 < i) {
            mo56741b(bArr[i2]);
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo56744e(int i) {
        m92037h(4, (long) i);
    }

    /* renamed from: f */
    public final void mo56745f(long j) {
        m92037h(4, (long) ((int) j));
        m92037h(4, j >>> 32);
    }

    /* renamed from: i */
    public final C59291p mo56757i(CharSequence charSequence, Charset charset) {
        if (!C58913w.f156754c.equals(charset)) {
            return super.mo56757i(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            char charAt3 = charSequence.charAt(i + 2);
            char charAt4 = charSequence.charAt(i + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            m92037h(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i = i2;
        }
        while (i < length) {
            char charAt5 = charSequence.charAt(i);
            if (charAt5 < 128) {
                m92037h(1, (long) charAt5);
            } else if (charAt5 < 2048) {
                m92037h(2, C59276af.m92049j(charAt5));
            } else if (charAt5 < 55296 || charAt5 > 57343) {
                m92037h(3, C59276af.m92048i(charAt5));
            } else {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (codePointAt == charAt5) {
                    byte[] bytes = charSequence.subSequence(i, length).toString().getBytes(charset);
                    mo56743d(bytes, bytes.length);
                    return this;
                }
                i++;
                m92037h(4, C59276af.m92050k(codePointAt));
            }
            i++;
        }
        return this;
    }

    /* renamed from: p */
    public final C59289n mo56758p() {
        C58838bb.m90883r(!this.f157400e);
        this.f157400e = true;
        int h = this.f157396a ^ C59276af.m92047h((int) this.f157397b);
        this.f157396a = h;
        return C59276af.m92051l(h, this.f157399d);
    }
}
