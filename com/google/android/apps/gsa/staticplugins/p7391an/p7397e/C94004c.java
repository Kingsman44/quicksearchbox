package com.google.android.apps.gsa.staticplugins.p7391an.p7397e;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.e.c */
/* compiled from: PG */
public final /* synthetic */ class C94004c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94009h f262553a;

    public /* synthetic */ C94004c(C94009h hVar) {
        this.f262553a = hVar;
    }

    public final void onClick(View view) {
        C94009h hVar = this.f262553a;
        hVar.f262563f.mo84539b(view, (Integer) null);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", hVar.f262559b.f252939e);
        intent.putExtra("android.intent.extra.TEXT", hVar.f262559b.f252940f);
        hVar.f262561d.startActivity(Intent.createChooser(intent, hVar.f262559b.f252939e));
    }
}
