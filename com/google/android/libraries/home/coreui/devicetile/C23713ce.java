package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ce */
/* compiled from: PG */
final class C23713ce implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23656ab f64863a;

    /* renamed from: b */
    final /* synthetic */ C23714cf f64864b;

    public C23713ce(C23656ab abVar, C23714cf cfVar) {
        this.f64863a = abVar;
        this.f64864b = cfVar;
    }

    public final void onClick(View view) {
        C23656ab abVar = this.f64863a;
        C23752n nVar = ((C23674at) abVar).f64756g;
        C23642d dVar = this.f64864b.f64865a;
        Control control = null;
        if (dVar == null) {
            C69664n.m101065k("template");
            dVar = null;
        }
        String a = dVar.mo28966a();
        Control control2 = this.f64864b.f64866b;
        if (control2 == null) {
            C69664n.m101065k("control");
        } else {
            control = control2;
        }
        nVar.mo29117h(abVar, a, control);
    }
}
