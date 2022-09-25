package com.google.android.apps.gsa.staticplugins.paymentsauth.p8672ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C115987g implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115992l f321643a;

    /* renamed from: b */
    public final /* synthetic */ View f321644b;

    public /* synthetic */ C115987g(C115992l lVar, View view) {
        this.f321643a = lVar;
        this.f321644b = view;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115992l lVar = this.f321643a;
        View view = this.f321644b;
        if (((Boolean) obj).booleanValue() || ((Boolean) ((C115980ac) lVar.f321649a).f321614e.f63720e).booleanValue()) {
            view.setVisibility(8);
            C89949q.m146521e(C28285c.m52881h(3, C28295m.m52916b(view), (View) null), false);
            return;
        }
        view.setVisibility(0);
        C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(view), (View) null), false);
    }
}
