package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.dy */
/* compiled from: PG */
public final /* synthetic */ class C29008dy implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78766a;

    public /* synthetic */ C29008dy(C29117fe feVar) {
        this.f78766a = feVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78766a;
        ArrayList arrayList = new ArrayList();
        for (C29392ep epVar : (List) obj) {
            if (!feVar.mo34594s(epVar.f79683c)) {
                C60870cx g = feVar.f78975d.mo34602g(epVar);
                C28961cz czVar = new C28961cz(feVar, epVar);
                arrayList.add(C60922j.m93045h(g, C47810es.m84966f(czVar), feVar.f78980i));
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C28984da.f78695a, feVar.f78980i);
    }
}
