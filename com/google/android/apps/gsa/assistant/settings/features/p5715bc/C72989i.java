package com.google.android.apps.gsa.assistant.settings.features.p5715bc;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.bc.i */
/* compiled from: PG */
public final /* synthetic */ class C72989i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ m f193626a;

    /* renamed from: b */
    public final /* synthetic */ Intent f193627b;

    public /* synthetic */ C72989i(m mVar, Intent intent) {
        this.f193626a = mVar;
        this.f193627b = intent;
    }

    public final void onClick(View view) {
        m mVar = this.f193626a;
        mVar.a.startActivityForResult(this.f193627b, 0);
    }
}
