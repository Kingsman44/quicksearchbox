package com.google.android.apps.gsa.search.core.p6805i;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.i.l */
/* compiled from: PG */
public final class C86116l {

    /* renamed from: a */
    public static final long f232759a = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: b */
    private final C86127w f232760b;

    /* renamed from: c */
    private final C88483e f232761c;

    public C86116l(C86127w wVar, C88483e eVar) {
        this.f232760b = wVar;
        this.f232761c = eVar;
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: a */
    public final C60870cx mo79734a() {
        if (this.f232760b.f232790a.mo79722a().getBoolean("remove_experiment_overrides", false)) {
            C58976aa aaVar = C58975e.f156826a;
            return C118826c.f331423b;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        ClientEventData a = new C88489j(C87739bu.UPDATE_GSA_CONFIGS).mo82013a();
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.GSA_CONFIG_TASK_BACKGROUND;
        gVar.f239204f = "forwarding";
        return this.f232761c.mo82004b(new ClientConfig(gVar), a, f232759a);
    }
}
