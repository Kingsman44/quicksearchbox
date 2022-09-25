package androidx.media3.exoplayer.p145h.p146a;

import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p140d.C2901c;
import androidx.media3.exoplayer.p140d.C2903e;
import androidx.media3.exoplayer.p140d.C2905g;
import androidx.media3.exoplayer.p145h.C3036as;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;

/* renamed from: androidx.media3.exoplayer.h.a.f */
/* compiled from: PG */
public final /* synthetic */ class C3011f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C3013h f8723a;

    /* renamed from: b */
    public final /* synthetic */ C3036as f8724b;

    public /* synthetic */ C3011f(C3013h hVar, C3036as asVar) {
        this.f8723a = hVar;
        this.f8724b = asVar;
    }

    public final void run() {
        C3013h hVar = this.f8723a;
        C3036as asVar = this.f8724b;
        C3016k kVar = hVar.f8728b;
        C3006a aVar = kVar.f8735a;
        int i = asVar.f7205b;
        int i2 = asVar.f7206c;
        C2905g gVar = (C2905g) aVar;
        if (gVar.f8259i != null) {
            C2903e eVar = (C2903e) gVar.f8255e.get(kVar);
            eVar.getClass();
            C2901c cVar = new C2901c(i, i2);
            AdMediaInfo adMediaInfo = (AdMediaInfo) eVar.f8229f.mo55027e().get(cVar);
            if (adMediaInfo != null) {
                for (int i3 = 0; i3 < eVar.f8228e.size(); i3++) {
                    ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i3)).onLoaded(adMediaInfo);
                }
                return;
            }
            C2633u.m7050e("AdTagLoader", "Unexpected prepared ad ".concat(cVar.toString()));
        }
    }
}
