package com.google.android.gms.cast;

import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.ar */
/* compiled from: PG */
public final class C143360ar {

    /* renamed from: a */
    public MediaInfo f388807a;

    /* renamed from: b */
    public MediaQueueData f388808b;

    /* renamed from: c */
    public Boolean f388809c = true;

    /* renamed from: d */
    public long f388810d = -1;

    /* renamed from: e */
    public long[] f388811e;

    /* renamed from: f */
    public JSONObject f388812f;

    /* renamed from: g */
    public String f388813g;

    /* renamed from: h */
    public String f388814h;

    /* renamed from: i */
    public String f388815i;

    /* renamed from: j */
    public String f388816j;

    /* renamed from: k */
    public long f388817k;

    /* renamed from: l */
    private double f388818l = 1.0d;

    /* renamed from: a */
    public final MediaLoadRequestData mo118510a() {
        return new MediaLoadRequestData(this.f388807a, this.f388808b, this.f388809c, this.f388810d, this.f388818l, this.f388811e, this.f388812f, this.f388813g, this.f388814h, this.f388815i, this.f388816j, this.f388817k);
    }

    /* renamed from: b */
    public final void mo118511b(double d) {
        if (Double.compare(d, 2.0d) > 0 || Double.compare(d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        this.f388818l = d;
    }
}
