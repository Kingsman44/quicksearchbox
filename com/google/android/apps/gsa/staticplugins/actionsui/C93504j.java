package com.google.android.apps.gsa.staticplugins.actionsui;

import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.j */
/* compiled from: PG */
final class C93504j implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C93507m f260974a;

    public C93504j(C93507m mVar) {
        this.f260974a = mVar;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f260974a.mo82070ij();
    }

    public final void onViewDetachedFromWindow(View view) {
        C59052c cVar = (C59052c) C93507m.f260977c.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, this.f260974a.f239233b);
        ((C59052c) cVar.mo56372aa(13726)).mo56386p("#onViewDetachedFromWindow");
        this.f260974a.mo82069id();
    }
}
