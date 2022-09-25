package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.ads.interactivemedia.p367v3.api.AdError;
import com.google.ads.interactivemedia.p367v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.p367v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.p367v3.api.player.ResizablePlayer;
import com.google.ads.interactivemedia.p367v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.p367v3.api.player.VideoStreamPlayer;
import com.google.ads.interactivemedia.p367v3.impl.data.C6740bf;
import com.google.ads.interactivemedia.p367v3.impl.data.C6749bo;
import com.google.ads.interactivemedia.p367v3.impl.data.C6754bt;
import com.google.ads.interactivemedia.p367v3.impl.data.C6755c;
import com.google.ads.interactivemedia.p367v3.impl.data.ResizeAndPositionVideoMsgData;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.anz */
/* compiled from: PG */
public final class anz implements VideoStreamPlayer.VideoStreamPlayerCallback, aoa, ant {

    /* renamed from: a */
    private VideoStreamPlayer f21083a;

    /* renamed from: b */
    private ane f21084b;

    /* renamed from: c */
    private final anw f21085c;

    /* renamed from: d */
    private boolean f21086d = false;

    /* renamed from: e */
    private aob f21087e;

    /* renamed from: f */
    private final String f21088f;

    /* renamed from: g */
    private String f21089g;

    /* renamed from: h */
    private final StreamDisplayContainer f21090h;

    /* renamed from: i */
    private anu f21091i;

    public anz(String str, ane ane, anw anw, StreamDisplayContainer streamDisplayContainer, String str2) {
        VideoStreamPlayer videoStreamPlayer = streamDisplayContainer.getVideoStreamPlayer();
        this.f21083a = videoStreamPlayer;
        if (videoStreamPlayer != null) {
            this.f21085c = anw;
            this.f21088f = str;
            this.f21084b = ane;
            this.f21089g = str2;
            this.f21086d = false;
            this.f21090h = streamDisplayContainer;
            this.f21091i = null;
            this.f21091i = new anu(videoStreamPlayer);
            this.f21087e = null;
            this.f21087e = new aob(ane.mo14996b(), streamDisplayContainer.getAdContainer());
            return;
        }
        throw new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INVALID_ARGUMENTS, "Server-side ad insertion player was not provided.");
    }

    /* renamed from: o */
    private final void m19101o(amw amw, Object obj) {
        this.f21084b.mo15008n(new amx(amv.videoDisplay1, amw, this.f21088f, obj));
    }

    /* renamed from: a */
    public final void mo14971a(VideoProgressUpdate videoProgressUpdate) {
        if (!this.f21086d) {
            m19101o(amw.start, C6754bt.builder().volumePercentage(this.f21083a.getVolume()).build());
            this.f21086d = true;
        }
        m19101o(amw.timeupdate, C6749bo.create(videoProgressUpdate));
    }

    /* renamed from: b */
    public final void mo15056b() {
        C7458yy.m22580c("Destroying StreamVideoDisplay");
        this.f21083a.removeCallback(this);
        this.f21083a = null;
        this.f21084b = null;
        anu anu = this.f21091i;
        if (anu != null) {
            anu.mo15049d();
            this.f21091i.mo15047b(this);
        }
        this.f21091i = null;
        this.f21087e.mo15070b();
    }

    /* renamed from: c */
    public final void mo15057c() {
        this.f21083a.onAdBreakStarted();
    }

    /* renamed from: d */
    public final void mo15023d(amv amv, amw amw, C6740bf bfVar) {
        String str;
        String str2;
        amw amw2 = amw.activate;
        int ordinal = amw.ordinal();
        if (ordinal != 44) {
            if (ordinal == 51) {
                this.f21083a.pause();
            } else if (ordinal == 52) {
                this.f21083a.resume();
            }
        } else if (bfVar == null || bfVar.streamUrl == null) {
            this.f21085c.mo14961f(new alk(new AdError(AdError.AdErrorType.LOAD, AdError.AdErrorCode.INTERNAL_ERROR, "Load message must contain video url.")));
        } else {
            int i = 0;
            this.f21086d = false;
            this.f21091i.mo15048c();
            String str3 = bfVar.streamUrl;
            if (!(str3 == null || (str = this.f21089g) == null || str.length() == 0)) {
                String trim = str.trim();
                String str4 = BuildConfig.FLAVOR;
                String replaceAll = trim.replaceAll("\\s+", str4);
                if (replaceAll.charAt(0) == '?') {
                    replaceAll = replaceAll.substring(1);
                }
                if (replaceAll.length() != 0) {
                    Map a = C7458yy.m22578a(Uri.parse(str3));
                    HashMap hashMap = new HashMap();
                    Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                    buildUpon.clearQuery();
                    String valueOf = String.valueOf(replaceAll);
                    if (valueOf.length() != 0) {
                        str2 = "http://www.dom.com/path?".concat(valueOf);
                    } else {
                        str2 = new String("http://www.dom.com/path?");
                    }
                    Map a2 = C7458yy.m22578a(Uri.parse(str2));
                    hashMap.putAll(a2);
                    if (!a.isEmpty()) {
                        for (String str5 : a.keySet()) {
                            if (!a2.containsKey(str5)) {
                                hashMap.put(str5, (String) a.get(str5));
                            }
                        }
                    }
                    if (hashMap.size() != 0) {
                        StringBuilder sb = new StringBuilder();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            sb.append((String) entry.getKey());
                            sb.append("=");
                            sb.append((String) entry.getValue());
                            if (i < hashMap.size() - 1) {
                                sb.append("&");
                            }
                            i++;
                        }
                        str4 = sb.toString();
                    }
                    buildUpon.encodedQuery(str4);
                    str3 = buildUpon.build().toString();
                }
            }
            this.f21083a.loadUrl(str3, bfVar.subtitles);
        }
    }

    /* renamed from: e */
    public final void mo15058e() {
        this.f21083a.onAdBreakEnded();
        mo15064k();
    }

    /* renamed from: f */
    public final void mo15059f() {
        this.f21083a.onAdPeriodStarted();
    }

    /* renamed from: g */
    public final void mo15060g() {
        this.f21083a.onAdPeriodEnded();
    }

    public final VideoProgressUpdate getAdProgress() {
        return this.f21083a.getContentProgress();
    }

    /* renamed from: h */
    public final void mo15061h(long j) {
        this.f21083a.seek(j);
    }

    /* renamed from: i */
    public final void mo15062i() {
        this.f21083a.addCallback(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo15063j(C6755c cVar) {
        if (cVar.isLinear()) {
            this.f21087e.mo15069a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo15064k() {
        this.f21087e.mo15070b();
    }

    /* renamed from: l */
    public final void mo15065l(ResizeAndPositionVideoMsgData resizeAndPositionVideoMsgData) {
        if (!(this.f21083a instanceof ResizablePlayer)) {
            C7458yy.m22583f("Stream player does not support resizing.");
        } else if (!C7458yy.m22579b(this.f21090h, resizeAndPositionVideoMsgData)) {
            C7458yy.m22583f("Video resize parameters were not within the container bounds.");
        } else {
            int width = this.f21090h.getAdContainer().getWidth();
            int height = this.f21090h.getAdContainer().getHeight();
            int intValue = resizeAndPositionVideoMsgData.mo13984x().intValue();
            int intValue2 = resizeAndPositionVideoMsgData.width().intValue();
            int intValue3 = resizeAndPositionVideoMsgData.mo13985y().intValue();
            ((ResizablePlayer) this.f21083a).resize(resizeAndPositionVideoMsgData.mo13984x().intValue(), resizeAndPositionVideoMsgData.mo13985y().intValue(), (width - intValue) - intValue2, (height - intValue3) - resizeAndPositionVideoMsgData.height().intValue());
        }
    }

    /* renamed from: m */
    public final void mo15066m() {
        VideoStreamPlayer videoStreamPlayer = this.f21083a;
        if (videoStreamPlayer instanceof ResizablePlayer) {
            ((ResizablePlayer) videoStreamPlayer).resize(0, 0, 0, 0);
        }
    }

    /* renamed from: n */
    public final void mo15067n() {
        this.f21091i.mo15046a(this);
    }

    public final void onAdError(AdErrorEvent adErrorEvent) {
    }

    public final void onContentComplete() {
        this.f21084b.mo15008n(new amx(amv.adsLoader, amw.contentComplete, "*"));
    }

    public final void onPause() {
        m19101o(amw.pause, (Object) null);
    }

    public final void onResume() {
        m19101o(amw.play, (Object) null);
    }

    public final void onUserTextReceived(String str) {
        m19101o(amw.timedMetadata, any.create(str));
    }

    public final void onVolumeChanged(int i) {
        m19101o(amw.volumeChange, C6754bt.builder().volumePercentage(i).build());
    }
}
