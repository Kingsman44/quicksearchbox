package com.google.common.p4541l;

import com.google.common.base.C58838bb;

/* renamed from: com.google.common.l.d */
/* compiled from: PG */
final class C59321d extends C59325h {

    /* renamed from: a */
    final char[] f157509a = new char[512];

    public C59321d(C59320c cVar) {
        super(cVar, (Character) null);
        C58838bb.m90868c(cVar.f157501b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.f157509a;
            char[] cArr2 = cVar.f157501b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    /* renamed from: b */
    public final C59326i mo56822b(C59320c cVar, Character ch) {
        return new C59321d(cVar);
    }

    /* renamed from: c */
    public final void mo56823c(Appendable appendable, byte[] bArr, int i) {
        appendable.getClass();
        C58838bb.m90882q(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2] & 255;
            appendable.append(this.f157509a[b]);
            appendable.append(this.f157509a[b | 256]);
        }
    }

    /* renamed from: a */
    public final int mo56821a(byte[] bArr, CharSequence charSequence) {
        bArr.getClass();
        if (charSequence.length() % 2 != 1) {
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f157513b.mo56812a(charSequence.charAt(i)) << 4) | this.f157513b.mo56812a(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }
        throw new C59323f("Invalid input length " + charSequence.length());
    }
}
