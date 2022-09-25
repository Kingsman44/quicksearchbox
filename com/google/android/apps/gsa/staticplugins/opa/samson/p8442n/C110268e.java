package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110420g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.e */
/* compiled from: PG */
public final /* synthetic */ class C110268e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110269f f307290a;

    public /* synthetic */ C110268e(C110269f fVar) {
        this.f307290a = fVar;
    }

    public final void onClick(View view) {
        Intent b;
        Activity activity;
        C110269f fVar = this.f307290a;
        C69464a aVar = (C69464a) fVar.f307292b.get("ch-amb-m-ip");
        if (aVar != null && (b = ((C110420g) aVar.mo17428b()).mo98440b()) != null && (activity = (Activity) fVar.f307291a.get()) != null) {
            activity.startActivityForResult(b, 1);
        }
    }
}
