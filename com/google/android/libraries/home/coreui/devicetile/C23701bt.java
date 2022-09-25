package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.Control;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23651m;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23653o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bt */
/* compiled from: PG */
public final class C23701bt implements C23638a {

    /* renamed from: c */
    private static final C59071e f64821c = C59071e.m91331h();

    /* renamed from: a */
    public C23653o f64822a;

    /* renamed from: b */
    public C23656ab f64823b;

    /* renamed from: d */
    private Context f64824d;

    /* renamed from: a */
    public final void mo28964a(Control control, int i) {
        C23653o oVar;
        Drawable findDrawableByLayerId;
        C69664n.m101061g(control, "control");
        this.f64824d = ((C23674at) mo29043c()).f64764o;
        mo29043c();
        ((C23674at) mo29043c()).f64761l.setOnClickListener(new C23700bs(this));
        boolean z = false;
        mo29043c().mo29003c(control.f64890h, false);
        C23642d dVar = control.f64889g;
        if (dVar instanceof C23653o) {
            oVar = (C23653o) dVar;
        } else {
            oVar = dVar instanceof C23651m ? (C23653o) ((C23651m) dVar).f64687b : null;
        }
        this.f64822a = oVar;
        if (oVar == null) {
            C59052c cVar = (C59052c) f64821c.mo56225c();
            cVar.mo56379ah(new C59094n(48669));
            cVar.mo56389s("Unsupported template type: %s", dVar);
            return;
        }
        Drawable background = ((C23674at) mo29043c()).f64761l.getBackground();
        C69664n.m101059e(background, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) background;
        C23653o oVar2 = this.f64822a;
        if (oVar2 != null && oVar2.f64700b) {
            z = true;
        }
        if (z && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.clip_layer)) != null) {
            findDrawableByLayerId.setLevel(10000);
        }
        mo29043c().mo29006f(z, i);
    }

    /* renamed from: b */
    public final void mo28965b(C23656ab abVar) {
        this.f64823b = abVar;
    }

    /* renamed from: c */
    public final C23656ab mo29043c() {
        C23656ab abVar = this.f64823b;
        if (abVar != null) {
            return abVar;
        }
        C69664n.m101065k("cvh");
        return null;
    }
}
