package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.hd */
/* compiled from: PG */
public final class C112913hd {

    /* renamed from: a */
    public final C112794ct f312939a;

    /* renamed from: b */
    private final C86124t f312940b;

    /* renamed from: c */
    private final C22871g f312941c;

    /* renamed from: d */
    private Optional f312942d = Optional.empty();

    public C112913hd(C86124t tVar, C22871g gVar, C112794ct ctVar) {
        this.f312940b = tVar;
        this.f312941c = gVar;
        this.f312939a = ctVar;
    }

    /* renamed from: a */
    public final void mo99779a() {
        this.f312942d.ifPresent(C112911hb.f312933a);
    }

    /* renamed from: b */
    public final void mo99780b(String str, int i, List list, C113408es esVar, C113415ez ezVar) {
        if (this.f312940b.mo79746e(C90063do.f249356bw)) {
            this.f312942d = Optional.m71637of(this.f312941c.mo28203c(str, this.f312940b.mo79743a(C90063do.f249287ag), new C112912hc(this, i, list, esVar, ezVar)));
        }
    }
}
