package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108490y;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.f */
/* compiled from: PG */
public final /* synthetic */ class C114077f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f316081a;

    /* renamed from: b */
    public final /* synthetic */ C108324em f316082b;

    public /* synthetic */ C114077f(C113926aa aaVar, C108324em emVar) {
        this.f316081a = aaVar;
        this.f316082b = emVar;
    }

    public final void onClick(View view) {
        C113926aa aaVar = this.f316081a;
        C108324em emVar = this.f316082b;
        C108490y yVar = new C108490y();
        if (!TextUtils.isEmpty(aaVar.f315537z)) {
            yVar.f301871a = aaVar.f315537z.toString();
        }
        yVar.f301875e = C58833ax.m90833j(aaVar.f315513b);
        aaVar.mo100790n(yVar);
        emVar.mo96784a(yVar.mo96781a());
    }
}
