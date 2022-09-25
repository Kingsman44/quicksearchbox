package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hv */
/* compiled from: PG */
public final /* synthetic */ class C108414hv implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108423id f301532a;

    /* renamed from: b */
    public final /* synthetic */ C108430ik f301533b;

    public /* synthetic */ C108414hv(C108423id idVar, C108430ik ikVar) {
        this.f301532a = idVar;
        this.f301533b = ikVar;
    }

    public final void onClick(View view) {
        C108423id idVar = this.f301532a;
        C108430ik ikVar = this.f301533b;
        idVar.mo96864h();
        if (idVar.f301559f.mo79746e(C90014bt.f247206cl)) {
            ikVar.f301617x = true;
        }
        idVar.mObservable.mo2879a();
        idVar.f301556c.mo96411x(ikVar);
    }
}
