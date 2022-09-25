package com.google.android.apps.gsa.assistant.settings.features.people;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.b */
/* compiled from: PG */
public final /* synthetic */ class C73372b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ i f194312a;

    public /* synthetic */ C73372b(i iVar) {
        this.f194312a = iVar;
    }

    public final void onClick(View view) {
        C0167am activity = this.f194312a.getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.finish();
        }
    }
}
