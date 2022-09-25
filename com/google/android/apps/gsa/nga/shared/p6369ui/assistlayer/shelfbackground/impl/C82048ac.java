package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl;

import android.support.constraint.C0129a;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j.C81826s;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.shelfbackground.impl.ac */
/* compiled from: PG */
public final /* synthetic */ class C82048ac implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C82071az f224281a;

    public /* synthetic */ C82048ac(C82071az azVar) {
        this.f224281a = azVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        View view = this.f224281a.f224309D;
        int i = ((C81826s) obj).mo75359a().bottom;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0129a) {
            C0129a aVar = (C0129a) layoutParams;
            if (aVar.f369b != i) {
                aVar.f369b = i;
                view.requestLayout();
            }
        }
    }
}
