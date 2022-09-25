package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8518n;

import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.C111593r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.n.c */
/* compiled from: PG */
public final class C111643c extends C113409et {

    /* renamed from: a */
    public final C111593r f310409a;

    /* renamed from: b */
    private final C22871g f310410b;

    public C111643c(C111593r rVar, C22871g gVar) {
        this.f310409a = rVar;
        this.f310410b = gVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.SHORTCUT;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return this.f310410b.mo28202b("FetchShortcutSuggestions", new C111642b(this, epVar));
    }
}
