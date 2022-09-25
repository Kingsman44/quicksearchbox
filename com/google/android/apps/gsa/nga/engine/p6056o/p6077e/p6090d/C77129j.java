package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.j */
/* compiled from: PG */
public final class C77129j extends C77087de {

    /* renamed from: a */
    public Optional f212873a = Optional.empty();

    /* renamed from: b */
    public Optional f212874b = Optional.empty();

    /* renamed from: c */
    public C74965n f212875c;

    /* renamed from: d */
    private boolean f212876d;

    /* renamed from: e */
    private Optional f212877e = Optional.empty();

    /* renamed from: f */
    private C58485gu f212878f;

    /* renamed from: g */
    private Optional f212879g = Optional.empty();

    /* renamed from: h */
    private byte f212880h;

    /* renamed from: a */
    public final C77088df mo72399a() {
        C58485gu guVar;
        C74965n nVar;
        if (this.f212880h == 1 && (guVar = this.f212878f) != null && (nVar = this.f212875c) != null) {
            return new C77130k(this.f212876d, this.f212877e, this.f212873a, guVar, this.f212879g, this.f212874b, nVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f212880h == 0) {
            sb.append(" isSharingRequest");
        }
        if (this.f212878f == null) {
            sb.append(" explicitAppCandidates");
        }
        if (this.f212875c == null) {
            sb.append(" queryContext");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo72400b(Optional optional) {
        if (optional != null) {
            this.f212877e = optional;
            return;
        }
        throw new NullPointerException("Null assistContent");
    }

    /* renamed from: c */
    public final void mo72401c(Optional optional) {
        if (optional != null) {
            this.f212879g = optional;
            return;
        }
        throw new NullPointerException("Null explicitAppByMid");
    }

    /* renamed from: d */
    public final void mo72402d(C58485gu guVar) {
        if (guVar != null) {
            this.f212878f = guVar;
            return;
        }
        throw new NullPointerException("Null explicitAppCandidates");
    }

    /* renamed from: e */
    public final void mo72403e(boolean z) {
        this.f212876d = z;
        this.f212880h = 1;
    }

    /* renamed from: f */
    public final void mo72404f(C74965n nVar) {
        if (nVar != null) {
            this.f212875c = nVar;
            return;
        }
        throw new NullPointerException("Null queryContext");
    }
}
