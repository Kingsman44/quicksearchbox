package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.p9180b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d.C121220ae;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.b.k */
/* compiled from: PG */
public final /* synthetic */ class C121232k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C121237p f336760a;

    /* renamed from: b */
    public final /* synthetic */ C48714bv f336761b;

    public /* synthetic */ C121232k(C121237p pVar, C48714bv bvVar) {
        this.f336760a = pVar;
        this.f336761b = bvVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx i;
        C121237p pVar = this.f336760a;
        C48714bv bvVar = this.f336761b;
        Boolean bool = (Boolean) obj;
        if (!pVar.f336776f.containsKey(bvVar)) {
            return C60856cj.m92900i(C121220ae.f336741f);
        }
        C121236o oVar = (C121236o) pVar.f336776f.get(bvVar);
        synchronized (oVar) {
            if (oVar.mo105092f()) {
                Optional c = oVar.mo105089c();
                if (c.isEmpty()) {
                    i = C60856cj.m92900i(C121220ae.f336741f);
                } else {
                    i = (C60870cx) c.get();
                }
            } else if (oVar.mo105093g(pVar.f336774d.mo57444a())) {
                i = C60856cj.m92900i(C121220ae.f336741f);
            } else {
                i = C60856cj.m92900i(oVar.mo105087a());
            }
        }
        return i;
    }
}
