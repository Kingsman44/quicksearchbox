package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c */
/* compiled from: PG */
public final class C79008c extends C78980ag {

    /* renamed from: a */
    public Optional f217295a = Optional.empty();

    /* renamed from: b */
    private C74757n f217296b;

    public C79008c() {
    }

    /* renamed from: a */
    public final C78981ah mo73739a() {
        C74757n nVar = this.f217296b;
        if (nVar != null) {
            return new C79044d(nVar, this.f217295a);
        }
        throw new IllegalStateException("Missing required properties: query");
    }

    /* renamed from: b */
    public final void mo73740b(C74757n nVar) {
        if (nVar != null) {
            this.f217296b = nVar;
            return;
        }
        throw new NullPointerException("Null query");
    }

    public C79008c(C78981ah ahVar) {
        C79044d dVar = (C79044d) ahVar;
        this.f217296b = dVar.f217373a;
        this.f217295a = dVar.f217374b;
    }
}
