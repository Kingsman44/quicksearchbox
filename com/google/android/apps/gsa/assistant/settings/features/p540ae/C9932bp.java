package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.bp */
/* compiled from: PG */
public final /* synthetic */ class C9932bp implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9935bs f34037a;

    /* renamed from: b */
    public final /* synthetic */ Intent f34038b;

    public /* synthetic */ C9932bp(C9935bs bsVar, Intent intent) {
        this.f34037a = bsVar;
        this.f34038b = intent;
    }

    public final void onClick(View view) {
        C9935bs bsVar = this.f34037a;
        bsVar.f34042b.startActivityForResult(this.f34038b, 0);
    }
}
