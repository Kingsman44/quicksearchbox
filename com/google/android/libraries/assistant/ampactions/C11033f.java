package com.google.android.libraries.assistant.ampactions;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.ampactions.f */
/* compiled from: PG */
public final /* synthetic */ class C11033f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C11039l f36247a;

    /* renamed from: b */
    public final /* synthetic */ Intent f36248b;

    public /* synthetic */ C11033f(C11039l lVar, Intent intent) {
        this.f36247a = lVar;
        this.f36248b = intent;
    }

    public final void onClick(View view) {
        C11039l lVar = this.f36247a;
        lVar.getContext().startActivity(this.f36248b);
    }
}
