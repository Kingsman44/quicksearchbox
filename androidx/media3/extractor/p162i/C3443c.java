package androidx.media3.extractor.p162i;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3335aj;
import androidx.media3.extractor.C3336ak;
import androidx.media3.extractor.C3337al;
import androidx.media3.extractor.C3364bb;

/* renamed from: androidx.media3.extractor.i.c */
/* compiled from: PG */
final class C3443c implements C3448h {

    /* renamed from: a */
    public long f10630a = -1;

    /* renamed from: b */
    private final C3337al f10631b;

    /* renamed from: c */
    private final C3336ak f10632c;

    /* renamed from: d */
    private long f10633d = -1;

    public C3443c(C3337al alVar, C3336ak akVar) {
        this.f10631b = alVar;
        this.f10632c = akVar;
    }

    /* renamed from: a */
    public final long mo7400a(C3327ab abVar) {
        long j = this.f10633d;
        if (j < 0) {
            return -1;
        }
        this.f10633d = -1;
        return -(j + 2);
    }

    /* renamed from: b */
    public final C3364bb mo7401b() {
        C2601a.m6832d(this.f10630a != -1);
        return new C3335aj(this.f10631b, this.f10630a);
    }

    /* renamed from: c */
    public final void mo7402c(long j) {
        long[] jArr = this.f10632c.f10057a;
        this.f10633d = jArr[C2612ak.m6973aw(jArr, j, true)];
    }
}
