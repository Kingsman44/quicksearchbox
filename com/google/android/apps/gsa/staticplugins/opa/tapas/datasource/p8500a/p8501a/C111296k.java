package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8501a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.k */
/* compiled from: PG */
public final class C111296k extends C113409et {

    /* renamed from: a */
    public static final C59071e f309706a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.a.k");

    /* renamed from: k */
    private static final C121537f f309707k = C121537f.m200840b("TapasDonationSource", C113409et.f314037l);

    /* renamed from: b */
    public final C22871g f309708b;

    /* renamed from: c */
    public final C68214a f309709c;

    /* renamed from: d */
    public final C68214a f309710d;

    /* renamed from: e */
    public final C68214a f309711e;

    /* renamed from: f */
    public final C86124t f309712f;

    /* renamed from: g */
    public final C113206m f309713g;

    /* renamed from: h */
    public final C113425ff f309714h;

    /* renamed from: i */
    public final C111054d f309715i;

    /* renamed from: j */
    public final Executor f309716j;

    public C111296k(C22871g gVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C86124t tVar, C113206m mVar, C113425ff ffVar, C111054d dVar, C90851k kVar) {
        this.f309708b = gVar;
        this.f309709c = aVar;
        this.f309710d = aVar2;
        this.f309711e = aVar3;
        this.f309712f = tVar;
        this.f309713g = mVar;
        this.f309714h = ffVar;
        this.f309715i = dVar;
        this.f309716j = kVar.mo85210c("TapasLightweightExecutor");
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.APP_ACTIONS_DONATION;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo99102b(C113405ep epVar) {
        C60870cx b = this.f309708b.mo28202b("Transform from signal to suggestion", new C111294i(this, epVar));
        f309707k.mo105244m("fetchSuggestions", b);
        return b;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        return mo99102b(epVar);
    }
}
