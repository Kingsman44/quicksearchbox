package com.google.android.apps.gsa.staticplugins.opa.tapas.p8567o.p8570c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.p8542b.p8543a.C112039a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8552k.C112127m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d.C121535i;
import com.google.android.libraries.assistant.p1594s.p1597b.C19141ab;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.e */
/* compiled from: PG */
public final class C113006e implements C112039a {

    /* renamed from: a */
    public static final C59071e f313180a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.o.c.e");

    /* renamed from: b */
    private static final C121537f f313181b = C121537f.m200840b("Tapas/ModelPrewarmTask", C121511c.f337208a);

    /* renamed from: c */
    private final C68214a f313182c;

    /* renamed from: d */
    private final C68214a f313183d;

    /* renamed from: e */
    private final C60887da f313184e;

    /* renamed from: f */
    private final C86124t f313185f;

    public C113006e(C68214a aVar, C68214a aVar2, C60887da daVar, C86124t tVar) {
        this.f313182c = aVar;
        this.f313183d = aVar2;
        this.f313184e = daVar;
        this.f313185f = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo99349a(C19167ba baVar) {
        C19141ab abVar = baVar.f53685m;
        if (abVar == null) {
            abVar = C19141ab.f53614i;
        }
        if (!abVar.f53617b) {
            return C60856cj.m92898g();
        }
        C121537f fVar = f313181b;
        if (this.f313185f.mo79746e(C90063do.f249454do)) {
            ((C121535i) this.f313183d.mo27525b()).mo105231a();
        }
        C60870cx b = ((C112127m) this.f313182c.mo27525b()).mo99402b(false);
        C113005d dVar = C113005d.f313179a;
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(dVar), this.f313184e);
        fVar.mo105244m("modelPrewarmTask", g);
        return g;
    }
}
