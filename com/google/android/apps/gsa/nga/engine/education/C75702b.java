package com.google.android.apps.gsa.nga.engine.education;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80587u;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80721cw;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.b */
/* compiled from: PG */
final class C75702b extends C75749d {

    /* renamed from: a */
    private final boolean f210135a;

    /* renamed from: b */
    private final boolean f210136b;

    /* renamed from: c */
    private final C80721cw f210137c;

    /* renamed from: d */
    private final boolean f210138d;

    /* renamed from: e */
    private final C80587u f210139e;

    /* renamed from: f */
    private final Optional f210140f;

    /* renamed from: g */
    private final Optional f210141g;

    /* renamed from: h */
    private final String f210142h;

    /* renamed from: i */
    private final String f210143i;

    /* renamed from: j */
    private final String f210144j;

    /* renamed from: k */
    private final e f210145k;

    /* renamed from: l */
    private final Optional f210146l;

    public C75702b(boolean z, boolean z2, C80721cw cwVar, boolean z3, C80587u uVar, Optional optional, Optional optional2, String str, String str2, String str3, e eVar, Optional optional3) {
        this.f210135a = z;
        this.f210136b = z2;
        this.f210137c = cwVar;
        this.f210138d = z3;
        this.f210139e = uVar;
        this.f210140f = optional;
        this.f210141g = optional2;
        this.f210142h = str;
        this.f210143i = str2;
        this.f210144j = str3;
        this.f210145k = eVar;
        this.f210146l = optional3;
    }

    /* renamed from: a */
    public final e mo71838a() {
        return this.f210145k;
    }

    /* renamed from: b */
    public final C80587u mo71839b() {
        return this.f210139e;
    }

    /* renamed from: c */
    public final C80721cw mo71840c() {
        return this.f210137c;
    }

    /* renamed from: d */
    public final Optional mo71841d() {
        return this.f210140f;
    }

    /* renamed from: e */
    public final Optional mo71842e() {
        return this.f210146l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C75749d) {
            C75749d dVar = (C75749d) obj;
            return this.f210135a == dVar.mo71850k() && this.f210136b == dVar.mo71849j() && this.f210137c.equals(dVar.mo71840c()) && this.f210138d == dVar.mo71851l() && this.f210139e.equals(dVar.mo71839b()) && this.f210140f.equals(dVar.mo71841d()) && this.f210141g.equals(dVar.mo71844f()) && this.f210142h.equals(dVar.mo71848i()) && this.f210143i.equals(dVar.mo71845g()) && this.f210144j.equals(dVar.mo71846h()) && this.f210145k.equals(dVar.mo71838a()) && this.f210146l.equals(dVar.mo71842e());
        }
    }

    /* renamed from: f */
    public final Optional mo71844f() {
        return this.f210141g;
    }

    /* renamed from: g */
    public final String mo71845g() {
        return this.f210143i;
    }

    /* renamed from: h */
    public final String mo71846h() {
        return this.f210144j;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = ((((((true != this.f210135a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.f210136b ? 1237 : 1231)) * 1000003) ^ this.f210137c.hashCode()) * 1000003;
        if (true == this.f210138d) {
            i = 1231;
        }
        return ((((((((((((((((hashCode ^ i) * 1000003) ^ this.f210139e.hashCode()) * 1000003) ^ this.f210140f.hashCode()) * 1000003) ^ this.f210141g.hashCode()) * 1000003) ^ this.f210142h.hashCode()) * 1000003) ^ this.f210143i.hashCode()) * 1000003) ^ this.f210144j.hashCode()) * 1000003) ^ this.f210145k.hashCode()) * 1000003) ^ this.f210146l.hashCode();
    }

    /* renamed from: i */
    public final String mo71848i() {
        return this.f210142h;
    }

    /* renamed from: j */
    public final boolean mo71849j() {
        return this.f210136b;
    }

    /* renamed from: k */
    public final boolean mo71850k() {
        return this.f210135a;
    }

    /* renamed from: l */
    public final boolean mo71851l() {
        return this.f210138d;
    }

    public final String toString() {
        boolean z = this.f210135a;
        boolean z2 = this.f210136b;
        String obj = this.f210137c.toString();
        boolean z3 = this.f210138d;
        String num = Integer.toString(this.f210139e.getNumber());
        String valueOf = String.valueOf(this.f210140f);
        String valueOf2 = String.valueOf(this.f210141g);
        String str = this.f210142h;
        String str2 = this.f210143i;
        String str3 = this.f210144j;
        String num2 = Integer.toString(this.f210145k.ca);
        String valueOf3 = String.valueOf(this.f210146l);
        return "FreQuerySuggestionData{showLogo=" + z + ", showIllustrationGif=" + z2 + ", illustrationGifType=" + obj + ", showSuggestionChips=" + z3 + ", freClickHandling=" + num + ", disclosureInfo=" + valueOf + ", veDataOptional=" + valueOf2 + ", suggestionHint=" + str + ", displayQuery=" + str2 + ", executionQuery=" + str3 + ", opaTriggerType=" + num2 + ", suggestionDisplayMode=" + valueOf3 + "}";
    }
}
