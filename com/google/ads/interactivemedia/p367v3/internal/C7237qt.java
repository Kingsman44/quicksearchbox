package com.google.ads.interactivemedia.p367v3.internal;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qt */
/* compiled from: PG */
final class C7237qt implements C7235qr {

    /* renamed from: a */
    private final int f23666a;

    /* renamed from: b */
    private MediaCodecInfo[] f23667b;

    public C7237qt(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f23666a = i;
    }

    /* renamed from: f */
    private final void m21650f() {
        if (this.f23667b == null) {
            this.f23667b = new MediaCodecList(this.f23666a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final int mo16334a() {
        m21650f();
        return this.f23667b.length;
    }

    /* renamed from: b */
    public final MediaCodecInfo mo16335b(int i) {
        m21650f();
        return this.f23667b[i];
    }

    /* renamed from: c */
    public final boolean mo16336c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo16337d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: e */
    public final boolean mo16338e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }
}
