package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108321ej;
import com.google.android.apps.gsa.staticplugins.opa.chatui.C108488w;
import com.google.android.libraries.logging.C28285c;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.q */
/* compiled from: PG */
public final /* synthetic */ class C114088q implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f316094a;

    /* renamed from: b */
    public final /* synthetic */ C108321ej f316095b;

    public /* synthetic */ C114088q(C113926aa aaVar, C108321ej ejVar) {
        this.f316094a = aaVar;
        this.f316095b = ejVar;
    }

    public final boolean onLongClick(View view) {
        C113926aa aaVar = this.f316094a;
        C108321ej ejVar = this.f316095b;
        C89949q.m146521e(C28285c.m52882i(view, 32, (Integer) null), false);
        C108488w wVar = new C108488w();
        wVar.f301857c = 0;
        CharSequence charSequence = aaVar.f315537z;
        if (charSequence != null) {
            wVar.f301856b = charSequence.toString();
        }
        wVar.f301862h = C58833ax.m90833j(aaVar.f315513b);
        aaVar.mo100790n(wVar);
        ejVar.mo96780b(wVar.mo96774a());
        return true;
    }
}
