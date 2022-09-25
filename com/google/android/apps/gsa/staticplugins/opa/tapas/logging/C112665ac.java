package com.google.android.apps.gsa.staticplugins.opa.tapas.logging;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79932ag;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112557l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113372dm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.logging.p3039b.C38830b;
import com.google.android.libraries.search.logging.p3039b.C38833e;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.p4537i.C59294s;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Optional;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ac */
/* compiled from: PG */
public final class C112665ac {

    /* renamed from: a */
    public static final C59071e f312273a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.logging.ac");

    /* renamed from: b */
    public static final C121537f f312274b = C121537f.m200840b("Tapas/TapasMLLogger", C121511c.f337208a);

    /* renamed from: c */
    public final C38830b f312275c;

    /* renamed from: d */
    public final C68214a f312276d;

    /* renamed from: e */
    public final C38833e f312277e;

    /* renamed from: f */
    public final C86054o f312278f;

    /* renamed from: g */
    public final C86124t f312279g;

    /* renamed from: h */
    public final C22871g f312280h;

    /* renamed from: i */
    public final C68214a f312281i;

    /* renamed from: j */
    public final C68214a f312282j;

    /* renamed from: k */
    public final C111248k f312283k;

    /* renamed from: l */
    public final C113372dm f312284l;

    /* renamed from: m */
    private final String f312285m;

    /* renamed from: n */
    private final C22871g f312286n;

    public C112665ac(C38830b bVar, C68214a aVar, C38833e eVar, C86054o oVar, C86124t tVar, String str, C22871g gVar, C22871g gVar2, C68214a aVar2, C68214a aVar3, C111248k kVar, C113372dm dmVar) {
        this.f312275c = bVar;
        this.f312276d = aVar;
        this.f312277e = eVar;
        this.f312278f = oVar;
        this.f312279g = tVar;
        this.f312285m = str;
        this.f312286n = gVar;
        this.f312280h = gVar2;
        this.f312281i = aVar2;
        this.f312282j = aVar3;
        this.f312283k = kVar;
        this.f312284l = dmVar;
    }

    /* renamed from: a */
    public static Optional m186455a(C113415ez ezVar) {
        Optional c = C112557l.m186377c(ezVar);
        if (c.isEmpty()) {
            return Optional.empty();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((C79932ag) c.get()).f219136d);
        sb.append(",");
        sb.append(ezVar.mo100199L());
        return Optional.m71637of(Long.valueOf(C59294s.m92132b().mo56759a(sb, StandardCharsets.UTF_8).mo56773c()));
    }

    /* renamed from: b */
    public static Optional m186456b(C113408es esVar, OptionalInt optionalInt, String str, C59743a aVar, int i, boolean z, int i2, C22871g gVar) {
        if (esVar.mo100133n().isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of(gVar.mo28209i((C60870cx) ((C58881cr) esVar.mo100133n().get()).mo6453a(), "[Tapas] prepare model extension log", new C112664ab(esVar, optionalInt, str, aVar, i, z, i2)));
    }

    /* renamed from: c */
    public final void mo99617c(int i, C113408es esVar, OptionalInt optionalInt, int i2, C59743a aVar) {
        C113408es esVar2 = esVar;
        OptionalInt optionalInt2 = optionalInt;
        C59743a aVar2 = aVar;
        int i3 = i;
        Optional b = m186456b(esVar2, optionalInt2, this.f312285m, aVar2, i3, this.f312279g.mo79746e(C90063do.f249373cM), i2, this.f312280h);
        if (b.isEmpty()) {
            f312274b.mo105240i("tapasMLLogger_missingExt");
            return;
        }
        C60870cx cxVar = (C60870cx) b.get();
        new C90873ag(this.f312286n.mo28210j(cxVar, "[Tapas] build ML query event", new C112717y(this, aVar)), this.f312280h, "[Tapas] log ML query", new C112718z(this, cxVar, aVar)).mo85223a(new C112663aa(aVar));
    }
}
