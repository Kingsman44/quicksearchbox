package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.et */
/* compiled from: PG */
public abstract class C113409et {

    /* renamed from: l */
    public static final C121511c f314037l = C121511c.m200805a("Tapas/SuggestionSource", C121511c.f337208a);

    /* renamed from: r */
    public static boolean m187721r(C48672ag agVar) {
        C48672ag agVar2 = C48672ag.UNKNOWN;
        int ordinal = agVar.ordinal();
        return ordinal == 1 || ordinal == 2;
    }

    /* renamed from: a */
    public abstract C48672ag mo99101a();

    /* renamed from: c */
    public abstract C60870cx mo99103c(C113405ep epVar, Map map);

    /* renamed from: q */
    public final C113414ey mo100187q() {
        C113414ey R = C113415ez.m187750R();
        R.mo100175t(mo99101a());
        return R;
    }
}
