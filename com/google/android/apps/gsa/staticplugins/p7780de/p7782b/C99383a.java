package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87305ad;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e.C87307af;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90223c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7085d.C90224d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.a */
/* compiled from: PG */
final class C99383a extends C87305ad {

    /* renamed from: a */
    final /* synthetic */ C90224d f278048a;

    /* renamed from: b */
    final /* synthetic */ C87305ad f278049b;

    /* renamed from: c */
    final /* synthetic */ C99406c f278050c;

    public C99383a(C99406c cVar, C90224d dVar, C87305ad adVar) {
        this.f278050c = cVar;
        this.f278048a = dVar;
        this.f278049b = adVar;
    }

    /* renamed from: a */
    public final void mo80952a(C87307af afVar) {
        Throwable th = afVar.f235788b;
        if (th == null) {
            C59104x c = C99406c.f278168a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
            ((C59052c) ((C59052c) c).mo56372aa(32588)).mo56389s("Failed to show tooltip: %s", afVar.f235787a);
            return;
        }
        C59104x c2 = C99406c.f278168a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "BottomBarTooltipManager");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(th)).mo56372aa(32587)).mo56389s("Failed to show tooltip: %s", afVar.f235787a);
    }

    /* renamed from: c */
    public final void mo80954c() {
        C58976aa aaVar = C58975e.f156826a;
        int i = this.f278048a.f252053b;
        C99406c cVar = this.f278050c;
        int a = C90223c.m146769a(this.f278048a.f252053b);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        int e = cVar.mo91435e(a);
        if (e > 0) {
            C86337q b = this.f278050c.f278169b.mo80076b();
            int a2 = C90223c.m146769a(this.f278048a.f252053b);
            if (a2 != 0) {
                i2 = a2;
            }
            b.mo80070e("bottom_bar_tooltip_remaining_times_to_show_".concat(Integer.toString(i2 - 1)), e - 1);
            b.apply();
        }
        C87305ad adVar = this.f278049b;
        if (adVar != null) {
            adVar.mo80954c();
        }
    }
}
