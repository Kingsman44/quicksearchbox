package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.search.core.p6805i.C86116l;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.google.bv */
/* compiled from: PG */
public final class C85899bv implements C118549h {

    /* renamed from: a */
    private final C88483e f232237a;

    public C85899bv(C88483e eVar) {
        this.f232237a = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C58976aa aaVar = C58975e.f156826a;
        ClientEventData a = new C88489j(C87739bu.PROPERTIES_UPDATE_IN_PHENOTYPE).mo82013a();
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.GSA_CONFIG_TASK_BACKGROUND;
        gVar.f239204f = "forwarding";
        return this.f232237a.mo82004b(new ClientConfig(gVar), a, C86116l.f232759a);
    }
}
