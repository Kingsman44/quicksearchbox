package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bp */
/* compiled from: PG */
final class C23697bp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23698bq f64813a;

    /* renamed from: b */
    final /* synthetic */ C23651m f64814b;

    /* renamed from: c */
    final /* synthetic */ Control f64815c;

    public C23697bp(C23698bq bqVar, C23651m mVar, Control control) {
        this.f64813a = bqVar;
        this.f64814b = mVar;
        this.f64815c = control;
    }

    public final void onClick(View view) {
        C23656ab abVar = this.f64813a.f64816a;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        C23752n nVar = ((C23674at) abVar).f64756g;
        C23656ab abVar3 = this.f64813a.f64816a;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar3;
        }
        nVar.mo29117h(abVar2, this.f64814b.f64686a, this.f64815c);
    }
}
