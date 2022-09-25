package androidx.media3.extractor.p160g;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3351az;
import androidx.media3.extractor.C3365bc;

/* renamed from: androidx.media3.extractor.g.g */
/* compiled from: PG */
final class C3410g implements C3409f {

    /* renamed from: a */
    private final long[] f10441a;

    /* renamed from: b */
    private final long[] f10442b;

    /* renamed from: c */
    private final long f10443c;

    /* renamed from: d */
    private final long f10444d;

    public C3410g(long[] jArr, long[] jArr2, long j, long j2) {
        this.f10441a = jArr;
        this.f10442b = jArr2;
        this.f10443c = j;
        this.f10444d = j2;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        int aw = C2612ak.m6973aw(this.f10441a, j, true);
        C3365bc bcVar = new C3365bc(this.f10441a[aw], this.f10442b[aw]);
        if (bcVar.f10174b < j) {
            long[] jArr = this.f10441a;
            if (aw != jArr.length - 1) {
                int i = aw + 1;
                return new C3351az(bcVar, new C3365bc(jArr[i], this.f10442b[i]));
            }
        }
        return new C3351az(bcVar, bcVar);
    }

    /* renamed from: e */
    public final long mo7377e() {
        return this.f10444d;
    }

    /* renamed from: f */
    public final long mo7378f(long j) {
        return this.f10441a[C2612ak.m6973aw(this.f10442b, j, true)];
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10443c;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
