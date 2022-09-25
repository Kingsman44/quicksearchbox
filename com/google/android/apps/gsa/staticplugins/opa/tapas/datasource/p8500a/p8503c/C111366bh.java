package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8500a.p8503c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C110972aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111029bz;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111054d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a.C111071u;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121492b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import com.google.p4129b.p4136c.C54773u;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.a.c.bh */
/* compiled from: PG */
public abstract class C111366bh extends C113409et implements C90991b {

    /* renamed from: k */
    public static final /* synthetic */ int f309874k = 0;

    /* renamed from: m */
    private static final C121537f f309875m = C121537f.m200840b("TapasAppActionsSource", C113409et.f314037l);

    /* renamed from: a */
    protected final C22871g f309876a;

    /* renamed from: b */
    protected final C86124t f309877b;

    /* renamed from: c */
    protected final C68214a f309878c;

    /* renamed from: d */
    protected final C68214a f309879d;

    /* renamed from: e */
    protected final C68214a f309880e;

    /* renamed from: f */
    protected final C111370f f309881f;

    /* renamed from: g */
    protected final C113206m f309882g;

    /* renamed from: h */
    protected final C111248k f309883h;

    /* renamed from: i */
    protected final C111054d f309884i;

    /* renamed from: j */
    protected final C68214a f309885j;

    public C111366bh(C22871g gVar, C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C111370f fVar, C113206m mVar, C111248k kVar, C111054d dVar, C68214a aVar4) {
        this.f309876a = gVar;
        this.f309877b = tVar;
        this.f309878c = aVar;
        this.f309879d = aVar2;
        this.f309880e = aVar3;
        this.f309881f = fVar;
        this.f309882g = mVar;
        this.f309883h = kVar;
        this.f309884i = dVar;
        this.f309885j = aVar4;
    }

    /* renamed from: b */
    public abstract int mo99114b();

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        if (!epVar.mo100031n().isPresent()) {
            return mo99119h(epVar);
        }
        return this.f309876a.mo28209i(this.f309876a.mo28210j(this.f309882g.mo99844c(), "Transform package name to Tapas suggestions.", new C111353av(this)), "Transform tapas suggestions into Tapas response", C111354aw.f309854a);
    }

    /* renamed from: e */
    public abstract int mo99115e();

    /* renamed from: f */
    public abstract C48580an mo99116f();

    /* renamed from: g */
    public abstract int mo99117g();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (this.f309877b.mo79746e(C90063do.f249395ci)) {
            fVar.mo85291r(getClass().getSimpleName());
            ((C110972aj) this.f309879d.mo27525b()).mo17602gS(fVar.mo85281e((Object) null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C60870cx mo99119h(C113405ep epVar) {
        C121492b a = f309875m.mo105233a("fetchSuggestionsThrottled");
        C60870cx j = this.f309876a.mo28210j(this.f309882g.mo99844c(), "FetchAppActionSuggestions using packageNameToScoreMap", new C111363be(this, epVar));
        new C90873ag(j, this.f309876a, "fetchSuggestions completed", new C111364bf(a)).mo85223a(new C111365bg(a));
        return j;
    }

    /* renamed from: i */
    public final C60870cx mo99120i(C111369e eVar, Map map) {
        C49301bt c = eVar.mo99123c();
        C54759g b = eVar.mo99122b();
        ((C111029bz) this.f309878c.mo27525b()).mo99018a(c.f127426b);
        C54773u uVar = b.f143681a;
        if (uVar == null) {
            uVar = C54773u.f143704c;
        }
        String str = uVar.f143706a;
        C48582b a = ((C110972aj) this.f309879d.mo27525b()).mo98996a(str);
        C60870cx f = ((C110972aj) this.f309879d.mo27525b()).mo99000f(str, C58729pv.f156485a);
        C111071u uVar2 = (C111071u) this.f309880e.mo27525b();
        C54758f fVar = b.f143682b;
        if (fVar == null) {
            fVar = C54758f.f143676b;
        }
        C60870cx c2 = uVar2.mo99042c(c, a, fVar, C58729pv.f156485a, b);
        return C60856cj.m92895d(f, c2).mo57334a(new C111355ax(this, f, c2, c, map, eVar), C60826bg.f164896a);
    }
}
