package com.google.android.apps.search.transcription.p10670f;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.transcription.f.g */
/* compiled from: PG */
final class C141872g extends C141855c {

    /* renamed from: a */
    private Optional f384970a = Optional.empty();

    /* renamed from: b */
    private Optional f384971b = Optional.empty();

    /* renamed from: c */
    private int f384972c;

    /* renamed from: d */
    private int f384973d;

    /* renamed from: e */
    private int f384974e;

    /* renamed from: f */
    private boolean f384975f;

    /* renamed from: g */
    private byte f384976g;

    /* renamed from: a */
    public final int mo116844a() {
        if ((this.f384976g & 2) != 0) {
            return this.f384973d;
        }
        throw new IllegalStateException("Property \"channelCount\" has not been set");
    }

    /* renamed from: b */
    public final C141860d mo116845b() {
        if (this.f384976g == 15) {
            return new C141914h(this.f384970a, this.f384971b, this.f384972c, this.f384973d, this.f384974e, this.f384975f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f384976g & 1) == 0) {
            sb.append(" samplingRate");
        }
        if ((this.f384976g & 2) == 0) {
            sb.append(" channelCount");
        }
        if ((this.f384976g & 4) == 0) {
            sb.append(" encoding");
        }
        if ((this.f384976g & 8) == 0) {
            sb.append(" isFromMic");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: d */
    public final void mo116847d(int i) {
        this.f384973d = i;
        this.f384976g = (byte) (this.f384976g | 2);
    }

    /* renamed from: e */
    public final void mo116848e(int i) {
        this.f384974e = i;
        this.f384976g = (byte) (this.f384976g | 4);
    }

    /* renamed from: f */
    public final void mo116849f(Optional optional) {
        if (optional != null) {
            this.f384971b = optional;
            return;
        }
        throw new NullPointerException("Null fileDescriptor");
    }

    /* renamed from: g */
    public final void mo116850g(boolean z) {
        this.f384975f = z;
        this.f384976g = (byte) (this.f384976g | 8);
    }

    /* renamed from: h */
    public final void mo116851h(int i) {
        this.f384972c = i;
        this.f384976g = (byte) (this.f384976g | 1);
    }

    /* renamed from: i */
    public final void mo116852i(Optional optional) {
        if (optional != null) {
            this.f384970a = optional;
            return;
        }
        throw new NullPointerException("Null uri");
    }
}
