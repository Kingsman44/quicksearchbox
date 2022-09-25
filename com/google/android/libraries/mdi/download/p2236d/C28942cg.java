package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.cg */
/* compiled from: PG */
public final /* synthetic */ class C28942cg implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78611a;

    /* renamed from: b */
    public final /* synthetic */ C58528ij f78612b;

    public /* synthetic */ C28942cg(C29117fe feVar, C58528ij ijVar) {
        this.f78611a = feVar;
        this.f78612b = ijVar;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78611a;
        C58528ij ijVar = this.f78612b;
        ArrayList arrayList = new ArrayList();
        for (C29392ep epVar : (List) obj) {
            if (!epVar.f79684d.isEmpty() && !ijVar.contains(epVar.f79684d)) {
                C60870cx g = feVar.f78975d.mo34602g(epVar);
                C28939cd cdVar = new C28939cd(feVar, epVar);
                arrayList.add(C60922j.m93045h(g, C47810es.m84966f(cdVar), feVar.f78980i));
            }
        }
        return C29672d.m54726a(arrayList).mo34823a(C28941cf.f78610a, feVar.f78980i);
    }
}
