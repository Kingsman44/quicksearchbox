package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.io.Serializable;

/* renamed from: com.google.common.i.k */
/* compiled from: PG */
final class C59286k extends C59289n implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final byte[] f157412a;

    public C59286k(byte[] bArr) {
        bArr.getClass();
        this.f157412a = bArr;
    }

    /* renamed from: a */
    public final int mo56771a() {
        int length = this.f157412a.length;
        C58838bb.m90885t(length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", length);
        byte[] bArr = this.f157412a;
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    /* renamed from: b */
    public final int mo56772b() {
        return this.f157412a.length * 8;
    }

    /* renamed from: c */
    public final long mo56773c() {
        int length = this.f157412a.length;
        C58838bb.m90885t(length >= 8, "HashCode#asLong() requires >= 8 bytes (it only has %s bytes).", length);
        long j = (long) (this.f157412a[0] & 255);
        for (int i = 1; i < Math.min(this.f157412a.length, 8); i++) {
            j |= (((long) this.f157412a[i]) & 255) << (i * 8);
        }
        return j;
    }

    /* renamed from: d */
    public final boolean mo56774d(C59289n nVar) {
        if (this.f157412a.length != nVar.mo56776f().length) {
            return false;
        }
        int i = 0;
        boolean z = true;
        while (true) {
            byte[] bArr = this.f157412a;
            if (i >= bArr.length) {
                return z;
            }
            z &= bArr[i] == nVar.mo56776f()[i];
            i++;
        }
    }

    /* renamed from: e */
    public final byte[] mo56775e() {
        return (byte[]) this.f157412a.clone();
    }

    /* renamed from: f */
    public final byte[] mo56776f() {
        return this.f157412a;
    }
}
