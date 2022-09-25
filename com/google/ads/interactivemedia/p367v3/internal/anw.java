package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Log;
import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p367v3.api.CuePoint;
import com.google.ads.interactivemedia.p367v3.api.StreamManager;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.ResizeAndPositionVideoMsgData;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anw */
/* compiled from: PG */
public final class anw extends amh implements StreamManager {

    /* renamed from: g */
    private final String f21067g;

    /* renamed from: h */
    private List f21068h = new ArrayList();

    /* renamed from: i */
    private anz f21069i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public anw(java.lang.String r8, com.google.ads.interactivemedia.p367v3.internal.ane r9, com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer r10, java.lang.String r11, com.google.ads.interactivemedia.p367v3.internal.anr r12, android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r7.f21068h = r12
            r7.f21067g = r14
            com.google.ads.interactivemedia.v3.internal.anz r12 = new com.google.ads.interactivemedia.v3.internal.anz
            r0 = r12
            r3 = r7
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f21069i = r12
            r12.mo15062i()
            com.google.ads.interactivemedia.v3.internal.anz r10 = r7.f21069i
            r7.addAdErrorListener(r10)
            com.google.ads.interactivemedia.v3.internal.anz r10 = r7.f21069i
            r9.mo15004j(r10, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.anw.<init>(java.lang.String, com.google.ads.interactivemedia.v3.internal.ane, com.google.ads.interactivemedia.v3.api.StreamDisplayContainer, java.lang.String, com.google.ads.interactivemedia.v3.internal.anr, android.content.Context, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void mo14935a(anb anb) {
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int ordinal = anb.f21007a.ordinal();
        if (ordinal == 3) {
            this.f21069i.mo15064k();
        } else if (ordinal == 4) {
            this.f21068h = anb.f21010d;
        } else if (ordinal == 14) {
            double d = anb.f21012f;
            StringBuilder sb = new StringBuilder(54);
            sb.append("Seek time when ad is skipped: ");
            sb.append(d);
            Log.i("IMASDK", sb.toString());
            this.f21069i.mo15061h(Math.round(anb.f21012f * 1000.0d));
        } else if (ordinal != 15) {
            switch (ordinal) {
                case 23:
                    this.f21069i.mo15057c();
                    break;
                case 24:
                    this.f21069i.mo15058e();
                    break;
                case 25:
                    this.f21069i.mo15059f();
                    break;
                case 26:
                    this.f21069i.mo15060g();
                    break;
            }
        } else {
            this.f21069i.mo15063j(anb.f21008b);
        }
        super.mo14935a(anb);
    }

    /* renamed from: b */
    public final void mo14936b(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        this.f21069i.mo15065l(resizeAndPositionVideoMsgData);
    }

    /* renamed from: c */
    public final void mo14937c() {
        this.f21069i.mo15066m();
    }

    public final void destroy() {
        mo14960e(amw.contentComplete);
        this.f20957e = true;
        this.f21069i.mo15056b();
        mo14959d();
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f20957e ? VideoProgressUpdate.VIDEO_TIME_NOT_READY : this.f21069i.getAdProgress();
    }

    public final double getContentTimeForStreamTime(double d) {
        double d2 = d;
        for (CuePoint cuePoint : this.f21068h) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return C59203do.f157270a;
            }
            if (d >= cuePoint.getEndTime()) {
                d2 -= cuePoint.getEndTime() - cuePoint.getStartTime();
            } else if (d < cuePoint.getEndTime() && d > cuePoint.getStartTime()) {
                d2 -= d - cuePoint.getStartTime();
            }
        }
        return d2;
    }

    public final List getCuePoints() {
        return Collections.unmodifiableList(this.f21068h);
    }

    public final CuePoint getPreviousCuePointForStreamTime(double d) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.f21068h) {
            if (cuePoint2.getStartTime() < d) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    public final String getStreamId() {
        return this.f21067g;
    }

    public final double getStreamTimeForContentTime(double d) {
        double d2 = d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (CuePoint cuePoint : this.f21068h) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return C59203do.f157270a;
            }
            d3 += cuePoint.getStartTime() - d4;
            if (d3 > d) {
                return d2;
            }
            d2 += cuePoint.getEndTime() - cuePoint.getStartTime();
            d4 = cuePoint.getEndTime();
        }
        return d2;
    }

    public final void init(AdsRenderingSettings adsRenderingSettings) {
        super.init(adsRenderingSettings);
        anz anz = this.f21069i;
        this.f20955c.getDisableUi();
        anz.mo15067n();
    }

    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    public final void replaceAdTagParameters(Map map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("adTagParameters", map);
            this.f20953a.mo15008n(new amx(amv.adsManager, amw.replaceAdTagParameters, this.f20954b, hashMap));
        }
    }
}
