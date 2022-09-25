package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.o */
/* compiled from: PG */
public final class C113016o {

    /* renamed from: a */
    public static final /* synthetic */ int f313198a = 0;

    /* renamed from: b */
    private static final C121537f f313199b = C121537f.m200840b("Tapas/WorkPrewarmer", C121511c.f337208a);

    /* renamed from: c */
    private final C86124t f313200c;

    /* renamed from: d */
    private final Set f313201d;

    public C113016o(C86124t tVar, Set set) {
        this.f313200c = tVar;
        this.f313201d = set;
    }

    /* renamed from: a */
    public final C60870cx mo99818a(C19167ba baVar) {
        if (!this.f313200c.mo79746e(C90063do.f249465dz)) {
            return C60856cj.m92898g();
        }
        C121537f fVar = f313199b;
        C60870cx o = C60856cj.m92906o((C58485gu) Collection.EL.stream(this.f313201d).map(new C113014m(baVar)).collect(C58370cn.f155946a));
        fVar.mo105244m("prewarmWork", o);
        C113015n nVar = C113015n.f313197a;
        return C60922j.m93044g(o, C47810es.m84963c(nVar), C60826bg.f164896a);
    }
}
