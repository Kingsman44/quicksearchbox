package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import com.google.android.apps.gsa.shared.p7066m.C90003bi;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97112h;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97117m;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97124t;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97214b;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;
import com.google.common.p4522b.C58662ni;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.v */
/* compiled from: PG */
public final /* synthetic */ class C97236v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C97112h f271642a;

    /* renamed from: b */
    public final /* synthetic */ C97117m f271643b;

    public /* synthetic */ C97236v(C97112h hVar, C97117m mVar) {
        this.f271642a = hVar;
        this.f271643b = mVar;
    }

    public final void run() {
        C97214b bVar;
        C97112h hVar = this.f271642a;
        C97117m mVar = this.f271643b;
        hVar.mo90500i();
        float f = ((C97213a) C97219g.m160925a(hVar.f271341j)).f271608b;
        if (hVar.f271345n) {
            float f2 = ((C97213a) C97219g.m160926b(hVar.f271341j)).f271607a;
            hVar.f271343l.mo90474c(new C97213a(((float) hVar.mo90493b()) + f2, f));
            bVar = hVar.mo90496e(f2, f);
        } else {
            hVar.f271343l.mo90474c(new C97213a((float) (-hVar.mo90493b()), f));
            bVar = hVar.mo90496e(0.0f, f);
        }
        hVar.mo90498g(C97112h.f271333b, bVar);
        if (hVar.f271338g.mo79746e(C90003bi.f246866b)) {
            C97124t tVar = hVar.f271336e;
            tVar.mo90507a(hVar, hVar.mo90494c(bVar), C58662ni.m90358q(tVar.f271382a));
        }
        mVar.mo90503a(0.0f, 1.0f);
    }
}
