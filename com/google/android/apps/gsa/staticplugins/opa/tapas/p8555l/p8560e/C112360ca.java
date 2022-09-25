package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112139f;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ca */
/* compiled from: PG */
public final class C112360ca extends C112139f {

    /* renamed from: c */
    public static final C121537f f311766c = C121537f.m200840b("ReflectionSuggestionsAdjuster", C112139f.f311400b);

    /* renamed from: d */
    public static final C59071e f311767d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.ca");

    /* renamed from: e */
    public final C68214a f311768e;

    /* renamed from: f */
    public final C111248k f311769f;

    /* renamed from: g */
    public final C86124t f311770g;

    /* renamed from: h */
    public final C21370a f311771h;

    /* renamed from: i */
    public C58495hd f311772i = C58729pv.f156485a;

    /* renamed from: j */
    public final C90851k f311773j;

    public C112360ca(C68214a aVar, C111248k kVar, C90851k kVar2, C86124t tVar, C21370a aVar2) {
        this.f311768e = aVar;
        this.f311769f = kVar;
        this.f311773j = kVar2;
        this.f311770g = tVar;
        this.f311771h = aVar2;
    }

    /* renamed from: a */
    public final C48667ab mo99422a() {
        return C48667ab.REFLECTION_SUGGESTIONS_ADJUSTER;
    }

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, Map map) {
        C121537f fVar = f311766c;
        String s = epVar.mo100186s();
        return fVar.mo105234c("adjust".concat(s), new C112345bm(this, epVar, map));
    }
}
