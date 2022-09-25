package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ao */
/* compiled from: PG */
public final class C111903ao implements C111917k {

    /* renamed from: a */
    public static final C121537f f310933a = C121537f.m200840b("Tapas/Prefetch/GlobalQuery", C121511c.f337208a);

    /* renamed from: b */
    public static final C59071e f310934b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.ao");

    /* renamed from: c */
    private final C58495hd f310935c;

    public C111903ao(C58495hd hdVar) {
        this.f310935c = hdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C58485gu mo99294a(C113408es esVar) {
        return C58485gu.m89845m();
    }

    /* renamed from: b */
    public final C58485gu mo99295b(String str) {
        return (C58485gu) this.f310935c.getOrDefault(str.toLowerCase(Locale.getDefault()), C58485gu.m89845m());
    }

    /* renamed from: c */
    public final String mo99296c() {
        return BuildConfig.FLAVOR;
    }
}
