package com.google.android.libraries.p590as.p593b.p596b.p597a;

import com.google.android.libraries.p590as.p593b.p596b.p604g.C10874b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.as.b.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C10792h implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10795k f35820a;

    public /* synthetic */ C10792h(C10795k kVar) {
        this.f35820a = kVar;
    }

    public final C60870cx apply(Object obj) {
        C10795k kVar = this.f35820a;
        C60870cx i = C60856cj.m92900i(C58485gu.m89845m());
        if (!((C10874b) obj).equals(C10874b.MANUAL_UPDATES_ONLY)) {
            C60870cx a = kVar.f35824b.mo19272a();
            C60870cx d = kVar.f35824b.mo19275d();
            i = C47638k.m84753d(a, d).mo51521b(new C10789e(kVar, a, d), kVar.f35827e);
        }
        C60870cx g = kVar.f35824b.mo19278g();
        C10788d dVar = new C10788d(kVar);
        return C47638k.m84753d(i, C60922j.m93045h(g, C47810es.m84966f(dVar), kVar.f35827e)).mo51521b(C10790f.f35818a, kVar.f35827e);
    }
}
