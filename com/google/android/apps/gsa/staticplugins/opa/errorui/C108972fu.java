package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.fu */
/* compiled from: PG */
public final /* synthetic */ class C108972fu implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108980gb f303021a;

    public /* synthetic */ C108972fu(C108980gb gbVar) {
        this.f303021a = gbVar;
    }

    public final void onClick(View view) {
        C108980gb gbVar = this.f303021a;
        if (gbVar.f303052q.booleanValue()) {
            gbVar.f303049n.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_keyboard_arrow_down_grey600_24, 0);
            gbVar.f303051p.setVisibility(8);
            gbVar.f303050o.setVisibility(0);
            gbVar.mo97340i();
        } else {
            gbVar.f303049n.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.quantum_ic_keyboard_arrow_up_grey600_24, 0);
            gbVar.f303050o.setVisibility(8);
            gbVar.f303051p.setVisibility(0);
            gbVar.mo97341j();
        }
        gbVar.f303052q = Boolean.valueOf(!gbVar.f303052q.booleanValue());
    }
}
