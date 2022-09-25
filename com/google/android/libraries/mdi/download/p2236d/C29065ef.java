package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.ef */
/* compiled from: PG */
public final /* synthetic */ class C29065ef implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78880a;

    /* renamed from: b */
    public final /* synthetic */ C60931s f78881b;

    public /* synthetic */ C29065ef(C29117fe feVar, C60931s sVar) {
        this.f78880a = feVar;
        this.f78881b = sVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78880a;
        C60931s sVar = this.f78881b;
        ArrayList arrayList = new ArrayList();
        for (C29392ep epVar : (List) obj) {
            if (!epVar.f79685e) {
                C60870cx g = feVar.f78975d.mo34602g(epVar);
                C28952cq cqVar = new C28952cq(feVar, epVar, sVar);
                arrayList.add(C60922j.m93045h(g, C47810es.m84966f(cqVar), feVar.f78980i));
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C28953cr.f78650a, feVar.f78980i);
    }
}
