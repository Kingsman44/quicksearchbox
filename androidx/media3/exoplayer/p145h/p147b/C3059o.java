package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2680x;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2510n;

/* renamed from: androidx.media3.exoplayer.h.b.o */
/* compiled from: PG */
public abstract class C3059o extends C3050f {

    /* renamed from: t */
    public final long f8895t;

    public C3059o(C2505i iVar, C2510n nVar, C2680x xVar, int i, Object obj, long j, long j2, long j3) {
        super(iVar, nVar, 1, xVar, i, obj, j, j2);
        xVar.getClass();
        this.f8895t = j3;
    }

    /* renamed from: d */
    public abstract boolean mo6998d();

    /* renamed from: k */
    public long mo6999k() {
        long j = this.f8895t;
        if (j != -1) {
            return j + 1;
        }
        return -1;
    }
}
