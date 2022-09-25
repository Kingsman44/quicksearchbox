package com.google.android.apps.search.googleapp.googleappbrowser.p10305g;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.g.y */
/* compiled from: PG */
public final /* synthetic */ class C136008y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C136009z f370412a;

    public /* synthetic */ C136008y(C136009z zVar) {
        this.f370412a = zVar;
    }

    public final void onClick(View view) {
        C136009z zVar = this.f370412a;
        zVar.f370415c.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (zVar.f370413a.getChildFragmentManager().f634a.mo671c("GoogleAppBrowserClearTag") == null) {
            C135954aa aaVar = (C135954aa) C135955ab.f370293d.createBuilder();
            boolean e = zVar.mo112685e();
            aaVar.copyOnWrite();
            C135955ab abVar = (C135955ab) aaVar.instance;
            abVar.f370295a |= 2;
            abVar.f370297c = e;
            boolean d = zVar.mo112684d();
            aaVar.copyOnWrite();
            C135955ab abVar2 = (C135955ab) aaVar.instance;
            abVar2.f370295a |= 1;
            abVar2.f370296b = d;
            C135999s.m220794a(zVar.f370414b, (C135955ab) aaVar.build()).showNow(zVar.f370413a.getChildFragmentManager(), "GoogleAppBrowserClearTag");
        }
    }
}
