package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7507i.p7508a;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94641e;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.i.a.w */
/* compiled from: PG */
public final /* synthetic */ class C95674w implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95651ae f267825a;

    /* renamed from: b */
    public final /* synthetic */ Set f267826b;

    public /* synthetic */ C95674w(C95651ae aeVar, Set set) {
        this.f267825a = aeVar;
        this.f267826b = set;
    }

    public final void run() {
        C95651ae aeVar = this.f267825a;
        Set set = this.f267826b;
        C58976aa aaVar = C58975e.f156826a;
        C95665n nVar = aeVar.f267718i;
        C22872h.m42742b(C0826b.class);
        nVar.f267791i.removeAll(set);
        if (nVar.f267791i.isEmpty()) {
            nVar.mo89632a();
        }
        C95646a aVar = aeVar.f267715f;
        C94641e eVar = (C94641e) aVar.f267696d.get();
        if (eVar != null) {
            eVar.mo88591j(set);
        }
        if (aVar.f267694b.mo89168p()) {
            aVar.f267694b.mo89171s(set, false);
        }
    }
}
