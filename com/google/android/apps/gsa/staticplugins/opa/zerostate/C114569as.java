package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.view.View;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90080ee;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114864dg;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.as */
/* compiled from: PG */
final class C114569as implements C114864dg {

    /* renamed from: a */
    final /* synthetic */ C114575ay f317705a;

    public C114569as(C114575ay ayVar) {
        this.f317705a = ayVar;
    }

    /* renamed from: a */
    public final void mo101408a(C89062r rVar) {
        if (this.f317705a.f317749i.mo79746e(C90080ee.f249815n)) {
            this.f317705a.f317755o.mo101589a();
        }
        if (!rVar.mo83040a()) {
            this.f317705a.mo101415e(false);
            return;
        }
        View view = this.f317705a.f317715D;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f317705a.mo101425o();
    }
}
