package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.greeting.C109100ar;
import com.google.android.apps.gsa.staticplugins.opa.greeting.C109113j;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.df */
/* compiled from: PG */
public final /* synthetic */ class C108772df implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108775di f302495a;

    public /* synthetic */ C108772df(C108775di diVar) {
        this.f302495a = diVar;
    }

    public final void run() {
        C109100ar arVar = this.f302495a.f302499a.f303323bd.f303830g;
        if (arVar != null) {
            arVar.f303777j.setVisibility(0);
            arVar.f303778k.setVisibility(0);
            arVar.f303772e.setOnClickListener(new C109113j(arVar));
        }
    }
}
