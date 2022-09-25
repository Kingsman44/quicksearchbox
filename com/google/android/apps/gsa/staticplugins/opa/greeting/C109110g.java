package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.g */
/* compiled from: PG */
public final /* synthetic */ class C109110g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C109100ar f303855a;

    /* renamed from: b */
    public final /* synthetic */ String f303856b;

    public /* synthetic */ C109110g(C109100ar arVar, String str) {
        this.f303855a = arVar;
        this.f303856b = str;
    }

    public final void onClick(View view) {
        C109100ar arVar = this.f303855a;
        arVar.f303789v.mo65089a(new Intent("android.intent.action.VIEW", Uri.parse(this.f303856b)));
    }
}
