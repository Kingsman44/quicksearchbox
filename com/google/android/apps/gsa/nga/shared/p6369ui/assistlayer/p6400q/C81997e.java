package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import com.google.android.libraries.gsa.p1876k.C22870f;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.e */
/* compiled from: PG */
public final /* synthetic */ class C81997e implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C82003k f224161a;

    /* renamed from: b */
    public final /* synthetic */ View f224162b;

    public /* synthetic */ C81997e(C82003k kVar, View view) {
        this.f224161a = kVar;
        this.f224162b = view;
    }

    public final void run() {
        C82003k kVar = this.f224161a;
        View view = this.f224162b;
        view.getViewTreeObserver().addOnPreDrawListener(new C81999g(kVar, view));
    }
}
