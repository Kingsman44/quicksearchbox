package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.b.b.i */
/* compiled from: PG */
public final /* synthetic */ class C39334i implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39280aa f103600a;

    public /* synthetic */ C39334i(C39280aa aaVar) {
        this.f103600a = aaVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39280aa aaVar = this.f103600a;
        if (aaVar.f103476g != null) {
            if (aaVar.f103491v == 2) {
                aaVar.mo41766n(3);
                C58838bb.m90866a(aaVar.f103476g, "soda should not be null (avoid null checker)");
                aaVar.mo41763k();
                C58838bb.m90866a(aaVar.f103476g, "soda should still not be null (avoid null checker)");
                aaVar.f103476g.mo24349p();
            }
            if (aaVar.f103472c.isEmpty()) {
                aaVar.f103476g.mo24340l();
                ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53417)).mo56386p("#delete finished");
            } else {
                ((C59052c) ((C59052c) C39280aa.f103467a.mo56224b()).mo56372aa(53416)).mo56386p("Not deleting preloaded SODA instance.");
            }
            aaVar.f103476g = null;
            aaVar.f103480k.mo41777b();
        }
        return C60866ct.f164955a;
    }
}
