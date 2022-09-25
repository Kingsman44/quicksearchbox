package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.o */
/* compiled from: PG */
public final /* synthetic */ class C101155o implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101166z f282382a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f282383b;

    public /* synthetic */ C101155o(C101166z zVar, C60870cx cxVar) {
        this.f282382a = zVar;
        this.f282383b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C101166z zVar = this.f282382a;
        Void voidR = (Void) obj;
        C60870cx cxVar = C60866ct.f164955a;
        for (String pVar : (List) C60856cj.m92909r(this.f282383b)) {
            C101156p pVar2 = new C101156p(zVar, pVar);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(pVar2), zVar.f282404i);
        }
        return cxVar;
    }
}
