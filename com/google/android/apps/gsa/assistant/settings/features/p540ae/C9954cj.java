package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.cj */
/* compiled from: PG */
public final /* synthetic */ class C9954cj implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34093a;

    /* renamed from: b */
    public final /* synthetic */ Intent f34094b;

    public /* synthetic */ C9954cj(C9958cn cnVar, Intent intent) {
        this.f34093a = cnVar;
        this.f34094b = intent;
    }

    public final void onClick(View view) {
        C9958cn cnVar = this.f34093a;
        cnVar.f34102b.startActivityForResult(this.f34094b, 0);
    }
}
