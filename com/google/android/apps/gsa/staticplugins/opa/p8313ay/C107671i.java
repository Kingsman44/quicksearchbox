package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import android.view.View;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.i */
/* compiled from: PG */
public final /* synthetic */ class C107671i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C107656ap f299669a;

    public /* synthetic */ C107671i(C107656ap apVar) {
        this.f299669a = apVar;
    }

    public final void onClick(View view) {
        C107656ap apVar = this.f299669a;
        if (apVar.mo96131aD() && !apVar.mo96184m().hasFocus()) {
            apVar.mo96184m().requestFocus();
        }
        apVar.mo96184m().setText(BuildConfig.FLAVOR);
    }
}
