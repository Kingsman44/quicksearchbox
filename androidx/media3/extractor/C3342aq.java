package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.extractor.aq */
/* compiled from: PG */
public final class C3342aq implements C3364bb {

    /* renamed from: a */
    private final long[] f10080a;

    /* renamed from: b */
    private final long[] f10081b;

    /* renamed from: c */
    private final long f10082c;

    /* renamed from: d */
    private final boolean f10083d;

    public C3342aq(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        C2601a.m6830b(length == length2);
        boolean z = length2 > 0;
        this.f10083d = z;
        if (!z || jArr2[0] <= 0) {
            this.f10080a = jArr;
            this.f10081b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f10080a = jArr3;
            long[] jArr4 = new long[i];
            this.f10081b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f10082c = j;
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        if (!this.f10083d) {
            C3365bc bcVar = C3365bc.f10173a;
            return new C3351az(bcVar, bcVar);
        }
        int aw = C2612ak.m6973aw(this.f10081b, j, true);
        C3365bc bcVar2 = new C3365bc(this.f10081b[aw], this.f10080a[aw]);
        if (bcVar2.f10174b != j) {
            long[] jArr = this.f10081b;
            if (aw != jArr.length - 1) {
                int i = aw + 1;
                return new C3351az(bcVar2, new C3365bc(jArr[i], this.f10080a[i]));
            }
        }
        return new C3351az(bcVar2, bcVar2);
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10082c;
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return this.f10083d;
    }
}
