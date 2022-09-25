package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.view.View;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.fc */
/* compiled from: PG */
public final /* synthetic */ class C108684fc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108688fg f302284a;

    public /* synthetic */ C108684fc(C108688fg fgVar) {
        this.f302284a = fgVar;
    }

    public final void onClick(View view) {
        C60870cx cxVar;
        C108688fg fgVar = this.f302284a;
        C83992d dVar = (C83992d) fgVar.f302293f.mo77447a().get(0);
        C58838bb.m90883r(dVar instanceof C108687ff);
        C108687ff ffVar = (C108687ff) dVar;
        C108741i iVar = fgVar.f302291d.f302004l;
        iVar.getClass();
        String k = iVar.mo97107k();
        k.getClass();
        if (ffVar.f302286a.mo96965a() == null) {
            cxVar = fgVar.f302292e.mo96971b(k, ffVar.f302286a.mo96966b());
        } else {
            cxVar = fgVar.f302292e.mo96970a(k, ffVar.f302286a);
        }
        fgVar.f302290c.mo85147l(cxVar, new C108686fe());
        fgVar.mo77318iT().mo77312a();
    }
}
