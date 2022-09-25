package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.hy */
/* compiled from: PG */
public final /* synthetic */ class C108417hy implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108423id f301537a;

    /* renamed from: b */
    public final /* synthetic */ C108430ik f301538b;

    public /* synthetic */ C108417hy(C108423id idVar, C108430ik ikVar) {
        this.f301537a = idVar;
        this.f301538b = ikVar;
    }

    public final void onClick(View view) {
        C108423id idVar = this.f301537a;
        C108430ik ikVar = this.f301538b;
        idVar.mo96864h();
        if (idVar.f301559f.mo79746e(C90014bt.f247206cl)) {
            ikVar.f301617x = true;
        }
        idVar.mObservable.mo2879a();
        idVar.f301556c.mo96411x(ikVar);
    }
}
