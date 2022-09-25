package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137941aa;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b.C137965y;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.a */
/* compiled from: PG */
final class C138367a extends C138383ae {

    /* renamed from: a */
    private final String f376428a;

    /* renamed from: b */
    private final String f376429b;

    /* renamed from: c */
    private final String f376430c;

    /* renamed from: d */
    private final String f376431d;

    /* renamed from: e */
    private final String f376432e;

    /* renamed from: f */
    private final C137965y f376433f;

    /* renamed from: g */
    private final String f376434g;

    /* renamed from: h */
    private final C137941aa f376435h;

    public C138367a(String str, String str2, String str3, String str4, String str5, C137965y yVar, String str6, C137941aa aaVar) {
        this.f376428a = str;
        this.f376429b = str2;
        this.f376430c = str3;
        this.f376431d = str4;
        this.f376432e = str5;
        this.f376433f = yVar;
        this.f376434g = str6;
        this.f376435h = aaVar;
    }

    /* renamed from: a */
    public final C137965y mo114256a() {
        return this.f376433f;
    }

    /* renamed from: b */
    public final C137941aa mo114257b() {
        return this.f376435h;
    }

    /* renamed from: c */
    public final String mo114258c() {
        return this.f376429b;
    }

    /* renamed from: d */
    public final String mo114259d() {
        return this.f376431d;
    }

    /* renamed from: e */
    public final String mo114260e() {
        return this.f376434g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C138383ae) {
            C138383ae aeVar = (C138383ae) obj;
            return this.f376428a.equals(aeVar.mo114263g()) && this.f376429b.equals(aeVar.mo114258c()) && this.f376430c.equals(aeVar.mo114264h()) && this.f376431d.equals(aeVar.mo114259d()) && this.f376432e.equals(aeVar.mo114262f()) && this.f376433f.equals(aeVar.mo114256a()) && this.f376434g.equals(aeVar.mo114260e()) && this.f376435h.equals(aeVar.mo114257b());
        }
    }

    /* renamed from: f */
    public final String mo114262f() {
        return this.f376432e;
    }

    /* renamed from: g */
    public final String mo114263g() {
        return this.f376428a;
    }

    /* renamed from: h */
    public final String mo114264h() {
        return this.f376430c;
    }

    public final int hashCode() {
        return ((((((((((((((this.f376428a.hashCode() ^ 1000003) * 1000003) ^ this.f376429b.hashCode()) * 1000003) ^ this.f376430c.hashCode()) * 1000003) ^ this.f376431d.hashCode()) * 1000003) ^ this.f376432e.hashCode()) * 1000003) ^ this.f376433f.hashCode()) * 1000003) ^ this.f376434g.hashCode()) * 1000003) ^ this.f376435h.hashCode();
    }

    public final String toString() {
        String str = this.f376428a;
        String str2 = this.f376429b;
        String str3 = this.f376430c;
        String str4 = this.f376431d;
        String str5 = this.f376432e;
        String obj = this.f376433f.toString();
        String str6 = this.f376434g;
        String obj2 = this.f376435h.toString();
        return "CompleteServerRequestSettings{searchLanguageHl=" + str + ", countryCode=" + str2 + ", suggestClient=" + str3 + ", devicePixelRatioParameter=" + str4 + ", psychicSessionId=" + str5 + ", previousQueryData=" + obj + ", localSearchesBelowThreshold=" + str6 + ", userSettings=" + obj2 + "}";
    }
}
