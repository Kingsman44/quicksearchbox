package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23647i;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.cb */
/* compiled from: PG */
final class C23710cb implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C23656ab f64853a;

    /* renamed from: b */
    final /* synthetic */ C23711cc f64854b;

    public C23710cb(C23656ab abVar, C23711cc ccVar) {
        this.f64853a = abVar;
        this.f64854b = ccVar;
    }

    public final void onClick(View view) {
        C23656ab abVar = this.f64853a;
        C23752n nVar = ((C23674at) abVar).f64756g;
        C23642d dVar = this.f64854b.f64855a;
        if (dVar == null) {
            C69664n.m101065k("template");
            dVar = null;
        }
        String a = dVar.mo28966a();
        Control control = this.f64854b.f64856b;
        if (control == null) {
            C69664n.m101065k("control");
            control = null;
        }
        nVar.mo29117h(abVar, a, control);
        C23642d dVar2 = this.f64854b.f64855a;
        if (dVar2 == null) {
            C69664n.m101065k("template");
            dVar2 = null;
        }
        if (dVar2 instanceof C23647i) {
            C23711cc ccVar = this.f64854b;
            ccVar.f64858d = true;
            this.f64853a.mo29006f(ccVar.mo29059c(), ccVar.f64859e);
            C71422aw awVar = this.f64854b.f64857c;
            if (awVar == null) {
                C69664n.m101065k("coroutineScope");
                awVar = null;
            }
            C71803m.m105043d(awVar, (C69585o) null, (C71424ay) null, new C23709ca(this.f64854b, this.f64853a, (C69577g) null), 3);
        }
    }
}
