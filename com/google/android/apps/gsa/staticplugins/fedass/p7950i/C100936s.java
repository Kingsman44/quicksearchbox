package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.s */
/* compiled from: PG */
public final /* synthetic */ class C100936s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100892ad f281980a;

    public /* synthetic */ C100936s(C100892ad adVar) {
        this.f281980a = adVar;
    }

    public final C60870cx apply(Object obj) {
        C100892ad adVar = this.f281980a;
        C60870cx i = C60856cj.m92900i(new ArrayList());
        for (String wVar : (List) obj) {
            C100940w wVar2 = new C100940w(adVar, wVar);
            i = C60922j.m93045h(i, C47810es.m84966f(wVar2), adVar.f281891f);
        }
        C100941x xVar = new C100941x(adVar);
        return C60922j.m93045h(i, C47810es.m84966f(xVar), adVar.f281891f);
    }
}
