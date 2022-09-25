package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113394ee;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113395ef;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.cd */
/* compiled from: PG */
public final class C113083cd {

    /* renamed from: a */
    public static final C121537f f313320a = C121537f.m200840b("Tapas/TapasUserProfileFeaturesExtractor", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f313321b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.p.cd");

    /* renamed from: c */
    public final C112471ap f313322c;

    /* renamed from: d */
    public final C86124t f313323d;

    /* renamed from: e */
    public final C113425ff f313324e;

    /* renamed from: f */
    public C113052b f313325f;

    /* renamed from: g */
    public final Map f313326g;

    /* renamed from: h */
    public final Map f313327h;

    /* renamed from: i */
    public final Map f313328i;

    /* renamed from: j */
    public final Map f313329j;

    /* renamed from: k */
    public final Map f313330k;

    /* renamed from: l */
    public final Map f313331l;

    /* renamed from: m */
    public final Map f313332m;

    /* renamed from: n */
    public final C22871g f313333n;

    /* renamed from: o */
    public final C112037ao f313334o;

    /* renamed from: p */
    public C60870cx f313335p = null;

    /* renamed from: q */
    public C60870cx f313336q = null;

    public C113083cd(C112471ap apVar, C86124t tVar, C113425ff ffVar, C22871g gVar, C112037ao aoVar) {
        this.f313322c = apVar;
        this.f313323d = tVar;
        this.f313324e = ffVar;
        this.f313334o = aoVar;
        this.f313325f = new C113052b();
        this.f313326g = new HashMap();
        this.f313327h = new HashMap();
        this.f313329j = new HashMap();
        this.f313328i = new HashMap();
        this.f313330k = new HashMap();
        this.f313331l = new HashMap();
        this.f313332m = new HashMap();
        this.f313333n = gVar;
    }

    /* renamed from: a */
    public static C113395ef m187078a(C113052b bVar) {
        if (bVar.mo99832b() != null) {
            return m187081d((float) bVar.mo99832b().f313251c, (float) bVar.mo99832b().f313253e);
        }
        return m187081d(0.0f, 0.0f);
    }

    /* renamed from: b */
    public static C113395ef m187079b(C113052b bVar) {
        if (bVar.mo99832b() != null) {
            return m187081d((float) bVar.mo99832b().f313252d, (float) bVar.mo99832b().f313254f);
        }
        return m187081d(0.0f, 0.0f);
    }

    /* renamed from: c */
    public static C113395ef m187080c(C113052b bVar) {
        if (bVar.mo99832b() != null) {
            return m187081d((float) bVar.mo99832b().f313249a, (float) bVar.mo99832b().f313250b);
        }
        return m187081d(0.0f, 0.0f);
    }

    /* renamed from: d */
    public static C113395ef m187081d(float f, float f2) {
        C113394ee eeVar = (C113394ee) C113395ef.f313995d.createBuilder();
        eeVar.copyOnWrite();
        C113395ef efVar = (C113395ef) eeVar.instance;
        efVar.f313997a |= 1;
        efVar.f313998b = (2.5f + f) / (5.0f + f2);
        eeVar.copyOnWrite();
        C113395ef efVar2 = (C113395ef) eeVar.instance;
        efVar2.f313997a |= 2;
        efVar2.f313999c = (f + 10.0f) / (f2 + 20.0f);
        return (C113395ef) eeVar.build();
    }

    /* renamed from: e */
    public final void mo99840e() {
        C22871g gVar = this.f313333n;
        this.f313336q = gVar.mo28209i(C113090ck.m187088a(this.f313323d, this.f313324e, gVar), "is enabled", new C113080ca(this));
    }
}
