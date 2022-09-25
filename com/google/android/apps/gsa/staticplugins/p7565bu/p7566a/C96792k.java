package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.k */
/* compiled from: PG */
final class C96792k extends C96762ag {

    /* renamed from: a */
    private final C65753ak f270713a;

    /* renamed from: b */
    private final boolean f270714b;

    /* renamed from: c */
    private final C58881cr f270715c;

    /* renamed from: d */
    private final Optional f270716d;

    /* renamed from: e */
    private final boolean f270717e;

    /* renamed from: f */
    private final Optional f270718f;

    /* renamed from: g */
    private final C58528ij f270719g;

    public C96792k(C65753ak akVar, boolean z, C58881cr crVar, Optional optional, boolean z2, Optional optional2, C58528ij ijVar) {
        this.f270713a = akVar;
        this.f270714b = z;
        this.f270715c = crVar;
        this.f270716d = optional;
        this.f270717e = z2;
        this.f270718f = optional2;
        this.f270719g = ijVar;
    }

    /* renamed from: a */
    public final C58881cr mo90338a() {
        return this.f270715c;
    }

    /* renamed from: b */
    public final C58528ij mo90339b() {
        return this.f270719g;
    }

    /* renamed from: c */
    public final C65753ak mo90340c() {
        return this.f270713a;
    }

    /* renamed from: d */
    public final Optional mo90341d() {
        return this.f270716d;
    }

    /* renamed from: e */
    public final Optional mo90342e() {
        return this.f270718f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C96762ag) {
            C96762ag agVar = (C96762ag) obj;
            return this.f270713a.equals(agVar.mo90340c()) && this.f270714b == agVar.mo90344g() && this.f270715c.equals(agVar.mo90338a()) && this.f270716d.equals(agVar.mo90341d()) && this.f270717e == agVar.mo90343f() && this.f270718f.equals(agVar.mo90342e()) && this.f270719g.equals(agVar.mo90339b());
        }
    }

    /* renamed from: f */
    public final boolean mo90343f() {
        return this.f270717e;
    }

    /* renamed from: g */
    public final boolean mo90344g() {
        return this.f270714b;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((this.f270713a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f270714b ? 1237 : 1231)) * 1000003) ^ this.f270715c.hashCode()) * 1000003) ^ this.f270716d.hashCode()) * 1000003;
        if (true == this.f270717e) {
            i = 1231;
        }
        return ((((hashCode ^ i) * 1000003) ^ this.f270718f.hashCode()) * 1000003) ^ this.f270719g.hashCode();
    }

    public final String toString() {
        String num = Integer.toString(this.f270713a.f178757bE);
        boolean z = this.f270714b;
        String obj = this.f270715c.toString();
        String valueOf = String.valueOf(this.f270716d);
        boolean z2 = this.f270717e;
        String valueOf2 = String.valueOf(this.f270718f);
        String obj2 = this.f270719g.toString();
        return "SimpleGddConfig{corpus=" + num + ", accountScoped=" + z + ", populatorStatus=" + obj + ", ngaGroupName=" + valueOf + ", isMultiVariantSupportEnabled=" + z2 + ", premigrationPopulator=" + valueOf2 + ", agsaBinaries=" + obj2 + "}";
    }
}
