package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate;

import android.view.View;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114750d;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.likerate.b */
/* compiled from: PG */
public final class C114960b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ String f318997a;

    /* renamed from: b */
    final /* synthetic */ View f318998b;

    /* renamed from: c */
    final /* synthetic */ C114961c f318999c;

    public C114960b(C114961c cVar, String str, View view) {
        this.f318999c = cVar;
        this.f318997a = str;
        this.f318998b = view;
    }

    public final void onClick(View view) {
        if (!C58837ba.m90859h(this.f318997a)) {
            this.f318999c.f319004e.mo101659d(C87566i.m142325x(this.f318997a), (C114750d) null);
        }
        this.f318999c.f319003d.mo101650c(this.f318998b).start();
    }
}
