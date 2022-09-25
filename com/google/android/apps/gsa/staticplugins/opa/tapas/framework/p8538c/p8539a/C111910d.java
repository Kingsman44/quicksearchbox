package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.d */
/* compiled from: PG */
public final class C111910d implements C111917k {

    /* renamed from: a */
    private static final C121537f f310939a = C121537f.m200840b("Tapas/Prefetch/CurrentSuggestion", C121511c.f337208a);

    /* renamed from: a */
    public final C58485gu mo99294a(C113408es esVar) {
        if (esVar.mo100053o().isEmpty()) {
            f310939a.mo105240i("post_fetch_from_empty_response");
        } else {
            f310939a.mo105240i("post_fetch_from_non_empty_response");
        }
        return (C58485gu) Collection.EL.stream(esVar.mo100053o()).map(C111908b.f310938a).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public final /* synthetic */ C58485gu mo99295b(String str) {
        return C58485gu.m89845m();
    }

    /* renamed from: c */
    public final String mo99296c() {
        return BuildConfig.FLAVOR;
    }
}
