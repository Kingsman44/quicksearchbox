package com.google.common.p4537i;

import java.nio.charset.Charset;

/* renamed from: com.google.common.i.c */
/* compiled from: PG */
abstract class C59278c implements C59291p {
    /* renamed from: c */
    public void mo56742c(char c) {
        mo56741b((byte) c);
        mo56741b((byte) (c >>> 8));
    }

    /* renamed from: d */
    public void mo56743d(byte[] bArr, int i) {
        throw null;
    }

    /* renamed from: e */
    public void mo56744e(int i) {
        mo56741b((byte) i);
        mo56741b((byte) (i >>> 8));
        mo56741b((byte) (i >>> 16));
        mo56741b((byte) (i >> 24));
    }

    /* renamed from: f */
    public void mo56745f(long j) {
        for (int i = 0; i < 64; i += 8) {
            mo56741b((byte) ((int) (j >>> i)));
        }
    }

    /* renamed from: g */
    public void mo56746g(byte[] bArr) {
        mo56743d(bArr, bArr.length);
    }

    /* renamed from: i */
    public C59291p mo56757i(CharSequence charSequence, Charset charset) {
        mo56746g(charSequence.toString().getBytes(charset));
        return this;
    }

    /* renamed from: j */
    public final void mo56766j(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo56742c(charSequence.charAt(i));
        }
    }
}
