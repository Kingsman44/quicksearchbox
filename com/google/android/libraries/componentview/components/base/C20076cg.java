package com.google.android.libraries.componentview.components.base;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.componentview.p1697d.C20470a;

/* renamed from: com.google.android.libraries.componentview.components.base.cg */
/* compiled from: PG */
final class C20076cg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f56309a;

    /* renamed from: b */
    final /* synthetic */ View f56310b;

    /* renamed from: c */
    final /* synthetic */ C20470a f56311c;

    /* renamed from: d */
    final /* synthetic */ float f56312d;

    /* renamed from: e */
    final /* synthetic */ float f56313e;

    /* renamed from: f */
    final /* synthetic */ float f56314f;

    /* renamed from: g */
    final /* synthetic */ float f56315g;

    public C20076cg(View view, View view2, C20470a aVar, float f, float f2, float f3, float f4) {
        this.f56309a = view;
        this.f56310b = view2;
        this.f56311c = aVar;
        this.f56312d = f;
        this.f56313e = f2;
        this.f56314f = f3;
        this.f56315g = f4;
    }

    public final void onGlobalLayout() {
        if (this.f56309a.getVisibility() != 8) {
            this.f56309a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C20078ci.m37955B(this.f56310b, this.f56311c, this.f56312d, this.f56313e, this.f56314f, this.f56315g, this.f56309a);
        }
    }
}
