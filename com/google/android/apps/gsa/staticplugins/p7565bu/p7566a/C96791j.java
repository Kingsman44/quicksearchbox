package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.j */
/* compiled from: PG */
public final class C96791j extends C96760ae {

    /* renamed from: a */
    public C58881cr f270705a;

    /* renamed from: b */
    public Optional f270706b = Optional.empty();

    /* renamed from: c */
    public C58528ij f270707c;

    /* renamed from: d */
    private C65753ak f270708d;

    /* renamed from: e */
    private boolean f270709e;

    /* renamed from: f */
    private boolean f270710f;

    /* renamed from: g */
    private final Optional f270711g = Optional.empty();

    /* renamed from: h */
    private byte f270712h;

    /* renamed from: a */
    public final C96762ag mo90334a() {
        C65753ak akVar;
        C58881cr crVar;
        C58528ij ijVar;
        if (this.f270712h == 3 && (akVar = this.f270708d) != null && (crVar = this.f270705a) != null && (ijVar = this.f270707c) != null) {
            return new C96792k(akVar, this.f270709e, crVar, this.f270706b, this.f270710f, this.f270711g, ijVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f270708d == null) {
            sb.append(" corpus");
        }
        if ((this.f270712h & 1) == 0) {
            sb.append(" accountScoped");
        }
        if (this.f270705a == null) {
            sb.append(" populatorStatus");
        }
        if ((this.f270712h & 2) == 0) {
            sb.append(" isMultiVariantSupportEnabled");
        }
        if (this.f270707c == null) {
            sb.append(" agsaBinaries");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo90335b(boolean z) {
        this.f270709e = z;
        this.f270712h = (byte) (this.f270712h | 1);
    }

    /* renamed from: c */
    public final void mo90336c(C65753ak akVar) {
        if (akVar != null) {
            this.f270708d = akVar;
            return;
        }
        throw new NullPointerException("Null corpus");
    }

    /* renamed from: d */
    public final void mo90337d(boolean z) {
        this.f270710f = z;
        this.f270712h = (byte) (this.f270712h | 2);
    }
}
