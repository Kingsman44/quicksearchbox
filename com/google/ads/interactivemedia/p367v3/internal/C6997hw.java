package com.google.ads.interactivemedia.p367v3.internal;

import android.media.AudioAttributes;
import android.media.AudioTrack;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hw */
/* compiled from: PG */
final class C6997hw {

    /* renamed from: a */
    public final C6864cy f22324a;

    /* renamed from: b */
    public final int f22325b;

    /* renamed from: c */
    public final int f22326c;

    /* renamed from: d */
    public final int f22327d;

    /* renamed from: e */
    public final int f22328e;

    /* renamed from: f */
    public final int f22329f;

    /* renamed from: g */
    public final int f22330g;

    /* renamed from: h */
    public final int f22331h;

    /* renamed from: i */
    public final boolean f22332i;

    /* renamed from: j */
    public final C6971gx[] f22333j;

    /* renamed from: e */
    private final int m20637e(long j) {
        int i;
        int i2 = this.f22330g;
        switch (i2) {
            case 5:
                i = 80000;
                break;
            case 6:
            case 18:
                i = 768000;
                break;
            case 7:
                i = 192000;
                break;
            case 8:
                i = 2250000;
                break;
            case 9:
                i = 40000;
                break;
            case 10:
                i = 100000;
                break;
            case 11:
                i = 16000;
                break;
            case 12:
                i = 7000;
                break;
            case 14:
                i = 3062500;
                break;
            case 15:
                i = 8000;
                break;
            case 16:
                i = 256000;
                break;
            case 17:
                i = 336000;
                break;
            default:
                throw new IllegalArgumentException();
        }
        if (i2 == 5) {
            i += i;
        }
        return (int) ((j * ((long) i)) / 1000000);
    }

    /* renamed from: f */
    private static AudioAttributes m20638f(C6966gs gsVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return gsVar.mo15885a();
    }

    /* renamed from: a */
    public final long mo15991a(long j) {
        return (j * 1000000) / ((long) this.f22328e);
    }

    /* renamed from: b */
    public final long mo15992b(long j) {
        return (j * ((long) this.f22328e)) / 1000000;
    }

    /* renamed from: c */
    public final AudioTrack mo15993c(boolean z, C6966gs gsVar, int i) {
        AudioTrack audioTrack;
        try {
            if (aeu.f20466a >= 29) {
                audioTrack = new AudioTrack.Builder().setAudioAttributes(m20638f(gsVar, z)).setAudioFormat(C7006ie.m20692X(this.f22328e, this.f22329f, this.f22330g)).setTransferMode(1).setBufferSizeInBytes(this.f22331h).setSessionId(i).setOffloadedPlayback(this.f22326c == 1).build();
            } else if (aeu.f20466a >= 21) {
                audioTrack = new AudioTrack(m20638f(gsVar, z), C7006ie.m20692X(this.f22328e, this.f22329f, this.f22330g), this.f22331h, 1, i);
            } else {
                int i2 = gsVar.f22226c;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.f22328e, this.f22329f, this.f22330g, this.f22331h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f22328e, this.f22329f, this.f22330g, this.f22331h, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new C6985hk(state, this.f22328e, this.f22329f, this.f22331h, mo15994d(), (Exception) null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C6985hk(0, this.f22328e, this.f22329f, this.f22331h, mo15994d(), e);
        }
    }

    /* renamed from: d */
    public final boolean mo15994d() {
        return this.f22326c == 1;
    }

    public C6997hw(C6864cy cyVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, C6971gx[] gxVarArr) {
        int i7;
        this.f22324a = cyVar;
        this.f22325b = i;
        this.f22326c = i2;
        this.f22327d = i3;
        this.f22328e = i4;
        this.f22329f = i5;
        this.f22330g = i6;
        this.f22332i = z2;
        this.f22333j = gxVarArr;
        boolean z3 = true;
        if (i2 != 0) {
            i7 = i2 != 1 ? m20637e(250000) : m20637e(50000000);
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
            ary.m19464q(minBufferSize == -2 ? false : z3);
            i7 = aeu.m18490H(minBufferSize * 4, ((int) mo15992b(250000)) * i3, Math.max(minBufferSize, ((int) mo15992b(750000)) * i3));
        }
        this.f22331h = i7;
    }
}
