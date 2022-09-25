package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bj */
/* compiled from: PG */
final class C23691bj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23693bl f64804a;

    /* renamed from: b */
    final /* synthetic */ Control f64805b;

    public C23691bj(C23693bl blVar, Control control) {
        this.f64804a = blVar;
        this.f64805b = control;
    }

    public final void onClick(View view) {
        C23656ab abVar = this.f64804a.f64807a;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        C23752n nVar = ((C23674at) abVar).f64756g;
        C23656ab abVar3 = this.f64804a.f64807a;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar3;
        }
        nVar.mo29117h(abVar2, this.f64805b.f64889g.mo28966a(), this.f64805b);
    }
}
