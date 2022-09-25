package com.google.ads.interactivemedia.p367v3.internal;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.AdEvent;
import com.google.ads.interactivemedia.p367v3.api.AdProgressInfo;
import com.google.ads.interactivemedia.p367v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.p367v3.api.BaseDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.BaseManager;
import com.google.ads.interactivemedia.p367v3.api.C6706Ad;
import com.google.ads.interactivemedia.p367v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.impl.data.C6755c;
import com.google.ads.interactivemedia.p367v3.impl.data.C6758f;
import com.google.ads.interactivemedia.p367v3.impl.data.C6759g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amh */
/* compiled from: PG */
abstract class amh implements BaseManager, anc, aol {

    /* renamed from: a */
    protected final ane f20953a;

    /* renamed from: b */
    protected final String f20954b;

    /* renamed from: c */
    protected AdsRenderingSettings f20955c;

    /* renamed from: d */
    protected amm f20956d;

    /* renamed from: e */
    protected boolean f20957e = false;

    /* renamed from: f */
    protected anu f20958f;

    /* renamed from: g */
    private final List f20959g = new ArrayList(1);

    /* renamed from: h */
    private final amo f20960h = new amo();

    /* renamed from: i */
    private final Context f20961i;

    /* renamed from: j */
    private C6755c f20962j;

    /* renamed from: k */
    private AdProgressInfo f20963k;

    /* renamed from: l */
    private ali f20964l;

    /* renamed from: m */
    private anr f20965m;

    /* renamed from: n */
    private aom f20966n;

    protected amh(String str, ane ane, BaseDisplayContainer baseDisplayContainer, anr anr, Context context, boolean z) {
        this.f20954b = str;
        this.f20953a = ane;
        this.f20961i = context;
        this.f20955c = new C6759g();
        ali ali = new ali(str, ane, baseDisplayContainer.getAdContainer());
        this.f20964l = ali;
        ali.mo14910a(z);
        if (anr == null) {
            anr = null;
        } else {
            anr.mo15037e(str);
            anr.mo15036d(baseDisplayContainer.getAdContainer());
            addAdEventListener(anr);
            addAdErrorListener(anr);
            amg amg = (amg) baseDisplayContainer;
            for (FriendlyObstruction g : amg.mo14957b()) {
                anr.mo15039g(g);
            }
            amg.mo14958c(anr);
        }
        this.f20965m = anr;
        ane.mo15000f(this, str);
        this.f20964l.mo14911b();
        Application h = C7458yy.m22585h(context);
        if (h != null) {
            aom aom = new aom(h);
            this.f20966n = aom;
            aom.mo15121a(this);
        }
    }

    /* renamed from: l */
    private final void m18990l(AdErrorEvent adErrorEvent) {
        this.f20963k = null;
        mo14961f(adErrorEvent);
    }

    /* renamed from: m */
    private final boolean m18991m() {
        return this.f20955c.getFocusSkipButtonWhenAvailable();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0079 A[LOOP:0: B:33:0x0073->B:35:0x0079, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14935a(com.google.ads.interactivemedia.p367v3.internal.anb r6) {
        /*
            r5 = this;
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r0 = r6.f21007a
            com.google.ads.interactivemedia.v3.impl.data.c r1 = r6.f21008b
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r2 = com.google.ads.interactivemedia.p367v3.api.AdEvent.AdEventType.ALL_ADS_COMPLETED
            int r2 = r0.ordinal()
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L_0x0062
            r3 = 24
            if (r2 == r3) goto L_0x0062
            r3 = 5
            if (r2 == r3) goto L_0x0055
            r3 = 6
            if (r2 == r3) goto L_0x0048
            r3 = 20
            if (r2 == r3) goto L_0x0045
            r3 = 21
            if (r2 == r3) goto L_0x0040
            switch(r2) {
                case 13: goto L_0x0034;
                case 14: goto L_0x0062;
                case 15: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0064
        L_0x0024:
            if (r1 == 0) goto L_0x0028
            r5.f20962j = r1
        L_0x0028:
            boolean r1 = r5.m18991m()
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r5.f20954b
            r5.mo14962g(r1)
            goto L_0x0064
        L_0x0034:
            boolean r1 = r5.m18991m()
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r5.f20954b
            r5.mo14962g(r1)
            goto L_0x0064
        L_0x0040:
            com.google.ads.interactivemedia.v3.api.AdProgressInfo r1 = r6.f21011e
            r5.f20963k = r1
            goto L_0x0064
        L_0x0045:
            r5.f20962j = r1
            goto L_0x0064
        L_0x0048:
            com.google.ads.interactivemedia.v3.internal.anu r1 = r5.f20958f
            if (r1 == 0) goto L_0x004f
            r1.mo15048c()
        L_0x004f:
            com.google.ads.interactivemedia.v3.internal.ali r1 = r5.f20964l
            r1.mo14914e()
            goto L_0x0064
        L_0x0055:
            com.google.ads.interactivemedia.v3.internal.anu r1 = r5.f20958f
            if (r1 == 0) goto L_0x005c
            r1.mo15049d()
        L_0x005c:
            com.google.ads.interactivemedia.v3.internal.ali r1 = r5.f20964l
            r1.mo14913d()
            goto L_0x0064
        L_0x0062:
            r5.f20963k = r4
        L_0x0064:
            java.util.Map r6 = r6.f21009c
            com.google.ads.interactivemedia.v3.internal.all r1 = new com.google.ads.interactivemedia.v3.internal.all
            com.google.ads.interactivemedia.v3.impl.data.c r2 = r5.f20962j
            r1.<init>(r0, r2, r6)
            java.util.List r6 = r5.f20959g
            java.util.Iterator r6 = r6.iterator()
        L_0x0073:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0083
            java.lang.Object r2 = r6.next()
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventListener r2 = (com.google.ads.interactivemedia.p367v3.api.AdEvent.AdEventListener) r2
            r2.onAdEvent(r1)
            goto L_0x0073
        L_0x0083:
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.p367v3.api.AdEvent.AdEventType.COMPLETED
            if (r0 == r6) goto L_0x008d
            com.google.ads.interactivemedia.v3.api.AdEvent$AdEventType r6 = com.google.ads.interactivemedia.p367v3.api.AdEvent.AdEventType.SKIPPED
            if (r0 != r6) goto L_0x008c
            goto L_0x008d
        L_0x008c:
            return
        L_0x008d:
            r5.f20962j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.amh.mo14935a(com.google.ads.interactivemedia.v3.internal.anb):void");
    }

    public void addAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20960h.mo14972a(adErrorListener);
    }

    public void addAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f20959g.add(adEventListener);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo14959d() {
        anr anr = this.f20965m;
        if (anr != null && anr.mo15038f()) {
            Log.d("IMASDK", "OMID ad session ended on BaseManager destroy.");
        }
        anu anu = this.f20958f;
        if (anu != null) {
            anu.mo15049d();
        }
        this.f20959g.clear();
        this.f20960h.mo14974c();
        this.f20964l.mo14912c();
        this.f20953a.mo15006l(this.f20954b);
        this.f20962j = null;
        aom aom = this.f20966n;
        if (aom != null) {
            aom.mo15122b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo14960e(amw amw) {
        this.f20953a.mo15008n(new amx(amv.adsManager, amw, this.f20954b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14961f(AdErrorEvent adErrorEvent) {
        this.f20960h.mo14975d(adErrorEvent);
    }

    public void focus() {
        mo14962g(this.f20954b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo14962g(String str) {
        if (C7458yy.m22584g(this.f20961i, this.f20953a.mo14997c())) {
            this.f20953a.mo14996b().requestFocus();
            this.f20953a.mo15008n(new amx(amv.userInteraction, amw.focusUiElement, str));
        }
    }

    public AdProgressInfo getAdProgressInfo() {
        return this.f20963k;
    }

    public C6706Ad getCurrentAd() {
        return this.f20962j;
    }

    /* renamed from: h */
    public void mo14963h(AdError.AdErrorType adErrorType, int i, String str) {
        m18990l(new alk(new AdError(adErrorType, i, str)));
    }

    /* renamed from: i */
    public void mo14964i(AdError.AdErrorType adErrorType, AdError.AdErrorCode adErrorCode, String str) {
        m18990l(new alk(new AdError(adErrorType, adErrorCode, str)));
    }

    public void init() {
        init((AdsRenderingSettings) null);
    }

    /* renamed from: j */
    public void mo14965j() {
        this.f20953a.mo15008n(new amx(amv.adsManager, amw.appBackgrounding, this.f20954b));
    }

    /* renamed from: k */
    public void mo14966k() {
        this.f20953a.mo15008n(new amx(amv.adsManager, amw.appForegrounding, this.f20954b));
    }

    public void removeAdErrorListener(AdErrorEvent.AdErrorListener adErrorListener) {
        this.f20960h.mo14973b(adErrorListener);
    }

    public void removeAdEventListener(AdEvent.AdEventListener adEventListener) {
        this.f20959g.remove(adEventListener);
    }

    public void init(AdsRenderingSettings adsRenderingSettings) {
        if (adsRenderingSettings != null) {
            this.f20955c = adsRenderingSettings;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("adsRenderingSettings", C6758f.builder(this.f20955c).build());
        anu anu = this.f20958f;
        if (anu != null) {
            VideoProgressUpdate e = anu.mo15050e();
            if (!e.equals(VideoProgressUpdate.VIDEO_TIME_NOT_READY)) {
                double currentTime = (double) e.getCurrentTime();
                StringBuilder sb = new StringBuilder(68);
                sb.append("AdsManager.init -> Setting contentStartTime ");
                sb.append(currentTime);
                Log.d("IMASDK", sb.toString());
                hashMap.put("contentStartTime", Double.valueOf(currentTime));
            }
        }
        this.f20953a.mo15008n(new amx(amv.adsManager, amw.init, this.f20954b, hashMap));
    }
}
