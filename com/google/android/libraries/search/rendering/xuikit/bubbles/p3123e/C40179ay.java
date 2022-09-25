package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.ay */
/* compiled from: PG */
final class C40179ay extends C44893x {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f105556a;

    /* renamed from: b */
    final /* synthetic */ C40180az f105557b;

    public C40179ay(C40180az azVar, CoordinatorLayout coordinatorLayout) {
        this.f105557b = azVar;
        this.f105556a = coordinatorLayout;
    }

    /* renamed from: a */
    public final void mo33564a(Snackbar snackbar, int i) {
        if (this.f105556a.getParent() != null) {
            this.f105557b.f105558a.removeView(this.f105556a);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        mo33565b((Snackbar) obj, i);
    }
}
