package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7609e;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.C44893x;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.e.e */
/* compiled from: PG */
final class C97210e extends C44893x {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f271602a;

    /* renamed from: b */
    final /* synthetic */ C97211f f271603b;

    public C97210e(C97211f fVar, CoordinatorLayout coordinatorLayout) {
        this.f271603b = fVar;
        this.f271602a = coordinatorLayout;
    }

    /* renamed from: a */
    public final void mo33564a(Snackbar snackbar, int i) {
        if (this.f271602a.getParent() != null) {
            this.f271603b.f271604a.removeView(this.f271602a);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo33565b(Object obj, int i) {
        mo33565b((Snackbar) obj, i);
    }
}
