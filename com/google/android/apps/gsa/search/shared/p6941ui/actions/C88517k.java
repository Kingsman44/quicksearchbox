package com.google.android.apps.gsa.search.shared.p6941ui.actions;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.actions.k */
/* compiled from: PG */
public final /* synthetic */ class C88517k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C88519m f239235a;

    public /* synthetic */ C88517k(C88519m mVar) {
        this.f239235a = mVar;
    }

    public final void onClick(View view) {
        C88519m mVar = this.f239235a;
        mVar.f239236a.clearFocus();
        mVar.f239237b.clearFocus();
        mVar.f239238c.clearFocus();
        mVar.f239239d.mo82131a((long) mVar.f239236a.getValue(), (long) mVar.f239237b.getValue(), (long) mVar.f239238c.getValue());
        mVar.dismiss();
    }
}
