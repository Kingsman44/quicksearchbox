package com.google.android.apps.gsa.nga.engine.recognition;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l */
/* compiled from: PG */
final class C77744l extends C77552ae {

    /* renamed from: a */
    public final String f214166a;

    /* renamed from: b */
    public final C77551ad f214167b;

    /* renamed from: c */
    public final Optional f214168c;

    /* renamed from: d */
    public final Optional f214169d;

    /* renamed from: e */
    public final Optional f214170e;

    /* renamed from: f */
    public final Optional f214171f;

    /* renamed from: g */
    public final Optional f214172g;

    public C77744l(String str, C77551ad adVar, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.f214166a = str;
        this.f214167b = adVar;
        this.f214168c = optional;
        this.f214169d = optional2;
        this.f214170e = optional3;
        this.f214171f = optional4;
        this.f214172g = optional5;
    }

    /* renamed from: a */
    public final C77550ac mo72611a() {
        return new C77731k(this);
    }

    /* renamed from: b */
    public final C77551ad mo72612b() {
        return this.f214167b;
    }

    /* renamed from: c */
    public final Optional mo72613c() {
        return this.f214171f;
    }

    /* renamed from: d */
    public final Optional mo72614d() {
        return this.f214168c;
    }

    /* renamed from: e */
    public final Optional mo72615e() {
        return this.f214170e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77552ae) {
            C77552ae aeVar = (C77552ae) obj;
            return this.f214166a.equals(aeVar.mo72618h()) && this.f214167b.equals(aeVar.mo72612b()) && this.f214168c.equals(aeVar.mo72614d()) && this.f214169d.equals(aeVar.mo72616f()) && this.f214170e.equals(aeVar.mo72615e()) && this.f214171f.equals(aeVar.mo72613c()) && this.f214172g.equals(aeVar.mo72617g());
        }
    }

    /* renamed from: f */
    public final Optional mo72616f() {
        return this.f214169d;
    }

    /* renamed from: g */
    public final Optional mo72617g() {
        return this.f214172g;
    }

    /* renamed from: h */
    public final String mo72618h() {
        return this.f214166a;
    }

    public final int hashCode() {
        return ((((((((((((this.f214166a.hashCode() ^ 1000003) * 1000003) ^ this.f214167b.hashCode()) * 1000003) ^ this.f214168c.hashCode()) * 1000003) ^ this.f214169d.hashCode()) * 1000003) ^ this.f214170e.hashCode()) * 1000003) ^ this.f214171f.hashCode()) * 1000003) ^ this.f214172g.hashCode();
    }

    public final String toString() {
        String str = this.f214166a;
        String obj = this.f214167b.toString();
        String valueOf = String.valueOf(this.f214168c);
        String valueOf2 = String.valueOf(this.f214169d);
        String valueOf3 = String.valueOf(this.f214170e);
        String valueOf4 = String.valueOf(this.f214171f);
        String valueOf5 = String.valueOf(this.f214172g);
        return "RecognitionHypothesis{text=" + str + ", sourceType=" + obj + ", jinnSource=" + valueOf + ", originalHypothesis=" + valueOf2 + ", originalAsrRank=" + valueOf3 + ", hypothesisScore=" + valueOf4 + ", suggestionChip=" + valueOf5 + "}";
    }
}
