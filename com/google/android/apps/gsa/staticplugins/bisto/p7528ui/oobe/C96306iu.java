package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.iu */
/* compiled from: PG */
public final /* synthetic */ class C96306iu implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96310iy f269498a;

    public /* synthetic */ C96306iu(C96310iy iyVar) {
        this.f269498a = iyVar;
    }

    public final void onClick(View view) {
        C96310iy iyVar = this.f269498a;
        iyVar.f269509j = true;
        C58976aa aaVar = C58975e.f156826a;
        ((C95299e) iyVar.f269603D.mo27525b()).f266647b.mo57066b("NotificationAccessSettings");
        C83395k.m132734e(iyVar.getActivity(), iyVar.f269504e);
        iyVar.f269508i.show();
        iyVar.f269503d.mo77327a(new C96305it(iyVar), iyVar.mo77318iT());
        String str = iyVar.f269506g.f269039a;
        if (str != null) {
            ((C89492cd) iyVar.f269505f.mo27525b()).mo83394aj(str, (C124636bb) null, C124633az.OOBE_EXTERNAL);
        }
        iyVar.f269507h.mo65090b(C83395k.m132732c(iyVar.getActivity()), new C96309ix());
    }
}
