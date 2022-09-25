package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124715m;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bx */
/* compiled from: PG */
public final /* synthetic */ class C89485bx implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C89485bx f242517a = new C89485bx();

    private /* synthetic */ C89485bx() {
    }

    public final Object apply(Object obj) {
        C124548d dVar = null;
        for (C124548d dVar2 : (List) obj) {
            C124715m j = dVar2.mo106512j();
            if (j == C124715m.FULLY_CONNECTED || j == C124715m.AUDIO_ONLY || j == C124715m.DATA_ONLY) {
                C58976aa aaVar = C58975e.f156826a;
                return dVar2;
            } else if (dVar == null || dVar.mo106469J().isEmpty() || true == ((Instant) dVar2.mo106469J().orElse(Instant.MIN)).isAfter((Instant) dVar.mo106469J().get())) {
                dVar = dVar2;
            }
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return dVar;
    }
}
