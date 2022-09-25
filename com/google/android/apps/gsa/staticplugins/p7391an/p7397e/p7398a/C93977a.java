package com.google.android.apps.gsa.staticplugins.p7391an.p7397e.p7398a;

import android.graphics.Rect;
import com.google.android.apps.gsa.shared.monet.p7112d.C90315c;
import com.google.android.apps.gsa.staticplugins.p7391an.p7397e.C94015n;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.a.a */
/* compiled from: PG */
public final /* synthetic */ class C93977a implements C90315c {

    /* renamed from: a */
    public final /* synthetic */ C93984h f262446a;

    public /* synthetic */ C93977a(C93984h hVar) {
        this.f262446a = hVar;
    }

    /* renamed from: a */
    public final void mo83996a(Rect rect) {
        C93984h hVar = this.f262446a;
        hVar.f262463i &= !((Boolean) ((C23249a) hVar.f262455a.mo88239f()).mo28725a()).booleanValue();
        C58976aa aaVar = C58975e.f156826a;
        Integer.toHexString(System.identityHashCode(hVar));
        hVar.f262461g = rect;
        C94015n nVar = hVar.f262458d;
        if (!hVar.f262463i) {
            rect = new Rect(0, rect.top, 0, 0);
        }
        nVar.f262600i = rect;
        C93983g gVar = hVar.f262459e;
        if (gVar != null) {
            gVar.mo88257c();
        }
        hVar.mo88265r();
    }
}
