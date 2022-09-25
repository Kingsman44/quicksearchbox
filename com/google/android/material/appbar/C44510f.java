package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p098j.p099a.C1981aa;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: com.google.android.material.appbar.f */
/* compiled from: PG */
final class C44510f implements C1981aa {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f115741a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f115742b;

    /* renamed from: c */
    final /* synthetic */ View f115743c;

    /* renamed from: d */
    final /* synthetic */ int f115744d;

    /* renamed from: e */
    final /* synthetic */ AppBarLayout.BaseBehavior f115745e;

    public C44510f(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f115745e = baseBehavior;
        this.f115741a = coordinatorLayout;
        this.f115742b = appBarLayout;
        this.f115743c = view;
        this.f115744d = i;
    }

    /* renamed from: a */
    public final boolean mo5140a(View view) {
        this.f115745e.mo47419A(this.f115741a, this.f115742b, this.f115743c, this.f115744d, new int[]{0, 0});
        return true;
    }
}
