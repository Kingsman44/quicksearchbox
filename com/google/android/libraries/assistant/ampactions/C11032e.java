package com.google.android.libraries.assistant.ampactions;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.libraries.assistant.ampactions.e */
/* compiled from: PG */
public final /* synthetic */ class C11032e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C11039l f36245a;

    /* renamed from: b */
    public final /* synthetic */ Intent f36246b;

    public /* synthetic */ C11032e(C11039l lVar, Intent intent) {
        this.f36245a = lVar;
        this.f36246b = intent;
    }

    public final void onClick(View view) {
        C11039l lVar = this.f36245a;
        lVar.getContext().startActivity(this.f36246b);
    }
}
