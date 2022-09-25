package com.google.android.libraries.lens.view.p2148l;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.l.a */
/* compiled from: PG */
public final class C27221a extends C27226f {

    /* renamed from: a */
    public C58833ax f74417a;

    /* renamed from: b */
    public C58833ax f74418b;

    /* renamed from: c */
    public C58833ax f74419c;

    /* renamed from: d */
    public C58833ax f74420d;

    /* renamed from: e */
    public C58833ax f74421e;

    /* renamed from: f */
    private C58833ax f74422f;

    /* renamed from: g */
    private int f74423g;

    public C27221a() {
        C58836b bVar = C58836b.f156633a;
        this.f74417a = bVar;
        this.f74418b = bVar;
        this.f74419c = bVar;
        this.f74422f = bVar;
        this.f74420d = bVar;
        this.f74421e = bVar;
    }

    public C27221a(C27228h hVar) {
        C58836b bVar = C58836b.f156633a;
        this.f74417a = bVar;
        this.f74418b = bVar;
        this.f74419c = bVar;
        this.f74422f = bVar;
        this.f74420d = bVar;
        this.f74421e = bVar;
        C27222b bVar2 = (C27222b) hVar;
        this.f74417a = bVar2.f74424a;
        this.f74418b = bVar2.f74425b;
        this.f74419c = bVar2.f74426c;
        this.f74422f = bVar2.f74427d;
        this.f74420d = bVar2.f74428e;
        this.f74421e = bVar2.f74429f;
        this.f74423g = bVar2.f74430g;
    }

    /* renamed from: a */
    public final C27228h mo32662a() {
        if (this.f74423g != 0) {
            return new C27222b(this.f74417a, this.f74418b, this.f74419c, this.f74422f, this.f74420d, this.f74421e, this.f74423g);
        }
        throw new IllegalStateException("Missing required properties: imageCategory");
    }

    /* renamed from: b */
    public final void mo32663b(C58833ax axVar) {
        this.f74422f = axVar;
    }

    /* renamed from: c */
    public final void mo32664c(C24226r rVar) {
        this.f74420d = C58833ax.m90834k(rVar);
    }

    /* renamed from: d */
    public final void mo32665d(int i) {
        if (i != 0) {
            this.f74423g = i;
            return;
        }
        throw new NullPointerException("Null imageCategory");
    }

    /* renamed from: e */
    public final void mo32666e() {
        this.f74421e = C58833ax.m90833j((Object) null);
    }
}
