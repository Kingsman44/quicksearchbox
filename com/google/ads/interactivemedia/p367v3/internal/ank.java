package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.p367v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.C6740bf;
import com.google.ads.interactivemedia.p367v3.impl.data.C6755c;
import com.google.ads.interactivemedia.p367v3.impl.data.C6756d;
import com.google.ads.interactivemedia.p367v3.impl.data.ResizeAndPositionVideoMsgData;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ank */
/* compiled from: PG */
public final class ank implements aoa, alm {

    /* renamed from: a */
    private final AdDisplayContainer f21034a;

    /* renamed from: b */
    private final VideoAdPlayer f21035b;

    /* renamed from: c */
    private final alw f21036c;

    /* renamed from: d */
    private final ane f21037d;

    /* renamed from: e */
    private final String f21038e;

    /* renamed from: f */
    private final aob f21039f;

    /* renamed from: g */
    private final aln f21040g;

    /* renamed from: h */
    private final arh f21041h = arh.m19364p();

    /* renamed from: i */
    private boolean f21042i = false;

    public ank(String str, ane ane, alw alw, AdDisplayContainer adDisplayContainer) {
        this.f21034a = adDisplayContainer;
        VideoAdPlayer player = adDisplayContainer.getPlayer();
        this.f21035b = player;
        this.f21036c = alw;
        this.f21037d = ane;
        this.f21038e = str;
        this.f21039f = new aob(ane.mo14996b(), adDisplayContainer.getAdContainer());
        aln aln = new aln(this);
        this.f21040g = aln;
        player.addCallback(aln);
    }

    /* renamed from: a */
    public final void mo14920a(amw amw, AdMediaInfo adMediaInfo, Object obj) {
        amv amv = (amv) this.f21041h.mo15261j().get(adMediaInfo);
        if (amv == null) {
            String valueOf = String.valueOf(amw);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 113);
            sb.append("The adMediaInfo for the ");
            sb.append(valueOf);
            sb.append(" event is not active. This may occur if callbacks are triggered after the ad is unloaded.");
            C7458yy.m22581d(sb.toString());
            return;
        }
        this.f21037d.mo15008n(new amx(amv, amw, this.f21038e, obj));
    }

    /* renamed from: b */
    public final void mo14921b(amv amv, amw amw) {
        this.f21037d.mo15008n(new amx(amv, amw, "*"));
    }

    /* renamed from: c */
    public final void mo15022c(boolean z) {
        this.f21042i = z;
    }

    /* renamed from: d */
    public final void mo15023d(amv amv, amw amw, C6740bf bfVar) {
        AdMediaInfo adMediaInfo = (AdMediaInfo) this.f21041h.get(amv);
        amw amw2 = amw.activate;
        int ordinal = amw.ordinal();
        if (ordinal != 33) {
            if (ordinal != 42) {
                if (ordinal != 71) {
                    if (ordinal == 51) {
                        this.f21035b.pauseAd(adMediaInfo);
                        return;
                    } else if (ordinal == 52) {
                        this.f21035b.playAd(adMediaInfo);
                        this.f21040g.mo14922a();
                        return;
                    } else {
                        return;
                    }
                }
            } else if (bfVar == null || bfVar.videoUrl == null) {
                this.f21036c.mo14961f(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
                return;
            } else {
                this.f21040g.mo14922a();
                AdMediaInfo adMediaInfo2 = new AdMediaInfo(bfVar.videoUrl);
                C6756d dVar = bfVar.adPodInfo;
                if (dVar == null) {
                    dVar = null;
                }
                this.f21041h.put(amv, adMediaInfo2);
                this.f21035b.loadAd(adMediaInfo2, dVar);
                return;
            }
        }
        this.f21035b.stopAd(adMediaInfo);
        this.f21041h.remove(amv);
    }

    /* renamed from: e */
    public final void mo15024e() {
        this.f21040g.mo14923b();
    }

    /* renamed from: f */
    public final void mo15025f() {
        C7458yy.m22580c("Destroying NativeVideoDisplay");
        this.f21039f.mo15070b();
        this.f21035b.removeCallback(this.f21040g);
        this.f21035b.release();
    }

    /* renamed from: g */
    public final boolean mo15026g() {
        return this.f21035b instanceof aoi;
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f21035b.getAdProgress();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo15027h(C6755c cVar) {
        if (!this.f21042i || !cVar.canDisableUi()) {
            cVar.setUiDisabled(false);
            if (cVar.isLinear()) {
                this.f21039f.mo15069a();
                return;
            }
            return;
        }
        cVar.setUiDisabled(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo15028i() {
        this.f21039f.mo15070b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo15029j(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f21035b instanceof ResizablePlayer)) {
            C7458yy.m22583f("Video player does not support resizing.");
        } else if (!C7458yy.m22579b(this.f21034a, resizeAndPositionVideoMsgData)) {
            C7458yy.m22583f("Creative resize parameters were not within the containers bounds.");
        } else {
            int width = this.f21034a.getAdContainer().getWidth();
            int height = this.f21034a.getAdContainer().getHeight();
            int intValue = resizeAndPositionVideoMsgData.mo13984x().intValue();
            int intValue2 = resizeAndPositionVideoMsgData.width().intValue();
            int intValue3 = resizeAndPositionVideoMsgData.mo13985y().intValue();
            ((ResizablePlayer) this.f21035b).resize(resizeAndPositionVideoMsgData.mo13984x().intValue(), resizeAndPositionVideoMsgData.mo13985y().intValue(), (width - intValue) - intValue2, (height - intValue3) - resizeAndPositionVideoMsgData.height().intValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo15030k() {
        VideoAdPlayer videoAdPlayer = this.f21035b;
        if (videoAdPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoAdPlayer).resize(0, 0, 0, 0);
        }
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
        mo15028i();
    }
}
