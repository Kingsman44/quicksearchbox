package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.c */
/* compiled from: PG */
final class C79545c extends C79552j {

    /* renamed from: a */
    public final C79562t f218264a;

    /* renamed from: b */
    public final Optional f218265b;

    /* renamed from: c */
    public final Optional f218266c;

    /* renamed from: d */
    public final Optional f218267d;

    /* renamed from: e */
    public final Optional f218268e;

    /* renamed from: f */
    public final Optional f218269f;

    public C79545c(C79562t tVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.f218264a = tVar;
        this.f218265b = optional;
        this.f218266c = optional2;
        this.f218267d = optional3;
        this.f218268e = optional4;
        this.f218269f = optional5;
    }

    /* renamed from: a */
    public final C79551i mo74125a() {
        return new C79544b(this);
    }

    /* renamed from: b */
    public final C79562t mo74126b() {
        return this.f218264a;
    }

    /* renamed from: c */
    public final Optional mo74127c() {
        return this.f218265b;
    }

    /* renamed from: d */
    public final Optional mo74128d() {
        return this.f218266c;
    }

    /* renamed from: e */
    public final Optional mo74129e() {
        return this.f218267d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C79552j) {
            C79552j jVar = (C79552j) obj;
            return this.f218264a.equals(jVar.mo74126b()) && this.f218265b.equals(jVar.mo74127c()) && this.f218266c.equals(jVar.mo74128d()) && this.f218267d.equals(jVar.mo74129e()) && this.f218268e.equals(jVar.mo74132g()) && this.f218269f.equals(jVar.mo74131f());
        }
    }

    /* renamed from: f */
    public final Optional mo74131f() {
        return this.f218269f;
    }

    /* renamed from: g */
    public final Optional mo74132g() {
        return this.f218268e;
    }

    public final int hashCode() {
        return ((((((((((this.f218264a.hashCode() ^ 1000003) * 1000003) ^ this.f218265b.hashCode()) * 1000003) ^ this.f218266c.hashCode()) * 1000003) ^ this.f218267d.hashCode()) * 1000003) ^ this.f218268e.hashCode()) * 1000003) ^ this.f218269f.hashCode();
    }

    public final String toString() {
        String obj = this.f218264a.toString();
        String valueOf = String.valueOf(this.f218265b);
        String valueOf2 = String.valueOf(this.f218266c);
        String valueOf3 = String.valueOf(this.f218267d);
        String valueOf4 = String.valueOf(this.f218268e);
        String valueOf5 = String.valueOf(this.f218269f);
        return "LogEvent{sessionStage=" + obj + ", additionalSessionStageDebugInfo=" + valueOf + ", contextType=" + valueOf2 + ", flagValues=" + valueOf3 + ", utteranceId=" + valueOf4 + ", screenLocked=" + valueOf5 + "}";
    }
}
