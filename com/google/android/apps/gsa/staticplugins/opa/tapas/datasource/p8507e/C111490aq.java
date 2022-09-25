package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.aq */
/* compiled from: PG */
public final class C111490aq extends C111495c {

    /* renamed from: c */
    private static final C121537f f310134c;

    /* renamed from: b */
    final C111488ao f310135b;

    static {
        C121537f b = C121537f.m200840b("TapasCompleteServerSuggestSource", C113409et.f314037l);
        f310134c = b;
        C121511c cVar = b.f337270a;
    }

    public C111490aq(C22871g gVar, C111485al alVar, C111488ao aoVar, C86124t tVar) {
        super(gVar, alVar, tVar);
        this.f310135b = aoVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.COMPLETE_SERVER;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        if (TextUtils.isEmpty(epVar.mo100033p())) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        Objects.requireNonNull(this.f310135b);
        return mo99159b(epVar, new C111489ap(), f310134c);
    }
}
