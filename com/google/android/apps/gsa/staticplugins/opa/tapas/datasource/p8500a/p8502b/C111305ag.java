package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8502b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8515m.p8516a.C111572e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110972aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111071u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113167by;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.b.ag */
/* compiled from: PG */
public final class C111305ag {

    /* renamed from: a */
    public static final C121537f f309731a;

    /* renamed from: b */
    public final C22871g f309732b;

    /* renamed from: c */
    public final C111029bz f309733c;

    /* renamed from: d */
    public final C110972aj f309734d;

    /* renamed from: e */
    public final C111572e f309735e;

    /* renamed from: f */
    public final C111071u f309736f;

    /* renamed from: g */
    public final C111248k f309737g;

    /* renamed from: h */
    public final C113167by f309738h;

    /* renamed from: i */
    public final C111054d f309739i;

    /* renamed from: j */
    public final C86124t f309740j;

    /* renamed from: k */
    public final C68214a f309741k;

    /* renamed from: l */
    private final C113206m f309742l;

    static {
        C121537f b = C121537f.m200840b("TapasAppActionsResponseParser", C113409et.f314037l);
        f309731a = b;
        C121511c cVar = b.f337270a;
    }

    public C111305ag(C22871g gVar, C111029bz bzVar, C110972aj ajVar, C111071u uVar, C111572e eVar, C113206m mVar, C111248k kVar, C113167by byVar, C111054d dVar, C86124t tVar, C68214a aVar) {
        this.f309732b = gVar;
        this.f309733c = bzVar;
        this.f309734d = ajVar;
        this.f309736f = uVar;
        this.f309735e = eVar;
        this.f309742l = mVar;
        this.f309737g = kVar;
        this.f309738h = byVar;
        this.f309739i = dVar;
        this.f309740j = tVar;
        this.f309741k = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo99104a(C49728r rVar) {
        return this.f309732b.mo28210j(this.f309742l.mo99844c(), "parse tapas server response and packageNameToScoreMap into app action", new C111321q(this, rVar));
    }
}
