package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Intent;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.z */
/* compiled from: PG */
public final /* synthetic */ class C96440z implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96070aa f269803a;

    /* renamed from: b */
    public final /* synthetic */ Intent f269804b;

    public /* synthetic */ C96440z(C96070aa aaVar, Intent intent) {
        this.f269803a = aaVar;
        this.f269804b = intent;
    }

    public final void onClick(View view) {
        C96070aa aaVar = this.f269803a;
        Intent intent = this.f269804b;
        if (intent == null) {
            C59104x d = C96070aa.f268978b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AccountMismatchFragment");
            ((C59052c) ((C59052c) d).mo56372aa(16940)).mo56386p("Missing account mismatch parameters");
            aaVar.mo77318iT().mo77313b();
            return;
        }
        aaVar.getActivity().startActivity(intent);
        aaVar.getActivity().finish();
    }
}
