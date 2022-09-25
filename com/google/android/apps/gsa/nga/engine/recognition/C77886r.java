package com.google.android.apps.gsa.nga.engine.recognition;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.r */
/* compiled from: PG */
public final class C77886r extends C77566as {

    /* renamed from: a */
    public final int f214559a;

    /* renamed from: b */
    public final int f214560b;

    /* renamed from: c */
    public final int f214561c;

    /* renamed from: d */
    public final Optional f214562d;

    /* renamed from: e */
    public final Optional f214563e;

    /* renamed from: f */
    public final Optional f214564f;

    /* renamed from: g */
    public final Optional f214565g;

    /* renamed from: h */
    public final Optional f214566h;

    /* renamed from: i */
    public final boolean f214567i;

    /* renamed from: j */
    public final boolean f214568j;

    /* renamed from: k */
    public final Optional f214569k;

    /* renamed from: l */
    public final int f214570l;

    public C77886r(int i, int i2, int i3, int i4, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, boolean z, boolean z2, Optional optional6) {
        this.f214570l = i;
        this.f214559a = i2;
        this.f214560b = i3;
        this.f214561c = i4;
        this.f214562d = optional;
        this.f214563e = optional2;
        this.f214564f = optional3;
        this.f214565g = optional4;
        this.f214566h = optional5;
        this.f214567i = z;
        this.f214568j = z2;
        this.f214569k = optional6;
    }

    /* renamed from: a */
    public final int mo72678a() {
        return this.f214560b;
    }

    /* renamed from: b */
    public final int mo72679b() {
        return this.f214561c;
    }

    /* renamed from: c */
    public final int mo72680c() {
        return this.f214559a;
    }

    /* renamed from: d */
    public final Optional mo72681d() {
        return this.f214566h;
    }

    /* renamed from: e */
    public final Optional mo72682e() {
        return this.f214562d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77566as) {
            C77566as asVar = (C77566as) obj;
            return this.f214570l == asVar.mo72690m() && this.f214559a == asVar.mo72680c() && this.f214560b == asVar.mo72678a() && this.f214561c == asVar.mo72679b() && this.f214562d.equals(asVar.mo72682e()) && this.f214563e.equals(asVar.mo72686i()) && this.f214564f.equals(asVar.mo72683f()) && this.f214565g.equals(asVar.mo72684g()) && this.f214566h.equals(asVar.mo72681d()) && this.f214567i == asVar.mo72688k() && this.f214568j == asVar.mo72687j() && this.f214569k.equals(asVar.mo72685h());
        }
    }

    /* renamed from: f */
    public final Optional mo72683f() {
        return this.f214564f;
    }

    /* renamed from: g */
    public final Optional mo72684g() {
        return this.f214565g;
    }

    /* renamed from: h */
    public final Optional mo72685h() {
        return this.f214569k;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((this.f214570l ^ 1000003) * 1000003) ^ this.f214559a) * 1000003) ^ this.f214560b) * 1000003) ^ this.f214561c) * 1000003) ^ this.f214562d.hashCode()) * 1000003) ^ this.f214563e.hashCode()) * 1000003) ^ this.f214564f.hashCode()) * 1000003) ^ this.f214565g.hashCode()) * 1000003) ^ this.f214566h.hashCode()) * 1000003) ^ (true != this.f214567i ? 1237 : 1231)) * 1000003;
        if (true == this.f214568j) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f214569k.hashCode();
    }

    /* renamed from: i */
    public final Optional mo72686i() {
        return this.f214563e;
    }

    /* renamed from: j */
    public final boolean mo72687j() {
        return this.f214568j;
    }

    /* renamed from: k */
    public final boolean mo72688k() {
        return this.f214567i;
    }

    /* renamed from: l */
    public final C77885q mo72689l() {
        return new C77885q(this);
    }

    /* renamed from: m */
    public final int mo72690m() {
        return this.f214570l;
    }

    public final String toString() {
        String num = Integer.toString(this.f214570l);
        int i = this.f214559a;
        int i2 = this.f214560b;
        int i3 = this.f214561c;
        String valueOf = String.valueOf(this.f214562d);
        String valueOf2 = String.valueOf(this.f214563e);
        String valueOf3 = String.valueOf(this.f214564f);
        String valueOf4 = String.valueOf(this.f214565g);
        String valueOf5 = String.valueOf(this.f214566h);
        boolean z = this.f214567i;
        boolean z2 = this.f214568j;
        String valueOf6 = String.valueOf(this.f214569k);
        return "SpeechSessionParams{type=" + num + ", sampleRate=" + i + ", channelConfig=" + i2 + ", encoding=" + i3 + ", hotwordResult=" + valueOf + ", uri=" + valueOf2 + ", invocationToken=" + valueOf3 + ", minBufferSizeSeconds=" + valueOf4 + ", audioEffects=" + valueOf5 + ", requestZeroLatencyMic=" + z + ", failFastIfOpNotAllowed=" + z2 + ", rohanToken=" + valueOf6 + "}";
    }
}
