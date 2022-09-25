package com.google.android.libraries.home.coreui.devicetile;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.p1953c.C23636a;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.cf */
/* compiled from: PG */
public final class C23714cf implements C23638a {

    /* renamed from: a */
    public C23642d f64865a;

    /* renamed from: b */
    public Control f64866b;

    /* renamed from: c */
    private C23656ab f64867c;

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        this.f64866b = control;
        C23656ab abVar = this.f64867c;
        C23656ab abVar2 = null;
        if (abVar == null) {
            C69664n.m101065k("cvh");
            abVar = null;
        }
        CharSequence charSequence = control.f64890h;
        Set set = C23656ab.f64704a;
        abVar.mo29003c(charSequence, false);
        this.f64865a = control.f64889g;
        C23656ab abVar3 = this.f64867c;
        if (abVar3 == null) {
            C69664n.m101065k("cvh");
            abVar3 = null;
        }
        int a = C23636a.m44118a(((C23674at) abVar3).f64764o, R.attr.control_unavailable_foreground);
        C23656ab abVar4 = this.f64867c;
        if (abVar4 == null) {
            C69664n.m101065k("cvh");
            abVar4 = null;
        }
        ((C23674at) abVar4).f64766q.setTextColor(a);
        C23656ab abVar5 = this.f64867c;
        if (abVar5 == null) {
            C69664n.m101065k("cvh");
            abVar5 = null;
        }
        ((C23674at) abVar5).f64767r.setTextColor(a);
        C23656ab abVar6 = this.f64867c;
        if (abVar6 == null) {
            C69664n.m101065k("cvh");
        } else {
            abVar2 = abVar6;
        }
        abVar2.mo29006f(false, i);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64867c = abVar;
        ((C23674at) abVar).f64761l.setOnClickListener(new C23713ce(abVar, this));
    }
}
