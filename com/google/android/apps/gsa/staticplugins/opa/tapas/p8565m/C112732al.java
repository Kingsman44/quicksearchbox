package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.al */
/* compiled from: PG */
public final /* synthetic */ class C112732al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C112733am f312500a;

    public /* synthetic */ C112732al(C112733am amVar) {
        this.f312500a = amVar;
    }

    public final void onClick(View view) {
        C112733am amVar = this.f312500a;
        int absoluteAdapterPosition = amVar.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition < amVar.f312504d.f312507c.size()) {
            ((C91097g) amVar.f312504d.f312505a.mo27525b()).mo65089a(new Intent("android.intent.action.CALL", Uri.parse("tel:".concat(String.valueOf(((C113321r) amVar.f312504d.f312507c.get(absoluteAdapterPosition)).f313835b)))));
        }
    }
}
