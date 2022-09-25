package com.android.launcher3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
public class InsettableFrameLayout extends FrameLayout implements ViewGroup.OnHierarchyChangeListener, Insettable {
    public final Rect mInsets = new Rect();

    /* compiled from: PG */
    public class LayoutParams extends FrameLayout.LayoutParams {
        boolean ignoreInsets = false;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.InsettableFrameLayout_Layout);
            this.ignoreInsets = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public InsettableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnHierarchyChangeListener(this);
    }

    public static final void setFrameLayoutChildInsets$ar$ds(View view, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (view instanceof Insettable) {
            ((Insettable) view).setInsets(rect);
        } else if (!layoutParams.ignoreInsets) {
            layoutParams.topMargin += rect.top - rect2.top;
            layoutParams.leftMargin += rect.left - rect2.left;
            layoutParams.rightMargin += rect.right - rect2.right;
            layoutParams.bottomMargin += rect.bottom - rect2.bottom;
        }
        view.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void onChildViewAdded(View view, View view2) {
        setFrameLayoutChildInsets$ar$ds(view2, this.mInsets, new Rect());
    }

    public void onChildViewRemoved(View view, View view2) {
    }

    public final void setInsets(Rect rect) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            setFrameLayoutChildInsets$ar$ds(getChildAt(i), rect, this.mInsets);
        }
        this.mInsets.set(rect);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }
}
