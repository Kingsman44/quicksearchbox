package android.support.p033v7.view.menu;

import android.support.p033v7.view.C0436d;
import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: android.support.v7.view.menu.w */
/* compiled from: PG */
final class C0483w extends FrameLayout implements C0436d {

    /* renamed from: a */
    final CollapsibleActionView f1711a;

    public C0483w(View view) {
        super(view.getContext());
        this.f1711a = (CollapsibleActionView) view;
        addView(view);
    }

    public final void onActionViewCollapsed() {
        this.f1711a.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.f1711a.onActionViewExpanded();
    }
}
