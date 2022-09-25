package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2237a.C28816c;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.j */
/* compiled from: PG */
public final /* synthetic */ class C29220j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79218a;

    public /* synthetic */ C29220j(C29314z zVar) {
        this.f79218a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79218a;
        ArrayList arrayList = new ArrayList();
        for (C28816c cVar : (List) obj) {
            C29392ep b = cVar.mo34484b();
            C29334dr a = cVar.mo34483a();
            Long valueOf = Long.valueOf(C29099m.m54005a(a));
            C29045l.m53932d("%s: Checking group %s with expiration date %s", "ExpirationHandler", a.f79501c, valueOf);
            if (C29099m.m54012h(valueOf.longValue(), zVar.f79445f)) {
                zVar.f79444e.mo34544i(1051, a.f79501c, a.f79503e, a.f79516r, a.f79517s);
                C29045l.m53932d("%s: Expired group %s with expiration date %s", "ExpirationHandler", a.f79501c, valueOf);
                arrayList.add(b);
                if (C29099m.m54014j(a)) {
                    C29099m.m54010f(zVar.f79440a, zVar.f79447h, a, zVar.f79446g);
                }
            }
        }
        C60870cx j = zVar.f79441b.mo34605j(arrayList);
        C29308t tVar = new C29308t(zVar);
        return C60922j.m93044g(j, C47810es.m84963c(tVar), zVar.f79449j);
    }
}
