package com.google.android.apps.gsa.sidekick.main.notifications;

import android.location.Location;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.search.location.C38570a;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.ar */
/* compiled from: PG */
final class C91503ar extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91505at f255227a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91503ar(C91505at atVar) {
        super("ReRegisterAllGeofences", 2, 4);
        this.f255227a = atVar;
    }

    public final void run() {
        C58976aa aaVar = C58975e.f156826a;
        C91505at atVar = this.f255227a;
        try {
            C74637ae aeVar = atVar.f255233f;
            C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SEARCH_SIDEKICK_LO);
            ((C38570a) d).f101954b = 3;
            Location location = (Location) C90877ak.m148472f(aeVar.mo71020c(d.mo41492a()));
            if (location != null) {
                atVar.mo85852c(location);
            }
        } catch (ExecutionException e) {
            C59104x d2 = C91505at.f255228a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(11663)).mo56386p("Unable to get location");
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            C59104x d3 = C91505at.f255228a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "NotificationGeofenceHe");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e2)).mo56372aa(11664)).mo56386p("Interrupted while getting last location");
        }
    }
}
