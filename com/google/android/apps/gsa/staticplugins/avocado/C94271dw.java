package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.Context;
import android.view.OrientationEventListener;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dw */
/* compiled from: PG */
final class C94271dw extends OrientationEventListener {

    /* renamed from: a */
    final /* synthetic */ C94273dy f263442a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C94271dw(C94273dy dyVar, Context context) {
        super(context);
        this.f263442a = dyVar;
    }

    public final void onOrientationChanged(int i) {
        if (i != -1) {
            C94273dy dyVar = this.f263442a;
            double d = (double) i;
            Double.isNaN(d);
            dyVar.f263450g = ((int) Math.round(d / 90.0d)) * 90;
            C59104x b = C94273dy.f263444a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConfigManager");
            ((C59052c) ((C59052c) b).mo56372aa(14403)).mo56393w("#onOrientationChanged, orientation: %d, currentDeviceOrientation: %d", i, this.f263442a.f263450g);
        }
    }
}
