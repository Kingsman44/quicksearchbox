package androidx.media3.exoplayer.p142e;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.exoplayer.C3187i;

/* renamed from: androidx.media3.exoplayer.e.s */
/* compiled from: PG */
public final class C2989s {

    /* renamed from: a */
    public final String f8587a;

    /* renamed from: b */
    public final String f8588b;

    /* renamed from: c */
    public final String f8589c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f8590d;

    /* renamed from: e */
    public final boolean f8591e;

    /* renamed from: f */
    public final boolean f8592f;

    /* renamed from: g */
    public final boolean f8593g;

    /* renamed from: h */
    private final boolean f8594h;

    /* renamed from: a */
    public static Point m8460a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C2612ak.m6979d(i, widthAlignment) * widthAlignment, C2612ak.m6979d(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: g */
    private final void m8461g(String str) {
        String str2 = this.f8587a;
        String str3 = this.f8588b;
        String str4 = C2612ak.f7253e;
        C2633u.m7047b("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    /* renamed from: h */
    private static boolean m8462h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = m8460a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: b */
    public final C3187i mo6903b(C2680x xVar, C2680x xVar2) {
        int i = true != C2612ak.m6951aa(xVar.f7496n, xVar2.f7496n) ? 8 : 0;
        if (this.f8594h) {
            if (xVar.f7504v != xVar2.f7504v) {
                i |= 1024;
            }
            if (!this.f8591e && !(xVar.f7501s == xVar2.f7501s && xVar.f7502t == xVar2.f7502t)) {
                i |= 512;
            }
            if (!C2612ak.m6951aa(xVar.f7508z, xVar2.f7508z)) {
                i |= 2048;
            }
            String str = this.f8587a;
            if (C2612ak.f7252d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !xVar.mo6359d(xVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C3187i(this.f8587a, xVar, xVar2, true != xVar.mo6359d(xVar2) ? 2 : 3, 0);
            }
        } else {
            if (xVar.f7477A != xVar2.f7477A) {
                i |= 4096;
            }
            if (xVar.f7478B != xVar2.f7478B) {
                i |= 8192;
            }
            if (xVar.f7479C != xVar2.f7479C) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f8588b)) {
                Pair a = C2970af.m8385a(xVar);
                Pair a2 = C2970af.m8385a(xVar2);
                if (!(a == null || a2 == null)) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C3187i(this.f8587a, xVar, xVar2, 3, 0);
                    }
                }
            }
            if (!xVar.mo6359d(xVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f8588b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C3187i(this.f8587a, xVar, xVar2, 1, 0);
            }
        }
        return new C3187i(this.f8587a, xVar, xVar2, 0, i);
    }

    /* renamed from: c */
    public final boolean mo6904c(C2680x xVar) {
        int i;
        Pair a;
        if (!this.f8588b.equals(xVar.f7496n) && !this.f8588b.equals(C2970af.m8387c(xVar))) {
            return false;
        }
        if (!(xVar.f7493k == null || (a = C2970af.m8385a(xVar)) == null)) {
            int intValue = ((Integer) a.first).intValue();
            int intValue2 = ((Integer) a.second).intValue();
            if ("video/dolby-vision".equals(xVar.f7496n)) {
                if ("video/avc".equals(this.f8588b)) {
                    intValue = 8;
                    intValue2 = 0;
                } else if ("video/hevc".equals(this.f8588b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (!this.f8594h) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] f = mo6907f();
            int i2 = C2612ak.f7249a;
            int length = f.length;
            int i3 = 0;
            while (i3 < length) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = f[i3];
                if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2 || ("video/hevc".equals(this.f8588b) && intValue == 2 && ("sailfish".equals(C2612ak.f7250b) || "marlin".equals(C2612ak.f7250b)))) {
                    i3++;
                }
            }
            String str = xVar.f7493k;
            String str2 = this.f8589c;
            m8461g("codec.profileLevel, " + str + ", " + str2);
            return false;
        }
        if (!this.f8594h) {
            int i4 = C2612ak.f7249a;
            int i5 = xVar.f7478B;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8590d;
                if (codecCapabilities == null) {
                    m8461g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    m8461g("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i5)) {
                    m8461g("sampleRate.support, " + i5);
                    return false;
                }
            }
            int i6 = xVar.f7477A;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f8590d;
                if (codecCapabilities2 == null) {
                    m8461g("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        m8461g("channelCount.aCaps");
                    } else {
                        String str3 = this.f8587a;
                        String str4 = this.f8588b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4)) {
                            if ("audio/ac3".equals(str4)) {
                                i = 6;
                            } else {
                                i = "audio/eac3".equals(str4) ? 16 : 30;
                            }
                            C2633u.m7050e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i6) {
                            m8461g("channelCount.support, " + i6);
                        }
                    }
                }
                return false;
            }
            return true;
        } else if (xVar.f7501s <= 0 || xVar.f7502t <= 0) {
            return true;
        } else {
            int i7 = C2612ak.f7249a;
            return mo6906e(xVar.f7501s, xVar.f7502t, (double) xVar.f7503u);
        }
    }

    /* renamed from: d */
    public final boolean mo6905d(C2680x xVar) {
        if (this.f8594h) {
            return this.f8591e;
        }
        Pair a = C2970af.m8385a(xVar);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    /* renamed from: e */
    public final boolean mo6906e(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8590d;
        if (codecCapabilities == null) {
            m8461g("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m8461g("sizeAndRate.vCaps");
            return false;
        } else if (m8462h(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f8587a) && "mcv5a".equals(C2612ak.f7250b)) || !m8462h(videoCapabilities, i2, i, d))) {
                m8461g("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            C2633u.m7047b("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d) + "] [" + this.f8587a + ", " + this.f8588b + "] [" + C2612ak.f7253e + "]");
            return true;
        }
    }

    /* renamed from: f */
    public final MediaCodecInfo.CodecProfileLevel[] mo6907f() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8590d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f8590d.profileLevels;
    }

    public final String toString() {
        return this.f8587a;
    }

    public C2989s(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f8587a = str;
        this.f8588b = str2;
        this.f8589c = str3;
        this.f8590d = codecCapabilities;
        this.f8593g = z;
        this.f8591e = z2;
        this.f8592f = z3;
        this.f8594h = C2598ay.m6817p(str2);
    }
}
