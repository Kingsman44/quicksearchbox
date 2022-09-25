package com.google.android.libraries.web.weblayer.contrib.p3452a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58597ky;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.o */
/* compiled from: PG */
public final /* synthetic */ class C44157o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114898a;

    /* renamed from: b */
    public final /* synthetic */ Boolean f114899b;

    public /* synthetic */ C44157o(C44161s sVar, Boolean bool) {
        this.f114898a = sVar;
        this.f114899b = bool;
    }

    public final C60870cx apply(Object obj) {
        C44161s sVar = this.f114898a;
        boolean booleanValue = this.f114899b.booleanValue();
        List h = C58597ky.m90217h((List) obj, new C44159q(sVar));
        if (booleanValue) {
            C44148f fVar = new C44148f(sVar, h);
            return C60856cj.m92903l(C47810es.m84977q(fVar), sVar.f114906c);
        }
        C44160r rVar = new C44160r(sVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(rVar), sVar.f114908e);
        C44158p pVar = new C44158p(sVar, h);
        return C60922j.m93045h(m, C47810es.m84966f(pVar), sVar.f114907d);
    }
}
