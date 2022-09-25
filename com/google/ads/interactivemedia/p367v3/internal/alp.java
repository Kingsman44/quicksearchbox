package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdsManager;
import com.google.ads.interactivemedia.p367v3.api.AdsRequest;
import com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.StreamManager;
import com.google.ads.interactivemedia.p367v3.api.StreamRequest;
import java.util.List;
import java.util.SortedSet;

/* renamed from: com.google.ads.interactivemedia.v3.internal.alp */
/* compiled from: PG */
final class alp implements ana {

    /* renamed from: a */
    final /* synthetic */ alv f20898a;

    public alp(alv alv) {
        this.f20898a = alv;
    }

    /* renamed from: a */
    public final void mo14924a(String str, List list, SortedSet sortedSet, boolean z) {
        AdsRequest adsRequest = (AdsRequest) this.f20898a.f20916f.get(str);
        this.f20898a.f20918h.mo15035c(((amb) adsRequest).mo14945g());
        try {
            alv alv = this.f20898a;
            alv.m18968p(alv, new alx((AdsManager) new alw(str, alv.f20912b, this.f20898a.f20922l, adsRequest.getContentProgressProvider(), list, sortedSet, this.f20898a.f20918h, this.f20898a.f20911a, z), adsRequest.getUserRequestContext()));
        } catch (AdError e) {
            this.f20898a.f20914d.mo14975d(new alk(e, adsRequest.getUserRequestContext()));
        }
    }

    /* renamed from: b */
    public final void mo14925b(String str, String str2, boolean z) {
        String str3 = str;
        StreamRequest streamRequest = (StreamRequest) this.f20898a.f20917g.get(str);
        this.f20898a.f20918h.mo15035c(streamRequest.getContentUrl());
        this.f20898a.f20918h.mo15041i();
        try {
            alv alv = this.f20898a;
            ane l = alv.f20912b;
            String manifestSuffix = streamRequest.getManifestSuffix();
            anr o = this.f20898a.f20918h;
            Context d = this.f20898a.f20911a;
            StreamDisplayContainer m = this.f20898a.f20921k;
            m.getVideoStreamPlayer();
            alv.m18968p(alv, new alx((StreamManager) new anw(str, l, m, manifestSuffix, o, d, str2, z), streamRequest.getUserRequestContext()));
        } catch (AdError e) {
            this.f20898a.f20914d.mo14975d(new alk(e, streamRequest.getUserRequestContext()));
        }
    }

    /* renamed from: c */
    public final void mo14926c(String str, AdError.AdErrorType adErrorType, int i, String str2) {
        Object obj;
        if (this.f20898a.f20916f.get(str) != null) {
            obj = ((AdsRequest) this.f20898a.f20916f.get(str)).getUserRequestContext();
        } else {
            obj = ((StreamRequest) this.f20898a.f20917g.get(str)).getUserRequestContext();
        }
        this.f20898a.f20914d.mo14975d(new alk(new AdError(adErrorType, i, str2), obj));
    }

    /* renamed from: d */
    public final void mo14927d(String str, AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode) {
        Object obj;
        if (this.f20898a.f20916f.get(str) != null) {
            obj = ((AdsRequest) this.f20898a.f20916f.get(str)).getUserRequestContext();
        } else {
            obj = ((StreamRequest) this.f20898a.f20917g.get(str)).getUserRequestContext();
        }
        this.f20898a.f20914d.mo14975d(new alk(new AdError(adErrorType, adErrorCode, "adsLoaded message did not contain cue points."), obj));
    }
}
