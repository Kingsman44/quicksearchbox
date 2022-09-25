package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7468b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.b.d */
/* compiled from: PG */
public final class C94906d extends C94927y {

    /* renamed from: a */
    public Optional f265457a = Optional.empty();

    /* renamed from: b */
    public int f265458b;

    /* renamed from: c */
    private int f265459c;

    /* renamed from: d */
    private boolean f265460d;

    /* renamed from: e */
    private int f265461e;

    /* renamed from: f */
    private int f265462f;

    /* renamed from: g */
    private byte f265463g;

    /* renamed from: h */
    private int f265464h;

    /* renamed from: a */
    public final C94928z mo88781a() {
        int i;
        int i2;
        if (this.f265463g == 15 && (i = this.f265464h) != 0 && (i2 = this.f265458b) != 0) {
            return new C94907e(this.f265459c, i, i2, this.f265460d, this.f265461e, this.f265462f, this.f265457a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f265463g & 1) == 0) {
            sb.append(" audioFormat");
        }
        if (this.f265464h == 0) {
            sb.append(" responseType");
        }
        if (this.f265458b == 0) {
            sb.append(" voiceMode");
        }
        if ((this.f265463g & 2) == 0) {
            sb.append(" sendRecognizedText");
        }
        if ((this.f265463g & 4) == 0) {
            sb.append(" sampleRate");
        }
        if ((this.f265463g & 8) == 0) {
            sb.append(" numChannels");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo88782b(int i) {
        this.f265459c = i;
        this.f265463g = (byte) (this.f265463g | 1);
    }

    /* renamed from: c */
    public final void mo88783c(int i) {
        this.f265462f = i;
        this.f265463g = (byte) (this.f265463g | 8);
    }

    /* renamed from: d */
    public final void mo88784d(int i) {
        this.f265461e = i;
        this.f265463g = (byte) (this.f265463g | 4);
    }

    /* renamed from: e */
    public final void mo88785e(boolean z) {
        this.f265460d = z;
        this.f265463g = (byte) (this.f265463g | 2);
    }

    /* renamed from: f */
    public final void mo88786f(int i) {
        if (i != 0) {
            this.f265464h = i;
            return;
        }
        throw new NullPointerException("Null responseType");
    }
}
