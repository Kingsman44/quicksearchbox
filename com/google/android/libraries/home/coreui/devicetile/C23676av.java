package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.libraries.home.coreui.devicetile.model.Control;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.av */
/* compiled from: PG */
public final class C23676av implements C23638a {

    /* renamed from: a */
    private C23656ab f64780a;

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        C23656ab abVar = this.f64780a;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        CharSequence charSequence = control.f64890h;
        Set set = C23656ab.f64704a;
        abVar.mo29003c(charSequence, false);
        C23656ab abVar3 = this.f64780a;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar3;
        }
        abVar2.mo29006f(false, i);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64780a = abVar;
    }
}
