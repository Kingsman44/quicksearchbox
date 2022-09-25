package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.AdsManager;
import com.google.ads.interactivemedia.p367v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.C6749bo;
import com.google.ads.interactivemedia.p367v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alw */
/* compiled from: PG */
public final class alw extends amh implements AdsManager {

    /* renamed from: g */
    private List f20925g;

    /* renamed from: h */
    private ank f20926h;

    /* JADX WARNING: type inference failed for: r15v0, types: [com.google.ads.interactivemedia.v3.api.AdDisplayContainer, com.google.ads.interactivemedia.v3.api.BaseDisplayContainer] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public alw(java.lang.String r13, com.google.ads.interactivemedia.p367v3.internal.ane r14, com.google.ads.interactivemedia.p367v3.api.BaseDisplayContainer r15, com.google.ads.interactivemedia.p367v3.api.player.ContentProgressProvider r16, java.util.List r17, java.util.SortedSet r18, com.google.ads.interactivemedia.p367v3.internal.anr r19, android.content.Context r20, boolean r21) {
        /*
            r12 = this;
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r16
            r11 = r18
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r17
            r7.f20925g = r0
            if (r11 == 0) goto L_0x0049
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0049
            if (r10 == 0) goto L_0x003d
            com.google.ads.interactivemedia.v3.internal.anu r0 = new com.google.ads.interactivemedia.v3.internal.anu
            r0.<init>(r10)
            r7.f20958f = r0
            com.google.ads.interactivemedia.v3.internal.amm r0 = new com.google.ads.interactivemedia.v3.internal.amm
            r0.<init>(r14, r11, r13)
            r7.f20956d = r0
            com.google.ads.interactivemedia.v3.internal.anu r0 = r7.f20958f
            com.google.ads.interactivemedia.v3.internal.amm r1 = r7.f20956d
            r0.mo15046a(r1)
            com.google.ads.interactivemedia.v3.internal.anu r0 = r7.f20958f
            r0.mo15048c()
            goto L_0x0049
        L_0x003d:
            com.google.ads.interactivemedia.v3.api.AdError r0 = new com.google.ads.interactivemedia.v3.api.AdError
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorType r1 = com.google.ads.interactivemedia.p367v3.api.AdError.AdErrorType.PLAY
            com.google.ads.interactivemedia.v3.api.AdError$AdErrorCode r2 = com.google.ads.interactivemedia.p367v3.api.AdError.AdErrorCode.PLAYLIST_NO_CONTENT_TRACKING
            java.lang.String r3 = "Unable to handle cue points, no content progress provider configured."
            r0.<init>((com.google.ads.interactivemedia.p367v3.api.AdError.AdErrorType) r1, (com.google.ads.interactivemedia.p367v3.api.AdError.AdErrorCode) r2, (java.lang.String) r3)
            throw r0
        L_0x0049:
            com.google.ads.interactivemedia.v3.internal.ank r0 = new com.google.ads.interactivemedia.v3.internal.ank
            r1 = r15
            r0.<init>(r13, r14, r12, r15)
            r7.f20926h = r0
            r12.addAdErrorListener(r0)
            com.google.ads.interactivemedia.v3.internal.ank r0 = r7.f20926h
            r14.mo15004j(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.alw.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.ane, com.google.ads.interactivemedia.v3.api.BaseDisplayContainer, com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider, java.util.List, java.util.SortedSet, com.google.ads.interactivemedia.v3.internal.anr, android.content.Context, boolean):void");
    }

    /* renamed from: l */
    private final void m18974l() {
        if (!this.f20957e) {
            this.f20957e = true;
            mo14960e(amw.destroy);
        }
    }

    /* renamed from: a */
    public final void mo14935a(anb anb) {
        AdEvent.AdEventType adEventType = anb.f21007a;
        AdEvent.AdEventType adEventType2 = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = adEventType.ordinal();
        if (ordinal != 0) {
            if (ordinal == 6) {
                this.f20926h.mo15028i();
                this.f20926h.mo15024e();
            } else if (ordinal == 14) {
                this.f20926h.mo15028i();
            } else if (ordinal == 15) {
                this.f20926h.mo15027h(anb.f21008b);
            }
            super.mo14935a(anb);
            return;
        }
        super.mo14935a(anb);
        this.f20926h.mo15025f();
        m18974l();
        super.mo14959d();
    }

    /* renamed from: b */
    public final void mo14936b(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.f20926h.mo15029j(resizeAndPositionVideoMsgData);
    }

    /* renamed from: c */
    public final void mo14937c() {
        this.f20926h.mo15030k();
    }

    public final void clicked() {
        this.f20953a.mo15008n(new amx(amv.adsManager, amw.click, this.f20954b));
    }

    public final void destroy() {
        anu anu = this.f20958f;
        if (anu != null) {
            anu.mo15049d();
        }
        m18974l();
    }

    public final void discardAdBreak() {
        mo14960e(amw.discardAdBreak);
    }

    public final List getAdCuePoints() {
        return this.f20925g;
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f20957e ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.f20926h.getAdProgress();
    }

    public final void init(AdsRenderingSettings adsRenderingSettings) {
        super.init(adsRenderingSettings);
        this.f20926h.mo15022c(this.f20955c.getDisableUi());
    }

    public final boolean isCustomPlaybackUsed() {
        return this.f20926h.mo15026g();
    }

    public final void pause() {
        mo14960e(amw.pause);
    }

    public final void requestNextAdBreak() {
        if (this.f20958f != null) {
            this.f20953a.mo15008n(new amx(amv.contentTimeUpdate, amw.contentTimeUpdate, this.f20954b, C6749bo.create(this.f20958f.mo15050e())));
            mo14960e(amw.requestNextAdBreak);
        }
    }

    public final void resume() {
        mo14960e(amw.resume);
    }

    public final void skip() {
        mo14960e(amw.skip);
    }

    public final void start() {
        mo14960e(amw.start);
    }
}
