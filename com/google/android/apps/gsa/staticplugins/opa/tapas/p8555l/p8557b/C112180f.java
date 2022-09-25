package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8557b;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.f */
/* compiled from: PG */
public final class C112180f implements C112175a {

    /* renamed from: a */
    public static final C59071e f311455a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.b.f");

    /* renamed from: b */
    public static final C121537f f311456b = C121537f.m200840b("Tapas/MixAdjustersHelperImplV2", C121511c.f337208a);

    /* renamed from: c */
    public final C68214a f311457c;

    /* renamed from: d */
    public Optional f311458d = Optional.empty();

    /* renamed from: e */
    private final C86124t f311459e;

    /* renamed from: f */
    private final C68214a f311460f;

    /* renamed from: g */
    private final C68214a f311461g;

    /* renamed from: h */
    private final C68214a f311462h;

    /* renamed from: i */
    private final C68214a f311463i;

    /* renamed from: j */
    private final C68214a f311464j;

    /* renamed from: k */
    private final C68214a f311465k;

    /* renamed from: l */
    private final C68214a f311466l;

    /* renamed from: m */
    private final C68214a f311467m;

    /* renamed from: n */
    private final C68214a f311468n;

    /* renamed from: o */
    private final C68214a f311469o;

    /* renamed from: p */
    private final C68214a f311470p;

    /* renamed from: q */
    private final C68214a f311471q;

    /* renamed from: r */
    private final C68214a f311472r;

    public C112180f(C86124t tVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14) {
        this.f311459e = tVar;
        this.f311460f = aVar;
        this.f311461g = aVar2;
        this.f311462h = aVar3;
        this.f311457c = aVar4;
        this.f311463i = aVar5;
        this.f311464j = aVar6;
        this.f311465k = aVar7;
        this.f311466l = aVar8;
        this.f311467m = aVar9;
        this.f311468n = aVar11;
        this.f311469o = aVar10;
        this.f311470p = aVar12;
        this.f311471q = aVar13;
        this.f311472r = aVar14;
    }

    /* renamed from: a */
    public final C58485gu mo99460a(C113405ep epVar) {
        return (C58485gu) f311456b.mo105235d("getMixAdjusters", new C112179e(this, epVar));
    }

    /* renamed from: b */
    public final void mo99461b(C19167ba baVar) {
        if (this.f311458d.isEmpty()) {
            this.f311458d = Optional.m71637of(mo99463c());
        }
    }

    /* renamed from: c */
    public final C58495hd mo99463c() {
        C58490gz gzVar = new C58490gz(4);
        if (this.f311459e.mo79746e(C90014bt.f247749my)) {
            gzVar.mo55429h(C48667ab.DUPLICATE_SUGGESTIONS_SUPPRESSOR, this.f311460f);
        }
        if (this.f311459e.mo79746e(C90014bt.f247750mz)) {
            gzVar.mo55429h(C48667ab.TAPAS_SUGGESTIONS_TRUNCATOR, this.f311461g);
        }
        gzVar.mo55429h(C48667ab.REFLECTION_SUGGESTION_ADJUSTER, this.f311462h);
        gzVar.mo55429h(C48667ab.REFLECTION_SUGGESTIONS_ADJUSTER, this.f311462h);
        gzVar.mo55429h(C48667ab.LOW_SCORE_SUPPRESSOR, this.f311463i);
        gzVar.mo55429h(C48667ab.ZERO_STATE_ADJUSTER, this.f311464j);
        gzVar.mo55429h(C48667ab.ENTITY_TYPE_ADJUSTER, this.f311465k);
        gzVar.mo55429h(C48667ab.PERSONAL_PUBLIC_QUERY_ADJUSTER, this.f311466l);
        gzVar.mo55429h(C48667ab.CONTEXTUAL_SUPPRESSOR, this.f311467m);
        gzVar.mo55429h(C48667ab.HOME_AUTOMATION_ADJUSTER, this.f311468n);
        gzVar.mo55429h(C48667ab.OFFLINE_CLIENT_SUPPRESSOR, this.f311469o);
        gzVar.mo55429h(C48667ab.TAPAS_APP_ACTIONS_SLICE_ADJUSTER, this.f311470p);
        gzVar.mo55429h(C48667ab.TF_TRIGGERING_ADJUSTER, this.f311471q);
        gzVar.mo55429h(C48667ab.NG3_SCORE_ADJUSTER, this.f311472r);
        return gzVar.mo55427f(false);
    }
}
