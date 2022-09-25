package androidx.media3.exoplayer.p145h.p146a;

import android.os.SystemClock;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p140d.C2901c;
import androidx.media3.exoplayer.p140d.C2903e;
import androidx.media3.exoplayer.p140d.C2905g;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;

/* renamed from: androidx.media3.exoplayer.h.a.g */
/* compiled from: PG */
public final /* synthetic */ class C3012g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3013h f8725a;

    /* renamed from: b */
    public final /* synthetic */ C3036as f8726b;

    public /* synthetic */ C3012g(C3013h hVar, C3036as asVar) {
        this.f8725a = hVar;
        this.f8726b = asVar;
    }

    public final void run() {
        C3013h hVar = this.f8725a;
        C3036as asVar = this.f8726b;
        C3016k kVar = hVar.f8728b;
        C3006a aVar = kVar.f8735a;
        int i = asVar.f7205b;
        int i2 = asVar.f7206c;
        C2905g gVar = (C2905g) aVar;
        if (gVar.f8259i != null) {
            C2903e eVar = (C2903e) gVar.f8255e.get(kVar);
            eVar.getClass();
            if (eVar.f8233j != null) {
                try {
                    if (eVar.f8237n == null) {
                        C2633u.m7050e("AdTagLoader", "Ignoring ad prepare error after release");
                        return;
                    }
                    if (eVar.f8243t == 0) {
                        eVar.f8249z = SystemClock.elapsedRealtime();
                        long A = C2612ak.m6918A(eVar.f8241r.mo6321c(i).f7218a);
                        eVar.f8213A = A;
                        if (A == Long.MIN_VALUE) {
                            eVar.f8213A = eVar.f8240q;
                        }
                        eVar.f8248y = new C2901c(i, i2);
                    } else {
                        AdMediaInfo adMediaInfo = eVar.f8244u;
                        adMediaInfo.getClass();
                        if (i2 > eVar.f8247x) {
                            for (int i3 = 0; i3 < eVar.f8228e.size(); i3++) {
                                ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i3)).onEnded(adMediaInfo);
                            }
                        }
                        eVar.f8247x = eVar.f8241r.mo6321c(i).mo6108a(-1);
                        for (int i4 = 0; i4 < eVar.f8228e.size(); i4++) {
                            ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i4)).onError(adMediaInfo);
                        }
                    }
                    eVar.f8241r = eVar.f8241r.mo6323e(i, i2);
                    eVar.mo6737R();
                } catch (RuntimeException e) {
                    eVar.mo6734O("handlePrepareError", e);
                }
            }
        }
    }
}
