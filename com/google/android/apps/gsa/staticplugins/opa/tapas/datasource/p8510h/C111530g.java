package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8510h;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.h.g */
/* compiled from: PG */
public final class C111530g extends C113409et {

    /* renamed from: a */
    public final C86124t f310216a;

    /* renamed from: b */
    public final C113425ff f310217b;

    /* renamed from: c */
    private final C68214a f310218c;

    /* renamed from: d */
    private final C90851k f310219d;

    public C111530g(C68214a aVar, C86124t tVar, C113425ff ffVar, C90851k kVar) {
        this.f310218c = aVar;
        this.f310216a = tVar;
        this.f310217b = ffVar;
        this.f310219d = kVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.HABIT_RECENT_QUERIES;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f310216a.mo79746e(C90063do.f249387ca)) {
            return C60856cj.m92900i(C113408es.f314036b);
        }
        C60870cx b = this.f310217b.mo100136b();
        C60870cx a = ((C112471ap) this.f310218c.mo27525b()).f311989a.mo99547a(C48634bw.HABIT_PROFILE);
        return C60856cj.m92895d(b, a).mo57334a(new C111529f(this, b, a), this.f310219d.mo85208a("TapasBackgroundExecutor"));
    }
}
