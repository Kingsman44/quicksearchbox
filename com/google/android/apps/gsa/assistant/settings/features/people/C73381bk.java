package com.google.android.apps.gsa.assistant.settings.features.people;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.bk */
/* compiled from: PG */
public final /* synthetic */ class C73381bk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ bs f194323a;

    public /* synthetic */ C73381bk(bs bsVar) {
        this.f194323a = bsVar;
    }

    public final void onClick(View view) {
        C0167am activity = this.f194323a.getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.finish();
        }
    }
}
