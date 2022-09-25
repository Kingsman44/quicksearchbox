package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.graphics.Point;
import android.support.constraint.C0129a;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.l */
/* compiled from: PG */
public final /* synthetic */ class C110101l implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C110103n f306764a;

    public /* synthetic */ C110101l(C110103n nVar) {
        this.f306764a = nVar;
    }

    public final void run() {
        C110103n nVar = this.f306764a;
        Point a = nVar.f306771f.f307801a.mo98660a();
        float b = C91115n.m148870b((float) a.y, nVar.f306768c);
        int i = nVar.f306772g.y;
        float b2 = C91115n.m148870b((float) a.x, nVar.f306768c);
        int i2 = nVar.f306772g.x;
        C58976aa aaVar = C58975e.f156826a;
        C0129a aVar = (C0129a) nVar.f306769d.getLayoutParams();
        aVar.topMargin = (int) (b - ((float) i));
        aVar.leftMargin = (int) (b2 - ((float) i2));
        nVar.f306769d.requestLayout();
        nVar.f306775j = C91115n.m148870b((float) a.x, nVar.f306768c) - ((float) nVar.f306772g.x);
        float b3 = C91115n.m148870b((float) a.y, nVar.f306768c) - ((float) nVar.f306772g.y);
        nVar.f306774i = b3;
        C110094e eVar = nVar.f306770e;
        eVar.f306741c = nVar.f306775j;
        eVar.f306742d = b3;
        eVar.invalidate();
        nVar.f306766a.setTranslationX(Math.min(Math.abs(nVar.f306775j), (float) nVar.f306773h.x));
        nVar.f306766a.setTranslationY(Math.min((float) nVar.f306773h.y, nVar.f306774i));
    }
}
