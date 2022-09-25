package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87307af;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87308ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.b */
/* compiled from: PG */
final class C99405b extends C87308ag {
    public C99405b(C99406c cVar, int i, boolean z) {
        super(i, z, cVar.f278170c, cVar.f278171d, cVar.f278172e);
    }

    /* renamed from: a */
    public final void mo80952a(C87307af afVar) {
        Throwable th = afVar.f235788b;
        if (th == null) {
            C59104x c = C99406c.f278168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
            ((C59052c) ((C59052c) c).mo56372aa(32591)).mo56389s("Failed to show tooltip: %s", afVar.f235787a);
            return;
        }
        C59104x c2 = C99406c.f278168a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(th)).mo56372aa(32590)).mo56389s("Failed to show tooltip: %s", afVar.f235787a);
    }
}
