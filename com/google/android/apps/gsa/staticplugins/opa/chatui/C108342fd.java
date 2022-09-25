package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fd */
/* compiled from: PG */
public final /* synthetic */ class C108342fd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108343fe f301374a;

    /* renamed from: b */
    public final /* synthetic */ String f301375b;

    public /* synthetic */ C108342fd(C108343fe feVar, String str) {
        this.f301374a = feVar;
        this.f301375b = str;
    }

    public final void onClick(View view) {
        C108343fe feVar = this.f301374a;
        String str = this.f301375b;
        Intent intent = new Intent();
        intent.putExtra("com.google.opa.QUERY", str);
        feVar.f301377b.mo65089a(intent);
    }
}
