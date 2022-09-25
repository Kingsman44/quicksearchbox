package com.google.android.apps.gsa.staticplugins.opa.p8621x;

import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.staticplugins.opa.C109205hl;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.x.d */
/* compiled from: PG */
public final /* synthetic */ class C114516d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114524l f317577a;

    public /* synthetic */ C114516d(C114524l lVar) {
        this.f317577a = lVar;
    }

    public final void onClick(View view) {
        C114524l lVar = this.f317577a;
        if (lVar.f317595c.mo79746e(C90029ch.f248221aH)) {
            C109205hl hlVar = lVar.f317603k;
            if (hlVar != null) {
                hlVar.mo97660a(lVar.f317593a);
            }
            lVar.mo101383a();
            return;
        }
        lVar.mo101383a();
        C109205hl hlVar2 = lVar.f317603k;
        if (hlVar2 != null) {
            hlVar2.mo97660a(lVar.f317593a);
            lVar.f317603k = null;
        }
    }
}
