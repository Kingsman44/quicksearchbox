package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113374do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bb */
/* compiled from: PG */
final class C113547bb implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f314348a;

    /* renamed from: b */
    final /* synthetic */ View f314349b;

    /* renamed from: c */
    final /* synthetic */ C113374do f314350c;

    /* renamed from: d */
    final /* synthetic */ C113558bm f314351d;

    public C113547bb(C113558bm bmVar, View view, View view2, C113374do doVar) {
        this.f314351d = bmVar;
        this.f314348a = view;
        this.f314349b = view2;
        this.f314350c = doVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            this.f314351d.mo100278C(this.f314348a, this.f314349b, this.f314350c);
        }
    }
}
