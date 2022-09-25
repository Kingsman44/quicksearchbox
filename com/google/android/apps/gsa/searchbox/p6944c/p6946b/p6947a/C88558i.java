package com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116924j;
import com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c.C116890d;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.searchbox.c.b.a.i */
/* compiled from: PG */
final class C88558i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C88616t f239346a;

    /* renamed from: b */
    final /* synthetic */ C88560k f239347b;

    public C88558i(C88560k kVar, C88616t tVar) {
        this.f239347b = kVar;
        this.f239346a = tVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C88550a aVar = this.f239347b.f239351a;
        C88616t tVar = this.f239346a;
        C58976aa aaVar = C58975e.f156826a;
        C116890d dVar = (C116890d) ((C116924j) aVar).f324633d.remove(tVar);
        if (dVar != null) {
            dVar.f324527b.cancel(true);
            dVar.f324526a.mo83286e().mo54566a();
            return;
        }
        C118826c cVar = C118826c.f331422a;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C41626a aVar = (C41626a) obj;
    }
}
