package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.k */
/* compiled from: PG */
final class C77130k extends C77088df {

    /* renamed from: a */
    private final boolean f212881a;

    /* renamed from: b */
    private final Optional f212882b;

    /* renamed from: c */
    private final Optional f212883c;

    /* renamed from: d */
    private final C58485gu f212884d;

    /* renamed from: e */
    private final Optional f212885e;

    /* renamed from: f */
    private final Optional f212886f;

    /* renamed from: g */
    private final C74965n f212887g;

    public C77130k(boolean z, Optional optional, Optional optional2, C58485gu guVar, Optional optional3, Optional optional4, C74965n nVar) {
        this.f212881a = z;
        this.f212882b = optional;
        this.f212883c = optional2;
        this.f212884d = guVar;
        this.f212885e = optional3;
        this.f212886f = optional4;
        this.f212887g = nVar;
    }

    /* renamed from: a */
    public final C74965n mo72405a() {
        return this.f212887g;
    }

    /* renamed from: b */
    public final C58485gu mo72406b() {
        return this.f212884d;
    }

    /* renamed from: c */
    public final Optional mo72407c() {
        return this.f212882b;
    }

    /* renamed from: d */
    public final Optional mo72408d() {
        return this.f212885e;
    }

    /* renamed from: e */
    public final Optional mo72409e() {
        return this.f212886f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77088df) {
            C77088df dfVar = (C77088df) obj;
            return this.f212881a == dfVar.mo72411g() && this.f212882b.equals(dfVar.mo72407c()) && this.f212883c.equals(dfVar.mo72410f()) && C58597ky.m90218i(this.f212884d, dfVar.mo72406b()) && this.f212885e.equals(dfVar.mo72408d()) && this.f212886f.equals(dfVar.mo72409e()) && this.f212887g.equals(dfVar.mo72405a());
        }
    }

    /* renamed from: f */
    public final Optional mo72410f() {
        return this.f212883c;
    }

    /* renamed from: g */
    public final boolean mo72411g() {
        return this.f212881a;
    }

    public final int hashCode() {
        return (((((((((((((true != this.f212881a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.f212882b.hashCode()) * 1000003) ^ this.f212883c.hashCode()) * 1000003) ^ this.f212884d.hashCode()) * 1000003) ^ this.f212885e.hashCode()) * 1000003) ^ this.f212886f.hashCode()) * 1000003) ^ this.f212887g.hashCode();
    }

    public final String toString() {
        boolean z = this.f212881a;
        String valueOf = String.valueOf(this.f212882b);
        String valueOf2 = String.valueOf(this.f212883c);
        String obj = this.f212884d.toString();
        String valueOf3 = String.valueOf(this.f212885e);
        String valueOf4 = String.valueOf(this.f212886f);
        String obj2 = this.f212887g.toString();
        return "ShareRequest{isSharingRequest=" + z + ", assistContent=" + valueOf + ", person=" + valueOf2 + ", explicitAppCandidates=" + obj + ", explicitAppByMid=" + valueOf3 + ", fulfillerLogger=" + valueOf4 + ", queryContext=" + obj2 + "}";
    }
}
