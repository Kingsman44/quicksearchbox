package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.assistant.shared.p.k;
import com.google.android.libraries.gsa.logoview.LogoView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.g */
/* compiled from: PG */
public final /* synthetic */ class C107669g implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C107656ap f299667a;

    public /* synthetic */ C107669g(C107656ap apVar) {
        this.f299667a = apVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        LogoView logoView;
        C107656ap apVar = this.f299667a;
        k kVar = (k) obj;
        if (kVar != k.a && (logoView = apVar.f299598u) != null) {
            logoView.setVisibility(8);
        } else if (kVar == k.a && apVar.mo96177e() == 1) {
            apVar.mo96108G();
        }
    }
}
