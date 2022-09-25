package com.google.android.apps.search.googleapp.discover.secondscreen;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.discover.secondscreen.m */
/* compiled from: PG */
final class C134622m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C134624o f366597a;

    public C134622m(C134624o oVar) {
        this.f366597a = oVar;
    }

    public final void onClick(View view) {
        this.f366597a.mo111851b();
        C0167am activity = this.f366597a.f366600a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
