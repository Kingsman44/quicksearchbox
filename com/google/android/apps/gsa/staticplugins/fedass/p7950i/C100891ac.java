package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ac */
/* compiled from: PG */
public final /* synthetic */ class C100891ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100892ad f281884a;

    /* renamed from: b */
    public final /* synthetic */ List f281885b;

    public /* synthetic */ C100891ac(C100892ad adVar, List list) {
        this.f281884a = adVar;
        this.f281885b = list;
    }

    public final C60870cx apply(Object obj) {
        C100892ad adVar = this.f281884a;
        List<String> list = this.f281885b;
        Void voidR = (Void) obj;
        C60870cx cxVar = C60866ct.f164955a;
        for (String vVar : list) {
            C100939v vVar2 = new C100939v(adVar, vVar);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(vVar2), adVar.f281891f);
        }
        return cxVar;
    }
}
