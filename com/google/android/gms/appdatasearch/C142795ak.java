package com.google.android.gms.appdatasearch;

import java.io.UnsupportedEncodingException;

/* renamed from: com.google.android.gms.appdatasearch.ak */
/* compiled from: PG */
final class C142795ak {

    /* renamed from: a */
    int f387587a = 0;

    /* renamed from: b */
    int f387588b = 0;

    /* renamed from: c */
    final int[] f387589c;

    /* renamed from: d */
    final byte[] f387590d;

    public C142795ak(int[] iArr, byte[] bArr) {
        this.f387589c = iArr;
        this.f387590d = bArr;
    }

    /* renamed from: a */
    public final String mo117703a(int i) {
        mo117704b(i);
        try {
            return new String(this.f387590d, this.f387588b, this.f387589c[this.f387587a], "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo117704b(int i) {
        if (i < this.f387587a) {
            this.f387587a = 0;
            this.f387588b = 0;
        }
        while (true) {
            int i2 = this.f387587a;
            if (i2 < i) {
                this.f387588b += this.f387589c[i2];
                this.f387587a = i2 + 1;
            } else {
                return;
            }
        }
    }
}
