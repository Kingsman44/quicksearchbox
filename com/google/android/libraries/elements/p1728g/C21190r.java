package com.google.android.libraries.elements.p1728g;

import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import com.facebook.litho.LithoView;

/* renamed from: com.google.android.libraries.elements.g.r */
/* compiled from: PG */
public final class C21190r implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ View f59444a;

    /* renamed from: b */
    private final LithoView f59445b;

    public C21190r(View view) {
        LithoView lithoView;
        this.f59444a = view;
        int i = C21193u.f59456a;
        if (view instanceof LithoView) {
            lithoView = (LithoView) view;
        } else {
            ViewParent parent = view.getParent();
            while (parent != null && !(parent instanceof LithoView)) {
                parent = parent.getParent();
            }
            lithoView = (LithoView) parent;
        }
        this.f59445b = lithoView;
    }

    public final void onAnimationEnd(Animation animation) {
        LithoView lithoView = this.f59445b;
        if (lithoView != null) {
            lithoView.setHasTransientState(false);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        LithoView lithoView = this.f59445b;
        if (lithoView != null) {
            lithoView.setHasTransientState(true);
        }
    }
}
