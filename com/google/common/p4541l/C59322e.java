package com.google.common.p4541l;

import com.google.common.base.C58838bb;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.common.l.e */
/* compiled from: PG */
final class C59322e extends C59325h {
    private C59322e(C59320c cVar, Character ch) {
        super(cVar, ch);
        C58838bb.m90868c(cVar.f157501b.length == 64);
    }

    /* renamed from: b */
    public final C59326i mo56822b(C59320c cVar, Character ch) {
        return new C59322e(cVar, ch);
    }

    /* renamed from: c */
    public final void mo56823c(Appendable appendable, byte[] bArr, int i) {
        int i2 = 0;
        C58838bb.m90882q(0, i, bArr.length);
        int i3 = i;
        while (i3 >= 3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b = ((bArr[i2] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            appendable.append(this.f157513b.f157501b[b >>> 18]);
            appendable.append(this.f157513b.f157501b[(b >>> 12) & 63]);
            appendable.append(this.f157513b.f157501b[(b >>> 6) & 63]);
            appendable.append(this.f157513b.f157501b[b & 63]);
            i3 -= 3;
            i2 = i5 + 1;
        }
        if (i2 < i) {
            mo56834j(appendable, bArr, i2, i - i2);
        }
    }

    public C59322e(String str, String str2, Character ch) {
        this(new C59320c(str, str2.toCharArray()), ch);
    }

    /* renamed from: a */
    public final int mo56821a(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        CharSequence h = mo56828h(charSequence);
        if (this.f157513b.mo56816e(h.length())) {
            int i = 0;
            int i2 = 0;
            while (i < h.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int a = (this.f157513b.mo56812a(h.charAt(i)) << 18) | (this.f157513b.mo56812a(h.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (a >>> 16);
                if (i4 < h.length()) {
                    int i6 = i4 + 1;
                    int a2 = a | (this.f157513b.mo56812a(h.charAt(i4)) << 6);
                    int i7 = i5 + 1;
                    bArr[i5] = (byte) ((a2 >>> 8) & PrivateKeyType.INVALID);
                    if (i6 < h.length()) {
                        bArr[i7] = (byte) ((a2 | this.f157513b.mo56812a(h.charAt(i6))) & PrivateKeyType.INVALID);
                        i = i6 + 1;
                        i2 = i7 + 1;
                    } else {
                        i = i6;
                        i2 = i7;
                    }
                } else {
                    i2 = i5;
                    i = i4;
                }
            }
            return i2;
        }
        throw new C59323f("Invalid input length " + h.length());
    }
}
