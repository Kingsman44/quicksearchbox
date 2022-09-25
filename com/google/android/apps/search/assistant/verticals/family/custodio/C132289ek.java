package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ek */
/* compiled from: PG */
public final /* synthetic */ class C132289ek implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132291em f361076a;

    public /* synthetic */ C132289ek(C132291em emVar) {
        this.f361076a = emVar;
    }

    public final void onClick(View view) {
        C0167am activity = this.f361076a.f361079b.getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
        }
    }
}
