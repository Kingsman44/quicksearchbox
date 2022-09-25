package androidx.media3.extractor.p159f;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3627q;

/* renamed from: androidx.media3.extractor.f.f */
/* compiled from: PG */
final class C3401f {

    /* renamed from: a */
    public final C2604ac f10408a = new C2604ac(8);

    /* renamed from: b */
    public int f10409b;

    /* renamed from: a */
    public final long mo7374a(C3327ab abVar) {
        C3627q qVar = (C3627q) abVar;
        int i = 0;
        qVar.mo7320o(this.f10408a.f7234a, 0, 1, false);
        byte b = this.f10408a.f7234a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        qVar.mo7320o(this.f10408a.f7234a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f10408a.f7234a[i] & 255) + (i4 << 8);
        }
        this.f10409b += i3 + 1;
        return (long) i4;
    }
}
