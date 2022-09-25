package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.w */
/* compiled from: PG */
final class C114244w implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ OpaWebView f316797a;

    public C114244w(OpaWebView opaWebView) {
        this.f316797a = opaWebView;
    }

    public final void onChildViewAdded(View view, View view2) {
        this.f316797a.post(new C114243v(this));
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f316797a.post(new C114242u(this));
    }
}
