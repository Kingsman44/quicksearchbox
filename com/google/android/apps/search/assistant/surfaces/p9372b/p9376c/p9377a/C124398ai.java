package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.p9164b.C121124b;
import com.google.android.libraries.search.udcdataservice.C41389e;
import com.google.android.libraries.search.udcdataservice.C41408g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C124398ai implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f343331a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f343332b;

    public /* synthetic */ C124398ai(C60870cx cxVar, C60870cx cxVar2) {
        this.f343331a = cxVar;
        this.f343332b = cxVar2;
    }

    public final Object call() {
        int a;
        C60870cx cxVar = this.f343331a;
        C60870cx cxVar2 = this.f343332b;
        List list = (List) C60856cj.m92909r(cxVar);
        if (list.size() <= 0 || (a = C41408g.m72395a(((C41389e) list.get(0)).f108147c)) == 0 || a != 2 || !((C121124b) C60856cj.m92909r(cxVar2)).f336566b) {
            return false;
        }
        return true;
    }
}
