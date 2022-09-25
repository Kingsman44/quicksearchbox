package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.common.p4522b.C58528ij;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.b */
/* compiled from: PG */
public final class C79544b extends C79551i {

    /* renamed from: a */
    public Optional f218258a = Optional.empty();

    /* renamed from: b */
    public Optional f218259b = Optional.empty();

    /* renamed from: c */
    public Optional f218260c = Optional.empty();

    /* renamed from: d */
    private C79562t f218261d;

    /* renamed from: e */
    private Optional f218262e = Optional.empty();

    /* renamed from: f */
    private Optional f218263f = Optional.empty();

    public C79544b() {
    }

    /* renamed from: a */
    public final C79552j mo74122a() {
        C79562t tVar = this.f218261d;
        if (tVar != null) {
            return new C79545c(tVar, this.f218262e, this.f218258a, this.f218263f, this.f218259b, this.f218260c);
        }
        throw new IllegalStateException("Missing required properties: sessionStage");
    }

    /* renamed from: b */
    public final void mo74123b(C58528ij ijVar) {
        this.f218263f = Optional.m71637of(ijVar);
    }

    /* renamed from: c */
    public final void mo74124c(C79562t tVar) {
        if (tVar != null) {
            this.f218261d = tVar;
            return;
        }
        throw new NullPointerException("Null sessionStage");
    }

    public C79544b(C79552j jVar) {
        C79545c cVar = (C79545c) jVar;
        this.f218261d = cVar.f218264a;
        this.f218262e = cVar.f218265b;
        this.f218258a = cVar.f218266c;
        this.f218263f = cVar.f218267d;
        this.f218259b = cVar.f218268e;
        this.f218260c = cVar.f218269f;
    }
}
