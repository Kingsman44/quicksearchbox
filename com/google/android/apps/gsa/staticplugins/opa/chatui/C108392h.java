package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.h */
/* compiled from: PG */
public final /* synthetic */ class C108392h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108473k f301482a;

    public /* synthetic */ C108392h(C108473k kVar) {
        this.f301482a = kVar;
    }

    public final void onClick(View view) {
        C108473k kVar = this.f301482a;
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.setPackage("com.google.android.googlequicksearchbox");
        intent.putExtra("query", kVar.f301709c);
        kVar.f301708b.mo65089a(intent);
    }
}
