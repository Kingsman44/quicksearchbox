package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.a.k */
/* compiled from: PG */
public final /* synthetic */ class C114933k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114934l f318885a;

    /* renamed from: b */
    public final /* synthetic */ String f318886b;

    public /* synthetic */ C114933k(C114934l lVar, String str) {
        this.f318885a = lVar;
        this.f318886b = str;
    }

    public final void onClick(View view) {
        C114934l lVar = this.f318885a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f318886b));
        intent.addFlags(268435456);
        lVar.f318890d.f318891a.startActivity(intent);
    }
}
