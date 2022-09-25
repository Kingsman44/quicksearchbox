package com.google.android.apps.gsa.nga.engine.warmactions.p6253e;

import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59672bz;
import com.google.common.p4552o.C59686ca;
import com.google.common.p4552o.C59687cb;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.e.s */
/* compiled from: PG */
public final class C79561s implements C79553k {

    /* renamed from: a */
    static final Function f218281a = new C79560r();

    /* renamed from: d */
    public static final /* synthetic */ int f218282d = 0;

    /* renamed from: b */
    public final C79546d f218283b;

    /* renamed from: c */
    public final C79853ak f218284c;

    /* renamed from: e */
    private final C79863k f218285e;

    /* renamed from: f */
    private final Optional f218286f;

    public C79561s(C79863k kVar, C79546d dVar, Optional optional, C79853ak akVar) {
        this.f218285e = kVar;
        this.f218283b = dVar;
        this.f218286f = optional;
        this.f218284c = akVar;
    }

    /* renamed from: a */
    public final void mo74135a(C79562t tVar) {
        C79544b bVar = new C79544b();
        bVar.mo74124c(tVar);
        C79552j a = bVar.mo74122a();
        mo74136b(a);
        mo74137c(a);
    }

    /* renamed from: b */
    public final void mo74136b(C79552j jVar) {
        C59672bz bzVar = (C59672bz) C59686ca.f160028e.createBuilder();
        Optional d = jVar.mo74128d();
        Objects.requireNonNull(bzVar);
        d.ifPresent(new C79556n(bzVar));
        Optional e = jVar.mo74129e();
        Objects.requireNonNull(bzVar);
        e.ifPresent(new C79557o(bzVar));
        Optional f = jVar.mo74131f();
        Objects.requireNonNull(bzVar);
        f.ifPresent(new C79558p(bzVar));
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        ajVar.copyOnWrite();
        C59687cb cbVar = (C59687cb) ajVar.instance;
        C59686ca caVar = (C59686ca) bzVar.build();
        caVar.getClass();
        cbVar.f160087aY = caVar;
        cbVar.f160123d |= 524288;
        jVar.mo74132g().ifPresent(new C79559q(this, ajVar));
        C79863k kVar = this.f218285e;
        C89856f fVar = new C89856f();
        fVar.f246201a = ((C79543a) f218281a).apply(jVar.mo74126b());
        fVar.f246203c = (C59687cb) ajVar.build();
        kVar.mo74236a(fVar.mo83699a());
    }

    /* renamed from: c */
    public final void mo74137c(C79552j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.mo74126b());
        jVar.mo74127c().ifPresent(new C79554l(sb));
        this.f218286f.ifPresent(new C79555m());
    }
}
