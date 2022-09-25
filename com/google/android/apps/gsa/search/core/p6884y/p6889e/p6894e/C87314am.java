package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.am */
/* compiled from: PG */
final class C87314am extends C87305ad {
    /* renamed from: a */
    public final void mo80952a(C87307af afVar) {
        Throwable th = afVar.f235788b;
        C87306ae aeVar = afVar.f235787a;
        if (th != null) {
            C59104x c = C87316ao.f235808a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SnackbarBSConfig");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(8283)).mo56389s("%s", th.getMessage());
            return;
        }
        C87306ae aeVar2 = C87306ae.UNKNOWN;
        int ordinal = aeVar.ordinal();
        if (ordinal == 2) {
            C59104x c2 = C87316ao.f235808a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SnackbarBSConfig");
            ((C59052c) ((C59052c) c2).mo56372aa(8279)).mo56386p("Failed to show snackbar because its scope is failed to load");
        } else if (ordinal == 3) {
            C59104x c3 = C87316ao.f235808a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "SnackbarBSConfig");
            ((C59052c) ((C59052c) c3).mo56372aa(8280)).mo56386p("Failed to show snackbar because its scope is not found");
        } else if (ordinal == 5) {
            C58976aa aaVar = C58975e.f156826a;
        } else if (ordinal != 6) {
            C59104x c4 = C87316ao.f235808a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "SnackbarBSConfig");
            ((C59052c) ((C59052c) c4).mo56372aa(8278)).mo56389s("Failed to show snackbar: %s", aeVar);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
        }
    }
}
