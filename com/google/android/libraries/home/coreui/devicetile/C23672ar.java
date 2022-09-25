package com.google.android.libraries.home.coreui.devicetile;

import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.material.aspectratio.FixedAspectRatioFrameLayout;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ar */
/* compiled from: PG */
final class C23672ar extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C23674at f64735a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23672ar(C23674at atVar) {
        super(0);
        this.f64735a = atVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        View r = C2043bi.m5589r(this.f64735a.f64754e, R.id.control_base_item);
        C69664n.m101060f(r, "requireViewById(container, R.id.control_base_item)");
        return (FixedAspectRatioFrameLayout) r;
    }
}
