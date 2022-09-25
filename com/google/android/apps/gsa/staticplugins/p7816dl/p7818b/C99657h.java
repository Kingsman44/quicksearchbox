package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.h */
/* compiled from: PG */
public final /* synthetic */ class C99657h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99673x f278917a;

    public /* synthetic */ C99657h(C99673x xVar) {
        this.f278917a = xVar;
    }

    public final void run() {
        C99673x xVar = this.f278917a;
        if (!xVar.f278941g) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.googlequicksearchbox.UPDATE_MINUS_ONE_CONTENT");
            intentFilter.addAction("com.google.android.googlequicksearchbox.REFRESH_MINUS_ONE_CONTENT");
            xVar.f278936b.registerReceiver(xVar.f278935a, intentFilter);
            xVar.f278941g = true;
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        if (!xVar.f278944j) {
            Intent intent = xVar.f278943i;
            if (intent != null) {
                xVar.mo91565e(intent);
            }
        } else if (!((Boolean) ((C99651b) xVar.f278937c).f278875b.f63720e).booleanValue()) {
            ((C99651b) xVar.f278937c).f278875b.mo28730f(true, false);
            xVar.mo91567h();
        }
        xVar.f278944j = false;
        xVar.f278943i = null;
        xVar.f278935a.f278933a = false;
    }
}
