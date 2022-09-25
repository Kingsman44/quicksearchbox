package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.content.Intent;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111790b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8530f.p8532b.C111791c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.common.p4522b.C58485gu;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.ab */
/* compiled from: PG */
public final class C110964ab {

    /* renamed from: a */
    private final C110963aa f309131a;

    /* renamed from: b */
    private final C111790b f309132b;

    /* renamed from: c */
    private final C86124t f309133c;

    /* renamed from: d */
    private final l f309134d;

    public C110964ab(C110963aa aaVar, C111790b bVar, C86124t tVar, l lVar) {
        this.f309131a = aaVar;
        this.f309132b = bVar;
        this.f309133c = tVar;
        this.f309134d = lVar;
    }

    /* renamed from: a */
    public final void mo98994a(C113502n nVar, Map map) {
        Optional a = this.f309131a.mo98992a(nVar.mo100250p(), nVar.mo100047j(), map);
        if (!a.isEmpty()) {
            if (this.f309133c.mo79746e(C90063do.f249406ct)) {
                this.f309132b.mo99229a(C58485gu.m89846n(C111791c.m185631a((Intent) a.get())));
            } else {
                this.f309134d.i((Intent) a.get());
            }
        }
    }
}
