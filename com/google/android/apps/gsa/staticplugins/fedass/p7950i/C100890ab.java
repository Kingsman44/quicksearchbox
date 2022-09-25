package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ab */
/* compiled from: PG */
public final /* synthetic */ class C100890ab implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C100892ad f281882a;

    /* renamed from: b */
    public final /* synthetic */ List f281883b;

    public /* synthetic */ C100890ab(C100892ad adVar, List list) {
        this.f281882a = adVar;
        this.f281883b = list;
    }

    public final C60870cx apply(Object obj) {
        C100892ad adVar = this.f281882a;
        List<String> list = this.f281883b;
        Void voidR = (Void) obj;
        C60870cx cxVar = C60866ct.f164955a;
        for (String zVar : list) {
            C100943z zVar2 = new C100943z(adVar, zVar);
            cxVar = C60922j.m93045h(cxVar, C47810es.m84966f(zVar2), adVar.f281891f);
        }
        return cxVar;
    }
}
