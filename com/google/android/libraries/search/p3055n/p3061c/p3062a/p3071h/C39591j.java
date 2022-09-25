package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.n.c.a.h.j */
/* compiled from: PG */
public final class C39591j extends C39582bt {

    /* renamed from: a */
    public C58833ax f104226a;

    /* renamed from: b */
    public C39390af f104227b;

    /* renamed from: c */
    public C58833ax f104228c;

    /* renamed from: d */
    private C39538ac f104229d;

    /* renamed from: e */
    private C39536aa f104230e;

    /* renamed from: f */
    private C39562b f104231f;

    public C39591j() {
        C58836b bVar = C58836b.f156633a;
        this.f104226a = bVar;
        this.f104228c = bVar;
    }

    /* renamed from: a */
    public final C39583bu mo41915a() {
        C39536aa aaVar;
        C39562b bVar;
        C39390af afVar;
        C39538ac acVar = this.f104229d;
        if (acVar != null && (aaVar = this.f104230e) != null && (bVar = this.f104231f) != null && (afVar = this.f104227b) != null) {
            return new C39592k(acVar, aaVar, bVar, this.f104226a, afVar, this.f104228c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104229d == null) {
            sb.append(" coreConfigParams");
        }
        if (this.f104230e == null) {
            sb.append(" clientConfigParams");
        }
        if (this.f104231f == null) {
            sb.append(" audioLibraryListeningSessionParams");
        }
        if (this.f104227b == null) {
            sb.append(" hotwordDetectionCallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41916b(C39562b bVar) {
        if (bVar != null) {
            this.f104231f = bVar;
            return;
        }
        throw new NullPointerException("Null audioLibraryListeningSessionParams");
    }

    /* renamed from: c */
    public final void mo41917c(C39536aa aaVar) {
        if (aaVar != null) {
            this.f104230e = aaVar;
            return;
        }
        throw new NullPointerException("Null clientConfigParams");
    }

    /* renamed from: d */
    public final void mo41918d(C39538ac acVar) {
        if (acVar != null) {
            this.f104229d = acVar;
            return;
        }
        throw new NullPointerException("Null coreConfigParams");
    }
}
