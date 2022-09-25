package com.google.android.libraries.p10915aa.p10920b;

import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.aa.b.s */
/* compiled from: PG */
final class C146696s extends C146654ab {

    /* renamed from: a */
    private final Optional f396132a;

    /* renamed from: b */
    private final Optional f396133b;

    /* renamed from: c */
    private final Optional f396134c;

    /* renamed from: d */
    private final Optional f396135d;

    /* renamed from: e */
    private final Optional f396136e;

    /* renamed from: f */
    private final Optional f396137f;

    /* renamed from: g */
    private final Optional f396138g;

    public C146696s(Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7) {
        this.f396132a = optional;
        this.f396133b = optional2;
        this.f396134c = optional3;
        this.f396135d = optional4;
        this.f396136e = optional5;
        this.f396137f = optional6;
        this.f396138g = optional7;
    }

    /* renamed from: a */
    public final Optional mo123427a() {
        return this.f396134c;
    }

    /* renamed from: b */
    public final Optional mo123428b() {
        return this.f396135d;
    }

    /* renamed from: c */
    public final Optional mo123429c() {
        return this.f396136e;
    }

    /* renamed from: d */
    public final Optional mo123430d() {
        return this.f396137f;
    }

    /* renamed from: e */
    public final Optional mo123431e() {
        return this.f396138g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C146654ab) {
            C146654ab abVar = (C146654ab) obj;
            return this.f396132a.equals(abVar.mo123432f()) && this.f396133b.equals(abVar.mo123433g()) && this.f396134c.equals(abVar.mo123427a()) && this.f396135d.equals(abVar.mo123428b()) && this.f396136e.equals(abVar.mo123429c()) && this.f396137f.equals(abVar.mo123430d()) && this.f396138g.equals(abVar.mo123431e());
        }
    }

    /* renamed from: f */
    public final Optional mo123432f() {
        return this.f396132a;
    }

    /* renamed from: g */
    public final Optional mo123433g() {
        return this.f396133b;
    }

    public final int hashCode() {
        return ((((((((((((this.f396132a.hashCode() ^ 1000003) * 1000003) ^ this.f396133b.hashCode()) * 1000003) ^ this.f396134c.hashCode()) * 1000003) ^ this.f396135d.hashCode()) * 1000003) ^ this.f396136e.hashCode()) * 1000003) ^ this.f396137f.hashCode()) * 1000003) ^ this.f396138g.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f396132a);
        String valueOf2 = String.valueOf(this.f396133b);
        String valueOf3 = String.valueOf(this.f396134c);
        String valueOf4 = String.valueOf(this.f396135d);
        String valueOf5 = String.valueOf(this.f396136e);
        String valueOf6 = String.valueOf(this.f396137f);
        String valueOf7 = String.valueOf(this.f396138g);
        return "ProcessedNodeCondition{textToMatch=" + valueOf + ", textToMatchRegex=" + valueOf2 + ", contentDescriptionToMatch=" + valueOf3 + ", contentDescriptionToMatchRegex=" + valueOf4 + ", isClickable=" + valueOf5 + ", isVisible=" + valueOf6 + ", precomputedCondition=" + valueOf7 + "}";
    }
}
