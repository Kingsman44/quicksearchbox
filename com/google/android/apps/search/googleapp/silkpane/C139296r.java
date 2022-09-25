package com.google.android.apps.search.googleapp.silkpane;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.silkpane.r */
/* compiled from: PG */
public final /* synthetic */ class C139296r implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C139298t f378859a;

    public /* synthetic */ C139296r(C139298t tVar) {
        this.f378859a = tVar;
    }

    public final void onClick(View view) {
        C0167am activity = this.f378859a.f378864d.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
