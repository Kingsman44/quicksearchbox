package androidx.media3.common.p136b;

import java.util.Arrays;

/* renamed from: androidx.media3.common.b.v */
/* compiled from: PG */
public final class C2634v {

    /* renamed from: a */
    public int f7304a;

    /* renamed from: b */
    public long[] f7305b;

    public C2634v() {
        this((byte[]) null);
    }

    public C2634v(byte[] bArr) {
        this.f7305b = new long[32];
    }

    /* renamed from: a */
    public final long mo6207a(int i) {
        if (i >= 0 && i < this.f7304a) {
            return this.f7305b[i];
        }
        int i2 = this.f7304a;
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    /* renamed from: b */
    public final void mo6208b(long j) {
        int i = this.f7304a;
        long[] jArr = this.f7305b;
        if (i == jArr.length) {
            this.f7305b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f7305b;
        int i2 = this.f7304a;
        this.f7304a = i2 + 1;
        jArr2[i2] = j;
    }
}
