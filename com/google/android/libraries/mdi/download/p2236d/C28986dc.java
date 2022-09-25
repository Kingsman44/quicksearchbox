package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.mdi.download.d.dc */
/* compiled from: PG */
public final /* synthetic */ class C28986dc implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78699a;

    public /* synthetic */ C28986dc(C29117fe feVar) {
        this.f78699a = feVar;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C29117fe feVar = this.f78699a;
        C28816c cVar = (C28816c) obj;
        C29392ep b = cVar.mo34484b();
        C29334dr a = cVar.mo34483a();
        if (a == null || !b.f79685e || !C29099m.m54014j(a)) {
            return C60866ct.f164955a;
        }
        if (!feVar.f78984m.mo34444x() || !C29099m.m54014j(a)) {
            cxVar = C60856cj.m92900i(true);
        } else {
            ArrayList arrayList = new ArrayList(a.f79512n.size());
            for (C29328dl dlVar : a.f79512n) {
                C60870cx i = feVar.mo34586i(dlVar, a);
                C29075ep epVar = new C29075ep(feVar, dlVar, a);
                arrayList.add(C60922j.m93045h(i, C47810es.m84966f(epVar), feVar.f78980i));
            }
            C60870cx a2 = C29672d.m54728c(arrayList).mo34823a(C29076eq.f78914a, feVar.f78980i);
            C29078es esVar = new C29078es(a);
            cxVar = C60846c.m92878g(a2, IOException.class, C47810es.m84963c(esVar), feVar.f78980i);
        }
        C29072em emVar = new C29072em(feVar, a);
        return C60922j.m93045h(cxVar, C47810es.m84966f(emVar), feVar.f78980i);
    }
}
