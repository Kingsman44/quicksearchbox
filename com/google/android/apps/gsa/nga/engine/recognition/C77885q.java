package com.google.android.apps.gsa.nga.engine.recognition;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.q */
/* compiled from: PG */
public final class C77885q {

    /* renamed from: a */
    public int f214546a;

    /* renamed from: b */
    public Optional f214547b = Optional.empty();

    /* renamed from: c */
    public Optional f214548c = Optional.empty();

    /* renamed from: d */
    public Optional f214549d = Optional.empty();

    /* renamed from: e */
    public Optional f214550e = Optional.empty();

    /* renamed from: f */
    public Optional f214551f = Optional.empty();

    /* renamed from: g */
    public byte f214552g;

    /* renamed from: h */
    public int f214553h;

    /* renamed from: i */
    private int f214554i;

    /* renamed from: j */
    private int f214555j;

    /* renamed from: k */
    private Optional f214556k = Optional.empty();

    /* renamed from: l */
    private boolean f214557l;

    /* renamed from: m */
    private boolean f214558m;

    public C77885q() {
    }

    /* renamed from: a */
    public final C77566as mo72859a() {
        int i;
        if (this.f214552g == 31 && (i = this.f214553h) != 0) {
            return new C77886r(i, this.f214554i, this.f214555j, this.f214546a, this.f214547b, this.f214556k, this.f214548c, this.f214549d, this.f214550e, this.f214557l, this.f214558m, this.f214551f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f214553h == 0) {
            sb.append(" type");
        }
        if ((this.f214552g & 1) == 0) {
            sb.append(" sampleRate");
        }
        if ((this.f214552g & 2) == 0) {
            sb.append(" channelConfig");
        }
        if ((this.f214552g & 4) == 0) {
            sb.append(" encoding");
        }
        if ((this.f214552g & 8) == 0) {
            sb.append(" requestZeroLatencyMic");
        }
        if ((this.f214552g & 16) == 0) {
            sb.append(" failFastIfOpNotAllowed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72860b(int i) {
        this.f214555j = i;
        this.f214552g = (byte) (this.f214552g | 2);
    }

    /* renamed from: c */
    public final void mo72861c(boolean z) {
        this.f214558m = z;
        this.f214552g = (byte) (this.f214552g | 16);
    }

    /* renamed from: d */
    public final void mo72862d(boolean z) {
        this.f214557l = z;
        this.f214552g = (byte) (this.f214552g | 8);
    }

    /* renamed from: e */
    public final void mo72863e(int i) {
        this.f214554i = i;
        this.f214552g = (byte) (this.f214552g | 1);
    }

    /* renamed from: f */
    public final void mo72864f(Optional optional) {
        if (optional != null) {
            this.f214556k = optional;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    public C77885q(C77566as asVar) {
        C77886r rVar = (C77886r) asVar;
        this.f214553h = rVar.f214570l;
        this.f214554i = rVar.f214559a;
        this.f214555j = rVar.f214560b;
        this.f214546a = rVar.f214561c;
        this.f214547b = rVar.f214562d;
        this.f214556k = rVar.f214563e;
        this.f214548c = rVar.f214564f;
        this.f214549d = rVar.f214565g;
        this.f214550e = rVar.f214566h;
        this.f214557l = rVar.f214567i;
        this.f214558m = rVar.f214568j;
        this.f214551f = rVar.f214569k;
        this.f214552g = 31;
    }
}
