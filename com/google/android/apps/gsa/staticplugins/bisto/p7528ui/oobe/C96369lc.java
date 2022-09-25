package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.view.View;
import com.google.android.apps.gsa.search.core.p6513aj.C84533ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lc */
/* compiled from: PG */
public final /* synthetic */ class C96369lc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96371le f269617a;

    public /* synthetic */ C96369lc(C96371le leVar) {
        this.f269617a = leVar;
    }

    public final void onClick(View view) {
        C96371le leVar = this.f269617a;
        boolean isChecked = leVar.f269626h.f228724c.f228880c.isChecked();
        C84533ar a = leVar.f269623e.mo78243a().mo78241a();
        if (isChecked) {
            a.mo78237c("key_send_diagnostics", true);
        } else {
            a.mo78240f("key_send_diagnostics");
        }
        a.mo78236b();
        leVar.mo77318iT().mo77312a();
    }
}
