package com.google.android.apps.gsa.staticplugins.opa;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.a */
/* compiled from: PG */
final class C105908a implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ C107711b f295709a;

    public C105908a(C107711b bVar) {
        this.f295709a = bVar;
    }

    public final void onChildViewAdded(View view, View view2) {
        view2.setBackgroundResource(this.f295709a.f299728b.mo95422k().mo96654a());
    }

    public final void onChildViewRemoved(View view, View view2) {
    }
}
