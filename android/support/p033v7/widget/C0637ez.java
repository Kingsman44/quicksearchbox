package android.support.p033v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ez */
/* compiled from: PG */
final class C0637ez {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f2402a;

    public C0637ez(RecyclerView recyclerView) {
        this.f2402a = recyclerView;
    }

    /* renamed from: a */
    public final void mo2862a(View view) {
        C0673gh childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            this.f2402a.setChildImportantForAccessibilityInternal$ar$ds(childViewHolderInt, childViewHolderInt.mWasImportantForAccessibilityBeforeHidden);
            childViewHolderInt.mWasImportantForAccessibilityBeforeHidden = 0;
        }
    }

    /* renamed from: b */
    public final void mo2863b(int i) {
        View childAt = this.f2402a.getChildAt(i);
        if (childAt != null) {
            this.f2402a.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        this.f2402a.removeViewAt(i);
    }
}
