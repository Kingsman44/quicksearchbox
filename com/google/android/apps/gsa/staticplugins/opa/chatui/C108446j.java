package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.j */
/* compiled from: PG */
public final /* synthetic */ class C108446j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108473k f301640a;

    public /* synthetic */ C108446j(C108473k kVar) {
        this.f301640a = kVar;
    }

    public final void onClick(View view) {
        C108473k kVar = this.f301640a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=".concat(String.valueOf(Uri.encode(kVar.f301709c)))));
        intent.setPackage("com.google.android.apps.maps");
        kVar.f301708b.mo65089a(intent);
    }
}
