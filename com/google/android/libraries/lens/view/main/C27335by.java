package com.google.android.libraries.lens.view.main;

import androidx.lifecycle.C2383n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.p2068al.C25289b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.lens.view.main.by */
/* compiled from: PG */
public final /* synthetic */ class C27335by implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74826a;

    public /* synthetic */ C27335by(C27384dt dtVar) {
        this.f74826a = dtVar;
    }

    public final void run() {
        C27384dt dtVar = this.f74826a;
        if (!dtVar.f74987g.f74695a.f6612c.mo5788a(C2383n.STARTED)) {
            ((C59052c) ((C59052c) C27384dt.f74877a.mo56224b()).mo56372aa(49766)).mo56386p("Not prewarming Elements after MainFragment state saved.");
        } else if (!dtVar.f74944an || !dtVar.f74995o.mo31462g(C26239a.ONELRP_REMOVE_ELEMENTS_PREWARMING) || dtVar.f74892N.f70642a.f70649b != C25980d.AUTO_FILTER) {
            C25289b bVar = (C25289b) dtVar.mo32951p(R.id.prewarming_container, "prewarming_fragment", new C27338ca(dtVar));
        }
    }
}
