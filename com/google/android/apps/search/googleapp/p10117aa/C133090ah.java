package com.google.android.apps.search.googleapp.p10117aa;

import com.google.android.libraries.web.base.C43271v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.aa.ah */
/* compiled from: PG */
public final /* synthetic */ class C133090ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133103au f362859a;

    /* renamed from: b */
    public final /* synthetic */ Set f362860b;

    public /* synthetic */ C133090ah(C133103au auVar, Set set) {
        this.f362859a = auVar;
        this.f362860b = set;
    }

    public final C60870cx apply(Object obj) {
        C133103au auVar = this.f362859a;
        Set set = this.f362860b;
        if (!((Boolean) obj).booleanValue()) {
            return C60866ct.f164955a;
        }
        C60870cx b = auVar.f362881g.mo47042b(C43271v.WEB_LAYER);
        C133086ad adVar = new C133086ad(auVar, set);
        return C60922j.m93045h(b, C47810es.m84966f(adVar), auVar.f362878d);
    }
}
