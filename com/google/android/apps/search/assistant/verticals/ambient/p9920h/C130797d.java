package com.google.android.apps.search.assistant.verticals.ambient.p9920h;

import com.google.assistant.p3860as.C49784bt;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.d */
/* compiled from: PG */
final class C130797d extends C130701b {

    /* renamed from: a */
    public final String f358032a;

    /* renamed from: b */
    public final double f358033b;

    /* renamed from: c */
    public final C49784bt f358034c;

    /* renamed from: d */
    public final Optional f358035d;

    /* renamed from: e */
    public final Optional f358036e;

    /* renamed from: f */
    public final Optional f358037f;

    public C130797d(String str, double d, C49784bt btVar, Optional optional, Optional optional2, Optional optional3) {
        this.f358032a = str;
        this.f358033b = d;
        this.f358034c = btVar;
        this.f358035d = optional;
        this.f358036e = optional2;
        this.f358037f = optional3;
    }

    /* renamed from: a */
    public final double mo109791a() {
        return this.f358033b;
    }

    /* renamed from: c */
    public final C130696a mo109792c() {
        return new C130735c(this);
    }

    /* renamed from: d */
    public final C49784bt mo109793d() {
        return this.f358034c;
    }

    /* renamed from: e */
    public final Optional mo109794e() {
        return this.f358037f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130701b) {
            C130701b bVar = (C130701b) obj;
            return this.f358032a.equals(bVar.mo109797h()) && Double.doubleToLongBits(this.f358033b) == Double.doubleToLongBits(bVar.mo109791a()) && this.f358034c.equals(bVar.mo109793d()) && this.f358035d.equals(bVar.mo109795f()) && this.f358036e.equals(bVar.mo109796g()) && this.f358037f.equals(bVar.mo109794e());
        }
    }

    /* renamed from: f */
    public final Optional mo109795f() {
        return this.f358035d;
    }

    /* renamed from: g */
    public final Optional mo109796g() {
        return this.f358036e;
    }

    /* renamed from: h */
    public final String mo109797h() {
        return this.f358032a;
    }

    public final int hashCode() {
        return ((((((((((this.f358032a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f358033b) >>> 32) ^ Double.doubleToLongBits(this.f358033b)))) * 1000003) ^ this.f358034c.hashCode()) * 1000003) ^ this.f358035d.hashCode()) * 1000003) ^ this.f358036e.hashCode()) * 1000003) ^ this.f358037f.hashCode();
    }

    public final String toString() {
        String str = this.f358032a;
        double d = this.f358033b;
        String obj = this.f358034c.toString();
        String valueOf = String.valueOf(this.f358035d);
        String valueOf2 = String.valueOf(this.f358036e);
        String valueOf3 = String.valueOf(this.f358037f);
        return "ApplicationData{androidApp=" + str + ", score=" + d + ", scoreSignals=" + obj + ", category=" + valueOf + ", usesPerMonth=" + valueOf2 + ", appHeadphoneDuration=" + valueOf3 + "}";
    }
}
