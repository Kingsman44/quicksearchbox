package androidx.media3.exoplayer.hls;

import android.os.SystemClock;
import androidx.media3.common.C2652bn;
import androidx.media3.exoplayer.p145h.p147b.C3061q;
import androidx.media3.exoplayer.p150j.C3208d;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.j */
/* compiled from: PG */
final class C3170j extends C3208d {

    /* renamed from: e */
    private int f9396e;

    public C3170j(C2652bn bnVar, int[] iArr) {
        super(bnVar, iArr);
        this.f9396e = mo7031i(bnVar.f7357d[iArr[0]]);
    }

    /* renamed from: a */
    public final int mo7021a() {
        return this.f9396e;
    }

    /* renamed from: b */
    public final int mo7022b() {
        return 0;
    }

    /* renamed from: c */
    public final Object mo7023c() {
        return null;
    }

    /* renamed from: d */
    public final void mo7024d(long j, long j2, long j3, List list, C3061q[] qVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mo7040r(this.f9396e, elapsedRealtime)) {
            int i = this.f9627b;
            do {
                i--;
                if (i < 0) {
                    throw new IllegalStateException();
                }
            } while (mo7040r(i, elapsedRealtime));
            this.f9396e = i;
        }
    }
}
