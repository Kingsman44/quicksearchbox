package com.google.android.libraries.home.coreui.devicetile;

import android.widget.ImageButton;
import com.google.android.libraries.home.coreui.devicetile.model.C23751z;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23648j;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bo */
/* compiled from: PG */
public final class C23696bo implements C23638a {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f64810a = C59071e.m91331h();

    /* renamed from: b */
    private C23656ab f64811b;

    /* renamed from: c */
    private String f64812c;

    /* renamed from: d */
    private final void m44180d(C23642d dVar) {
        if (dVar instanceof C23648j) {
            this.f64812c = dVar.mo28966a();
        } else if (dVar instanceof C23651m) {
            m44180d(((C23651m) dVar).f64687b);
        } else {
            C59052c cVar = (C59052c) f64810a.mo56225c();
            cVar.mo56379ah(new C59094n(48668));
            cVar.mo56389s("Unsupported template type: %s", dVar);
        }
    }

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C69664n.m101061g(control, "control");
        m44180d(control.f64889g);
        C23656ab abVar = this.f64811b;
        if (abVar == null) {
            C69664n.m101065k("controlViewHolder");
            abVar = null;
        }
        C23674at atVar = (C23674at) abVar;
        ImageButton imageButton = atVar.f64770u;
        if (imageButton != null) {
            imageButton.setOnClickListener(new C23694bm(this));
        }
        ImageButton imageButton2 = atVar.f64771v;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new C23695bn(this));
        }
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64811b = abVar;
    }

    /* renamed from: c */
    public final void mo29037c(C23751z zVar) {
        C23656ab abVar = this.f64811b;
        String str = null;
        if (abVar == null) {
            C69664n.m101065k("controlViewHolder");
            abVar = null;
        }
        C23752n nVar = ((C23674at) abVar).f64756g;
        String str2 = this.f64812c;
        if (str2 == null) {
            C69664n.m101065k("templateId");
        } else {
            str = str2;
        }
        nVar.mo29115f(abVar, str, zVar);
    }
}
