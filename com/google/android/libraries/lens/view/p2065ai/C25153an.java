package com.google.android.libraries.lens.view.p2065ai;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.ai.an */
/* compiled from: PG */
public final /* synthetic */ class C25153an implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C25155ap f68496a;

    public /* synthetic */ C25153an(C25155ap apVar) {
        this.f68496a = apVar;
    }

    public final void onClick(View view) {
        C25155ap apVar = this.f68496a;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        apVar.f68507f.mo30559j(intent, new C25150ak(apVar));
    }
}
