package com.google.android.apps.gsa.staticplugins.bisto.p7457a;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90364ac;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.a.h */
/* compiled from: PG */
public final class C94644h {
    /* renamed from: a */
    public static Set m156132a(C89656k kVar) {
        String d = kVar.mo83549d("bisto_spoken_notifications_apps");
        if (d == null) {
            d = new C90364ac(kVar).mo84074a();
        }
        return C58758qx.m90648f(C58869cf.m90936b(new C58903m(',')).mo56153g(d));
    }

    /* renamed from: b */
    public static void m156133b(int i, C95285o oVar, C95284n nVar) {
        C94643g gVar = new C94643g(oVar, nVar);
        if (i == 3) {
            oVar.mo89201a(350, gVar);
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        oVar.mo89202b(0, gVar);
    }
}
