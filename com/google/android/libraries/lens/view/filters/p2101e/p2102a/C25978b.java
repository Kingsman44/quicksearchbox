package com.google.android.libraries.lens.view.filters.p2101e.p2102a;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.filters.e.a.b */
/* compiled from: PG */
final class C25978b extends C25981e {

    /* renamed from: a */
    private final C25980d f70609a;

    /* renamed from: b */
    private final String f70610b;

    /* renamed from: c */
    private final String f70611c;

    /* renamed from: d */
    private final String f70612d;

    /* renamed from: e */
    private final int f70613e;

    /* renamed from: f */
    private final int f70614f;

    /* renamed from: g */
    private final C58833ax f70615g;

    /* renamed from: h */
    private final int f70616h;

    /* renamed from: i */
    private final boolean f70617i;

    /* renamed from: j */
    private final boolean f70618j;

    /* renamed from: k */
    private final boolean f70619k;

    /* renamed from: l */
    private final boolean f70620l;

    /* renamed from: m */
    private final boolean f70621m;

    /* renamed from: n */
    private final boolean f70622n;

    public C25978b(C25980d dVar, String str, String str2, String str3, int i, int i2, C58833ax axVar, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f70609a = dVar;
        this.f70610b = str;
        this.f70611c = str2;
        this.f70612d = str3;
        this.f70613e = i;
        this.f70614f = i2;
        this.f70615g = axVar;
        this.f70616h = i3;
        this.f70617i = z;
        this.f70618j = z2;
        this.f70619k = z3;
        this.f70620l = z4;
        this.f70621m = z5;
        this.f70622n = z6;
    }

    /* renamed from: a */
    public final int mo31182a() {
        return this.f70616h;
    }

    /* renamed from: b */
    public final int mo31183b() {
        return this.f70613e;
    }

    /* renamed from: c */
    public final int mo31184c() {
        return this.f70614f;
    }

    /* renamed from: d */
    public final C25980d mo31185d() {
        return this.f70609a;
    }

    /* renamed from: e */
    public final C58833ax mo31186e() {
        return this.f70615g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C25981e) {
            C25981e eVar = (C25981e) obj;
            return this.f70609a.equals(eVar.mo31185d()) && this.f70610b.equals(eVar.mo31190h()) && this.f70611c.equals(eVar.mo31189g()) && this.f70612d.equals(eVar.mo31188f()) && this.f70613e == eVar.mo31183b() && this.f70614f == eVar.mo31184c() && this.f70615g.equals(eVar.mo31186e()) && this.f70616h == eVar.mo31182a() && this.f70617i == eVar.mo31194k() && this.f70618j == eVar.mo31192i() && this.f70619k == eVar.mo31195l() && this.f70620l == eVar.mo31196m() && this.f70621m == eVar.mo31193j() && this.f70622n == eVar.mo31197n();
        }
    }

    /* renamed from: f */
    public final String mo31188f() {
        return this.f70612d;
    }

    /* renamed from: g */
    public final String mo31189g() {
        return this.f70611c;
    }

    /* renamed from: h */
    public final String mo31190h() {
        return this.f70610b;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((this.f70609a.hashCode() ^ 1000003) * 1000003) ^ this.f70610b.hashCode()) * 1000003) ^ this.f70611c.hashCode()) * 1000003) ^ this.f70612d.hashCode()) * 1000003) ^ this.f70613e) * 1000003) ^ this.f70614f) * 1000003) ^ this.f70615g.hashCode()) * 1000003) ^ this.f70616h) * 1000003) ^ (true != this.f70617i ? 1237 : 1231)) * 1000003) ^ (true != this.f70618j ? 1237 : 1231)) * 1000003) ^ (true != this.f70619k ? 1237 : 1231)) * 1000003) ^ (true != this.f70620l ? 1237 : 1231)) * 1000003) ^ (true != this.f70621m ? 1237 : 1231)) * 1000003;
        if (true == this.f70622n) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    /* renamed from: i */
    public final boolean mo31192i() {
        return this.f70618j;
    }

    /* renamed from: j */
    public final boolean mo31193j() {
        return this.f70621m;
    }

    /* renamed from: k */
    public final boolean mo31194k() {
        return this.f70617i;
    }

    /* renamed from: l */
    public final boolean mo31195l() {
        return this.f70619k;
    }

    /* renamed from: m */
    public final boolean mo31196m() {
        return this.f70620l;
    }

    /* renamed from: n */
    public final boolean mo31197n() {
        return this.f70622n;
    }

    public final String toString() {
        String obj = this.f70609a.toString();
        String str = this.f70610b;
        String str2 = this.f70611c;
        String str3 = this.f70612d;
        int i = this.f70613e;
        int i2 = this.f70614f;
        String valueOf = String.valueOf(this.f70615g);
        int i3 = this.f70616h;
        boolean z = this.f70617i;
        boolean z2 = this.f70618j;
        boolean z3 = this.f70619k;
        boolean z4 = this.f70620l;
        boolean z5 = this.f70621m;
        boolean z6 = this.f70622n;
        return "Filter{type=" + obj + ", name=" + str + ", liveModeGuidanceMessage=" + str2 + ", filtersInHomeGuidanceMessage=" + str3 + ", itemViewResourceId=" + i + ", vectorIcon=" + i2 + ", veId=" + valueOf + ", filtersInHomeVeId=" + i3 + ", supportsRegionInteractions=" + z + ", discardsRegionSearchOcr=" + z2 + ", supportsReticle=" + z3 + ", supportsReticleRegion=" + z4 + ", supportsMultimodalQueries=" + z5 + ", supportsTextInteractions=" + z6 + "}";
    }
}
