package androidx.media3.exoplayer;

import android.media.MediaFormat;
import androidx.media3.common.C2680x;
import androidx.media3.exoplayer.video.C3301h;
import androidx.media3.exoplayer.video.p153a.C3276a;
import androidx.media3.exoplayer.video.p153a.C3288m;
import androidx.media3.exoplayer.video.p153a.C3292q;

/* renamed from: androidx.media3.exoplayer.bp */
/* compiled from: PG */
final class C2846bp implements C3301h, C3276a, C2890cs {

    /* renamed from: a */
    private C3301h f7945a;

    /* renamed from: b */
    private C3276a f7946b;

    /* renamed from: c */
    private C3301h f7947c;

    /* renamed from: d */
    private C3276a f7948d;

    /* renamed from: a */
    public final void mo6580a(long j, float[] fArr) {
        C3276a aVar = this.f7948d;
        if (aVar != null) {
            ((C3288m) aVar).f9882d.f9845c.mo6177e(j, fArr);
        }
        C3276a aVar2 = this.f7946b;
        if (aVar2 != null) {
            aVar2.mo6580a(j, fArr);
        }
    }

    /* renamed from: b */
    public final void mo6581b() {
        C3276a aVar = this.f7948d;
        if (aVar != null) {
            aVar.mo6581b();
        }
        C3276a aVar2 = this.f7946b;
        if (aVar2 != null) {
            aVar2.mo6581b();
        }
    }

    /* renamed from: c */
    public final void mo6582c(long j, long j2, C2680x xVar, MediaFormat mediaFormat) {
        C3301h hVar = this.f7947c;
        if (hVar != null) {
            hVar.mo6582c(j, j2, xVar, mediaFormat);
        }
        C3301h hVar2 = this.f7945a;
        if (hVar2 != null) {
            hVar2.mo6582c(j, j2, xVar, mediaFormat);
        }
    }

    /* renamed from: n */
    public final void mo6526n(int i, Object obj) {
        if (i == 7) {
            this.f7945a = (C3301h) obj;
        } else if (i == 8) {
            this.f7946b = (C3276a) obj;
        } else if (i == 10000) {
            C3292q qVar = (C3292q) obj;
            if (qVar == null) {
                this.f7947c = null;
                this.f7948d = null;
                return;
            }
            C3288m mVar = qVar.f9908c;
            this.f7947c = mVar;
            this.f7948d = mVar;
        }
    }
}
