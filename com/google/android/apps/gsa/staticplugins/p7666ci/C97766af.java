package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.af */
/* compiled from: PG */
public final /* synthetic */ class C97766af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97775ao f272980a;

    public /* synthetic */ C97766af(C97775ao aoVar) {
        this.f272980a = aoVar;
    }

    public final C60870cx apply(Object obj) {
        C97775ao aoVar = this.f272980a;
        if (!((Boolean) obj).booleanValue() || aoVar.f272995i) {
            C58976aa aaVar = C58975e.f156826a;
            return C60866ct.f164955a;
        }
        C47633f.m84733g(aoVar.f272988b.mo106145a()).mo51516i(new C97768ah(aoVar), aoVar.f272993g);
        C60872cz e = aoVar.f272992f.mo29165e(new C97769ai(aoVar), 30, TimeUnit.SECONDS);
        C60870cx b = aoVar.f272990d.mo79697b();
        C60870cx b2 = C47638k.m84751b(b, e).mo51521b(new C97770aj(aoVar, b), aoVar.f272993g);
        C60870cx a = aoVar.f272994h.mo106152a();
        C97772al alVar = new C97772al();
        C60856cj.m92911t(a, C47810es.m84974n(alVar), C60826bg.f164896a);
        return C47638k.m84751b(b2, a).mo51520a(C97771ak.f272986a, aoVar.f272993g);
    }
}
