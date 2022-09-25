package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.ads.interactivemedia.p367v3.api.AdPodInfo;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aoh */
/* compiled from: PG */
public final class aoh implements VideoAdPlayer, ResizablePlayer, aoi, aod {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6903ej f21101a;

    /* renamed from: b */
    private final SurfaceView f21102b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final abi f21103c;

    /* renamed from: d */
    private final FrameLayout f21104d;

    /* renamed from: e */
    private final ViewGroup f21105e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final List f21106f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final HashSet f21107g;

    /* renamed from: h */
    private final aoe f21108h;

    /* renamed from: i */
    private final aof f21109i;

    /* renamed from: j */
    private final aog f21110j;

    /* renamed from: k */
    private final ArrayList f21111k = new ArrayList();

    /* renamed from: l */
    private final ach f21112l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C7307ti f21113m;

    /* renamed from: n */
    private AdPodInfo f21114n;

    /* renamed from: o */
    private int f21115o;

    public aoh(Context context, ViewGroup viewGroup) {
        C6903ej a = C6827bo.m19786a(context, new aok(context), new aaw(aaq.f20093a, new aah()));
        this.f21105e = viewGroup;
        this.f21101a = a;
        this.f21112l = new ach(context, aeu.m18526aq(context));
        this.f21106f = new ArrayList(1);
        aof aof = new aof(this);
        this.f21109i = aof;
        this.f21107g = asn.m19515b();
        aog aog = new aog(this);
        this.f21110j = aog;
        this.f21108h = new aoe(this);
        a.mo15815c(aof);
        a.mo15817e(aog);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f21104d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        abi abi = new abi(context);
        this.f21103c = abi;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        abi.setLayoutParams(layoutParams);
        this.f21115o = 1;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f21102b = surfaceView;
        surfaceView.setZOrderMediaOverlay(true);
        a.mo15814b(surfaceView.getHolder());
        abi.addView(surfaceView);
        frameLayout.addView(abi);
        viewGroup.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    /* renamed from: i */
    private final void m19179i() {
        this.f21104d.setVisibility(8);
        this.f21102b.setVisibility(4);
        this.f21113m = null;
        this.f21108h.mo15074b();
        this.f21115o = 1;
        this.f21101a.mo15499a();
        this.f21101a.mo15813X();
        this.f21107g.clear();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final AdMediaInfo m19180j() {
        int m = this.f21101a.mo15565m();
        if (this.f21113m == null) {
            return null;
        }
        return m19183m(m);
    }

    /* renamed from: k */
    private final void m19181k(AdMediaInfo adMediaInfo) {
        C7323ty tyVar;
        Uri parse = Uri.parse(adMediaInfo.getUrl());
        int ab = aeu.m18511ab(parse);
        if (ab == 0) {
            ach ach = this.f21112l;
            tyVar = new C7395wp(new C7405wz(ach), ach).mo16718a(parse);
        } else if (ab == 2) {
            tyVar = new C7452ys(new C7440yg(this.f21112l)).mo16833a(parse);
        } else if (ab == 3) {
            tyVar = new C7346uu(this.f21112l, new aoj()).mo16588a(parse);
        } else {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Unsupported type: ");
            sb.append(ab);
            throw new IllegalStateException(sb.toString());
        }
        this.f21113m.mo16526C(tyVar);
        this.f21111k.add(adMediaInfo);
    }

    /* renamed from: l */
    private final int m19182l(AdMediaInfo adMediaInfo) {
        return this.f21111k.indexOf(adMediaInfo);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final AdMediaInfo m19183m(int i) {
        if (i < 0 || i >= this.f21111k.size()) {
            return null;
        }
        return (AdMediaInfo) this.f21111k.get(i);
    }

    /* renamed from: a */
    public final void mo15072a() {
        AdMediaInfo j = m19180j();
        VideoProgressUpdate adProgress = getAdProgress();
        for (VideoAdPlayer.VideoAdPlayerCallback onAdProgress : this.f21106f) {
            onAdProgress.onAdProgress(j, adProgress);
        }
    }

    public final void addCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f21106f.add(videoAdPlayerCallback);
    }

    public final VideoProgressUpdate getAdProgress() {
        if ((this.f21101a.mo15819g() == 2 || this.f21101a.mo15819g() == 3) && this.f21101a.mo15824n() > 0) {
            return new VideoProgressUpdate(this.f21101a.mo15567o(), this.f21101a.mo15824n());
        }
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
    }

    public final int getVolume() {
        return 100;
    }

    public final void pauseAd(AdMediaInfo adMediaInfo) {
        this.f21108h.mo15074b();
        this.f21115o = 4;
        this.f21101a.mo15821i(false);
        for (VideoAdPlayer.VideoAdPlayerCallback onPause : this.f21106f) {
            onPause.onPause(adMediaInfo);
        }
    }

    public final void playAd(AdMediaInfo adMediaInfo) {
        if (this.f21113m == null || !this.f21111k.contains(adMediaInfo)) {
            throw new IllegalStateException("Call to playAd without appropriate call to loadAd first.");
        }
        this.f21104d.setVisibility(0);
        this.f21102b.setVisibility(0);
        int i = this.f21115o;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                for (VideoAdPlayer.VideoAdPlayerCallback onPlay : this.f21106f) {
                    onPlay.onPlay(adMediaInfo);
                }
                this.f21101a.mo15814b(this.f21102b.getHolder());
            } else if (i2 == 2) {
                return;
            } else {
                if (i2 == 3) {
                    for (VideoAdPlayer.VideoAdPlayerCallback onResume : this.f21106f) {
                        onResume.onResume(adMediaInfo);
                    }
                }
            }
            this.f21108h.mo15073a();
            this.f21115o = 3;
            this.f21101a.mo15821i(true);
        } else {
            throw new IllegalStateException("Call to playAd when player state is not LOADED.");
        }
    }

    public final void release() {
        m19179i();
        this.f21101a.mo15816d(this.f21109i);
        this.f21101a.mo15818f(this.f21110j);
        this.f21101a.mo15823k();
        this.f21108h.mo15074b();
        this.f21105e.removeView(this.f21104d);
    }

    public final void removeCallback(VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback) {
        this.f21106f.remove(videoAdPlayerCallback);
    }

    public final void resize(int i, int i2, int i3, int i4) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((this.f21105e.getWidth() - i) - i3, (this.f21105e.getHeight() - i2) - i4);
        layoutParams.leftMargin = i;
        layoutParams.topMargin = i2;
        this.f21103c.setLayoutParams(layoutParams);
    }

    public final void stopAd(AdMediaInfo adMediaInfo) {
        if (this.f21113m == null) {
            Log.e("IMASDK", "Attempting to stop when no current ad source");
            return;
        }
        this.f21107g.add(adMediaInfo);
        int l = m19182l(adMediaInfo);
        int m = this.f21101a.mo15565m();
        if (l == m) {
            if (m19182l(adMediaInfo) == this.f21111k.size() - 1) {
                m19179i();
                return;
            }
            this.f21101a.mo15576y(this.f21101a.mo15565m() + 1);
        } else if (l > m) {
            this.f21113m.mo16531I(m19182l(adMediaInfo));
            this.f21111k.remove(adMediaInfo);
        }
    }

    public final void loadAd(AdMediaInfo adMediaInfo, AdPodInfo adPodInfo) {
        if (this.f21113m != null) {
            AdPodInfo adPodInfo2 = this.f21114n;
            if (adPodInfo2 == null || adPodInfo == null || adPodInfo2.getPodIndex() != adPodInfo.getPodIndex()) {
                throw new IllegalStateException("Called loadAd on an ad from a different ad break.");
            }
            m19181k(adMediaInfo);
            return;
        }
        this.f21101a.mo15499a();
        C6903ej ejVar = this.f21101a;
        ejVar.mo15576y(ejVar.mo15565m());
        this.f21111k.clear();
        this.f21113m = new C7307ti(new C7357ve(), new C7323ty[0]);
        this.f21114n = adPodInfo;
        m19181k(adMediaInfo);
        this.f21101a.mo15821i(false);
        this.f21101a.mo15820h(this.f21113m);
        this.f21115o = 2;
    }
}
