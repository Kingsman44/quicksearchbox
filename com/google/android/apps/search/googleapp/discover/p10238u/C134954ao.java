package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57338u;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.ao */
/* compiled from: PG */
public final class C134954ao {

    /* renamed from: a */
    public final String f367432a;

    /* renamed from: b */
    public final Optional f367433b;

    /* renamed from: c */
    public final Optional f367434c;

    /* renamed from: d */
    public final String f367435d;

    /* renamed from: e */
    public final String f367436e;

    /* renamed from: f */
    public final Optional f367437f;

    /* renamed from: g */
    public final Optional f367438g;

    /* renamed from: h */
    public final C57338u f367439h;

    public C134954ao(String str, Optional optional, Optional optional2, String str2, String str3, Optional optional3, Optional optional4, C57338u uVar) {
        C69664n.m101061g(str, "defaultLocale");
        C69664n.m101061g(optional, "overrideLocale");
        C69664n.m101061g(optional2, "authHeader");
        C69664n.m101061g(str2, "userAgent");
        C69664n.m101061g(str3, "clientDataHeader");
        C69664n.m101061g(optional3, "cookies");
        C69664n.m101061g(optional4, "countryCodePreference");
        C69664n.m101061g(uVar, "clientInfo");
        this.f367432a = str;
        this.f367433b = optional;
        this.f367434c = optional2;
        this.f367435d = str2;
        this.f367436e = str3;
        this.f367437f = optional3;
        this.f367438g = optional4;
        this.f367439h = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134954ao)) {
            return false;
        }
        C134954ao aoVar = (C134954ao) obj;
        return C69664n.m101066l(this.f367432a, aoVar.f367432a) && C69664n.m101066l(this.f367433b, aoVar.f367433b) && C69664n.m101066l(this.f367434c, aoVar.f367434c) && C69664n.m101066l(this.f367435d, aoVar.f367435d) && C69664n.m101066l(this.f367436e, aoVar.f367436e) && C69664n.m101066l(this.f367437f, aoVar.f367437f) && C69664n.m101066l(this.f367438g, aoVar.f367438g) && C69664n.m101066l(this.f367439h, aoVar.f367439h);
    }

    public final int hashCode() {
        return (((((((((((((this.f367432a.hashCode() * 31) + this.f367433b.hashCode()) * 31) + this.f367434c.hashCode()) * 31) + this.f367435d.hashCode()) * 31) + this.f367436e.hashCode()) * 31) + this.f367437f.hashCode()) * 31) + this.f367438g.hashCode()) * 31) + this.f367439h.hashCode();
    }

    public final String toString() {
        String str = this.f367432a;
        Optional optional = this.f367433b;
        Optional optional2 = this.f367434c;
        String str2 = this.f367435d;
        String str3 = this.f367436e;
        Optional optional3 = this.f367437f;
        Optional optional4 = this.f367438g;
        C57338u uVar = this.f367439h;
        return "DiscoverRequestProperties(defaultLocale=" + str + ", overrideLocale=" + optional + ", authHeader=" + optional2 + ", userAgent=" + str2 + ", clientDataHeader=" + str3 + ", cookies=" + optional3 + ", countryCodePreference=" + optional4 + ", clientInfo=" + uVar + ")";
    }
}
