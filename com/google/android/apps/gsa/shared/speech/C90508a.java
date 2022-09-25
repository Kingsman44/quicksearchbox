package com.google.android.apps.gsa.shared.speech;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.speech.p5224k.p5225a.C67229g;

/* renamed from: com.google.android.apps.gsa.shared.speech.a */
/* compiled from: PG */
public final class C90508a extends C90576g {

    /* renamed from: a */
    public C58833ax f253063a;

    /* renamed from: b */
    public C58833ax f253064b;

    /* renamed from: c */
    private float f253065c;

    /* renamed from: d */
    private float f253066d;

    /* renamed from: e */
    private float f253067e;

    /* renamed from: f */
    private float f253068f;

    /* renamed from: g */
    private boolean f253069g;

    /* renamed from: h */
    private boolean f253070h;

    /* renamed from: i */
    private boolean f253071i;

    /* renamed from: j */
    private long f253072j;

    /* renamed from: k */
    private C67229g f253073k;

    /* renamed from: l */
    private int f253074l;

    /* renamed from: m */
    private boolean f253075m;

    /* renamed from: n */
    private boolean f253076n;

    /* renamed from: o */
    private boolean f253077o;

    /* renamed from: p */
    private long f253078p;

    /* renamed from: q */
    private short f253079q;

    public C90508a() {
        C58836b bVar = C58836b.f156633a;
        this.f253063a = bVar;
        this.f253064b = bVar;
    }

    /* renamed from: a */
    public final HotwordResultMetadata mo84630a() {
        C67229g gVar;
        if (this.f253079q != 8191 || (gVar = this.f253073k) == null) {
            StringBuilder sb = new StringBuilder();
            if ((this.f253079q & 1) == 0) {
                sb.append(" backgroundPower");
            }
            if ((this.f253079q & 2) == 0) {
                sb.append(" hotwordPower");
            }
            if ((this.f253079q & 4) == 0) {
                sb.append(" hotwordScore");
            }
            if ((this.f253079q & 8) == 0) {
                sb.append(" speakerIdScore");
            }
            if ((this.f253079q & 16) == 0) {
                sb.append(" isVoiceUnlocked");
            }
            if ((this.f253079q & 32) == 0) {
                sb.append(" screenOn");
            }
            if ((this.f253079q & 64) == 0) {
                sb.append(" fromHotword");
            }
            if ((this.f253079q & 128) == 0) {
                sb.append(" triggerTimeMs");
            }
            if (this.f253073k == null) {
                sb.append(" alwaysOnHotwordDetectorType");
            }
            if ((this.f253079q & 256) == 0) {
                sb.append(" sampleRate");
            }
            if ((this.f253079q & 512) == 0) {
                sb.append(" isLowConfidenceTrigger");
            }
            if ((this.f253079q & 1024) == 0) {
                sb.append(" isSpeakerAuthenticated");
            }
            if ((this.f253079q & 2048) == 0) {
                sb.append(" isNearMiss");
            }
            if ((this.f253079q & 4096) == 0) {
                sb.append(" nearMissTimeMs");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        AutoValue_HotwordResultMetadata autoValue_HotwordResultMetadata = r3;
        AutoValue_HotwordResultMetadata autoValue_HotwordResultMetadata2 = new AutoValue_HotwordResultMetadata(this.f253065c, this.f253066d, this.f253067e, this.f253068f, this.f253069g, this.f253070h, this.f253071i, this.f253072j, gVar, this.f253063a, this.f253064b, this.f253074l, this.f253075m, this.f253076n, this.f253077o, this.f253078p);
        return autoValue_HotwordResultMetadata;
    }

    /* renamed from: b */
    public final void mo84631b(C67229g gVar) {
        if (gVar != null) {
            this.f253073k = gVar;
            return;
        }
        throw new NullPointerException("Null alwaysOnHotwordDetectorType");
    }

    /* renamed from: c */
    public final void mo84632c(float f) {
        this.f253065c = f;
        this.f253079q = (short) (this.f253079q | 1);
    }

    /* renamed from: d */
    public final void mo84633d(boolean z) {
        this.f253071i = z;
        this.f253079q = (short) (this.f253079q | 64);
    }

    /* renamed from: e */
    public final void mo84634e(float f) {
        this.f253066d = f;
        this.f253079q = (short) (this.f253079q | 2);
    }

    /* renamed from: f */
    public final void mo84635f(float f) {
        this.f253067e = f;
        this.f253079q = (short) (this.f253079q | 4);
    }

    /* renamed from: g */
    public final void mo84636g(boolean z) {
        this.f253075m = z;
        this.f253079q = (short) (this.f253079q | 512);
    }

    /* renamed from: h */
    public final void mo84637h(boolean z) {
        this.f253077o = z;
        this.f253079q = (short) (this.f253079q | 2048);
    }

    /* renamed from: i */
    public final void mo84638i(boolean z) {
        this.f253076n = z;
        this.f253079q = (short) (this.f253079q | 1024);
    }

    /* renamed from: j */
    public final void mo84639j(boolean z) {
        this.f253069g = z;
        this.f253079q = (short) (this.f253079q | 16);
    }

    /* renamed from: k */
    public final void mo84640k(long j) {
        this.f253078p = j;
        this.f253079q = (short) (this.f253079q | 4096);
    }

    /* renamed from: l */
    public final void mo84641l(int i) {
        this.f253074l = i;
        this.f253079q = (short) (this.f253079q | 256);
    }

    /* renamed from: m */
    public final void mo84642m(boolean z) {
        this.f253070h = z;
        this.f253079q = (short) (this.f253079q | 32);
    }

    /* renamed from: n */
    public final void mo84643n(float f) {
        this.f253068f = f;
        this.f253079q = (short) (this.f253079q | 8);
    }

    /* renamed from: o */
    public final void mo84644o(long j) {
        this.f253072j = j;
        this.f253079q = (short) (this.f253079q | 128);
    }
}
