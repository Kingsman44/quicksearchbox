package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.graphics.Point;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.p */
/* compiled from: PG */
public final /* synthetic */ class C110105p implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110106q f306790a;

    public /* synthetic */ C110105p(C110106q qVar) {
        this.f306790a = qVar;
    }

    public final void run() {
        C110106q qVar = this.f306790a;
        C58976aa aaVar = C58975e.f156826a;
        Point a = qVar.f306794d.mo98399a();
        float f = ((float) a.x) * qVar.f306796f;
        float f2 = ((float) a.y) * qVar.f306796f;
        qVar.f306791a.setTranslationX(f);
        qVar.f306791a.setTranslationY(qVar.f306795e + f2);
        qVar.f306792b.setTranslationX(f);
        qVar.f306792b.setTranslationY((-qVar.f306795e) + f2);
        qVar.f306793c.setTranslationX(f);
        qVar.f306793c.setTranslationY(f2);
        qVar.f306791a.requestLayout();
    }
}
