package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111741v;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.d */
/* compiled from: PG */
public final class C111308d extends C113409et {

    /* renamed from: a */
    public final C68214a f309746a;

    /* renamed from: b */
    private final C22871g f309747b;

    /* renamed from: c */
    private final C111741v f309748c;

    /* renamed from: d */
    private final C86124t f309749d;

    public C111308d(C22871g gVar, C111741v vVar, C68214a aVar, C86124t tVar) {
        this.f309747b = gVar;
        this.f309748c = vVar;
        this.f309746a = aVar;
        this.f309749d = tVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.APP_ACTIONS_ENTITY;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        epVar.mo100033p();
        if (!this.f309749d.mo79746e(C90014bt.f247171cC) || !this.f309749d.mo79746e(C90063do.f249334ba)) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        return this.f309747b.mo28210j(this.f309748c.mo99217a(epVar), "parse tapas server response to app action", new C111307c(this));
    }
}
