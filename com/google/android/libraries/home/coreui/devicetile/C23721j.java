package com.google.android.libraries.home.coreui.devicetile;

import android.app.Dialog;
import android.content.DialogInterface;
import android.widget.EditText;
import androidx.core.app.C1827n;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.model.C23750y;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.j */
/* compiled from: PG */
final class C23721j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23656ab f64879a;

    /* renamed from: b */
    final /* synthetic */ C23739n f64880b;

    public C23721j(C23656ab abVar, C23739n nVar) {
        this.f64879a = abVar;
        this.f64880b = nVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (dialogInterface instanceof Dialog) {
            Object a = C1827n.m5006a((Dialog) dialogInterface, R.id.controls_pin_input);
            C69664n.m101059e(a, "null cannot be cast to non-null type android.widget.EditText");
            this.f64879a.mo29002b(C23762x.m44262a(this.f64880b, new C23750y(((EditText) a).getText().toString())));
            dialogInterface.dismiss();
        }
    }
}
