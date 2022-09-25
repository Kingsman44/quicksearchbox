package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108324em;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108490y;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.b */
/* compiled from: PG */
public final /* synthetic */ class C113952b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f315577a;

    /* renamed from: b */
    public final /* synthetic */ C108324em f315578b;

    public /* synthetic */ C113952b(C113926aa aaVar, C108324em emVar) {
        this.f315577a = aaVar;
        this.f315578b = emVar;
    }

    public final void onClick(View view) {
        C113926aa aaVar = this.f315577a;
        C108324em emVar = this.f315578b;
        C89949q.m146521e(C28285c.m52882i(view, 5, (Integer) null), false);
        C108490y yVar = new C108490y();
        yVar.f301873c = true;
        if (!TextUtils.isEmpty(aaVar.f315537z)) {
            yVar.f301871a = aaVar.f315537z.toString();
        }
        aaVar.mo100790n(yVar);
        emVar.mo96784a(yVar.mo96781a());
    }
}
