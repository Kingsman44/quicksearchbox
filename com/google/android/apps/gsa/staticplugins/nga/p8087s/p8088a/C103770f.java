package com.google.android.apps.gsa.staticplugins.nga.p8087s.p8088a;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.a.f */
/* compiled from: PG */
public final /* synthetic */ class C103770f implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C103775k f288946a;

    public /* synthetic */ C103770f(C103775k kVar) {
        this.f288946a = kVar;
    }

    public final void onClick(View view) {
        C103775k kVar = this.f288946a;
        kVar.f288954b.setVisibility(0);
        kVar.f288957e.setVisibility(4);
        kVar.f288955c.setLeft(0);
        kVar.f288955c.animate().alpha(1.0f).withEndAction(new C103768d(kVar));
    }
}
