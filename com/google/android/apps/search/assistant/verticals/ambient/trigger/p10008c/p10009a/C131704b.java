package com.google.android.apps.search.assistant.verticals.ambient.trigger.p10008c.p10009a;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.trigger.c.a.b */
/* compiled from: PG */
public final /* synthetic */ class C131704b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f359815a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f359816b;

    public /* synthetic */ C131704b(C60870cx cxVar, C60870cx cxVar2) {
        this.f359815a = cxVar;
        this.f359816b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f359815a;
        C60870cx cxVar2 = this.f359816b;
        Boolean bool = (Boolean) C60856cj.m92909r(cxVar);
        ak akVar = (ak) C60856cj.m92909r(cxVar2);
        boolean z = true;
        if ((bool == null || !bool.booleanValue()) && (akVar == null || !akVar.i)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
