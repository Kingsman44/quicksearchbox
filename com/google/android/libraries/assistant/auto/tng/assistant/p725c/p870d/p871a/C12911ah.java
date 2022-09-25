package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C12911ah implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12914ak f40183a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f40184b;

    public /* synthetic */ C12911ah(C12914ak akVar, C60870cx cxVar) {
        this.f40183a = akVar;
        this.f40184b = cxVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12914ak akVar = this.f40183a;
        this.f40184b.cancel(false);
        C12953w wVar = akVar.f40206r;
        if (wVar == null) {
            return C60866ct.f164955a;
        }
        wVar.f40314a.cancel(false);
        C60870cx cxVar = wVar.f40314a;
        C12952v vVar = C12952v.f40313a;
        return C60922j.m93045h(cxVar, C47810es.m84966f(vVar), wVar.f40316c);
    }
}
