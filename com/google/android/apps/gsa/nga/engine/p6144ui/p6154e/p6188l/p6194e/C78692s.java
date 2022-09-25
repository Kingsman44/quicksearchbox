package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80985e;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.libraries.gsa.p1876k.C22862b;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.s */
/* compiled from: PG */
public final /* synthetic */ class C78692s implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78667aa f216622a;

    public /* synthetic */ C78692s(C78667aa aaVar) {
        this.f216622a = aaVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C78667aa aaVar = this.f216622a;
        C78669ac acVar = (C78669ac) C78670ad.f216577h.createBuilder();
        C76090f b = aaVar.f216569b.mo72021b();
        String languageTag = b.mo72039e().toLanguageTag();
        acVar.copyOnWrite();
        languageTag.getClass();
        ((C78670ad) acVar.instance).f216583e = languageTag;
        Optional d = b.mo72038d();
        Objects.requireNonNull(acVar);
        d.ifPresent(new C78695v(acVar));
        boolean u = aaVar.f216572e.mo74960u(b.mo72038d());
        acVar.copyOnWrite();
        ((C78670ad) acVar.instance).f216585g = u;
        C80987g.m128859c(aaVar.f216570c.mo74768e()).ifPresent(new C78696w(acVar));
        boolean equals = aaVar.f216570c.mo74766b().equals(C80985e.IN_FOREGROUND);
        acVar.copyOnWrite();
        ((C78670ad) acVar.instance).f216581c = equals;
        Optional c = ((C78245d) aaVar.f216571d.mo73191c().mo76657c()).mo73180b().mo73170c();
        Objects.requireNonNull(acVar);
        c.ifPresent(new C78697x(acVar));
        C78670ad adVar = (C78670ad) acVar.build();
        if (adVar != null) {
            return new C78666a(adVar);
        }
        throw new NullPointerException("Null input");
    }
}
