package com.google.android.apps.gsa.search.core.udc;

import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.udc.ac */
/* compiled from: PG */
public final class C87199ac implements C86109e {

    /* renamed from: a */
    private final C68214a f235607a;

    /* renamed from: b */
    private final C68214a f235608b;

    public C87199ac(C68214a aVar, C68214a aVar2) {
        this.f235607a = aVar;
        this.f235608b = aVar2;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        boolean e = tVar.mo79746e(C90109fg.f250575q);
        if (e != ((C86338r) this.f235607a.mo27525b()).getBoolean(C90507o.f253021k, false)) {
            C58976aa aaVar = C58975e.f156826a;
            C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 1;
            agVar.f328821a |= 4;
            ((C118561t) this.f235608b.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
            C86337q b = ((C86338r) this.f235607a.mo27525b()).mo80076b();
            if (e) {
                b.mo80067b(C90507o.f253021k, true);
            } else {
                b.mo80075j(C90507o.f253021k);
            }
            b.apply();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo70819b(C86124t tVar) {
    }
}
