package com.google.android.apps.gsa.staticplugins.p7877dx.p7881d;

import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.d.i */
/* compiled from: PG */
public final /* synthetic */ class C100310i implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100315n f280505a;

    public /* synthetic */ C100310i(C100315n nVar) {
        this.f280505a = nVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C100315n nVar = this.f280505a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        View j = nVar.mo91876j(C90208n.DRAWER_TAB);
        if (j != null) {
            j.setVisibility(true != booleanValue ? 8 : 0);
        }
    }
}
