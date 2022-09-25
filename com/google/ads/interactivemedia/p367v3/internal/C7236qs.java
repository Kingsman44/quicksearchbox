package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qs */
/* compiled from: PG */
final class C7236qs implements C7235qr {
    private C7236qs() {
    }

    public /* synthetic */ C7236qs(byte[] bArr) {
    }

    /* renamed from: a */
    public final int mo16334a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: b */
    public final MediaCodecInfo mo16335b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: c */
    public final boolean mo16336c() {
        return false;
    }

    /* renamed from: d */
    public final boolean mo16337d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* renamed from: e */
    public final boolean mo16338e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }
}
