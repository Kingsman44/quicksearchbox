package com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8638b;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.b.d */
/* compiled from: PG */
public final /* synthetic */ class C114952d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C114957i f318953a;

    public /* synthetic */ C114952d(C114957i iVar) {
        this.f318953a = iVar;
    }

    public final void onClick(View view) {
        C114957i iVar = this.f318953a;
        Intent intent = new Intent();
        intent.setClassName(iVar.f318959b, "com.google.android.apps.search.lens.LensActivity");
        intent.setFlags(268468224);
        Bundle bundle = new Bundle();
        bundle.putString("caller_package", "com.google.android.apps.gsa.staticplugins.opa");
        intent.putExtras(bundle);
        iVar.f318964g.mo65089a(intent);
    }
}
