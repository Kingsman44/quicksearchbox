package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
public class StickyHeaderScrollView extends BottomScrollView {

    /* renamed from: b */
    private View f118441b;

    /* renamed from: c */
    private View f118442c;

    /* renamed from: d */
    private int f118443d = 0;

    public StickyHeaderScrollView(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m80801a() {
        View view = this.f118441b;
        if (view != null) {
            View view2 = this.f118442c;
            View view3 = view2 != null ? view2 : view;
            int top = view2 != null ? view.getTop() : 0;
            if ((view3.getTop() - getScrollY()) + top < this.f118443d || !view3.isShown()) {
                view3.setTranslationY((float) (getScrollY() - top));
            } else {
                view3.setTranslationY(0.0f);
            }
        }
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.f118443d = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f118441b == null) {
            this.f118441b = findViewWithTag("sticky");
            this.f118442c = findViewWithTag("stickyContainer");
        }
        m80801a();
    }

    /* access modifiers changed from: protected */
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        m80801a();
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StickyHeaderScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
