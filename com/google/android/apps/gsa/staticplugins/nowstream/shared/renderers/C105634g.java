package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.support.p033v7.widget.C0660fv;
import android.support.p033v7.widget.C0673gh;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23292h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.g */
/* compiled from: PG */
public final /* synthetic */ class C105634g implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105474ab f294712a;

    public /* synthetic */ C105634g(C105474ab abVar) {
        this.f294712a = abVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C105474ab abVar = this.f294712a;
        C58976aa aaVar = C58975e.f156826a;
        if (!((Boolean) obj).booleanValue()) {
            abVar.mo94828J(true, abVar.mo94825G());
            abVar.mo94833O(false);
            abVar.f294206n = false;
            abVar.f294212t = new C23292h(abVar, abVar.f63126Q, abVar.f63795L);
            abVar.f294212t.setHasStableIds(true);
            abVar.mo94831M();
            abVar.f294209q.swapAdapter(abVar.f294212t, false);
            abVar.f294203k.mo2688d();
            C23292h hVar = abVar.f294212t;
            C0660fv b = abVar.f294209q.mRecycler.mo3025b();
            C0673gh ghVar = null;
            if (hVar != null && hVar.getItemCount() > 0) {
                ghVar = b.mo3018c(hVar.getItemViewType(0));
            }
            b.mo3020e();
            if (ghVar != null) {
                b.mo3022g(ghVar);
            }
        } else if (abVar.f294202j) {
            abVar.f294206n = true;
        } else {
            abVar.mo94835Q();
        }
    }
}
