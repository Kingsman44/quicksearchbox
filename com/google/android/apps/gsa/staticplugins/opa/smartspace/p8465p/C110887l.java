package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8465p;

import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.p.l */
/* compiled from: PG */
public final /* synthetic */ class C110887l implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C110887l f308914a = new C110887l();

    private /* synthetic */ C110887l() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C83800p pVar;
        Collection collection;
        List list = (List) obj;
        if (list.get(0) == null) {
            pVar = C83800p.m133473k().mo77042a();
        } else {
            pVar = (C83800p) list.get(0);
        }
        if (list.get(1) == null) {
            collection = new ArrayList();
        } else {
            collection = (List) list.get(1);
        }
        C83798n a = pVar.mo77055a();
        a.mo77046e(C58485gu.m89842j(collection));
        return C60856cj.m92900i(a.mo77042a());
    }
}
