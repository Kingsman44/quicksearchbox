package com.google.android.apps.gsa.search.core.google;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86116l;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
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

/* renamed from: com.google.android.apps.gsa.search.core.google.z */
/* compiled from: PG */
public final class C86084z implements C118549h {

    /* renamed from: a */
    private final C86338r f232682a;

    /* renamed from: b */
    private final C88483e f232683b;

    public C86084z(C86338r rVar, C88483e eVar) {
        this.f232682a = rVar;
        this.f232683b = eVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        if (!this.f232682a.getBoolean("remove_experiment_overrides", false)) {
            C58976aa aaVar = C58975e.f156826a;
            ClientEventData a = new C88489j(C87739bu.FETCH_CONFIGS_FROM_PHENOTYPE).mo82013a();
            C88486g gVar = new C88486g();
            gVar.f239201c = amo.GSA_CONFIG_TASK_BACKGROUND;
            gVar.f239204f = "forwarding";
            return this.f232683b.mo82004b(new ClientConfig(gVar), a, C86116l.f232759a);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return C118826c.f331423b;
    }
}
