package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.extractor.aj */
/* compiled from: PG */
public final class C3335aj implements C3364bb {

    /* renamed from: a */
    private final C3337al f10055a;

    /* renamed from: b */
    private final long f10056b;

    public C3335aj(C3337al alVar, long j) {
        this.f10055a = alVar;
        this.f10056b = j;
    }

    /* renamed from: d */
    private final C3365bc m9656d(long j, long j2) {
        return new C3365bc((j * 1000000) / ((long) this.f10055a.f10063e), this.f10056b + j2);
    }

    /* renamed from: b */
    public final C3351az mo7324b(long j) {
        long j2;
        C2601a.m6829a(this.f10055a.f10069k);
        C3337al alVar = this.f10055a;
        C3336ak akVar = alVar.f10069k;
        long[] jArr = akVar.f10057a;
        long[] jArr2 = akVar.f10058b;
        int aw = C2612ak.m6973aw(jArr, alVar.mo7328b(j), false);
        long j3 = 0;
        if (aw == -1) {
            j2 = 0;
        } else {
            j2 = jArr[aw];
        }
        if (aw != -1) {
            j3 = jArr2[aw];
        }
        C3365bc d = m9656d(j2, j3);
        if (d.f10174b == j || aw == jArr.length - 1) {
            return new C3351az(d, d);
        }
        int i = aw + 1;
        return new C3351az(d, m9656d(jArr[i], jArr2[i]));
    }

    /* renamed from: r */
    public final long mo7325r() {
        return this.f10055a.mo7327a();
    }

    /* renamed from: t */
    public final boolean mo7326t() {
        return true;
    }
}
