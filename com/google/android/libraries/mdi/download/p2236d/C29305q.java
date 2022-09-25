package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.mdi.download.d.q */
/* compiled from: PG */
public final /* synthetic */ class C29305q implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29314z f79426a;

    public /* synthetic */ C29305q(C29314z zVar) {
        this.f79426a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C29314z zVar = this.f79426a;
        ArrayList arrayList = new ArrayList();
        for (C29334dr drVar : (List) obj) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C29330dn dnVar = drVar.f79500b;
            if (dnVar == null) {
                dnVar = C29330dn.f79488g;
            }
            if (C29099m.m54012h(Math.min(timeUnit.toMillis(dnVar.f79491b), C29099m.m54005a(drVar)), zVar.f79445f)) {
                zVar.f79444e.mo34544i(1052, drVar.f79501c, drVar.f79503e, drVar.f79516r, drVar.f79517s);
                if (C29099m.m54014j(drVar)) {
                    C29099m.m54010f(zVar.f79440a, zVar.f79447h, drVar, zVar.f79446g);
                }
            } else {
                arrayList.add(drVar);
            }
        }
        C60870cx k = zVar.f79441b.mo34606k();
        C29303o oVar = new C29303o(zVar, arrayList);
        return C60922j.m93045h(k, C47810es.m84966f(oVar), zVar.f79449j);
    }
}
