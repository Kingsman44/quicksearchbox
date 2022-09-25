package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.accounts.Account;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87562e;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.db */
/* compiled from: PG */
public final /* synthetic */ class C108629db implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108634dg f302165a;

    public /* synthetic */ C108629db(C108634dg dgVar) {
        this.f302165a = dgVar;
    }

    public final void onClick(View view) {
        C108634dg dgVar = this.f302165a;
        C58976aa aaVar = C58975e.f156826a;
        C90461c cVar = new C90461c();
        cVar.f252689a = null;
        cVar.f252693e = "com.google.android.googlequicksearchbox.NEXUS_OPA_FEEDBACK";
        cVar.f252690b = "assistant_settings_help_pixel";
        cVar.mo84198b("genie-eng:app_pkg_name", "com.google.android.googlequicksearchbox.assistant");
        cVar.f252691c = (Account) dgVar.f302168c.mo77278a().mo56107c();
        cVar.f252692d = C87562e.m142218a(dgVar.getActivity(), "assistant_settings_help_pixel");
        dgVar.f302167b.mo84210a(dgVar.getActivity()).mo84209b(cVar, 0);
    }
}
