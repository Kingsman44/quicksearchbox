package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl.C82068aw;
import com.google.android.libraries.logging.C28285c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.cg */
/* compiled from: PG */
final class C81782cg {

    /* renamed from: a */
    private final Supplier f223707a;

    /* renamed from: b */
    private final C81572o f223708b;

    /* renamed from: c */
    private final C81780ce f223709c;

    /* renamed from: d */
    private final C81781cf f223710d;

    /* renamed from: e */
    private boolean f223711e = false;

    /* renamed from: f */
    private boolean f223712f = false;

    public C81782cg(C81780ce ceVar, C81781cf cfVar, Supplier supplier, C81572o oVar) {
        this.f223709c = ceVar;
        this.f223710d = cfVar;
        this.f223707a = supplier;
        this.f223708b = oVar;
    }

    /* renamed from: a */
    public final void mo75308a(View view) {
        if (this.f223711e && !this.f223712f) {
            Optional ofNullable = Optional.ofNullable(C28285c.m52882i(view, 5, (Integer) null));
            C81572o oVar = this.f223708b;
            Objects.requireNonNull(oVar);
            ofNullable.ifPresent(new C81779cd(oVar));
            this.f223712f = true;
        }
    }

    /* renamed from: b */
    public final void mo75309b() {
        if (!this.f223711e) {
            this.f223711e = true;
            Optional ofNullable = Optional.ofNullable(C28285c.m52881h(4, this.f223709c.mo75287a(), ((C82068aw) this.f223707a).f224303a.mo75492a()));
            C81572o oVar = this.f223708b;
            Objects.requireNonNull(oVar);
            ofNullable.ifPresent(new C81779cd(oVar));
        }
    }

    /* renamed from: c */
    public final void mo75310c() {
        if (this.f223711e) {
            this.f223710d.mo75288a();
            this.f223711e = false;
            this.f223712f = false;
        }
    }

    /* renamed from: d */
    public final void mo75311d(View view) {
        if (this.f223711e && !this.f223712f) {
            Optional ofNullable = Optional.ofNullable(C28285c.m52882i(view, 18, (Integer) null));
            C81572o oVar = this.f223708b;
            Objects.requireNonNull(oVar);
            ofNullable.ifPresent(new C81779cd(oVar));
            this.f223712f = true;
        }
    }
}
