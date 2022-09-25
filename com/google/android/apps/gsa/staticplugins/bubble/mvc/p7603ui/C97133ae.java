package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97108d;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97125u;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97126v;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7604a.C97128x;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97213a;
import com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7610f.C97219g;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.ae */
/* compiled from: PG */
public final /* synthetic */ class C97133ae implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C97136ah f271394a;

    public /* synthetic */ C97133ae(C97136ah ahVar) {
        this.f271394a = ahVar;
    }

    public final void onClick(View view) {
        C97128x xVar = this.f271394a.f271428z;
        C97108d dVar = (C97108d) xVar;
        dVar.f271324c.animate().alpha(0.0f).withEndAction(new C97125u(xVar)).start();
        dVar.f271323b.animate().scaleX(0.0f).scaleY(0.0f).translationY(((C97213a) C97219g.m160926b(dVar.f271325d)).f271608b).alpha(0.0f).withEndAction(new C97126v(xVar)).start();
    }
}
