package com.google.android.apps.search.googleapp.discover.fullcoverage;

import android.support.p031v4.app.C0167am;
import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.discover.fullcoverage.i */
/* compiled from: PG */
final class C134322i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C134325l f365866a;

    public C134322i(C134325l lVar) {
        this.f365866a = lVar;
    }

    public final void onClick(View view) {
        this.f365866a.mo111734b();
        C0167am activity = this.f365866a.f365871a.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
