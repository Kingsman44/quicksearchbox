package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.z */
/* compiled from: PG */
final class C101985z implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C101933ag f284553a;

    public C101985z(C101933ag agVar) {
        this.f284553a = agVar;
    }

    public final void onClick(View view) {
        C101933ag agVar = this.f284553a;
        C59104x b = C101933ag.f284328a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) b).mo56372aa(20478)).mo56386p("startButtonPressed");
        if (agVar.f284357h.isAdded()) {
            agVar.f284354e++;
            if (!agVar.mo92714r() && agVar.f284354e == 0) {
                agVar.mo92708l(true);
            }
            agVar.mo92712p();
        }
    }
}
