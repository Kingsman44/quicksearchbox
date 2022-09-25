package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qg */
/* compiled from: PG */
public final class C7224qg {

    /* renamed from: a */
    public final String f23577a;

    /* renamed from: b */
    public final String f23578b;

    /* renamed from: c */
    public final String f23579c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f23580d;

    /* renamed from: e */
    public final boolean f23581e;

    /* renamed from: f */
    public final boolean f23582f;

    /* renamed from: g */
    private final boolean f23583g;

    private C7224qg(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        ary.m19467t(str);
        this.f23577a = str;
        this.f23578b = str2;
        this.f23579c = str3;
        this.f23580d = codecCapabilities;
        boolean z3 = true;
        this.f23581e = !z && codecCapabilities != null && aeu.f20466a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && aeu.f20466a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (!z2 && (codecCapabilities == null || aeu.f20466a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f23582f = z3;
        this.f23583g = adz.m18350b(str2);
    }

    /* renamed from: a */
    public static C7224qg m21560a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C7224qg(str, str2, str3, codecCapabilities, z4, z5);
    }

    /* renamed from: h */
    private final void m21561h(String str) {
        String str2 = this.f23577a;
        String str3 = this.f23578b;
        String str4 = aeu.f20470e;
        int length = String.valueOf(str).length();
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + str3.length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    /* renamed from: i */
    private static boolean m21562i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point j = m21563j(videoCapabilities, i, i2);
        int i3 = j.x;
        int i4 = j.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: j */
    private static Point m21563j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(aeu.m18488F(i, widthAlignment) * widthAlignment, aeu.m18488F(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: b */
    public final MediaCodecInfo.CodecProfileLevel[] mo16307b() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23580d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f23580d.profileLevels;
    }

    /* renamed from: c */
    public final boolean mo16308c(C6864cy cyVar) {
        int i;
        String h;
        String str = cyVar.f21809i;
        boolean z = false;
        if (!(str == null || (h = adz.m18356h(str)) == null)) {
            if (!this.f23578b.equals(h)) {
                String str2 = cyVar.f21809i;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + h.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(h);
                m21561h(sb.toString());
            } else {
                Pair e = C7239qv.m21661e(cyVar);
                if (e != null) {
                    int intValue = ((Integer) e.first).intValue();
                    int intValue2 = ((Integer) e.second).intValue();
                    if (!this.f23583g) {
                        if (intValue == 42) {
                            intValue = 42;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel[] b = mo16307b();
                    int length = b.length;
                    int i2 = 0;
                    while (i2 < length) {
                        MediaCodecInfo.CodecProfileLevel codecProfileLevel = b[i2];
                        if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2) {
                            i2++;
                        }
                    }
                    String str3 = cyVar.f21809i;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + h.length());
                    sb2.append("codec.profileLevel, ");
                    sb2.append(str3);
                    sb2.append(", ");
                    sb2.append(h);
                    m21561h(sb2.toString());
                }
            }
            return false;
        }
        if (!this.f23583g) {
            if (aeu.f20466a >= 21) {
                int i3 = cyVar.f21826z;
                if (i3 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23580d;
                    if (codecCapabilities == null) {
                        m21561h("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m21561h("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i3)) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("sampleRate.support, ");
                        sb3.append(i3);
                        m21561h(sb3.toString());
                        return false;
                    }
                }
                int i4 = cyVar.f21825y;
                if (i4 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f23580d;
                    if (codecCapabilities2 == null) {
                        m21561h("channelCount.caps");
                    } else {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            m21561h("channelCount.aCaps");
                        } else {
                            String str4 = this.f23577a;
                            String str5 = this.f23578b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((aeu.f20466a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                                if ("audio/ac3".equals(str5)) {
                                    i = 6;
                                } else {
                                    i = "audio/eac3".equals(str5) ? 16 : 30;
                                }
                                StringBuilder sb4 = new StringBuilder(str4.length() + 59);
                                sb4.append("AssumedMaxChannelAdjustment: ");
                                sb4.append(str4);
                                sb4.append(", [");
                                sb4.append(maxInputChannelCount);
                                sb4.append(" to ");
                                sb4.append(i);
                                sb4.append("]");
                                Log.w("MediaCodecInfo", sb4.toString());
                                maxInputChannelCount = i;
                            }
                            if (maxInputChannelCount < i4) {
                                StringBuilder sb5 = new StringBuilder(33);
                                sb5.append("channelCount.support, ");
                                sb5.append(i4);
                                m21561h(sb5.toString());
                            }
                        }
                    }
                    return false;
                }
            }
            return true;
        } else if (cyVar.f21817q <= 0 || cyVar.f21818r <= 0) {
            return true;
        } else {
            if (aeu.f20466a >= 21) {
                return mo16311f(cyVar.f21817q, cyVar.f21818r, (double) cyVar.f21819s);
            }
            if (cyVar.f21817q * cyVar.f21818r <= C7239qv.m21660d()) {
                z = true;
            }
            if (!z) {
                int i5 = cyVar.f21817q;
                int i6 = cyVar.f21818r;
                StringBuilder sb6 = new StringBuilder(40);
                sb6.append("legacyFrameSize, ");
                sb6.append(i5);
                sb6.append("x");
                sb6.append(i6);
                m21561h(sb6.toString());
            }
            return z;
        }
    }

    /* renamed from: d */
    public final boolean mo16309d(C6864cy cyVar) {
        if (this.f23583g) {
            return this.f23581e;
        }
        Pair e = C7239qv.m21661e(cyVar);
        return e != null && ((Integer) e.first).intValue() == 42;
    }

    /* renamed from: e */
    public final boolean mo16310e(C6864cy cyVar, C6864cy cyVar2, boolean z) {
        if (this.f23583g) {
            String str = cyVar.f21812l;
            ary.m19467t(str);
            if (!str.equals(cyVar2.f21812l) || cyVar.f21820t != cyVar2.f21820t || ((!this.f23581e && (cyVar.f21817q != cyVar2.f21817q || cyVar.f21818r != cyVar2.f21818r)) || ((z || cyVar2.f21824x != null) && !aeu.m18533c(cyVar.f21824x, cyVar2.f21824x)))) {
                return false;
            }
            return true;
        }
        if ("audio/mp4a-latm".equals(this.f23578b)) {
            String str2 = cyVar.f21812l;
            ary.m19467t(str2);
            if (str2.equals(cyVar2.f21812l) && cyVar.f21825y == cyVar2.f21825y && cyVar.f21826z == cyVar2.f21826z) {
                Pair e = C7239qv.m21661e(cyVar);
                Pair e2 = C7239qv.m21661e(cyVar2);
                if (!(e == null || e2 == null)) {
                    return ((Integer) e.first).intValue() == 42 && ((Integer) e2.first).intValue() == 42;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo16311f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23580d;
        if (codecCapabilities == null) {
            m21561h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m21561h("sizeAndRate.vCaps");
            return false;
        } else if (m21562i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f23577a) && "mcv5a".equals(aeu.f20467b)) || !m21562i(videoCapabilities, i2, i, d))) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("sizeAndRate.support, ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                sb.append("x");
                sb.append(d);
                m21561h(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder(69);
            sb2.append("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            sb2.append("x");
            sb2.append(d);
            String sb3 = sb2.toString();
            String str = this.f23577a;
            String str2 = this.f23578b;
            String str3 = aeu.f20470e;
            int length = str.length();
            int length2 = str2.length();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 25 + length + length2 + String.valueOf(str3).length());
            sb4.append("AssumedSupport [");
            sb4.append(sb3);
            sb4.append("] [");
            sb4.append(str);
            sb4.append(", ");
            sb4.append(str2);
            sb4.append("] [");
            sb4.append(str3);
            sb4.append("]");
            Log.d("MediaCodecInfo", sb4.toString());
            return true;
        }
    }

    /* renamed from: g */
    public final Point mo16312g(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f23580d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m21563j(videoCapabilities, i, i2);
    }

    public final String toString() {
        return this.f23577a;
    }
}
