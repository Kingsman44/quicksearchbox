package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90063do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.k */
/* compiled from: PG */
public final /* synthetic */ class C107673k implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107656ap f299671a;

    public /* synthetic */ C107673k(C107656ap apVar) {
        this.f299671a = apVar;
    }

    public final boolean onLongClick(View view) {
        C107656ap apVar = this.f299671a;
        Toast.makeText(apVar.f299580c, String.format("Account: %s, Opted-in experiments: %s", new Object[]{((C86054o) apVar.f299515X.mo27525b()).mo79659F(), apVar.f299582e.mo79758x(C90063do.f249490eX)}), 1).show();
        return true;
    }
}
