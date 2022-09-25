package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jd */
/* compiled from: PG */
public final /* synthetic */ class C108450jd implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108451je f301647a;

    /* renamed from: b */
    public final /* synthetic */ C108321ej f301648b;

    public /* synthetic */ C108450jd(C108451je jeVar, C108321ej ejVar) {
        this.f301647a = jeVar;
        this.f301648b = ejVar;
    }

    public final boolean onLongClick(View view) {
        C108451je jeVar = this.f301647a;
        C108321ej ejVar = this.f301648b;
        C89949q.m146521e(C28285c.m52882i(view, 32, (Integer) null), false);
        String str = jeVar.f301037s;
        CharSequence charSequence = jeVar.f301663e;
        if (charSequence == null && str == null) {
            return false;
        }
        C108488w wVar = new C108488w();
        wVar.f301857c = Integer.valueOf(jeVar.f301034p);
        if (charSequence != null) {
            wVar.f301856b = charSequence.toString();
        }
        if (str != null) {
            wVar.f301855a = str;
        }
        ejVar.mo96780b(wVar.mo96774a());
        return true;
    }
}
