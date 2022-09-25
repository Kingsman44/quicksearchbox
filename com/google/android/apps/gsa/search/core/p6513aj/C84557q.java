package com.google.android.apps.gsa.search.core.p6513aj;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.search.core.aj.q */
/* compiled from: PG */
public final class C84557q {

    /* renamed from: a */
    public byte[] f230106a;

    /* renamed from: b */
    public int f230107b;

    /* renamed from: c */
    public int f230108c;

    public C84557q() {
        mo78293a((byte[]) null, 0, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo78293a(byte[] bArr, int i, int i2) {
        int length;
        if (bArr == null) {
            if (i == 0 && i2 == 0) {
                i = 0;
                i2 = 0;
            } else {
                throw null;
            }
        } else if (i < 0 || i2 < 0 || i > (length = bArr.length) || i2 > length - i) {
            throw new IndexOutOfBoundsException();
        }
        this.f230106a = bArr;
        this.f230107b = i;
        this.f230108c = i2;
    }

    /* renamed from: b */
    public final boolean mo78294b(byte b) {
        return this.f230108c == 1 && this.f230106a[this.f230107b] == b;
    }

    /* renamed from: c */
    public final boolean mo78295c(byte[] bArr, int i) {
        if (i != this.f230108c) {
            return false;
        }
        if (bArr == this.f230106a && this.f230107b == 0) {
            return true;
        }
        for (int i2 = 0; i2 != i; i2++) {
            if (bArr[i2] != this.f230106a[this.f230107b + i2]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        byte[] bArr = this.f230106a;
        return bArr == null ? BuildConfig.FLAVOR : new String(bArr, this.f230107b, this.f230108c);
    }
}
