package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113190cu;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.c */
/* compiled from: PG */
public final class C112177c implements C112175a {

    /* renamed from: e */
    private static final C59071e f311432e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.c");

    /* renamed from: f */
    private static final C121537f f311433f = C121537f.m200840b("Tapas/MixAdjustersHelperImplV1", C121511c.f337208a);

    /* renamed from: a */
    public final C86124t f311434a;

    /* renamed from: b */
    public final C112189o f311435b;

    /* renamed from: c */
    public Optional f311436c = Optional.empty();

    /* renamed from: d */
    public Optional f311437d = Optional.empty();

    /* renamed from: g */
    private final C68214a f311438g;

    /* renamed from: h */
    private final C68214a f311439h;

    /* renamed from: i */
    private final C68214a f311440i;

    /* renamed from: j */
    private final C68214a f311441j;

    /* renamed from: k */
    private final C68214a f311442k;

    /* renamed from: l */
    private final C68214a f311443l;

    /* renamed from: m */
    private final C68214a f311444m;

    /* renamed from: n */
    private final C68214a f311445n;

    /* renamed from: o */
    private final C68214a f311446o;

    /* renamed from: p */
    private final C68214a f311447p;

    /* renamed from: q */
    private final C68214a f311448q;

    /* renamed from: r */
    private final C68214a f311449r;

    /* renamed from: s */
    private final C68214a f311450s;

    /* renamed from: t */
    private final C68214a f311451t;

    /* renamed from: u */
    private final C68214a f311452u;

    public C112177c(C86124t tVar, C112189o oVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C68214a aVar15) {
        this.f311434a = tVar;
        this.f311435b = oVar;
        this.f311438g = aVar;
        this.f311439h = aVar2;
        this.f311440i = aVar3;
        this.f311441j = aVar4;
        this.f311442k = aVar5;
        this.f311443l = aVar6;
        this.f311444m = aVar7;
        this.f311445n = aVar8;
        this.f311446o = aVar9;
        this.f311447p = aVar11;
        this.f311448q = aVar10;
        this.f311449r = aVar12;
        this.f311450s = aVar13;
        this.f311451t = aVar14;
        this.f311452u = aVar15;
    }

    /* renamed from: d */
    private final C113405ep m186059d(C48674ai aiVar) {
        return ((C113190cu) this.f311452u.mo27525b()).mo99904b(BuildConfig.FLAVOR, C19167ba.f53673s, C51331dt.UNKNOWN_TRIGGER_TRUST_LEVEL, aiVar).mo100001a();
    }

    /* renamed from: a */
    public final C58485gu mo99460a(C113405ep epVar) {
        return (C58485gu) f311433f.mo105235d("getMixAdjusters", new C112176b(this, epVar));
    }

    /* renamed from: b */
    public final void mo99461b(C19167ba baVar) {
        if (baVar.f53679g) {
            try {
                mo99460a(m186059d(C48674ai.ASSISTANT));
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f311432e.mo56225c()).mo56382g(th)).mo56372aa(27634)).mo56386p("Warming up mix adjusters failed");
            }
        }
        if (baVar.f53678f) {
            try {
                mo99460a(m186059d(C48674ai.GEMINI));
            } catch (Throwable th2) {
                ((C59052c) ((C59052c) ((C59052c) f311432e.mo56225c()).mo56382g(th2)).mo56372aa(27633)).mo56386p("Warming up Gemini mix adjusters failed");
            }
        }
    }

    /* renamed from: c */
    public final C58485gu mo99462c(boolean z, C58485gu guVar) {
        C58490gz gzVar = new C58490gz(4);
        if (this.f311434a.mo79746e(C90014bt.f247749my)) {
            gzVar.mo55429h(C48667ab.DUPLICATE_SUGGESTIONS_SUPPRESSOR, this.f311438g);
        }
        if (this.f311434a.mo79746e(C90014bt.f247750mz)) {
            gzVar.mo55429h(C48667ab.TAPAS_SUGGESTIONS_TRUNCATOR, this.f311439h);
        }
        gzVar.mo55429h(C48667ab.REFLECTION_SUGGESTION_ADJUSTER, this.f311440i);
        gzVar.mo55429h(C48667ab.REFLECTION_SUGGESTIONS_ADJUSTER, this.f311440i);
        gzVar.mo55429h(C48667ab.LOW_SCORE_SUPPRESSOR, this.f311442k);
        gzVar.mo55429h(C48667ab.ZERO_STATE_ADJUSTER, this.f311443l);
        gzVar.mo55429h(C48667ab.ENTITY_TYPE_ADJUSTER, this.f311444m);
        gzVar.mo55429h(C48667ab.PERSONAL_PUBLIC_QUERY_ADJUSTER, this.f311445n);
        gzVar.mo55429h(C48667ab.CONTEXTUAL_SUPPRESSOR, this.f311446o);
        gzVar.mo55429h(C48667ab.HOME_AUTOMATION_ADJUSTER, this.f311447p);
        gzVar.mo55429h(C48667ab.OFFLINE_CLIENT_SUPPRESSOR, this.f311448q);
        gzVar.mo55429h(C48667ab.TAPAS_APP_ACTIONS_SLICE_ADJUSTER, this.f311449r);
        gzVar.mo55429h(C48667ab.TF_TRIGGERING_ADJUSTER, this.f311450s);
        gzVar.mo55429h(C48667ab.NG3_SCORE_ADJUSTER, this.f311451t);
        C58495hd f = gzVar.mo55427f(false);
        C58480gp e = C58485gu.m89837e();
        if (z) {
            e.mo55395g((C112145l) this.f311441j.mo27525b());
        }
        int size = guVar.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C48667ab abVar = (C48667ab) guVar.get(i);
            C68214a aVar = (C68214a) f.get(abVar);
            if (aVar == null) {
                f311433f.mo105240i("invalid_adjuster_".concat(String.valueOf(abVar.name())));
                ((C59052c) ((C59052c) f311432e.mo56225c()).mo56372aa(27632)).mo56387q("Could not find specified adjuster '%s'", abVar.f125795r);
            } else {
                if (abVar == C48667ab.REFLECTION_SUGGESTION_ADJUSTER || abVar == C48667ab.REFLECTION_SUGGESTIONS_ADJUSTER) {
                    if (z2) {
                        f311433f.mo105240i("duplicate_reflection_adjuster");
                        ((C59052c) ((C59052c) f311432e.mo56225c()).mo56372aa(27631)).mo56386p("Already added Reflection Adjuster");
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                }
                e.mo55395g((C112145l) aVar.mo27525b());
            }
        }
        return e.mo55394f();
    }
}
