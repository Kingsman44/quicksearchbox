package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108226ax;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.c */
/* compiled from: PG */
public final /* synthetic */ class C113981c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f315616a;

    /* renamed from: b */
    public final /* synthetic */ C108430ik f315617b;

    public /* synthetic */ C113981c(C113926aa aaVar, C108430ik ikVar) {
        this.f315616a = aaVar;
        this.f315617b = ikVar;
    }

    public final void onClick(View view) {
        C113926aa aaVar = this.f315616a;
        C108430ik ikVar = this.f315617b;
        view.setClickable(false);
        view.setAlpha(0.2f);
        C108226ax axVar = aaVar.f315488B.f315558a;
        C59071e eVar = C114071eg.f315790j;
        axVar.mo96411x(ikVar);
    }
}
