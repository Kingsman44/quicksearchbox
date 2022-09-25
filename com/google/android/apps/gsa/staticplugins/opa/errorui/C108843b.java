package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.b */
/* compiled from: PG */
final class C108843b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108870c f302645a;

    public C108843b(C108870c cVar) {
        this.f302645a = cVar;
    }

    public final void onClick(View view) {
        C113787bc bcVar = this.f302645a.f302714c;
        if (bcVar.mo100633m()) {
            bcVar.f315134c.edit().putBoolean("opa_is_in_signed_out_mode_for_no_account", true).apply();
        } else {
            ((C59052c) ((C59052c) C113787bc.f315132a.mo56226d()).mo56372aa(28429)).mo56386p("Couldn't enter the signed out mode for no account users because it is not supported on this device.");
            int i = C90755l.f253831a;
        }
        this.f302645a.mo77318iT().mo77312a();
    }
}
