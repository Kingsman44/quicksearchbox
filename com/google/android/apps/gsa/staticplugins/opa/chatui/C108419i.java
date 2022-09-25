package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.i */
/* compiled from: PG */
public final /* synthetic */ class C108419i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108473k f301541a;

    public /* synthetic */ C108419i(C108473k kVar) {
        this.f301541a = kVar;
    }

    public final void onClick(View view) {
        C108473k kVar = this.f301541a;
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setPackage("com.google.android.youtube");
        intent.putExtra("query", kVar.f301709c);
        intent.setFlags(268435456);
        kVar.f301708b.mo65089a(intent);
    }
}
