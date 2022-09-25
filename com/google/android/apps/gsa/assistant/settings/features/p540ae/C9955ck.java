package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.ck */
/* compiled from: PG */
public final /* synthetic */ class C9955ck implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9958cn f34095a;

    /* renamed from: b */
    public final /* synthetic */ Intent f34096b;

    public /* synthetic */ C9955ck(C9958cn cnVar, Intent intent) {
        this.f34095a = cnVar;
        this.f34096b = intent;
    }

    public final void onClick(View view) {
        C9958cn cnVar = this.f34095a;
        cnVar.f34102b.startActivityForResult(this.f34096b, 0);
    }
}
