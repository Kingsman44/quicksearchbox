package com.google.android.apps.search.googleapp.p10310h;

import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.common.base.C58833ax;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.h.b */
/* compiled from: PG */
final class C136121b extends C136129j {

    /* renamed from: a */
    private final C139779t f370732a;

    /* renamed from: b */
    private final boolean f370733b;

    /* renamed from: c */
    private final boolean f370734c;

    /* renamed from: d */
    private final boolean f370735d;

    /* renamed from: e */
    private final Optional f370736e;

    /* renamed from: f */
    private final C58833ax f370737f;

    /* renamed from: g */
    private final Optional f370738g;

    /* renamed from: h */
    private final Optional f370739h;

    /* renamed from: i */
    private final Optional f370740i;

    /* renamed from: j */
    private final Optional f370741j;

    /* renamed from: k */
    private final Optional f370742k;

    public C136121b(C139779t tVar, boolean z, boolean z2, boolean z3, Optional optional, C58833ax axVar, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6) {
        this.f370732a = tVar;
        this.f370733b = z;
        this.f370734c = z2;
        this.f370735d = z3;
        this.f370736e = optional;
        this.f370737f = axVar;
        this.f370738g = optional2;
        this.f370739h = optional3;
        this.f370740i = optional4;
        this.f370741j = optional5;
        this.f370742k = optional6;
    }

    /* renamed from: a */
    public final C139779t mo112777a() {
        return this.f370732a;
    }

    /* renamed from: b */
    public final C58833ax mo112778b() {
        return this.f370737f;
    }

    /* renamed from: c */
    public final Optional mo112779c() {
        return this.f370739h;
    }

    /* renamed from: d */
    public final Optional mo112780d() {
        return this.f370740i;
    }

    /* renamed from: e */
    public final Optional mo112781e() {
        return this.f370738g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C136129j) {
            C136129j jVar = (C136129j) obj;
            return this.f370732a.equals(jVar.mo112777a()) && this.f370733b == jVar.mo112787i() && this.f370734c == jVar.mo112788j() && this.f370735d == jVar.mo112789k() && this.f370736e.equals(jVar.mo112785h()) && this.f370737f.equals(jVar.mo112778b()) && this.f370738g.equals(jVar.mo112781e()) && this.f370739h.equals(jVar.mo112779c()) && this.f370740i.equals(jVar.mo112780d()) && this.f370741j.equals(jVar.mo112783f()) && this.f370742k.equals(jVar.mo112784g());
        }
    }

    /* renamed from: f */
    public final Optional mo112783f() {
        return this.f370741j;
    }

    /* renamed from: g */
    public final Optional mo112784g() {
        return this.f370742k;
    }

    /* renamed from: h */
    public final Optional mo112785h() {
        return this.f370736e;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((this.f370732a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f370733b ? 1237 : 1231)) * 1000003) ^ (true != this.f370734c ? 1237 : 1231)) * 1000003;
        if (true == this.f370735d) {
            i = 1231;
        }
        return ((((((((((((((hashCode ^ i) * 1000003) ^ this.f370736e.hashCode()) * 1000003) ^ this.f370737f.hashCode()) * 1000003) ^ this.f370738g.hashCode()) * 1000003) ^ this.f370739h.hashCode()) * 1000003) ^ this.f370740i.hashCode()) * 1000003) ^ this.f370741j.hashCode()) * 1000003) ^ this.f370742k.hashCode();
    }

    /* renamed from: i */
    public final boolean mo112787i() {
        return this.f370733b;
    }

    /* renamed from: j */
    public final boolean mo112788j() {
        return this.f370734c;
    }

    /* renamed from: k */
    public final boolean mo112789k() {
        return this.f370735d;
    }

    public final String toString() {
        String num = Integer.toString(this.f370732a.f379907i);
        boolean z = this.f370733b;
        boolean z2 = this.f370734c;
        boolean z3 = this.f370735d;
        String valueOf = String.valueOf(this.f370736e);
        String valueOf2 = String.valueOf(this.f370737f);
        String valueOf3 = String.valueOf(this.f370738g);
        String valueOf4 = String.valueOf(this.f370739h);
        String valueOf5 = String.valueOf(this.f370740i);
        String valueOf6 = String.valueOf(this.f370741j);
        String valueOf7 = String.valueOf(this.f370742k);
        return "GoogleAppIntentOptions{tabType=" + num + ", clearTask=" + z + ", goBackToDiscoverFeedFromSrp=" + z2 + ", openAccountMenuOnStart=" + z3 + ", queryOptionsOptional=" + valueOf + ", discoverIntentOptionsOptional=" + valueOf2 + ", persistenceIdOptional=" + valueOf3 + ", collectionsIntentOptions=" + valueOf4 + ", googleAppBrowserIntentOptions=" + valueOf5 + ", pixelLauncherDataOptional=" + valueOf6 + ", promotionOptionsOptional=" + valueOf7 + "}";
    }
}
