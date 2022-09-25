package androidx.media3.exoplayer.p140d;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.C2600b;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2659c;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.p145h.p146a.C3009d;
import androidx.media3.exoplayer.p145h.p146a.C3015j;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p367v3.api.AdsLoader;
import com.google.ads.interactivemedia.p367v3.api.AdsManager;
import com.google.ads.interactivemedia.p367v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.common.p4522b.C58458fu;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.d.d */
/* compiled from: PG */
final class C2902d implements AdsLoader.AdsLoadedListener, ContentProgressProvider, AdEvent.AdEventListener, AdErrorEvent.AdErrorListener, VideoAdPlayer {

    /* renamed from: a */
    final /* synthetic */ C2903e f8212a;

    public C2902d(C2903e eVar) {
        this.f8212a = eVar;
    }

    public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f8212a.f8228e.add(videoAdPlayerCallback);
    }

    public final VideoProgressUpdate getAdProgress() {
        throw new IllegalStateException("Unexpected call to getAdProgress when using preloading");
    }

    public final VideoProgressUpdate getContentProgress() {
        C2646bh bhVar;
        VideoProgressUpdate K = this.f8212a.mo6730K();
        C2903e eVar = this.f8212a;
        if (eVar.f8216D != -9223372036854775807L) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C2903e eVar2 = this.f8212a;
            if (elapsedRealtime - eVar2.f8216D >= 4000) {
                eVar2.f8216D = -9223372036854775807L;
                eVar2.mo6731L(new IOException("Ad preloading timed out"));
                this.f8212a.mo6735P();
            }
        } else if (eVar.f8214B != -9223372036854775807L && (bhVar = eVar.f8233j) != null && bhVar.mo5998e() == 2 && this.f8212a.mo6739T()) {
            this.f8212a.f8216D = SystemClock.elapsedRealtime();
        }
        return K;
    }

    public final int getVolume() {
        return this.f8212a.mo6728H();
    }

    public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        int i;
        try {
            C2903e eVar = this.f8212a;
            if (eVar.f8237n != null) {
                if (adPodInfo.getPodIndex() == -1) {
                    i = eVar.f8241r.f7415c - 1;
                } else {
                    i = eVar.mo6727G(adPodInfo.getTimeOffset());
                }
                int adPosition = adPodInfo.getAdPosition() - 1;
                C2901c cVar = new C2901c(i, adPosition);
                ((C58458fu) eVar.f8229f).mo55338d(adMediaInfo, cVar, true);
                if (!eVar.f8241r.mo6327h(i, adPosition)) {
                    C2646bh bhVar = eVar.f8233j;
                    if (bhVar != null && bhVar.mo5994a() == i && eVar.f8233j.mo5995b() == adPosition) {
                        eVar.f8226c.removeCallbacks(eVar.f8231h);
                    }
                    eVar.f8241r = eVar.f8241r.mo6322d(cVar.f8210a, Math.max(adPodInfo.getTotalAds(), eVar.f8241r.mo6321c(cVar.f8210a).f7221d.length));
                    C2600b c = eVar.f8241r.mo6321c(cVar.f8210a);
                    boolean z = false;
                    for (int i2 = 0; i2 < adPosition; i2++) {
                        if (c.f7221d[i2] == 0) {
                            eVar.f8241r = eVar.f8241r.mo6323e(i, i2);
                        }
                    }
                    Uri parse = Uri.parse(adMediaInfo.getUrl());
                    C2659c cVar2 = eVar.f8241r;
                    int i3 = cVar.f8210a;
                    int i4 = cVar.f8211b;
                    int i5 = cVar2.f7418f;
                    C2600b[] bVarArr = cVar2.f7419g;
                    C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
                    if (Uri.EMPTY.equals(parse)) {
                        boolean z2 = bVarArr2[i3].f7224g;
                    } else {
                        z = true;
                    }
                    C2601a.m6832d(z);
                    C2600b bVar = bVarArr2[i3];
                    int[] e = C2600b.m6823e(bVar.f7221d, i4 + 1);
                    long[] jArr = bVar.f7222e;
                    int length = jArr.length;
                    int length2 = e.length;
                    if (length != length2) {
                        jArr = C2600b.m6824f(jArr, length2);
                    }
                    long[] jArr2 = jArr;
                    Uri[] uriArr = (Uri[]) Arrays.copyOf(bVar.f7220c, length2);
                    uriArr[i4] = parse;
                    e[i4] = 1;
                    long j = bVar.f7218a;
                    int i6 = bVar.f7219b;
                    long j2 = bVar.f7223f;
                    boolean z3 = bVar.f7224g;
                    bVarArr2[i3] = new C2600b(j, i6, e, uriArr, jArr2);
                    Object obj = cVar2.f7414b;
                    long j3 = cVar2.f7416d;
                    long j4 = cVar2.f7417e;
                    int i7 = cVar2.f7418f;
                    eVar.f8241r = new C2659c(obj, bVarArr2, j3, j4);
                    eVar.mo6737R();
                }
            }
        } catch (RuntimeException e2) {
            this.f8212a.mo6734O("loadAd", e2);
        }
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
        AdError error = adErrorEvent.getError();
        C2903e eVar = this.f8212a;
        if (eVar.f8237n == null) {
            eVar.f8232i = null;
            eVar.f8241r = new C2659c(this.f8212a.f8224a, new long[0]);
            this.f8212a.mo6737R();
        } else if (error.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || error.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR) {
            try {
                this.f8212a.mo6731L(error);
            } catch (RuntimeException e) {
                this.f8212a.mo6734O("onAdError", e);
            }
        }
        C2903e eVar2 = this.f8212a;
        if (eVar2.f8238o == null) {
            eVar2.f8238o = new C3009d(error);
        }
        this.f8212a.mo6735P();
    }

    public final void onAdEvent(AdEvent adEvent) {
        int i;
        adEvent.getType();
        C2903e eVar = this.f8212a;
        try {
            if (eVar.f8237n != null) {
                AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
                int ordinal = adEvent.getType().ordinal();
                if (ordinal != 1) {
                    int i2 = 0;
                    if (ordinal == 2) {
                        while (i2 < eVar.f8227d.size()) {
                            C3015j jVar = (C3015j) eVar.f8227d.get(i2);
                            i2++;
                        }
                    } else if (ordinal == 5) {
                        eVar.f8242s = true;
                        eVar.f8243t = 0;
                        if (eVar.f8215C) {
                            eVar.f8214B = -9223372036854775807L;
                            eVar.f8215C = false;
                        }
                    } else if (ordinal == 6) {
                        eVar.f8242s = false;
                        C2901c cVar = eVar.f8245v;
                        if (cVar != null) {
                            eVar.f8241r = eVar.f8241r.mo6326g(cVar.f8210a);
                            eVar.mo6737R();
                        }
                    } else if (ordinal == 8) {
                        C2633u.m7049d("AdTagLoader", "AdEvent: ".concat(String.valueOf(String.valueOf(adEvent.getAdData()))));
                    } else if (ordinal == 16) {
                        while (i2 < eVar.f8227d.size()) {
                            C3015j jVar2 = (C3015j) eVar.f8227d.get(i2);
                            i2++;
                        }
                    }
                } else {
                    String str = (String) adEvent.getAdData().get("adBreakTime");
                    str.getClass();
                    double parseDouble = Double.parseDouble(str);
                    if (parseDouble == -1.0d) {
                        i = eVar.f8241r.f7415c - 1;
                    } else {
                        i = eVar.mo6727G(parseDouble);
                    }
                    eVar.mo6732M(i);
                }
            }
        } catch (RuntimeException e) {
            this.f8212a.mo6734O("onAdEvent", e);
        }
    }

    public final void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
        AdsManager adsManager = adsManagerLoadedEvent.getAdsManager();
        if (!C2612ak.m6951aa(this.f8212a.f8232i, adsManagerLoadedEvent.getUserRequestContext())) {
            adsManager.destroy();
            return;
        }
        C2903e eVar = this.f8212a;
        eVar.f8232i = null;
        eVar.f8237n = adsManager;
        adsManager.addAdErrorListener(this);
        adsManager.addAdEventListener(this);
        try {
            this.f8212a.f8241r = new C2659c(this.f8212a.f8224a, C2907i.m8180a(adsManager.getAdCuePoints()));
            this.f8212a.mo6737R();
        } catch (RuntimeException e) {
            this.f8212a.mo6734O("onAdsManagerLoaded", e);
        }
    }

    public final void pauseAd(AdMediaInfo adMediaInfo) {
        try {
            C2903e eVar = this.f8212a;
            if (eVar.f8237n != null) {
                if (eVar.f8243t != 0) {
                    eVar.f8243t = 2;
                    for (int i = 0; i < eVar.f8228e.size(); i++) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i)).onPause(adMediaInfo);
                    }
                }
            }
        } catch (RuntimeException e) {
            this.f8212a.mo6734O("pauseAd", e);
        }
    }

    public final void playAd(AdMediaInfo adMediaInfo) {
        try {
            C2903e eVar = this.f8212a;
            if (eVar.f8237n != null) {
                if (eVar.f8243t == 1) {
                    C2633u.m7050e("AdTagLoader", "Unexpected playAd without stopAd");
                }
                int i = 0;
                if (eVar.f8243t == 0) {
                    eVar.f8249z = -9223372036854775807L;
                    eVar.f8213A = -9223372036854775807L;
                    eVar.f8243t = 1;
                    eVar.f8244u = adMediaInfo;
                    C2901c cVar = (C2901c) eVar.f8229f.get(adMediaInfo);
                    cVar.getClass();
                    eVar.f8245v = cVar;
                    for (int i2 = 0; i2 < eVar.f8228e.size(); i2++) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i2)).onPlay(adMediaInfo);
                    }
                    C2901c cVar2 = eVar.f8248y;
                    if (cVar2 != null && cVar2.equals(eVar.f8245v)) {
                        eVar.f8248y = null;
                        while (i < eVar.f8228e.size()) {
                            ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i)).onError(adMediaInfo);
                            i++;
                        }
                    }
                    eVar.mo6738S();
                } else {
                    eVar.f8243t = 1;
                    C2601a.m6832d(adMediaInfo.equals(eVar.f8244u));
                    while (i < eVar.f8228e.size()) {
                        ((VideoAdPlayer.VideoAdPlayerCallback) eVar.f8228e.get(i)).onResume(adMediaInfo);
                        i++;
                    }
                }
                C2646bh bhVar = eVar.f8233j;
                if (bhVar != null) {
                    if (bhVar.mo5987O()) {
                        return;
                    }
                }
                AdsManager adsManager = eVar.f8237n;
                adsManager.getClass();
                adsManager.pause();
            }
        } catch (RuntimeException e) {
            this.f8212a.mo6734O("playAd", e);
        }
    }

    public final void release() {
    }

    public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f8212a.f8228e.remove(videoAdPlayerCallback);
    }

    public final void stopAd(AdMediaInfo adMediaInfo) {
        try {
            C2903e eVar = this.f8212a;
            if (eVar.f8237n != null) {
                if (eVar.f8243t == 0) {
                    C2901c cVar = (C2901c) eVar.f8229f.get(adMediaInfo);
                    if (cVar != null) {
                        C2659c cVar2 = eVar.f8241r;
                        int i = cVar.f8210a;
                        int i2 = cVar.f8211b;
                        int i3 = cVar2.f7418f;
                        C2600b[] bVarArr = cVar2.f7419g;
                        C2600b[] bVarArr2 = (C2600b[]) C2612ak.m6965ao(bVarArr, bVarArr.length);
                        bVarArr2[i] = bVarArr2[i].mo6110c(2, i2);
                        Object obj = cVar2.f7414b;
                        long j = cVar2.f7416d;
                        long j2 = cVar2.f7417e;
                        int i4 = cVar2.f7418f;
                        eVar.f8241r = new C2659c(obj, bVarArr2, j, j2);
                        eVar.mo6737R();
                        return;
                    }
                    return;
                }
                eVar.f8243t = 0;
                eVar.mo6736Q();
                C2901c cVar3 = eVar.f8245v;
                cVar3.getClass();
                int i5 = cVar3.f8210a;
                int i6 = cVar3.f8211b;
                if (!eVar.f8241r.mo6327h(i5, i6)) {
                    C2659c cVar4 = eVar.f8241r;
                    int i7 = cVar4.f7418f;
                    C2600b[] bVarArr3 = cVar4.f7419g;
                    C2600b[] bVarArr4 = (C2600b[]) C2612ak.m6965ao(bVarArr3, bVarArr3.length);
                    bVarArr4[i5] = bVarArr4[i5].mo6110c(3, i6);
                    Object obj2 = cVar4.f7414b;
                    long j3 = cVar4.f7416d;
                    long j4 = cVar4.f7417e;
                    int i8 = cVar4.f7418f;
                    eVar.f8241r = new C2659c(obj2, bVarArr4, j3, j4).mo6325f(0);
                    eVar.mo6737R();
                    if (!eVar.f8246w) {
                        eVar.f8244u = null;
                        eVar.f8245v = null;
                    }
                }
            }
        } catch (RuntimeException e) {
            this.f8212a.mo6734O("stopAd", e);
        }
    }
}
