package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.ae */
/* compiled from: PG */
public final class C111478ae extends C111495c {

    /* renamed from: b */
    public static final C121537f f310114b;

    /* renamed from: c */
    public final C111474aa f310115c;

    /* renamed from: d */
    private final C22871g f310116d;

    static {
        C121537f b = C121537f.m200840b("TapasCalculatorSource", C113409et.f314037l);
        f310114b = b;
        C121511c cVar = b.f337270a;
    }

    public C111478ae(C22871g gVar, C111485al alVar, C111474aa aaVar, C86124t tVar) {
        super(gVar, alVar, tVar);
        this.f310116d = gVar;
        this.f310115c = aaVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.CALCULATOR;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C60870cx cxVar = (C60870cx) map.get(C48672ag.COMPLETE_SERVER);
        if (cxVar != null) {
            return this.f310116d.mo28209i(cxVar, "parse calculator response", new C111476ac());
        }
        Objects.requireNonNull(this.f310115c);
        return mo99159b(epVar, new C111475ab(), f310114b);
    }
}
