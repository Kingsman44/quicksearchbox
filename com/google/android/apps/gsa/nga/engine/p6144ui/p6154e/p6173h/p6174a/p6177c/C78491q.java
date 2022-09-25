package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80722cx;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.q */
/* compiled from: PG */
final class C78491q extends C78392bo {

    /* renamed from: a */
    public C83358h f216163a;

    /* renamed from: b */
    public Optional f216164b = Optional.empty();

    /* renamed from: c */
    public Optional f216165c = Optional.empty();

    /* renamed from: d */
    public Optional f216166d = Optional.empty();

    /* renamed from: e */
    private Optional f216167e = Optional.empty();

    public C78491q() {
    }

    /* renamed from: a */
    public final C78393bp mo73349a() {
        C83358h hVar = this.f216163a;
        if (hVar != null) {
            return new C78492r(hVar, this.f216164b, this.f216167e, this.f216165c, this.f216166d);
        }
        throw new IllegalStateException("Missing required properties: greeting");
    }

    /* renamed from: b */
    public final void mo73350b(C80722cx cxVar) {
        this.f216164b = Optional.m71637of(cxVar);
    }

    /* renamed from: c */
    public final void mo73351c(C83358h hVar) {
        this.f216163a = hVar;
    }

    /* renamed from: d */
    public final void mo73352d(String str) {
        this.f216167e = Optional.m71637of(str);
    }

    public C78491q(C78393bp bpVar) {
        C78492r rVar = (C78492r) bpVar;
        this.f216163a = rVar.f216168a;
        this.f216164b = rVar.f216169b;
        this.f216167e = rVar.f216170c;
        this.f216165c = rVar.f216171d;
        this.f216166d = rVar.f216172e;
    }
}
