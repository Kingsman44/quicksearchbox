package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f;

import android.view.View;
import android.view.ViewGroup;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.i */
/* compiled from: PG */
public final class C129487i implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ ViewGroup f355520a;

    public C129487i(ViewGroup viewGroup) {
        this.f355520a = viewGroup;
    }

    /* renamed from: a */
    private final void m211404a() {
        this.f355520a.getChildCount();
        ViewGroup viewGroup = this.f355520a;
        viewGroup.setVisibility(viewGroup.getChildCount() > 0 ? 0 : 8);
    }

    public final void onChildViewAdded(View view, View view2) {
        C69664n.m101061g(view, "parent");
        C69664n.m101061g(view2, "child");
        m211404a();
    }

    public final void onChildViewRemoved(View view, View view2) {
        C69664n.m101061g(view, "parent");
        C69664n.m101061g(view2, "child");
        m211404a();
    }
}
