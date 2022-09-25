package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.y */
/* compiled from: PG */
public final /* synthetic */ class C109251y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpaHqActivity f304213a;

    public /* synthetic */ C109251y(OpaHqActivity opaHqActivity) {
        this.f304213a = opaHqActivity;
    }

    public final void onClick(View view) {
        OpaHqActivity opaHqActivity = this.f304213a;
        Intent intent = new Intent();
        intent.setClassName(opaHqActivity.f304082M, "com.google.android.apps.search.lens.LensActivity");
        intent.setFlags(268468224);
        Bundle bundle = new Bundle();
        bundle.putString("caller_package", "com.google.android.apps.gsa.staticplugins.opa");
        intent.putExtras(bundle);
        opaHqActivity.f304080K.mo65089a(intent);
    }
}
