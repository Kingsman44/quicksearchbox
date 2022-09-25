package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.widget.Button;
import com.google.android.apps.gsa.shared.util.C90775bs;
import com.google.android.setupcompat.template.C45275b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.k */
/* compiled from: PG */
public final /* synthetic */ class C84016k implements C90775bs {

    /* renamed from: a */
    public final /* synthetic */ C84017l f228860a;

    public /* synthetic */ C84016k(C84017l lVar) {
        this.f228860a = lVar;
    }

    /* renamed from: a */
    public final void mo77476a(Object obj) {
        C84017l lVar = this.f228860a;
        C58976aa aaVar = C58975e.f156826a;
        C45275b bVar = (C45275b) obj;
        bVar.mo49175f(lVar.mo77478f());
        bVar.mo49176g(lVar.mo77478f(), false);
        int i = lVar.f228862b;
        if (!(i == 0 || i == 1 || i == 2)) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalArgumentException("Unknown footer type: " + i);
                    }
                }
            }
            lVar.f228861a.f228857a.mo77362c(i);
            return;
        }
        FooterLayout footerLayout = lVar.f228861a.f228857a;
        if (footerLayout != null) {
            footerLayout.setVisibility(8);
            Button a = footerLayout.mo77360a();
            if (a != null) {
                a.setVisibility(8);
            }
            Button b = footerLayout.mo77361b();
            if (b != null) {
                b.setVisibility(8);
            }
        }
    }
}
