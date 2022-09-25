package androidx.coordinatorlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.coordinatorlayout.widget.e */
/* compiled from: PG */
final class C1772e implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ CoordinatorLayout f5522a;

    public C1772e(CoordinatorLayout coordinatorLayout) {
        this.f5522a = coordinatorLayout;
    }

    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5522a.f5505h;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        this.f5522a.mo4926j(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f5522a.f5505h;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
