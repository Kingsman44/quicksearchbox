package com.google.android.apps.gsa.staticplugins.p7816dl.p7820d;

import android.widget.FrameLayout;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.d.e */
/* compiled from: PG */
public final /* synthetic */ class C99697e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99702j f278987a;

    public /* synthetic */ C99697e(C99702j jVar) {
        this.f278987a = jVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C99702j jVar = this.f278987a;
        int intValue = ((Integer) obj).intValue();
        if (!((Boolean) ((C99711s) jVar.f278994b).f279023c.f63720e).booleanValue() && intValue > 0) {
            jVar.f279001i = intValue;
            double d = (double) intValue;
            Double.isNaN(d);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (d * 1.777d), intValue);
            layoutParams.gravity = 17;
            jVar.f279003k.setLayoutParams(layoutParams);
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
