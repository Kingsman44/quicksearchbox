package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95691o;
import com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.C95692p;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.l */
/* compiled from: PG */
public final /* synthetic */ class C95663l implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C95665n f267780a;

    /* renamed from: b */
    public final /* synthetic */ List f267781b;

    public /* synthetic */ C95663l(C95665n nVar, List list) {
        this.f267780a = nVar;
        this.f267781b = list;
    }

    public final void run() {
        C95665n nVar = this.f267780a;
        List list = this.f267781b;
        C22872h.m42742b(C0826b.class);
        nVar.mo89632a();
        C95652af afVar = nVar.f267786d.f267766b;
        if (!new C95691o(afVar.f267728b, 1, afVar.f267729c, afVar.f267730d, afVar.f267731e, afVar.f267735i, afVar.f267736j, afVar.f267738l, afVar.f267739m, afVar.f267737k, C95692p.f267905c).mo89638w()) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (nVar.f267791i.isEmpty()) {
            C58976aa aaVar2 = C58975e.f156826a;
        } else {
            nVar.f267791i.clear();
            String i = nVar.f267787e.mo89216i(nVar.f267784b, 8);
            if (i != null) {
                C58976aa aaVar3 = C58975e.f156826a;
                String c = ((C90421b) list.get(0)).mo84145c();
                if (!nVar.f267785c.f267694b.mo89168p() && nVar.f267785c.mo89615c() && nVar.f267785c.mo89616d()) {
                    nVar.f267785c.mo89618f(new C95657f(new C95658g(nVar.f267784b, nVar.f267787e, i, new C95664m(nVar), (C95672u) null, c, 8, nVar.f267789g, nVar.f267790h), nVar.f267787e, 8, (Runnable) null));
                }
            }
        }
    }
}
