package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.da */
/* compiled from: PG */
final class C108524da implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301942a;

    public C108524da(C109040fj fjVar) {
        this.f301942a = fjVar;
    }

    public final void onClick(View view) {
        C90461c cVar = new C90461c();
        cVar.mo84200d("From OPA feedback button", Boolean.TRUE.toString());
        this.f301942a.f303331bl.mo101362b(cVar, C58836b.f156633a);
    }
}
