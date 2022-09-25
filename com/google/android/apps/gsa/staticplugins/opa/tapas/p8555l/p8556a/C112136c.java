package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.c */
/* compiled from: PG */
public abstract class C112136c extends C112145l {

    /* renamed from: b */
    public static final C121537f f311392b;

    /* renamed from: c */
    public static final C59071e f311393c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.c");

    static {
        C121537f b = C121537f.m200840b("PerGroupSuggestionsAdjuster", C112145l.f311417q);
        f311392b = b;
        C121511c cVar = b.f337270a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo99415b(C113405ep epVar, C48670ae aeVar, ArrayList arrayList);

    /* renamed from: i */
    public final C60870cx mo99416i(C113405ep epVar, Map map) {
        C121537f fVar = f311392b;
        String s = epVar.mo100186s();
        return fVar.mo105234c("adjust".concat(s), new C112135b(this, epVar, map));
    }
}
