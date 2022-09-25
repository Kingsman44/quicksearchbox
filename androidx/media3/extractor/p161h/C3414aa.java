package androidx.media3.extractor.p161h;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.extractor.h.aa */
/* compiled from: PG */
final class C3414aa {

    /* renamed from: a */
    public final C3437x f10454a;

    /* renamed from: b */
    public final int f10455b;

    /* renamed from: c */
    public final long[] f10456c;

    /* renamed from: d */
    public final int[] f10457d;

    /* renamed from: e */
    public final int f10458e;

    /* renamed from: f */
    public final long[] f10459f;

    /* renamed from: g */
    public final int[] f10460g;

    /* renamed from: h */
    public final long f10461h;

    public C3414aa(C3437x xVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        C2601a.m6830b(length == length2);
        int length3 = jArr.length;
        C2601a.m6830b(length3 == length2);
        int length4 = iArr2.length;
        C2601a.m6830b(length4 != length2 ? false : z);
        this.f10454a = xVar;
        this.f10456c = jArr;
        this.f10457d = iArr;
        this.f10458e = i;
        this.f10459f = jArr2;
        this.f10460g = iArr2;
        this.f10461h = j;
        this.f10455b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo7384a(long j) {
        for (int aw = C2612ak.m6973aw(this.f10459f, j, false); aw >= 0; aw--) {
            if ((this.f10460g[aw] & 1) != 0) {
                return aw;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo7385b(long j) {
        for (int av = C2612ak.m6972av(this.f10459f, j, true); av < this.f10459f.length; av++) {
            if ((this.f10460g[av] & 1) != 0) {
                return av;
            }
        }
        return -1;
    }
}
