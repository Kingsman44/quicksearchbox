package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90201g;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69459x;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.f */
/* compiled from: PG */
public final /* synthetic */ class C100307f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C100315n f280502a;

    public /* synthetic */ C100307f(C100315n nVar) {
        this.f280502a = nVar;
    }

    public final void onClick(View view) {
        C69459x xVar;
        C69459x xVar2;
        C100315n nVar = this.f280502a;
        C90201g k = C100315n.m166269k(view);
        if (k != null) {
            C90208n a = C90208n.m146767a(k.f251971b);
            if (a == null) {
                a = C90208n.UNKNOWN_TAB;
            }
            C58833ax axVar = (C58833ax) ((C23249a) nVar.f280519b.mo91859d()).mo28725a();
            if (axVar.mo56113h()) {
                C69396ar arVar = (C69396ar) axVar.mo56107c();
                if (arVar.f185680a == 7) {
                    xVar = (C69459x) arVar.f185681b;
                } else {
                    xVar = C69459x.f185869c;
                }
                C90208n a2 = C90208n.m146767a(xVar.f185871a);
                if (a2 == null) {
                    a2 = C90208n.UNKNOWN_TAB;
                }
                View j = nVar.mo91876j(a2);
                if (j != null) {
                    C69396ar arVar2 = (C69396ar) axVar.mo56107c();
                    if (arVar2.f185680a == 7) {
                        xVar2 = (C69459x) arVar2.f185681b;
                    } else {
                        xVar2 = C69459x.f185869c;
                    }
                    C90208n a3 = C90208n.m146767a(xVar2.f185871a);
                    if (a3 == null) {
                        a3 = C90208n.UNKNOWN_TAB;
                    }
                    if (a3 == a) {
                        j.setVisibility(8);
                    }
                }
            }
            nVar.f280520c.mo91868h(a);
        }
    }
}
