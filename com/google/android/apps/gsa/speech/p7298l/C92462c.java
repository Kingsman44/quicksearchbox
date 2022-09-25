package com.google.android.apps.gsa.speech.p7298l;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.speech.p7261a.p7262a.C92137d;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.gsa.speech.l.c */
/* compiled from: PG */
public final class C92462c extends C92456a {

    /* renamed from: A */
    private boolean f257903A;

    /* renamed from: B */
    private boolean f257904B;

    /* renamed from: C */
    private int f257905C;

    /* renamed from: D */
    private int f257906D;

    /* renamed from: a */
    public boolean f257907a;

    /* renamed from: b */
    public Uri f257908b;

    /* renamed from: c */
    public byte[] f257909c;

    /* renamed from: d */
    public byte[] f257910d;

    /* renamed from: e */
    public C90582d f257911e;

    /* renamed from: f */
    public int f257912f;

    /* renamed from: g */
    private boolean f257913g;

    /* renamed from: h */
    private boolean f257914h;

    /* renamed from: i */
    private boolean f257915i;

    /* renamed from: j */
    private boolean f257916j;

    /* renamed from: k */
    private C67451at f257917k;

    /* renamed from: l */
    private C67451at f257918l;

    /* renamed from: m */
    private C67242t f257919m;

    /* renamed from: n */
    private int f257920n;

    /* renamed from: o */
    private int f257921o;

    /* renamed from: p */
    private int f257922p;

    /* renamed from: q */
    private boolean f257923q;

    /* renamed from: r */
    private int f257924r;

    /* renamed from: s */
    private boolean f257925s;

    /* renamed from: t */
    private C92137d f257926t;

    /* renamed from: u */
    private long f257927u;

    /* renamed from: v */
    private long f257928v;

    /* renamed from: w */
    private boolean f257929w;

    /* renamed from: x */
    private boolean f257930x;

    /* renamed from: y */
    private boolean f257931y;

    /* renamed from: z */
    private boolean f257932z;

    public C92462c() {
    }

    public C92462c(C92460b bVar) {
        C92471d dVar = (C92471d) bVar;
        this.f257907a = dVar.f257936a;
        this.f257913g = dVar.f257937b;
        this.f257914h = dVar.f257938c;
        this.f257915i = dVar.f257939d;
        this.f257916j = dVar.f257940e;
        this.f257917k = dVar.f257941f;
        this.f257918l = dVar.f257942g;
        this.f257919m = dVar.f257943h;
        this.f257920n = dVar.f257944i;
        this.f257921o = dVar.f257945j;
        this.f257922p = dVar.f257946k;
        this.f257923q = dVar.f257947l;
        this.f257908b = dVar.f257948m;
        this.f257909c = dVar.f257949n;
        this.f257910d = dVar.f257950o;
        this.f257924r = dVar.f257951p;
        this.f257925s = dVar.f257952q;
        this.f257926t = dVar.f257953r;
        this.f257927u = dVar.f257954s;
        this.f257928v = dVar.f257955t;
        this.f257929w = dVar.f257956u;
        this.f257930x = dVar.f257957v;
        this.f257906D = dVar.f257935C;
        this.f257931y = dVar.f257958w;
        this.f257911e = dVar.f257959x;
        this.f257932z = dVar.f257960y;
        this.f257903A = dVar.f257961z;
        this.f257904B = dVar.f257933A;
        this.f257905C = dVar.f257934B;
        this.f257912f = 4194303;
    }

    /* renamed from: a */
    public final C92460b mo87157a() {
        C67451at atVar;
        C67451at atVar2;
        C67242t tVar;
        C92137d dVar;
        int i;
        if (this.f257912f != 4194303 || (atVar = this.f257917k) == null || (atVar2 = this.f257918l) == null || (tVar = this.f257919m) == null || (dVar = this.f257926t) == null || (i = this.f257906D) == 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.f257912f & 1) == 0) {
                sb.append(" noiseSuppressionEnabled");
            }
            if ((this.f257912f & 2) == 0) {
                sb.append(" playBeepEnabled");
            }
            if ((this.f257912f & 4) == 0) {
                sb.append(" reportSoundLevels");
            }
            if ((this.f257912f & 8) == 0) {
                sb.append(" usePreemptibleAudioSource");
            }
            if ((this.f257912f & 16) == 0) {
                sb.append(" requestAudioFocus");
            }
            if (this.f257917k == null) {
                sb.append(" encoding");
            }
            if (this.f257918l == null) {
                sb.append(" preambleEncoding");
            }
            if (this.f257919m == null) {
                sb.append(" preambleType");
            }
            if ((this.f257912f & 32) == 0) {
                sb.append(" channelConfig");
            }
            if ((this.f257912f & 64) == 0) {
                sb.append(" mainChannel");
            }
            if ((this.f257912f & 128) == 0) {
                sb.append(" samplingRateHz");
            }
            if ((this.f257912f & 256) == 0) {
                sb.append(" preambleSamplingRateHz");
            }
            if ((this.f257912f & 512) == 0) {
                sb.append(" seamlessEnabled");
            }
            if ((this.f257912f & 1024) == 0) {
                sb.append(" preambleChannelCount");
            }
            if ((this.f257912f & 2048) == 0) {
                sb.append(" isFromOpa");
            }
            if ((this.f257912f & 4096) == 0) {
                sb.append(" downsamplingEnabled");
            }
            if (this.f257926t == null) {
                sb.append(" bargeInParams");
            }
            if ((this.f257912f & 8192) == 0) {
                sb.append(" queryCommitId");
            }
            if ((this.f257912f & 16384) == 0) {
                sb.append(" queryRequestId");
            }
            if ((this.f257912f & 32768) == 0) {
                sb.append(" usePreviousAudioSource");
            }
            if ((this.f257912f & 65536) == 0) {
                sb.append(" useCurrentAudioSource");
            }
            if (this.f257906D == 0) {
                sb.append(" microphoneType");
            }
            if ((this.f257912f & C89885b.S3REQUEST_VALUE) == 0) {
                sb.append(" canUseHapticFeedback");
            }
            if ((this.f257912f & C89885b.HTTP_VALUE) == 0) {
                sb.append(" speakerIdAdaptationEnabled");
            }
            if ((this.f257912f & 524288) == 0) {
                sb.append(" dontAllowMultiRecognitionsOnAudioStopped");
            }
            if ((this.f257912f & 1048576) == 0) {
                sb.append(" recordedAudioFromInteractor");
            }
            if ((this.f257912f & C89885b.NOW_VALUE) == 0) {
                sb.append(" preferredAsrAudioChannel");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        C92137d dVar2 = dVar;
        int i2 = i;
        return new C92471d(this.f257907a, this.f257913g, this.f257914h, this.f257915i, this.f257916j, atVar, atVar2, tVar, this.f257920n, this.f257921o, this.f257922p, this.f257923q, this.f257908b, this.f257909c, this.f257910d, this.f257924r, this.f257925s, dVar2, this.f257927u, this.f257928v, this.f257929w, this.f257930x, i2, this.f257931y, this.f257911e, this.f257932z, this.f257903A, this.f257904B, this.f257905C);
    }

    /* renamed from: b */
    public final void mo87158b(C92137d dVar) {
        if (dVar != null) {
            this.f257926t = dVar;
            return;
        }
        throw new NullPointerException("Null bargeInParams");
    }

    /* renamed from: c */
    public final void mo87159c(boolean z) {
        this.f257931y = z;
        this.f257912f |= C89885b.S3REQUEST_VALUE;
    }

    /* renamed from: d */
    public final void mo87160d(int i) {
        this.f257920n = i;
        this.f257912f |= 32;
    }

    /* renamed from: e */
    public final void mo87161e(boolean z) {
        this.f257903A = z;
        this.f257912f |= 524288;
    }

    /* renamed from: f */
    public final void mo87162f(C67451at atVar) {
        if (atVar != null) {
            this.f257917k = atVar;
            return;
        }
        throw new NullPointerException("Null encoding");
    }

    /* renamed from: g */
    public final void mo87163g(boolean z) {
        this.f257925s = z;
        this.f257912f |= 2048;
    }

    /* renamed from: h */
    public final void mo87164h(boolean z) {
        this.f257913g = z;
        this.f257912f |= 2;
    }

    /* renamed from: i */
    public final void mo87165i(int i) {
        this.f257924r = i;
        this.f257912f |= 1024;
    }

    /* renamed from: j */
    public final void mo87166j(C67451at atVar) {
        if (atVar != null) {
            this.f257918l = atVar;
            return;
        }
        throw new NullPointerException("Null preambleEncoding");
    }

    /* renamed from: k */
    public final void mo87167k(int i) {
        this.f257922p = i;
        this.f257912f |= 256;
    }

    /* renamed from: l */
    public final void mo87168l(C67242t tVar) {
        if (tVar != null) {
            this.f257919m = tVar;
            return;
        }
        throw new NullPointerException("Null preambleType");
    }

    /* renamed from: m */
    public final void mo87169m(int i) {
        this.f257905C = i;
        this.f257912f |= C89885b.NOW_VALUE;
    }

    /* renamed from: n */
    public final void mo87170n(long j) {
        this.f257927u = j;
        this.f257912f |= 8192;
    }

    /* renamed from: o */
    public final void mo87171o(long j) {
        this.f257928v = j;
        this.f257912f |= 16384;
    }

    /* renamed from: p */
    public final void mo87172p(boolean z) {
        this.f257904B = z;
        this.f257912f |= 1048576;
    }

    /* renamed from: q */
    public final void mo87173q(boolean z) {
        this.f257914h = z;
        this.f257912f |= 4;
    }

    /* renamed from: r */
    public final void mo87174r(boolean z) {
        this.f257916j = z;
        this.f257912f |= 16;
    }

    /* renamed from: s */
    public final void mo87175s(int i) {
        this.f257921o = i;
        this.f257912f |= 128;
    }

    /* renamed from: t */
    public final void mo87176t(boolean z) {
        this.f257923q = z;
        this.f257912f |= 512;
    }

    /* renamed from: u */
    public final void mo87177u(boolean z) {
        this.f257932z = z;
        this.f257912f |= C89885b.HTTP_VALUE;
    }

    /* renamed from: v */
    public final void mo87178v(boolean z) {
        this.f257930x = z;
        this.f257912f |= 65536;
    }

    /* renamed from: w */
    public final void mo87179w(boolean z) {
        this.f257915i = z;
        this.f257912f |= 8;
    }

    /* renamed from: x */
    public final void mo87180x(boolean z) {
        this.f257929w = z;
        this.f257912f |= 32768;
    }

    /* renamed from: y */
    public final void mo87181y(int i) {
        this.f257906D = i;
    }
}
