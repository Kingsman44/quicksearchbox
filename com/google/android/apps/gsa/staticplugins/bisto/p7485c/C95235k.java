package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.apps.gsa.staticplugins.bisto.p7482b.p7484b.C95208w;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.k */
/* compiled from: PG */
public final class C95235k {

    /* renamed from: a */
    final /* synthetic */ C95239o f266441a;

    public C95235k(C95239o oVar) {
        this.f266441a = oVar;
    }

    /* renamed from: a */
    public final void mo89146a(int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (i == 6 || i == 1) {
            C95239o oVar = this.f266441a;
            if (!oVar.f266451e) {
                oVar.f266451e = true;
                oVar.f266449c.mo89194d(new C95208w(oVar.f266448b, R.string.on_announcement_playback_failed, new Object[0]), new C95234j(this, i));
                return;
            }
        }
        C95239o oVar2 = this.f266441a;
        oVar2.f266451e = false;
        oVar2.mo89162j(i);
    }
}
