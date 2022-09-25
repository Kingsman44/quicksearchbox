package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.af */
/* compiled from: PG */
public final /* synthetic */ class C111815af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C111823an f310745a;

    public /* synthetic */ C111815af(C111823an anVar) {
        this.f310745a = anVar;
    }

    public final void run() {
        C111823an anVar = this.f310745a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C58526ih ihVar = new C58526ih();
        for (C111824ao aoVar : anVar.f310758a) {
            C60870cx b = aoVar.mo99256b();
            if (C90877ak.m148480n(b)) {
                arrayList.add((C113408es) C90877ak.m148474h(b));
            } else if (C90877ak.m148478l(b)) {
                ihVar.mo55373c(aoVar.mo99255a());
            } else {
                arrayList2.add(b);
            }
        }
        C121537f fVar = C111825ap.f310762a;
        C58976aa aaVar = C58975e.f156826a;
        anVar.mo99254d(arrayList, ihVar.mo55486f(), arrayList2);
    }
}
