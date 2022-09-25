package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.a */
/* compiled from: PG */
public final /* synthetic */ class C113922a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C113926aa f315475a;

    /* renamed from: b */
    public final /* synthetic */ String f315476b;

    public /* synthetic */ C113922a(C113926aa aaVar, String str) {
        this.f315475a = aaVar;
        this.f315476b = str;
    }

    public final void onClick(View view) {
        C113926aa aaVar = this.f315475a;
        aaVar.f315531t.mo65089a(new Intent("android.intent.action.VIEW", Uri.parse(this.f315476b)));
    }
}
