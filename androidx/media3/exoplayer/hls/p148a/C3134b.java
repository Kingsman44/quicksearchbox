package androidx.media3.exoplayer.hls.p148a;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3245k;
import androidx.media3.exoplayer.p151k.C3246l;
import androidx.media3.exoplayer.p151k.C3247m;
import androidx.media3.exoplayer.p151k.C3248n;
import java.util.List;

/* renamed from: androidx.media3.exoplayer.hls.a.b */
/* compiled from: PG */
final class C3134b implements C3153u {

    /* renamed from: a */
    final /* synthetic */ C3137e f9224a;

    public C3134b(C3137e eVar) {
        this.f9224a = eVar;
    }

    /* renamed from: k */
    public final void mo7135k() {
        this.f9224a.f9240c.remove(this);
    }

    /* renamed from: q */
    public final boolean mo7136q(Uri uri, C3248n nVar, boolean z) {
        C3136d dVar;
        if (this.f9224a.f9247j == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C3147o oVar = this.f9224a.f9245h;
            int i = C2612ak.f7249a;
            List list = oVar.f9305c;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C3136d dVar2 = (C3136d) this.f9224a.f9239b.get(((C3146n) list.get(i3)).f9297a);
                if (dVar2 != null && elapsedRealtime < dVar2.f9231e) {
                    i2++;
                }
            }
            C3247m a = C3245k.m9466a(new C3246l(1, 0, this.f9224a.f9245h.f9305c.size(), i2), nVar);
            if (!(a == null || a.f9768a != 2 || (dVar = (C3136d) this.f9224a.f9239b.get(uri)) == null)) {
                dVar.mo7140f(a.f9769b);
            }
        }
        return false;
    }
}
